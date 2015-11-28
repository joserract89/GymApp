package org.example.gymapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hp1 on 25/11/2015.
 */
public class HistoricoPesosBD extends SQLiteOpenHelper {

    public HistoricoPesosBD(Context context) {
        super(context, "historico_pesos", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
