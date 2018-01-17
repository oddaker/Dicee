package no.oddaker.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.rollButton);
    /*  R.id=Resource ID */
    /* try commit change */
        final ImageView leftDice = findViewById(R.id.imageViewLeftDice);
        final ImageView rightDice = findViewById(R.id.imageViewRightDice);

        final int[] dicearray={R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumerGenerator = new Random();
                int number = randomNumerGenerator.nextInt(6);
                leftDice.setImageResource(dicearray[number]);

                number=randomNumerGenerator.nextInt(6);
                rightDice.setImageResource(dicearray[number]);

                Log.d("Dicee", "The number is : " + number);
            }
        });

    }
}
