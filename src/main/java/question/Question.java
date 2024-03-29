package question;

public abstract class Question {
    private String title;
    private boolean isActive;

    private String receiving_letter;

    public Question(String title) {
        this.title = title;
    }

    public abstract String showQuestion();

    /**
     * Checks if the answer is correct.
     * This is done case-insensitive.
     *
     * @param answer The given answer to the question by the player.
     * @return Data as a {@link Boolean}. Either true or false.
     */
    public abstract boolean isCorrectAnswer(String answer);

    /**
     * Adds the correct answer to the question.
     * If the answer is either null or empty, then an exception will be thrown.
     *
     * @param answer The correct answer that needs to be added.
     */
    public abstract void addCorrectAnswer(String answer);


    public String getTitle() {
        return this.title;
    }
    public String getReceivingLetter() {
        return this.receiving_letter;
    }

    public void setReceivingLetter(String letter) {
        this.receiving_letter = letter;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }


}
