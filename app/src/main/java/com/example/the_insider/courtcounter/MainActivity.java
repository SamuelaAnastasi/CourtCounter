package com.example.the_insider.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Adds three points to the team A score
    */
    public void addThreeToTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /*
   * Adds two points to the team A score
   */
    public void addTwoToTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /*
   * Adds one point to the team A score
   */
    public void addOneToTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /*
    * Displays the given score for team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
    * Adds three points to the team B score
    */
    public void addThreeToTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /*
   * Adds two points to the team B score
   */
    public void addTwoToTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /*
   * Adds one point to the team B score
   */
    public void addOneToTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /*
    * Displays the given score for team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
    * Resets the given score for team A and team B to 0
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
