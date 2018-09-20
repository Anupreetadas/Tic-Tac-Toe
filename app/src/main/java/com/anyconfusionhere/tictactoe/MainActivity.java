package com.anyconfusionhere.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean turn = true;
    boolean initialization = false;
    ImageView topLeftImage;
    ImageView topMidImage;
    ImageView topRightImage;
    ImageView midLeftImage;
    ImageView midMidImage;
    ImageView midRightImage;
    ImageView bottomLeftImage;
    ImageView bottomMidImage;
    ImageView bottomRightImage;


    public void isSolved() {

        if (!initialization) {

            topLeftImage = (ImageView) findViewById(R.id.topLeftView);
            topRightImage = (ImageView) findViewById(R.id.topRightView);
            topMidImage = (ImageView) findViewById(R.id.topMidView);
            midMidImage = (ImageView) findViewById(R.id.midMidView);
            midLeftImage = (ImageView) findViewById(R.id.midLeftView);
            midRightImage = (ImageView) findViewById(R.id.midRightView);
            bottomRightImage = (ImageView) findViewById(R.id.bottomRightView);
            bottomLeftImage = (ImageView) findViewById(R.id.bottomLeftView);
            bottomMidImage = (ImageView) findViewById(R.id.bottomMidView);

            topLeftImage.setTag(-1);
            topRightImage.setTag(-2);
            topMidImage.setTag(-3);
            midLeftImage.setTag(-4);
            midMidImage.setTag(-5);
            midRightImage.setTag(-6);
            bottomLeftImage.setTag(-7);
            bottomMidImage.setTag(-8);
            bottomRightImage.setTag(-9);
            initialization = true;
        } else {

            if (Integer.parseInt(topLeftImage.getTag().toString()) == 0 && Integer.parseInt(topMidImage.getTag().toString()) == 0 && Integer.parseInt(topRightImage.getTag().toString()) == 0) {
                Toast.makeText(getApplicationContext(), "Player O Has Won", Toast.LENGTH_LONG).show();
                disableButtons();
                return;
            } else if (Integer.parseInt(topLeftImage.getTag().toString()) == 0 && Integer.parseInt(midMidImage.getTag().toString()) == 0 && Integer.parseInt(bottomRightImage.getTag().toString()) == 0) {
                Toast.makeText(getApplicationContext(), "Player O Has Won", Toast.LENGTH_LONG).show();
                disableButtons();

            } else if (Integer.parseInt(topLeftImage.getTag().toString()) == 0 && Integer.parseInt(midLeftImage.getTag().toString()) == 0 && Integer.parseInt(bottomLeftImage.getTag().toString()) == 0) {
                Toast.makeText(getApplicationContext(), "Player O Has Won", Toast.LENGTH_LONG).show();
                disableButtons();

            } else if (Integer.parseInt(topMidImage.getTag().toString()) == 0 && Integer.parseInt(midMidImage.getTag().toString()) == 0 && Integer.parseInt(bottomMidImage.getTag().toString()) == 0) {
                Toast.makeText(getApplicationContext(), "Player O Has Won", Toast.LENGTH_LONG).show();
                disableButtons();

            } else if (Integer.parseInt(topRightImage.getTag().toString()) == 0 && Integer.parseInt(midRightImage.getTag().toString()) == 0 && Integer.parseInt(bottomRightImage.getTag().toString()) == 0) {
                Toast.makeText(getApplicationContext(), "Player O Has Won", Toast.LENGTH_LONG).show();
                disableButtons();

            } else if (Integer.parseInt(topRightImage.getTag().toString()) == 0 && Integer.parseInt(midMidImage.getTag().toString()) == 0 && Integer.parseInt(bottomLeftImage.getTag().toString()) == 0) {
                Toast.makeText(getApplicationContext(), "Player O Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            } else if (Integer.parseInt(bottomLeftImage.getTag().toString()) == 0 && Integer.parseInt(bottomMidImage.getTag().toString()) == 0 && Integer.parseInt(bottomRightImage.getTag().toString()) == 0) {
                Toast.makeText(getApplicationContext(), "Player O Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            } else if (Integer.parseInt(midLeftImage.getTag().toString()) == 0 && Integer.parseInt(midMidImage.getTag().toString()) == 0 && Integer.parseInt(midRightImage.getTag().toString()) == 0) {
                Toast.makeText(getApplicationContext(), "Player O Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            }
            if (Integer.parseInt(topLeftImage.getTag().toString()) == 1 && Integer.parseInt(topMidImage.getTag().toString()) == 1 && Integer.parseInt(topRightImage.getTag().toString()) == 1) {
                Toast.makeText(getApplicationContext(), "Player X Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            } else if (Integer.parseInt(topLeftImage.getTag().toString()) == 1 && Integer.parseInt(midMidImage.getTag().toString()) == 1 && Integer.parseInt(bottomRightImage.getTag().toString()) == 1) {
                Toast.makeText(getApplicationContext(), "Player X Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            } else if (Integer.parseInt(topLeftImage.getTag().toString()) == 1 && Integer.parseInt(midLeftImage.getTag().toString()) == 1 && Integer.parseInt(bottomLeftImage.getTag().toString()) == 1) {
                Toast.makeText(getApplicationContext(), "Player X Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            } else if (Integer.parseInt(topMidImage.getTag().toString()) == 1 && Integer.parseInt(midMidImage.getTag().toString()) == 1 && Integer.parseInt(bottomMidImage.getTag().toString()) == 1) {
                Toast.makeText(getApplicationContext(), "Player X Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            } else if (Integer.parseInt(topRightImage.getTag().toString()) == 1 && Integer.parseInt(midRightImage.getTag().toString()) == 1 && Integer.parseInt(bottomRightImage.getTag().toString()) == 1) {
                Toast.makeText(getApplicationContext(), "Player X Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            } else if (Integer.parseInt(topRightImage.getTag().toString()) == 1 && Integer.parseInt(midMidImage.getTag().toString()) == 1 && Integer.parseInt(bottomLeftImage.getTag().toString()) == 1) {
                Toast.makeText(getApplicationContext(), "Player X Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            } else if (Integer.parseInt(bottomLeftImage.getTag().toString()) == 1 && Integer.parseInt(bottomMidImage.getTag().toString()) == 1 && Integer.parseInt(bottomRightImage.getTag().toString()) == 1) {
                Toast.makeText(getApplicationContext(), "Player X Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            } else if (Integer.parseInt(midLeftImage.getTag().toString()) == 1 && Integer.parseInt(midMidImage.getTag().toString()) == 1 && Integer.parseInt(midRightImage.getTag().toString()) == 1) {
                Toast.makeText(getApplicationContext(), "Player X Has Won", Toast.LENGTH_LONG).show();
                disableButtons();


            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkTurn();
        isSolved();

    }

    public void topLeft(View view) {

        topLeftImage = (ImageView) findViewById(R.id.topLeftView);
        if (!turn) {
            topLeftImage.setImageResource(R.drawable.o);
            topLeftImage.setTag(0);

        } else {
            topLeftImage.setImageResource(R.drawable.x);
            topLeftImage.setTag(1);

        }
        isSolved();
        checkTurn();
    }

    public void topRight(View view) {

        topRightImage = (ImageView) findViewById(R.id.topRightView);
        if (!turn) {
            topRightImage.setImageResource(R.drawable.o);
            topRightImage.setTag(0);
        } else {
            topRightImage.setImageResource(R.drawable.x);
            topRightImage.setTag(1);
        }
        checkTurn();
        isSolved();
    }

    public void topMid(View view) {

        topMidImage = (ImageView) findViewById(R.id.topMidView);
        if (!turn) {
            topMidImage.setImageResource(R.drawable.o);
            topMidImage.setTag(0);

        } else {
            topMidImage.setImageResource(R.drawable.x);
            topMidImage.setTag(1);


        }
        checkTurn();
        isSolved();
    }

    public void midMid(View view) {

        midMidImage = (ImageView) findViewById(R.id.midMidView);
        if (!turn) {
            midMidImage.setImageResource(R.drawable.o);
            midMidImage.setTag(0);

        } else {
            midMidImage.setImageResource(R.drawable.x);
            midMidImage.setTag(1);


        }
        checkTurn();
        isSolved();
    }

    public void midLeft(View view) {

        midLeftImage = (ImageView) findViewById(R.id.midLeftView);
        if (!turn) {
            midLeftImage.setImageResource(R.drawable.o);
            midLeftImage.setTag(0);

        } else {
            midLeftImage.setImageResource(R.drawable.x);
            midLeftImage.setTag(1);


        }
        checkTurn();
        isSolved();
    }

    public void midRight(View view) {

        midRightImage = (ImageView) findViewById(R.id.midRightView);
        if (!turn) {
            midRightImage.setImageResource(R.drawable.o);
            midRightImage.setTag(0);

        } else {
            midRightImage.setImageResource(R.drawable.x);
            midRightImage.setTag(1);
        }
        checkTurn();
        isSolved();
    }

    public void bottomRight(View view) {

        bottomRightImage = (ImageView) findViewById(R.id.bottomRightView);
        if (!turn) {
            bottomRightImage.setImageResource(R.drawable.o);
            bottomRightImage.setTag(0);

        } else {
            bottomRightImage.setImageResource(R.drawable.x);
            bottomRightImage.setTag(1);
        }
        checkTurn();
        isSolved();

    }

    public void bottomLeft(View view) {

        bottomLeftImage = (ImageView) findViewById(R.id.bottomLeftView);
        if (!turn) {
            bottomLeftImage.setImageResource(R.drawable.o);
            bottomLeftImage.setTag(0);

        } else {
            bottomLeftImage.setImageResource(R.drawable.x);
            bottomLeftImage.setTag(1);


        }
        checkTurn();
        isSolved();

    }

    public void bottomMid(View view) {

        bottomMidImage = (ImageView) findViewById(R.id.bottomMidView);
        if (!turn) {
            bottomMidImage.setImageResource(R.drawable.o);
            bottomMidImage.setTag(0);
        } else {
            bottomMidImage.setImageResource(R.drawable.x);
            bottomMidImage.setTag(1);


        }
        checkTurn();
        isSolved();
    }

    public void disableButtons() {

        topLeftImage.setEnabled(false);
        topMidImage.setEnabled(false);
        topRightImage.setEnabled(false);
        midLeftImage.setEnabled(false);
        midMidImage.setEnabled(false);
        midRightImage.setEnabled(false);
        bottomLeftImage.setEnabled(false);
        bottomMidImage.setEnabled(false);
        bottomRightImage.setEnabled(false);

    }

    public void checkTurn() {
        TextView oTurnView = (TextView) findViewById(R.id.oTurn);
        TextView xTurnView = (TextView) findViewById(R.id.xTurn);
        if (turn == true) {
            xTurnView.setAlpha(0f);
            oTurnView.setAlpha(1f);
            turn = false;
        } else {
            xTurnView.setAlpha(1f);
            oTurnView.setAlpha(0f);
            turn = true;
        }
    }
    
    public void startOver(View view){
        
        topLeftImage.setEnabled(true);
        topMidImage.setEnabled(true);
        topRightImage.setEnabled(true);
        midLeftImage.setEnabled(true);
        midMidImage.setEnabled(true);
        midRightImage.setEnabled(true);
        bottomLeftImage.setEnabled(true);
        bottomMidImage.setEnabled(true);
        bottomRightImage.setEnabled(true);

        topLeftImage.setImageDrawable(null);
        topMidImage.setImageDrawable(null);
        topRightImage.setImageDrawable(null);
        midLeftImage.setImageDrawable(null);
        midMidImage.setImageDrawable(null);
        midRightImage.setImageDrawable(null);
        bottomLeftImage.setImageDrawable(null);
        bottomMidImage.setImageDrawable(null);
        bottomRightImage.setImageDrawable(null);


        initialization = false;
        
    }

}
