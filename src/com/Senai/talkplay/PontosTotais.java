package com.Senai.talkplay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PontosTotais extends Activity {
	SQLiteDatabase db;
	Futebol f = new Futebol();
	MainActivity m = new MainActivity();
Primeira_Pergunta p = new Primeira_Pergunta();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pontos_totais);
		TextView pontos = (TextView) findViewById(R.id.textView3);
		TextView prosseguir = (TextView) findViewById(R.id.textView4);
		Button futebol = (Button) findViewById(R.id.futebol2);
		Button inicial = (Button) findViewById(R.id.inicial);
		try {
			db = openOrCreateDatabase("trabfinal", Context.MODE_PRIVATE, null);
			db.execSQL("CREATE TABLE IF NOT EXISTS usuario (nome VARCHAR(15) PRIMARY KEY,pontos INTEGER);");
					} catch (SQLException e) {
						Toast.makeText(getApplicationContext(), "Erro na database", Toast.LENGTH_SHORT).show();
		}
		Cursor c = db.rawQuery("SELECT * FROM usuario where nome = '"+m.nome2+"' ", null);
		pontos.setText(""+c);
		if(f.quizz == "futebol"){
			
		}else{
			prosseguir.setText("Você deseja prosseguir para o quizz de  informática?");
			futebol.setText("Informática");
		}
		inicial.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(PontosTotais.this,MainActivity.class);
				startActivity(intent);
				
			}
		});
		
		futebol.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(f.quizz == "futebol"){
					
					Intent intent = new Intent(PontosTotais.this,Futebol.class);
					startActivity(intent);
				}else{
					Intent intent = new Intent(PontosTotais.this,Primeira_Pergunta.class);
					startActivity(intent);
				}
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pontos_totais, menu);
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
