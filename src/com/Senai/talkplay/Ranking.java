package com.Senai.talkplay;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Ranking extends Activity {
	SQLiteDatabase db;
	MainActivity m = new MainActivity();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ranking1);
		TextView primeiro = (TextView) findViewById(R.id.txtpri);
		TextView segundo = (TextView) findViewById(R.id.txtseg);
		TextView terceiro = (TextView) findViewById(R.id.txtterc);
		TextView quarto = (TextView) findViewById(R.id.txtquar);
		TextView quinto = (TextView) findViewById(R.id.txtqui);
		
		try {
			db = openOrCreateDatabase("trabfinal", Context.MODE_PRIVATE, null);
			db.execSQL("CREATE TABLE IF NOT EXISTS usuario (nome VARCHAR(15) PRIMARY KEY,pontos INTEGER);");
					} catch (SQLException e) {
						Toast.makeText(getApplicationContext(), "Erro na database", Toast.LENGTH_SHORT).show();
		}
		
		Cursor c = db.rawQuery("SELECT max(pontos) FROM usuario ", null);
		Cursor ccount = db.rawQuery("SELECT count(*) as media FROM usuario ", null);
		Cursor c3 = db.rawQuery("SELECT top 5,count(pontos) FROM usuario ", null);
		Cursor c4 = db.rawQuery("SELECT top 5,count(pontos) FROM usuario ", null);
		Cursor c5 = db.rawQuery("SELECT top 5,count(pontos) FROM usuario ", null);
		if(ccount.getCount() == 1){
			int valor = c.getColumnIndex("media");
			primeiro.setText("1° Lugar "+c);
			
			
			
			
		}else if(ccount.getCount() == 2){
			int valor = c.getColumnIndex("media");
			primeiro.setText("1° Lugar "+c);
			segundo.setText("2° Lugar ");
			
			
			
			
		}else	if(ccount.getCount() == 3){
			int valor = c.getColumnIndex("media");
			primeiro.setText("1° Lugar "+c);
			segundo.setText("2° Lugar ");
			terceiro.setText("3° Lugar ");
			
			
			
			
		}else	if(ccount.getCount() == 4){
			int valor = c.getColumnIndex("media");
			primeiro.setText("1° Lugar "+c);
			segundo.setText("2° Lugar ");
			terceiro.setText("3° Lugar ");
			quarto.setText("4° Lugar ");
			
			
			
			
		}else if(ccount.getCount() == 5){
			int valor = c.getColumnIndex("media");
			primeiro.setText("1° Lugar "+c);
			segundo.setText("2° Lugar ");
			terceiro.setText("3° Lugar ");
			quarto.setText("4° Lugar ");
			quinto.setText("5° Lugar ");
			
			
			
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ranking, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
