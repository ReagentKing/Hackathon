package com.example.michael.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondPage extends Activity implements View.OnClickListener{
/*
 * Created by Michael on 10/25/2014.
 */
TextView textview1;
    int [] ar={4,6,8};
    String [] firstNames= {"Billybob", "Susan", "Joe", "Michael", "Abigail", "Joanna", "Lucy", "Freddie", "Rachel", "Sam", "Samantha"};
    String [] lastNames= {"Peterson", "Smith", "Jones", "Humphrey", "Conrad", "Rogers", "Allan", "Clegg", "Carpenter", "Linscott", "White", "Perry", "Hall", "Johnson", "Jones"};
    int [] ages= {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 56, 58, 59, 60, 61, 62, 63, 64, 65, 66};
    String [] occupations= {"Doctor", "Lawyer", "Bartender", "Zookeeper", "Programmer", "Firefighter", "Ambulance Driver", "Monkey", "Undercover Cop", "CIA", "FBI Special Agent", "Patient at an Insane Asylum", "CEO", "Accountant", "Stripper", "Millionaire", "Hairdresser", "Superhero"};
    String [] race= {"Caucasian", "Native American", "African American", "Monkey", "Giraffe", "Asian", "Dolphin", "Alaskan Native", "Hawaiian", "Puerto Rican", "American", "Hummingbird"};
Button button1;
    public static int randomNumber(int min, int max)
    {
        Random rand=new Random();
        int randNum=rand.nextInt((max-min)+1) +min;
        return randNum;
    }

@Override
protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        textview1=(TextView) findViewById(R.id.textView1);
        String fName=firstNames[randomNumber(0,(firstNames.length-1))];
        String lName=lastNames[randomNumber(0,(lastNames.length-1))];
        int age=ages[randomNumber(0,(ages.length-1))];
        String occ=occupations[randomNumber(0,(occupations.length-1))];
        String ethnicity=race[randomNumber(0,(race.length-1))];
        textview1.setText("You are " + fName + " " +lName+ ". You are " + age + " years old. You work as a(n) " + occ + ". Your ethnicity is "+ethnicity +".");
        button1=(Button) findViewById(R.id.button);
        button1.setText("Try again?");
        button1.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        Intent i =new Intent(this,SecondPage.class);
        startActivity(i);
    }

}
