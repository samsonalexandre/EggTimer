package alekssamson.jimdo.com.eggtimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton softButton, pouchButton, hardButton, startStopButton;
    EditText countdownTime;
    private CountDownTimer timer;
    private static final int MILLIS_PER_SECOND = 1000;
    private int softBoiledConst = 240;
    private int inApouchConst = 360;
    private int hardBoiledConst = 450;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        softButton = (ImageButton) findViewById(R.id.soft_boiled);
        pouchButton = (ImageButton) findViewById(R.id.In_a_pouch);
        hardButton = (ImageButton) findViewById(R.id.hard_boiled);
        startStopButton = (ImageButton) findViewById(R.id.startStopButton);
        countdownTime = (EditText) findViewById(R.id.countdown);

    }



    public void soft(View view) {
        try {
            showTimer(softBoiledConst * MILLIS_PER_SECOND);
        } catch (NumberFormatException e) {

        }

    }


    public void pouch(View view) {
        try {
            showTimer(inApouchConst * MILLIS_PER_SECOND);
        } catch (NumberFormatException e) {

        }

    }


    public void hard(View view) {
        try {
            showTimer(hardBoiledConst * MILLIS_PER_SECOND);
        } catch (NumberFormatException e) {

        }

    }

    private void showTimer(int countdownMillis) {
        if (timer != null) {
            timer.cancel();
        }
        timer = new CountDownTimer(countdownMillis, MILLIS_PER_SECOND) {

            @Override
            public void onTick(long millisUntilFinished) {
                countdownTime.setText("Осталось: " + millisUntilFinished / MILLIS_PER_SECOND);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    public void start(View view) {

    }
}
