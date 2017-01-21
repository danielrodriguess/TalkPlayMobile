package com.Senai.talkplay;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.Editable;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.provider.Settings.System;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	static String nome2;
	static String quizz = "futebol";
	public Cursor c;
	String nome3;
	public static int login;
	public static String nomeee;
	SQLiteDatabase db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView bemvindo = (TextView) findViewById(R.id.txt1);
		final EditText txtnome = (EditText) findViewById(R.id.txtnome);
		Button futebol = (Button) findViewById(R.id.futebol);
		final Button nome = (Button) findViewById(R.id.nome);
		Button jogar = (Button) findViewById(R.id.btn1);
		try {
		db = openOrCreateDatabase("trabfinal", Context.MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS usuario (nome VARCHAR(15) PRIMARY KEY,pontos INTEGER);");
				} catch (SQLException e) {
					Toast.makeText(getApplicationContext(), "Erro na database", Toast.LENGTH_SHORT).show();
	}
		if(login == 1){
			nome.setText("Deslogar");
			bemvindo.setText("Seja bem vindo "+nomeee);
			txtnome.setText(""+nomeee);
			txtnome.setEnabled(false);
		}
		nome.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(login == 1){
					login = 0;
					Toast.makeText(getApplicationContext(), "Usuário deslogado com sucesso", Toast.LENGTH_SHORT).show();
					txtnome.setText("");
					txtnome.setEnabled(true);
					bemvindo.setText("Seja bem vindo");
					nome.setText("Cadastrar e Logar");
				}else{
				if(txtnome.getText().toString().equals("")){
					AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
					alerta.setTitle("Erro");
					alerta.setMessage("Preencha o campo");
					alerta.setNeutralButton("Ok", null);
					alerta.show();
					nome.setText("Cadastrar e Logar");
				}else{
				Cursor c = db.rawQuery("SELECT * FROM usuario where nome = '"+txtnome.getText()+"'", null);
				if(c.getCount() > 0){
					login = 1;
					Toast.makeText(getApplicationContext(), "Usuário logado com sucesso", Toast.LENGTH_SHORT).show();
					txtnome.setEnabled(false);
					nomeee = txtnome.getText().toString();
					bemvindo.setText("Seja bem vindo "+nomeee);
					nome.setText("Deslogar");							
					nome2 = txtnome.getText().toString();
				}else{
					login = 1;
					db.execSQL("INSERT INTO usuario (nome,pontos) VALUES('"+txtnome.getText()+"',0);");
					txtnome.setEnabled(false);
					nomeee = txtnome.getText().toString();
					bemvindo.setText("Seja bem vindo "+nomeee);
					nome.setText("Deslogar");
					Toast.makeText(getApplicationContext(), "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
				}
				}
			}
			}
		});
		
		jogar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
					if(login == 1){
						Intent intent = new Intent(MainActivity.this,Primeira_Pergunta.class);
						startActivity(intent);
					}else{
						AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
						alerta.setTitle("Login");
						alerta.setMessage("Logue-se primeiro");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
					}
				
			}
		});
		
		futebol.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(login == 1){
					Intent intent = new Intent(MainActivity.this,Futebol.class);
					startActivity(intent);
				}else{
					AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
					alerta.setTitle("Login");
					alerta.setMessage("Logue-se primeiro");
					alerta.setNeutralButton("Ok", null);
					alerta.show();
				}
					
				
					
				
				
			}
		});
		
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		
		return super.onOptionsItemSelected(item);
	}
}
