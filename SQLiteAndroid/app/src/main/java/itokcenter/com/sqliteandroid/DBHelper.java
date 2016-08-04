package itokcenter.com.sqliteandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Gorro on 04/08/16.
 */
public class DBHelper extends SQLiteOpenHelper {

    static final String DBNAME = "CursoUPIICSA.db";
    static final int DBVERSION = 1;
    public static final String TABLE_NAME = "CURSO";
    public static final String _ID = "id";

    String sqliteCreate = "CREATE TABLE "
            + TABLE_NAME
            + " ( "
            + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nombre TEXT, " +
            "edad INTEGER, " +
            "domicilio TEXT );";


    public DBHelper(Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
