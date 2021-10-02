package com.example.pictureshare;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.pictureshare.UserSQLhelpopen;

//将数据保存到本地数据库
public class SQLiteApihelp {
    private MySQLiteQpenHelper myDbHelper;
    public UserSQLhelpopen.Uesrdbopen usedbhelper;
    public void PSQL(Context context){
        usedbhelper = new UserSQLhelpopen.Uesrdbopen(context);
        SQLiteDatabase db = usedbhelper.getReadableDatabase();
    }

    public void User(Context context){

    }

    public void U_P(Context context){

    }
}
