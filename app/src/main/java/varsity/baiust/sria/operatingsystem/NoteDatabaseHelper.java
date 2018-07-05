package varsity.baiust.sria.operatingsystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NoteDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="MyNotes.db";
    private static final String TABLE_NAME="Short_Note";
    private static final String COL_ID="ID";
    private static final String COL_NOTE="NOTE";


    public NoteDatabaseHelper(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = " CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT," + COL_NOTE + " TEXT )";
        db.execSQL(createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    public boolean addNote(String item)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_NOTE,item);

        long result = db.insert(TABLE_NAME,null,contentValues);

        if(result == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public Cursor getData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = " SELECT * FROM " + TABLE_NAME;
        Cursor data = db.rawQuery(query,null);
        return data;

    }

    public Cursor getItemID(String note)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query=" SELECT " + COL_ID + " FROM " + TABLE_NAME + " WHERE " + COL_NOTE + " = '" + note + "'";
        Cursor data = db.rawQuery(query,null);
        return data;
    }


    public void updateNote(String newNote,int id,String oldNote)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query= " UPDATE " + TABLE_NAME + " SET " + COL_NOTE + " = '" + newNote + "' WHERE " + COL_ID + " = '" + id + "'"
                + " AND " + COL_NOTE + " = '" + oldNote + "'";
        db.execSQL(query);

    }

    public void deleteNote(int id,String note)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query= " DELETE FROM " + TABLE_NAME + " WHERE " + COL_ID + " = '" + id + "'"
                + " AND " + COL_NOTE + "= '" + note + "'";
        db.execSQL(query);
    }



}
