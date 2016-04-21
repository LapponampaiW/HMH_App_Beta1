package com.su.lapponampai_w.mhm_app_beta1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by apple on 4/20/16.
 */
public class MyManage {

    MyHelper helper;
    SQLiteDatabase readSqLiteDatabase, writeSqLiteDatabase;

    //userTABLE
    private static final String userTABLE = "userTABLE";
    private static final String ucolumn_id = "_id";
    private static final String ucolumn_User = "User";
    private static final String ucolumn_Password = "Password";
    private static final String ucolumn_Stay = "Stay";
    private static final String ucolumn_Email = "Email";
    private static final String[] column_userTABLE = {ucolumn_id,ucolumn_User,ucolumn_Password,ucolumn_Stay,ucolumn_Email};


    public MyManage(Context context) {
        helper = new MyHelper(context);
        readSqLiteDatabase = helper.getReadableDatabase();
        writeSqLiteDatabase = helper.getWritableDatabase();
    }


    public int check_null_userTABLE() {

        Cursor cursor = readSqLiteDatabase.query(userTABLE, column_userTABLE, null, null, null, null, null);

        int i = cursor.getCount();

        return i;
    }

    public void addValueSignUp(String user,
                               String password,
                               String stay,
                               String email) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(ucolumn_User,user);
        contentValues.put(ucolumn_Password,password);
        contentValues.put(ucolumn_Stay,stay);
        contentValues.put(ucolumn_Email,email);
        writeSqLiteDatabase.insert(userTABLE, null, contentValues);
    }



} //Main class
