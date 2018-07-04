package com.forceoffline.zhu.forceofflinedemo;

/*
 *   负责管理所有Activity
 */

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityController {
    private static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);

    }

    public static void delActivity(Activity activity) {
        activities.remove(activity);

    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
        activities.clear();
    }
}
