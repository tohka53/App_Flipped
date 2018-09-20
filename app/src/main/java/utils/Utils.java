package utils;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by Suleiman on 30-04-2015.
 */
public class Utils {

    private static final String PREFERENCES_FILE = "flipped";


    public static void saveSharedSetting(Context ctx, String settingName, String settingValue) {
        SharedPreferences sharedPref = ctx.getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(settingName, settingValue);
        editor.apply();
    }

}
