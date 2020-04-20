package com.example.admin.my_app_c;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {

    List<String> getWorkouts (String workouttypes) {
        List<String> workout = new ArrayList<String>();

        if (workouttypes.equals("Chest")) {
            workout.add("Bench Press");
            workout.add("Cable Flys");
        } else if (workouttypes.equals("Triceps")) {
            workout.add("Tricep Ext");
            workout.add("Tricep PushDowns");

        } else if (workouttypes.equals("Shoulders")) {
            workout.add("Shoulder Press");
        } else if (workouttypes.equals("Biceps")) {
            workout.add("Dumble Press");
            workout.add("Bicep Curls");
        }
        return workout;
    }
}
