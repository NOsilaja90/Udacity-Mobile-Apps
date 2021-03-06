package com.example.android.project2taekwondoscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int roundTeamA = 0;
    int roundTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the round completed for Team A by 1 point.
     */
    public void addOneForRoundA(View v) {
        roundTeamA = roundTeamA += 1;
        displayRoundForTeamA(roundTeamA);
    }
    /**
     * Displays the total rounds completed for Team A.
     */
    public void displayRoundForTeamA(int round) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_round);
        scoreView.setText(String.valueOf(round));
    }
    /**
     * Increase the round completed for Team B by 1 point.
     */
    public void addOneForRoundB(View v) {
        roundTeamB = roundTeamB += 1;
        displayRoundForTeamB(roundTeamB);
    }
    /**
     * Displays the total rounds completed for Team B.
     */
    public void displayRoundForTeamB(int round) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_round);
        scoreView.setText(String.valueOf(round));
    }
    /**
     * Resets both teams to 0.
     */
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Resets both teams' rounds to 0.
     */
    public void resetRound(View v){
        roundTeamA = 0;
        roundTeamB = 0;
        displayRoundForTeamA(roundTeamA);
        displayRoundForTeamB(roundTeamB);
    }
}
