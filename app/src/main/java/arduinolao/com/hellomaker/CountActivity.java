package arduinolao.com.hellomaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    int scoreTA = 0;
    int state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
    }

    public void addThreeTeamA(View view) {
        scoreTA = scoreTA + 3;
        state = 3;
        displayScoreTeamA(scoreTA);
    }

    public void addTwoTeamA(View view) {
        scoreTA = scoreTA + 2;
        state = 2;
        displayScoreTeamA(scoreTA);
    }

    public void displayScoreTeamA(int scoreA) {
        TextView scoreTeamA = (TextView) findViewById(R.id.tvTeamA);
        scoreTeamA.setText(String.valueOf(scoreA));
    }

    public void reset(View view) {
        scoreTA = scoreTA - state;
        displayScoreTeamA(scoreTA);
    }
}
