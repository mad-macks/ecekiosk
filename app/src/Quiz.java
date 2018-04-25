package edu.fsu.famu.eng.eceinfokiosk;
import android.app.Application;

public class Quiz extends Application {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void incrementScore() {
        this.score++;
    }
}