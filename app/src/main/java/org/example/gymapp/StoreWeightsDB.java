package org.example.gymapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hp1 on 25/11/2015.
 */
public class StoreWeightsDB extends SQLiteOpenHelper {

    public StoreWeightsDB(Context context) {
        super(context, "weights_history", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE exercise_names (" +
                "id_exercise INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "exercise TEXT);");
        db.execSQL("CREATE TABLE weights (" +
                "id_weight, " +
                "id_exercise INTEGER, " +
                "weight REAL, " +
                "date TEXT, " +
                "FOREIGN KEY(id_exercise) REFERENCES exercise_names(id_exercise)" +
                ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
