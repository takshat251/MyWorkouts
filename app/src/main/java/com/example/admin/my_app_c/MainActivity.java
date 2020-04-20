package com.example.admin.my_app_c;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    private WorkoutExpert expert = new WorkoutExpert();//obj for specialjava class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindWorkout(View view)//parameter View view
    {
     TextView workouts = (TextView) findViewById(R.id.workout);//reference to textview

     Spinner workouttype = (Spinner) findViewById(R.id.workouttype);//reference to spinner

     String workout = String.valueOf(workouttype.getSelectedItem());//variable to store selected value
        //so we are extracting selected item using object(workouttype) of spinner

     //workouts.setText(workout);
     List<String> workoutlist = expert.getWorkouts(workout);//parsed selected workouttype as parameter to getWorkouts method

     StringBuilder workoutFormatted = new StringBuilder();

     for (String work : workoutlist)//for each workout present in worklist
     {
         workoutFormatted.append(work).append('\n');//appending work followed by a line break
     }
     workouts.setText(workoutFormatted);
    }
}
