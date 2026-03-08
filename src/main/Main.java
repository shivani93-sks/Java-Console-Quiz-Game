package main;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String type;
    public static String difficulty;

    public static ArrayList<String> allTopics = new ArrayList<>();
    public static ArrayList<String> allDifficulties = new ArrayList<>();
    public static ArrayList<Question> allQuestions = new ArrayList<>();
    public static ArrayList<Question> filteredQuestions = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n============ WELCOME TO THE QUIZ GAME ============");
        System.out.println("--------------------------------------------------\n");

        loadInitially();

        System.out.println("Total Topics : " + allTopics.size());
        System.out.println("No. Of Difficulties : " + allDifficulties.size());

        System.out.println("\nSelect a topic to test your knowledge:");
        System.out.println("--------------------------------------------------");

        for (String str : allTopics) {
            System.out.println("  <> " + str);
        }

        System.out.println("\nEnter your choice : ");
        String topicChoice = sc.next();

        for (String str : allTopics) {
            if (topicChoice.equals(str)) {
                type = str;
            }
        }

        System.out.println("\nPlease choose a difficulty level:");
        System.out.println("--------------------------------------------------");

        for (String str : allDifficulties) {
            System.out.println("  * " + str);
        }

        System.out.println("\nEnter Level : ");
        String difficultyChoice = sc.next();

        for (String str : allDifficulties) {
            if (difficultyChoice.equalsIgnoreCase(str)) {
                difficulty = str;
            }
        }

        System.out.println("\n==================================================");
        System.out.println("Topic Selected      : " + type);
        System.out.println("Difficulty Selected : " + difficulty);
        System.out.println("==================================================");
        System.out.println("\nGreat choice! Let's begin the quiz.\n");

        loadQuestions();

        int i = 1;
        int count = 0;

        for (Question filterqs : filteredQuestions) {

            System.out.println("--------------------------------------------------");
            System.out.println("Question " + i);
            System.out.println("--------------------------------------------------");

            System.out.println(filterqs.getQuestion());
            System.out.println("\nA. " + filterqs.getOptionA());
            System.out.println("B. " + filterqs.getOptionB());
            System.out.println("C. " + filterqs.getOptionC());
            System.out.println("D. " + filterqs.getOptionD());

            System.out.print("\nEnter your answer (A/B/C/D) : ");
            String answer = sc.next();

            if (filterqs.getAnswer().trim().equalsIgnoreCase(answer.trim())){
                System.out.println("Correct Answer!");
                ++count;
            }
             else {
                System.out.println("Incorrect.");
                System.out.println("Correct Answer : " + filterqs.getAnswer());
            }

            System.out.println("\n");
            i++;
        }

        System.out.println("==================================================");
        System.out.println("                 QUIZ FINISHED                    ");
        System.out.println("==================================================");

        System.out.println("\nYour Final Score : " + count + "/5");

        System.out.println("\n--------------------------------------------------");

        if (count == 5) {
            System.out.println("Outstanding! Perfect score!");
        } 
        else if (count >= 3) {
            System.out.println("Good job! You have solid knowledge.");
        } 
        else {
            System.out.println("Keep practicing. You'll improve!");
        }

        System.out.println("\n=============== END OF THE GAME ==================\n");

        sc.close();
    }


    @SuppressWarnings("resource")
    public static void loadInitially() throws IOException {

        String topicFilePath = "Source/allTopics.txt";
        File topics = new File(topicFilePath);
        BufferedReader topicsBR = new BufferedReader(new FileReader(topics));

        String line = "";

        while (line != null) {
            line = topicsBR.readLine();
            if (line != null) {
                allTopics.add(line);
            }
        }

        String difficultyFilePath = "Source/allDifficulties.txt";
        File difficulty = new File(difficultyFilePath);
        BufferedReader diffBR = new BufferedReader(new FileReader(difficulty));

        line = "";

        while (line != null) {
            line = diffBR.readLine();
            if (line != null) {
                allDifficulties.add(line);
            }
        }
    }


    @SuppressWarnings("resource")
    public static void loadQuestions() throws IOException {

        String questionFilePath = "Source/" + type + ".txt";
        File qs = new File(questionFilePath);
        BufferedReader quesBR = new BufferedReader(new FileReader(qs));

        String line = "";
        String[] allquesArr;

        while (line != null) {

            line = quesBR.readLine();

            if (line != null) {

                allquesArr = line.split("\\|\\|\\|");

                if (allquesArr.length < 7) {
                    System.out.println("Invalid question format: " + line);
                    continue;
                }

                allQuestions.add(
                        new Question(
                                allquesArr[1],
                                allquesArr[2],
                                allquesArr[3],
                                allquesArr[4],
                                allquesArr[5],
                                allquesArr[6],
                                allquesArr[0]
                        )
                );
            }
        }

        filterArray();
    }


    public static void filterArray() {

        for (Question ques : allQuestions) {

            if (ques.getDifficulty().equals(difficulty)) {
                filteredQuestions.add(ques);
            }
        }
    }
}