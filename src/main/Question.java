package main;


public class Question {
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
    private String difficulty;
    public Question(String question, String optionA, String optionB, String optionC, String optionD, String answer, String difficulty) {
        this.difficulty = difficulty;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
    }

    /**
     * @return String return the question
     */
    public String getQuestion() {
        return question;
    }

   

    /**
     * @return String return the optionA
     */
    public String getOptionA() {
        return optionA;
    }

   
    /**
     * @return String return the optionB
     */
    public String getOptionB() {
        return optionB;
    }

   

    /**
     * @return String return the optionC
     */
    public String getOptionC() {
        return optionC;
    }

   

    /**
     * @return String return the optionD
     */
    public String getOptionD() {
        return optionD;
    }

  

    /**
     * @return String return the answer
     */
    public String getAnswer() {
        return answer;
    }


    /**
     * @return String return the difficulty
     */
    public String getDifficulty() {
        return difficulty;
    }

  
    @Override
    public String toString() {
        return "Question: " + question + "\n" +
               "A. " + optionA + "\n" +
               "B. " + optionB + "\n" +
               "C. " + optionC + "\n" +
               "D. " + optionD + "\n";
    }

}
