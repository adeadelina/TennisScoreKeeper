package com.example.android.tennisscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA = 0;
    int scorePlayerB = 0;
    String advantagePlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFifteenForPlayerA (View V) {
        scorePlayerA = scorePlayerA + 15;
        displayForTeamA (scorePlayerA);
    }

    public void addThirtyForPlayerA (View V) {
        scorePlayerA = scorePlayerA + 15;
        displayForTeamA (scorePlayerA);
    }

    public void addFortyForPlayerA (View V) {
        scorePlayerA = scorePlayerA + 10;
        displayForTeamA(scorePlayerA);
    }
    public void addAdvForPlayerA (View V) {
        scorePlayerA = scorePlayerA + 1;
        advantagePlayer = "Adv";
        displayForTeamA (advantagePlayer + 1);
    }
    public void addFifteenForPlayerB (View V) {
        scorePlayerB = scorePlayerB + 3;
        displayForTeamB (scorePlayerB);

    }    public void addThirtyForPlayerB (View V) {
        scorePlayerB = scorePlayerB + 2;
        displayForTeamB (scorePlayerB);
    }
    public void addFortyForPlayerB (View V) {
        scorePlayerB = scorePlayerB + 1;
        displayForTeamB (scorePlayerB);
    }

    public void addAdvForPlayerB (View V) {
        scorePlayerB = scorePlayerB + 1;
        displayForTeamB (scorePlayerB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_points);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_points);
        scoreView.setText(String.valueOf(score));
    }
    public void resetScore (View V) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForTeamA (scorePlayerA);
        displayForTeamB (scorePlayerB);
    }

}
