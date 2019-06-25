package com.pankaj.foodfeed;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

public class SessionManager {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    public static String PREF_NAME = "Application";

    public static Boolean IS_LOGIN = false;
    public static String LOGIN = "login";
    public static String USER_NAME = "user_name";
    public static String USER_PASSWORD = "user_password";

    public SessionManager(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(PREF_NAME, 0);
        editor = sharedPreferences.edit();
    }

    public void saveLogin(String name, String password) {
        editor.putString(USER_NAME, name);
        editor.putString(USER_PASSWORD, password);
        editor.putBoolean(LOGIN, true);
        editor.commit();
    }

    public void getValues() {
        HashMap<String, String> user = new HashMap<>();
        user.put(USER_NAME, sharedPreferences.getString(USER_NAME, null));
        user.put(USER_PASSWORD, sharedPreferences.getString(USER_PASSWORD, null));
    }


    public boolean IsLogin() {
        return sharedPreferences.getBoolean(LOGIN, false);
    }
}