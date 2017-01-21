package com.Senai.talkplay;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings.System;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Primeira_Pergunta extends Activity {
	TextView pontos;
	TextView pergunta;
	RadioButton radio1;
	RadioButton radio2;
	RadioButton radio3;
	RadioButton radio4;
	int cont = 1;
	int contpontos;
	View v;
	View v2;
	View v3;
	View v4;
	View v5;
	View v6;
	View v7;
	View v8;
	View v9;
	View v10;
	SQLiteDatabase db;
	MainActivity m = new MainActivity();
	Futebol f = new Futebol();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_primeira__pergunta);
		final RadioGroup radio = (RadioGroup) findViewById(R.id.radiogroup);
		f.quizz = "informática";
		pergunta = (TextView) findViewById(R.id.txt1);
		pontos = (TextView) findViewById(R.id.pontos);
		radio1 = (RadioButton) findViewById(R.id.radio1);
		radio2 = (RadioButton) findViewById(R.id.radio2);
		radio3 = (RadioButton) findViewById(R.id.radio3);
		radio4 = (RadioButton) findViewById(R.id.radio4);
		Button btn1 = (Button) findViewById(R.id.btn1);
		Button voltar = (Button) findViewById(R.id.voltar);
		try {
			db = openOrCreateDatabase("trabfinal", Context.MODE_PRIVATE, null);
			db.execSQL("CREATE TABLE IF NOT EXISTS usuario (nome VARCHAR(15) PRIMARY KEY,pontos INTEGER);");
					} catch (SQLException e) {
						Toast.makeText(getApplicationContext(), "Erro na database", Toast.LENGTH_SHORT).show();
		}
		voltar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Primeira_Pergunta.this,MainActivity.class);
				startActivity(intent);
				
			}
		});
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(cont == 1){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta.setTitle("Certa");
						alerta.setMessage("Essa questão está certa");
						alerta.setNeutralButton("Ok", null);
						alerta.show();					
						pergunta.setText("2)Qual o nome do desenvolvedor do facebook?");
						radio1.setText("Eduardo Seven");
						radio2.setText("Kurt Cobain");
						radio3.setText("Mark Zuckerberg");
						radio4.setText("Bill Gates");
						contpontos = contpontos + 10;
						pontos.setText("Seus pontos são: "+ contpontos);
						SystemClock.sleep(1);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta4.setTitle("Errada");
						alerta4.setMessage("Essa questão está errada");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						pergunta.setText("2)Qual o nome do desenvolvedor do facebook?");
						radio1.setText("Eduardo Seven");
						radio2.setText("Kurt Cobain");
						radio3.setText("Mark Zuckerberg");
						radio4.setText("Bill Gates");
						pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
						
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						pergunta.setText("2)Qual o nome do desenvolvedor do facebook?");
						radio1.setText("Eduardo Seven");
						radio2.setText("Kurt Cobain");
						radio3.setText("Mark Zuckerberg");
						radio4.setText("Bill Gates");
						pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);						
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						pergunta.setText("2)Qual o nome do desenvolvedor do facebook?");
						radio1.setText("Eduardo Seven");
						radio2.setText("Kurt Cobain");
						radio3.setText("Mark Zuckerberg");
						radio4.setText("Bill Gates");
						pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
					break;
					
						}
					
					
				}else if(cont == 2){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						 pergunta.setText("3)Quem é conhecido como o pai da informática?");
						 radio1.setText("Ozzy Osborne");
						 radio2.setText("Thiago Reis");
						 radio3.setText("Mark Zuckerberg");
						 radio4.setText("Alan Turing");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						pergunta.setText("3)Quem é conhecido como o pai da informática?");
						 radio1.setText("Ozzy Osborne");
						 radio2.setText("Thiago Reis");
						 radio3.setText("Mark Zuckerberg");
						 radio4.setText("Alan Turing");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta4.setTitle("Certa");
						alerta4.setMessage("Essa questão está certa");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						
						pergunta.setText("3)Quem é conhecido como o pai da informática?");
						 radio1.setText("Ozzy Osborne");
						 radio2.setText("Thiago Reis");
						 radio3.setText("Mark Zuckerberg");
						 radio4.setText("Alan Turing");
						 contpontos = contpontos + 10;
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						cont = cont + 1;
						radio3.setChecked(false);		
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						pergunta.setText("3)Quem é conhecido como o pai da informática?");
						 radio1.setText("Ozzy Osborne");
						 radio2.setText("Thiago Reis");
						 radio3.setText("Mark Zuckerberg");
						 radio4.setText("Alan Turing");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);					
					break;
					}
				}else if(cont == 3){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						 pergunta.setText("4)Qual o sistema operacional de dispositivos móveis é dominante no mercado?");
						 radio1.setText("Android");
						 radio2.setText("IOS");
						 radio3.setText("Windows Phone");
						 radio4.setText("Java Mobile");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						 pergunta.setText("4)Qual o sistema operacional de dispositivos móveis é dominante no mercado?");
						 radio1.setText("Android");
						 radio2.setText("IOS");
						 radio3.setText("Windows Phone");
						 radio4.setText("Java Mobile");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						 pergunta.setText("4)Qual o sistema operacional de dispositivos móveis é dominante no mercado?");
						 radio1.setText("Android");
						 radio2.setText("IOS");
						 radio3.setText("Windows Phone");
						 radio4.setText("Java Mobile");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);
						
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta4.setTitle("Certa");
						alerta4.setMessage("Essa questão está certa");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						pergunta.setText("4)Qual o sistema operacional de dispositivos móveis é dominante no mercado?");
						 radio1.setText("Android");
						 radio2.setText("IOS");
						 radio3.setText("Windows Phone");
						 radio4.setText("Java Mobile");
						 contpontos = contpontos + 10;
						 pontos.setText("Seus pontos são: "+ contpontos);
						 radio4.setChecked(false);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						 break;
					}
				}else if(cont == 4){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta.setTitle("Certa");
						alerta.setMessage("Essa questão está certa");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						
						pergunta.setText("5)Qual o hacker que desbloqueou o Iphone?");
						 radio1.setText("Kevin Mitnick");
						 radio2.setText("George Hotz");
						 radio3.setText("Kelvin Pousen");
						 radio4.setText("Stephen Hawking");
						 contpontos = contpontos + 10;
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 
						 cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						 
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta4.setTitle("Errada");
						alerta4.setMessage("Essa questão está errada");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						pergunta.setText("5)Qual o hacker que desbloqueou o Iphone?");
						 radio1.setText("Kevin Mitnick");
						 radio2.setText("George Hotz");
						 radio3.setText("Kelvin Pousen");
						 radio4.setText("Stephen Hawking");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
						
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						pergunta.setText("5)Qual o hacker que desbloqueou o Iphone?");
						 radio1.setText("Kevin Mitnick");
						 radio2.setText("George Hotz");
						 radio3.setText("Kelvin Pousen");
						 radio4.setText("Stephen Hawking");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);
						
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						pergunta.setText("5)Qual o hacker que desbloqueou o Iphone?");
						 radio1.setText("Kevin Mitnick");
						 radio2.setText("George Hotz");
						 radio3.setText("Kelvin Pousen");
						 radio4.setText("Stephen Hawking");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 5){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();

						 pergunta.setText("6)Qual empresa que desenvolveu o Personal Computer?");
						 radio1.setText("Apple");
						 radio2.setText("Microsoft");
						 radio3.setText("LGBT");
						 radio4.setText("IBM");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta4.setTitle("Certa");
						alerta4.setMessage("Essa questão está certa");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						pergunta.setText("6)Qual empresa que desenvolveu o Personal Computer?");
						 radio1.setText("Apple");
						 radio2.setText("Microsoft");
						 radio3.setText("LGBT");
						 radio4.setText("IBM");
						 contpontos = contpontos + 10;
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						
							
						radio2.setChecked(false);
						
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						

						 pergunta.setText("6)Qual empresa que desenvolveu o Personal Computer?");
						 radio1.setText("Apple");
						 radio2.setText("Microsoft");
						 radio3.setText("LGBT");
						 radio4.setText("IBM");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);
					break;
					case R.id.radio4:
						
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();

						 pergunta.setText("6)Qual empresa que desenvolveu o Personal Computer?");
						 radio1.setText("Apple");
						 radio2.setText("Microsoft");
						 radio3.setText("LGBT");
						 radio4.setText("IBM");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
						
					break;
					}
				}else if(cont == 6){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						 pergunta.setText("7)Qual dessas marcas não produzem celulares?");
						 radio1.setText("Panasonic");
						 radio2.setText("Motorola");
						 radio3.setText("Positivo");
						 radio4.setText("LG");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						 pergunta.setText("7)Qual dessas marcas não produzem celulares?");
						 radio1.setText("Panasonic");
						 radio2.setText("Motorola");
						 radio3.setText("Positivo");
						 radio4.setText("LG");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						 pergunta.setText("7)Qual dessas marcas não produzem celulares?");
						 radio1.setText("Panasonic");
						 radio2.setText("Motorola");
						 radio3.setText("Positivo");
						 radio4.setText("LG");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);
					break;
					case R.id.radio4:
						contpontos = contpontos + 10;
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta4.setTitle("Certa");
						alerta4.setMessage("Essa questão está certa");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						
						 pergunta.setText("7)Qual dessas marcas não produzem celulares?");
						 radio1.setText("Panasonic");
						 radio2.setText("Motorola");
						 radio3.setText("Positivo");
						 radio4.setText("LG");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 7){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						contpontos = contpontos + 10;
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta4.setTitle("Certa");
						alerta4.setMessage("Essa questão está certa");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						 pergunta.setText("8)Qual a linha de processador da Intel?");
						 radio1.setText("AMD5.1,AMD4.5,AMD9.0");
						 radio2.setText("I3,I5,I7");
						 radio3.setText("GVForce7,GvForce6,GVForce4");
						 radio4.setText("Galaxy S5,Galaxy S6,Galaxy S7");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio1.setChecked(false);
						
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						pergunta.setText("8)Qual a linha de processadores da Intel?");
						 radio1.setText("AMD5.1,AMD4.5,AMD9.0");
						 radio2.setText("I3,I5,I7");
						 radio3.setText("GVForce7,GvForce6,GVForce4");
						 radio4.setText("Galaxy S5,Galaxy S6,Galaxy S7");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						pergunta.setText("8)Qual a linha de processadores da Intel?");
						 radio1.setText("AMD5.1,AMD4.5,AMD9.0");
						 radio2.setText("I3,I5,I7");
						 radio3.setText("GVForce7,GvForce6,GVForce4");
						 radio4.setText("Galaxy S5,Galaxy S6,Galaxy S7");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						pergunta.setText("8)Qual a linha de processadores da Intel?");
						 radio1.setText("AMD5.1,AMD4.5,AMD9.0");
						 radio2.setText("I3,I5,I7");
						 radio3.setText("GVForce7,GvForce6,GVForce4");
						 radio4.setText("Galaxy S5,Galaxy S6,Galaxy S7");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 8){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						
						AlertDialog.Builder alerta = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						pergunta.setText("9)Qual foi a primeira empresa a criar um desktop?");
						 radio1.setText("Apple");
						 radio2.setText("IBM");
						 radio3.setText("Positivo");
						 radio4.setText("Microsoft");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						contpontos = contpontos + 10;
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta4.setTitle("Certa");
						alerta4.setMessage("Essa questão está certa");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						 pergunta.setText("9)Qual foi a primeira empresa a criar um desktop?");
						 radio1.setText("Apple");
						 radio2.setText("IBM");
						 radio3.setText("Positivo");
						 radio4.setText("Microsoft");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						pergunta.setText("9)Qual foi a primeira empresa a criar um desktop?");
						 radio1.setText("Apple");
						 radio2.setText("IBM");
						 radio3.setText("Positivo");
						 radio4.setText("Microsoft");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						pergunta.setText("9)Qual foi a primeira empresa a criar um desktop?");
						 radio1.setText("Apple");
						 radio2.setText("IBM");
						 radio3.setText("Positivo");
						 radio4.setText("Microsoft");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 9){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						pergunta.setText("10)Qual a empresa mais cara do mundo?");
						 radio1.setText("Microsoft");
						 radio2.setText("Apple");
						 radio3.setText("Google");
						 radio4.setText("Mc Donalds");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						contpontos = contpontos + 10;
						AlertDialog.Builder alerta = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta.setTitle("Certa");
						alerta.setMessage("Essa questão está certa");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						 pergunta.setText("10)Qual a empresa mais cara do mundo?");
						 radio1.setText("Microsoft");
						 radio2.setText("Apple");
						 radio3.setText("Google");
						 radio4.setText("Mc Donalds");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta4.setTitle("Errada");
						alerta4.setMessage("Essa questão está errada");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						pergunta.setText("10)Qual a empresa mais cara do mundo?");
						 radio1.setText("Microsoft");
						 radio2.setText("Apple");
						 radio3.setText("Google");
						 radio4.setText("Mc Donalds");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						pergunta.setText("10)Qual a empresa mais cara do mundo?");
						 radio1.setText("Microsoft");
						 radio2.setText("Apple");
						 radio3.setText("Google");
						 radio4.setText("Mc Donalds");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 10){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta7 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta7.setTitle("Certa");
						alerta7.setMessage("Parabéns você terminou o quiz, seu total de pontos foi: "+contpontos);
						alerta7.setNeutralButton("Ok", new DialogInterface.OnClickListener(){
							@Override
					        public void onClick(DialogInterface dialog, int whichButton)
					        {
								db.execSQL("update usuario set pontos = '"+contpontos+"' WHERE nome = '"+m.nomeee.toString()+"';");
								Intent intent1 = new Intent(Primeira_Pergunta.this,MainActivity.class);
								startActivity(intent1);
					        }
						});
						alerta7.show();	
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta6 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta6.setTitle("Certa");
						alerta6.setMessage("Parabéns você terminou o quiz, seu total de pontos foi: "+contpontos);
						alerta6.setNeutralButton("Ok", new DialogInterface.OnClickListener(){
							@Override
					        public void onClick(DialogInterface dialog, int whichButton)
					        {
								db.execSQL("update usuario set pontos = '"+contpontos+"' WHERE nome = '"+m.nomeee.toString()+"';");
								Intent intent1 = new Intent(Primeira_Pergunta.this,MainActivity.class);
								startActivity(intent1);
					        }
						});
						alerta6.show();	
					break;
					case R.id.radio3:
						contpontos = contpontos + 10;
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta4.setTitle("Certa");
						alerta4.setMessage("Parabéns você terminou o quiz, seu total de pontos foi: "+contpontos);
						alerta4.setNeutralButton("Ok", new DialogInterface.OnClickListener(){
							@Override
					        public void onClick(DialogInterface dialog, int whichButton)
					        {
								db.execSQL("update usuario set pontos = '"+contpontos+"' WHERE nome = '"+m.nomeee.toString()+"';");
								Intent intent1 = new Intent(Primeira_Pergunta.this,MainActivity.class);
								startActivity(intent1);
					        }
						});
						alerta4.show();	
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta5 = new AlertDialog.Builder(Primeira_Pergunta.this);
						alerta5.setTitle("Certa");
						alerta5.setMessage("Parabéns você terminou o quiz, seu total de pontos foi: "+contpontos);
						alerta5.setNeutralButton("Ok", new DialogInterface.OnClickListener(){
							@Override
					        public void onClick(DialogInterface dialog, int whichButton)
					        {
								db.execSQL("update usuario set pontos = '"+contpontos+"' WHERE nome = '"+m.nomeee.toString()+"';");
								Intent intent1 = new Intent(Primeira_Pergunta.this,MainActivity.class);
								startActivity(intent1);
					        }
						});
						alerta5.show();					
					break;
					}
				}
				
				
					
				
			}
			
		});
		
		
		
		
	}

	
	
	
	 
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.primeira__pergunta, menu);
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
