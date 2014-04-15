package com.metikulous.list;
 
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
 
 
public abstract class Database extends SQLiteOpenHelper {
	SQLiteDatabase db1 = null;
	
 static String DBNAME = "list.sqlite";
 private static final String MYDATABASE = "list";
 private static final int VERSION = 1;
 
 public Database(Context connection) {
  super(connection, MYDATABASE, null, VERSION);
 }
 
 @Override
 public void onCreate(SQLiteDatabase db) {
  db.execSQL("CREATE TABLE EnteredText(id INTEGER PRIMARY KEY, youEntered TEXT);");
 }
 
}