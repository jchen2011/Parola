public class Timer {
    private long startTimer;
    private long stopTimer;

    public Timer() {
        resetTimer();
    }

    public void startTimer() {
        this.startTimer = System.currentTimeMillis();
    }

    public void stopTimer() {
        this.stopTimer = System.currentTimeMillis();
    }

    public long getStartTimer() {
        return this.startTimer;
    }

    public long getStopTimer() {
        return this.stopTimer;
    }
    public void resetTimer() {
        this.startTimer = 0;
        this.stopTimer = 0;
    }
}
