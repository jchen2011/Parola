public class Timer {
    private long startTimer;
    private long stopTimer;

    public Timer() {
        resetTimer();
    }

    /**
     * Starts the timer by declaring the current time.
     * This will be used later on to check the start and stop time.
     */
    public void startTimer() {
        this.startTimer = System.currentTimeMillis();
    }

    /**
     * Stops the timer by declaring the current time.
     */
    public void stopTimer() {
        this.stopTimer = System.currentTimeMillis();
    }

    /**
     * Resets the start- and stop timer to 0.
     */
    public void resetTimer() {
        this.startTimer = 0;
        this.stopTimer = 0;
    }

    public long getStartTimer() {
        return this.startTimer;
    }

    public long getStopTimer() {
        return this.stopTimer;
    }
}
