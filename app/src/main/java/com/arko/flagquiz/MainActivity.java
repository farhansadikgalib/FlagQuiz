package com.arko.flagquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4;
    ImageView imageiv;
    List<CountryItem> list;

    int turn = 1,count = 0;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();
        imageiv = (ImageView) findViewById(R.id.image1);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);

        list = new ArrayList<>();

        for (int i=0 ; i< new Storage().answers.length ; i++)
        {
            list.add(new CountryItem(new Storage().answers[i], new Storage().flags[i]));
        }

        Collections.shuffle(list);
        newQuestion(turn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equalsIgnoreCase(list.get(turn-1).getName()))
                {
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    count++;
                    Toast.makeText(MainActivity.this, "Correct Your Score is "+count, Toast.LENGTH_SHORT).show();

                    if (turn < list.size()) {

                        turn++;
                        newQuestion(turn);


                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    turn++;
                    newQuestion(turn);

                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equalsIgnoreCase(list.get(turn-1).getName()))
                {
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    count++;
                    Toast.makeText(MainActivity.this, "Your Score is "+count, Toast.LENGTH_SHORT).show();
                    if (turn < list.size())
                    {
                        turn++;
                        newQuestion(turn);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Wrong Answer"+turn, Toast.LENGTH_SHORT).show();
                    turn++;
                    newQuestion(turn);
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equalsIgnoreCase(list.get(turn-1).getName()))
                {
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    count++;
                    Toast.makeText(MainActivity.this, "your score is "+count ,Toast.LENGTH_SHORT).show();
                    if (turn < list.size())
                    {
                        turn++;
                        newQuestion(turn);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    turn++;
                    newQuestion(turn);

                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equalsIgnoreCase(list.get(turn-1).getName()))
                {
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    count++;
                    Toast.makeText(MainActivity.this, "Your Score is "+count, Toast.LENGTH_SHORT).show();
                    if (turn < list.size())
                    {
                        turn++;
                        newQuestion(turn);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    turn++;
                    newQuestion(turn);

                }

            }
        });


    }

    public void newQuestion(int number)
    {
        imageiv.setImageResource(list.get(number-1).getImage());
        Random r = new Random();

        int correct_answer = r.nextInt(4) + 1;

        int firstbutton = number - 1;
        int secondbutton;
        int thirdbutton;
        int fourthbutton;

        switch (correct_answer)
        {
            case 1:
                b1.setText(list.get(firstbutton).getName());
                do {
                    secondbutton = r.nextInt(list.size());
                }while (secondbutton == firstbutton);
                do {
                    thirdbutton = r.nextInt(list.size());
                }while (thirdbutton == firstbutton || thirdbutton == secondbutton);
                do {
                    fourthbutton = r.nextInt(list.size());
                }while (fourthbutton == firstbutton || fourthbutton == secondbutton  || fourthbutton == thirdbutton);
                b2.setText(list.get(secondbutton).getName());
                b3.setText(list.get(thirdbutton).getName());
                b4.setText(list.get(fourthbutton).getName());
                break;
            case 2:
                b2.setText(list.get(firstbutton).getName());
                do {
                    secondbutton = r.nextInt(list.size());
                }while (secondbutton == firstbutton);
                do {
                    thirdbutton = r.nextInt(list.size());
                }while (thirdbutton == firstbutton || thirdbutton == secondbutton);
                do {
                    fourthbutton = r.nextInt(list.size());
                }while (fourthbutton == firstbutton || fourthbutton == secondbutton  || fourthbutton == thirdbutton);
                b1.setText(list.get(secondbutton).getName());
                b3.setText(list.get(thirdbutton).getName());
                b4.setText(list.get(fourthbutton).getName());
                break;
            case 3:
                b3.setText(list.get(firstbutton).getName());
                do {
                    secondbutton = r.nextInt(list.size());
                }while (secondbutton == firstbutton);
                do {
                    thirdbutton = r.nextInt(list.size());
                }while (thirdbutton == firstbutton || thirdbutton == secondbutton);
                do {
                    fourthbutton = r.nextInt(list.size());
                }while (fourthbutton == firstbutton || fourthbutton == secondbutton  || fourthbutton == thirdbutton);
                b2.setText(list.get(secondbutton).getName());
                b1.setText(list.get(thirdbutton).getName());
                b4.setText(list.get(fourthbutton).getName());
                break;
            case 4:
                b4.setText(list.get(firstbutton).getName());
                do {
                    secondbutton = r.nextInt(list.size());
                }while (secondbutton == firstbutton);
                do {
                    thirdbutton = r.nextInt(list.size());
                }while (thirdbutton == firstbutton || thirdbutton == secondbutton);
                do {
                    fourthbutton = r.nextInt(list.size());
                }while (fourthbutton == firstbutton || fourthbutton == secondbutton  || fourthbutton == thirdbutton);
                b2.setText(list.get(secondbutton).getName());
                b3.setText(list.get(thirdbutton).getName());
                b1.setText(list.get(fourthbutton).getName());
                break;
        }


    }

}
