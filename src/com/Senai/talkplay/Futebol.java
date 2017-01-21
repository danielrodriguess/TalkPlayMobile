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

public class Futebol extends Activity {
	TextView pontos;
	TextView pergunta;
	RadioButton radio1;
	RadioButton radio2;
	RadioButton radio3;
	RadioButton radio4;
	int cont = 1;
	static int pontostotais;
	static String quizz;
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
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		try {
			db = openOrCreateDatabase("trabfinal", Context.MODE_PRIVATE, null);
			db.execSQL("CREATE TABLE IF NOT EXISTS usuario (nome VARCHAR(15) PRIMARY KEY,pontos INTEGER);");
					} catch (SQLException e) {
						Toast.makeText(getApplicationContext(), "Erro na database", Toast.LENGTH_SHORT).show();
		}
		final MainActivity m = new MainActivity(); 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.futebol);
		final RadioGroup radio = (RadioGroup) findViewById(R.id.radiogroup);
		pergunta = (TextView) findViewById(R.id.txt1);
		pontos = (TextView) findViewById(R.id.pontos);
		radio1 = (RadioButton) findViewById(R.id.radio1);
		radio2 = (RadioButton) findViewById(R.id.radio2);
		radio3 = (RadioButton) findViewById(R.id.radio3);
		radio4 = (RadioButton) findViewById(R.id.radio4);
		Button btn1 = (Button) findViewById(R.id.btn1);
		Button voltar = (Button) findViewById(R.id.voltar);
		voltar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Futebol.this,MainActivity.class);
				startActivity(intent);
				
			}
		});
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				
				if(cont == 1){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Futebol.this);
						alerta4.setTitle("Errada");
						alerta4.setMessage("Essa questão está errada");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();					
						 pergunta.setText("2)Em que ano foi fundado o Clube Atlético Mineiro?");
						 radio1.setText("1927");
						 radio2.setText("1908");
						 radio3.setText("1898");
						 radio4.setText("1945");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						
						AlertDialog.Builder alerta = new AlertDialog.Builder(Futebol.this);
						alerta.setTitle("Certa");
						alerta.setMessage("Essa questão está certe");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						pergunta.setText("2)Em que ano foi fundado o Clube Atlético Mineiro?");
						 radio1.setText("1927");
						 radio2.setText("1908");
						 radio3.setText("1898");
						 radio4.setText("1945");
						 contpontos = contpontos + 10;
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio2.setChecked(false);
						
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Futebol.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						 pergunta.setText("2)Em que ano foi fundado o Clube Atlético Mineiro?");
						 radio1.setText("1927");
						 radio2.setText("1908");
						 radio3.setText("1898");
						 radio4.setText("1945");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio3.setChecked(false);
						
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Futebol.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						 pergunta.setText("2)Em que ano foi fundado o Clube Atlético Mineiro?");
						 radio1.setText("1927");
						 radio2.setText("1908");
						 radio3.setText("1898");
						 radio4.setText("1945");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 2){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Futebol.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						 pergunta.setText("3)Quantas vezes o Vasco foi rebaixado?");
						 radio1.setText("1");
						 radio2.setText("0");
						 radio3.setText("3");
						 radio4.setText("10");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Futebol.this);
						alerta.setTitle("Certa");
						alerta.setMessage("Essa questão está certa");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						 pergunta.setText("3)Quantas vezes o Vasco foi rebaixado?");
						 radio1.setText("1");
						 radio2.setText("0");
						 radio3.setText("3");
						 radio4.setText("10");
						 contpontos = contpontos + 10;
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						cont = cont + 1;
						
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Futebol.this);
						alerta4.setTitle("Errada");
						alerta4.setMessage("Essa questão está errada");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						
						 pergunta.setText("3)Quantas vezes o Vasco foi rebaixado?");
						 radio1.setText("1");
						 radio2.setText("0");
						 radio3.setText("3");
						 radio4.setText("10");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);
						
						
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Futebol.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						 pergunta.setText("3)Quantas vezes o Vasco foi rebaixado?");
						 radio1.setText("1");
						 radio2.setText("0");
						 radio3.setText("3");
						 radio4.setText("10");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
						
					break;
					}
				}else if(cont == 3){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Futebol.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						 pergunta.setText("4)Qual desses times nunca foi rebaixado?");
						 radio1.setText("Chapecoense");
						 radio2.setText("Grêmio");
						 radio3.setText("Atlético MG");
						 radio4.setText("Fluminense");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Futebol.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						 pergunta.setText("4)Qual desses times nunca foi rebaixado?");
						 radio1.setText("Chapecoense");
						 radio2.setText("Grêmio");
						 radio3.setText("Atlético MG");
						 radio4.setText("Fluminense");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Futebol.this);
						alerta1.setTitle("Certa");
						alerta1.setMessage("Essa questão está certa");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						 pergunta.setText("4)Qual desses times nunca foi rebaixado?");
						 radio1.setText("Chapecoense");
						 radio2.setText("Grêmio");
						 radio3.setText("Atlético MG");
						 radio4.setText("Fluminense");
						 contpontos = contpontos + 10;
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						cont = cont + 1;
						radio3.setChecked(false);
						
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Futebol.this);
						alerta4.setTitle("Errada");
						alerta4.setMessage("Essa questão está errada");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						 pergunta.setText("4)Qual desses times nunca foi rebaixado?");
						 radio1.setText("Chapecoense");
						 radio2.setText("Grêmio");
						 radio3.setText("Atlético MG");
						 radio4.setText("Fluminense");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
						
					break;
					}
				}else if(cont == 4){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Futebol.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						
						pergunta.setText("5)Quem foi o melhor jogador da copa de 2002?");
						 radio1.setText("Ronaldo Fenômeno");
						 radio2.setText("Oliver Khan");
						 radio3.setText("Ronaldinho Gaúcho");
						 radio4.setText("Rivaldo");
						 contpontos = contpontos + 10;
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						 
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Futebol.this);
						alerta4.setTitle("Certa");
						alerta4.setMessage("Essa questão está certa");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						pergunta.setText("5)Quem foi o melhor jogador da copa de 2002?");
						 radio1.setText("Ronaldo Fenômeno");
						 radio2.setText("Oliver Khan");
						 radio3.setText("Ronaldinho Gaúcho");
						 radio4.setText("Rivaldo");
						 contpontos = contpontos + 10;
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						 radio2.setChecked(false);
						
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Futebol.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						pergunta.setText("5)Quem foi o melhor jogador da copa de 2002?");
						 radio1.setText("Ronaldo Fenômeno");
						 radio2.setText("Oliver Khan");
						 radio3.setText("Ronaldinho Gaúcho");
						 radio4.setText("Rivaldo");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio3.setChecked(false);
						
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Futebol.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						pergunta.setText("5)Quem foi o melhor jogador da copa de 2002?");
						 radio1.setText("Ronaldo Fenômeno");
						 radio2.setText("Oliver Khan");
						 radio3.setText("Ronaldinho Gaúcho");
						 radio4.setText("Rivaldo");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 5){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Futebol.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();

						 pergunta.setText("6)Quem foi o ultimo brasileiro melhor do mundo?");
						 radio1.setText("Rivaldo");
						 radio2.setText("Pelé");
						 radio3.setText("Kaká");
						 radio4.setText("Ronaldinho Gaúcho");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Futebol.this);
						alerta4.setTitle("Certa");
						alerta4.setMessage("Essa questão está certa");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						 pergunta.setText("6)Quem foi o ultimo brasileiro melhor do mundo?");
						 radio1.setText("Rivaldo");
						 radio2.setText("Pelé");
						 radio3.setText("Kaká");
						 radio4.setText("Ronaldinho Gaúcho");
						 contpontos = contpontos + 10;
						 SystemClock.sleep(1);
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
						
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Futebol.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						

						 pergunta.setText("6)Quem foi o ultimo brasileiro melhor do mundo?");
						 radio1.setText("Rivaldo");
						 radio2.setText("Pelé");
						 radio3.setText("Kaká");
						 radio4.setText("Ronaldinho Gaúcho");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);
					break;
					case R.id.radio4:
						
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Futebol.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						 pergunta.setText("6)Quem foi o ultimo brasileiro melhor do mundo?");
						 radio1.setText("Rivaldo");
						 radio2.setText("Pelé");
						 radio3.setText("Kaká");
						 radio4.setText("Ronaldinho Gaúcho");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
						
					break;
					}
				}else if(cont == 6){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Futebol.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						 pergunta.setText("7)Qual o time com mais titulos da UEFA Champions League?");
						 radio1.setText("Manchester United");
						 radio2.setText("Barcelona");
						 radio3.setText("Milan");
						 radio4.setText("Real Madrid");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Futebol.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						 pergunta.setText("7)Qual o time com mais titulos da UEFA Champions League?");
						 radio1.setText("Manchester United");
						 radio2.setText("Barcelona");
						 radio3.setText("Milan");
						 radio4.setText("Real Madrid");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Futebol.this);
						alerta1.setTitle("Certa");
						alerta1.setMessage("Essa questão está certa");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						 pergunta.setText("7)Qual o time com mais titulos da UEFA Champions League?");
						 radio1.setText("Manchester United");
						 radio2.setText("Barcelona");
						 radio3.setText("Milan");
						 radio4.setText("Real Madrid");
						 contpontos = contpontos + 10;
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						cont = cont + 1;
						radio3.setChecked(false);
					break;
					case R.id.radio4:
					
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Futebol.this);
						alerta4.setTitle("Errada");
						alerta4.setMessage("Essa questão está errada");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						
						 pergunta.setText("7)Qual o time com mais titulos da UEFA Champions League?");
						 radio1.setText("Manchester United");
						 radio2.setText("Barcelona");
						 radio3.setText("Milan");
						 radio4.setText("Real Madrid");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 7){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Futebol.this);
						alerta4.setTitle("Errada");
						alerta4.setMessage("Essa questão está errada");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						 pergunta.setText("8)Quem é o maior vencedor da libertadores?");
						 radio1.setText("Independientie");
						 radio2.setText("Boca Júniors");
						 radio3.setText("São Paulo");
						 radio4.setText("Peñarol");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio1.setChecked(false);
						
					break;
					case R.id.radio2:
						AlertDialog.Builder alerta = new AlertDialog.Builder(Futebol.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						 pergunta.setText("8)Quem é o maior vencedor da libertadores?");
						 radio1.setText("Independientie");
						 radio2.setText("Boca Júniors");
						 radio3.setText("São Paulo");
						 radio4.setText("Peñarol");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Futebol.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						 pergunta.setText("8)Quem é o maior vencedor da libertadores?");
						 radio1.setText("Independientie");
						 radio2.setText("Boca Júniors");
						 radio3.setText("São Paulo");
						 radio4.setText("Peñarol");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio3.setChecked(false);
					break;
					case R.id.radio4:
						contpontos = contpontos + 10;
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Futebol.this);
						alerta2.setTitle("Certa");
						alerta2.setMessage("Essa questão está certa");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						 pergunta.setText("8)Quem é o maior vencedor da libertadores?");
						 radio1.setText("Independientie");
						 radio2.setText("Boca Júniors");
						 radio3.setText("São Paulo");
						 radio4.setText("Peñarol");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						 cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 8){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						contpontos = contpontos + 10;
						AlertDialog.Builder alerta = new AlertDialog.Builder(Futebol.this);
						alerta.setTitle("Certa");
						alerta.setMessage("Essa questão está certa");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						pergunta.setText("9)Qual o clube mais antigo do Brasil?");
						 radio1.setText("Ponte Preta");
						 radio2.setText("Atlético MG");
						 radio3.setText("Sport Club Rio Grande");
						 radio4.setText("Santos");
						 pontos.setText("Seus pontos são: "+ contpontos);
						 SystemClock.sleep(1);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Futebol.this);
						alerta4.setTitle("Errada");
						alerta4.setMessage("Essa questão está errada");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						pergunta.setText("9)Qual o clube mais antigo do Brasil?");
						 radio1.setText("Ponte Preta");
						 radio2.setText("Atlético MG");
						 radio3.setText("Sport Club Rio Grande");
						 radio4.setText("Santos");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Futebol.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						pergunta.setText("9)Qual o clube mais antigo do Brasil?");
						 radio1.setText("Ponte Preta");
						 radio2.setText("Atlético MG");
						 radio3.setText("Sport Club Rio Grande");
						 radio4.setText("Santos");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Futebol.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						pergunta.setText("9)Qual o clube mais antigo do Brasil?");
						 radio1.setText("Ponte Preta");
						 radio2.setText("Atlético MG");
						 radio3.setText("Sport Club Rio Grande");
						 radio4.setText("Santos");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 9){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Futebol.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Essa questão está errada");
						alerta1.setNeutralButton("Ok", null);
						alerta1.show();
						pergunta.setText("10)Quem venceu a copa do mundo de 1974?");
						 radio1.setText("Brasil");
						 radio2.setText("Alemanha");
						 radio3.setText("Argentina");
						 radio4.setText("Holanda");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio1.setChecked(false);
					break;
					case R.id.radio2:
					
						AlertDialog.Builder alerta = new AlertDialog.Builder(Futebol.this);
						alerta.setTitle("Errada");
						alerta.setMessage("Essa questão está errada");
						alerta.setNeutralButton("Ok", null);
						alerta.show();
						pergunta.setText("10)Quem venceu a copa do mundo de 1974?");
						 radio1.setText("Brasil");
						 radio2.setText("Alemanha");
						 radio3.setText("Argentina");
						 radio4.setText("Holanda");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio2.setChecked(false);
					break;
					case R.id.radio3:	
						contpontos = contpontos + 10;
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Futebol.this);
						alerta4.setTitle("Certa");
						alerta4.setMessage("Essa questão está certa");
						alerta4.setNeutralButton("Ok", null);
						alerta4.show();
						pergunta.setText("10)Quem venceu a copa do mundo de 1974?");
						 radio1.setText("Brasil");
						 radio2.setText("Alemanha");
						 radio3.setText("Argentina");
						 radio4.setText("Holanda");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio3.setChecked(false);
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Futebol.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Essa questão está errada");
						alerta2.setNeutralButton("Ok", null);
						alerta2.show();
						pergunta.setText("10)Quem venceu a copa do mundo de 1974?");
						 radio1.setText("Brasil");
						 radio2.setText("Alemanha");
						 radio3.setText("Argentina");
						 radio4.setText("Holanda");
						 pontos.setText("Seus pontos são: "+ contpontos);
						cont = cont + 1;
						radio4.setChecked(false);
					break;
					}
				}else if(cont == 10){
					switch(radio.getCheckedRadioButtonId()){
					case R.id.radio1:
						AlertDialog.Builder alerta1 = new AlertDialog.Builder(Futebol.this);
						alerta1.setTitle("Errada");
						alerta1.setMessage("Parabéns. Respondeu a todas. Pontuação: "+contpontos);
						alerta1.setNeutralButton("Ok", new DialogInterface.OnClickListener(){
							@Override
					        public void onClick(DialogInterface dialog, int whichButton)
					        {
								db.execSQL("update usuario set pontos = '"+contpontos+"' WHERE nome = '"+m.nomeee.toString()+"';");
								Intent intent1 = new Intent(Futebol.this,MainActivity.class);
								startActivity(intent1);
					        }
						});
						alerta1.show();	
						radio1.setChecked(false);
					break;
					case R.id.radio2:
						contpontos = contpontos + 10;
						AlertDialog.Builder alerta = new AlertDialog.Builder(Futebol.this);
						alerta.setTitle("Certa");
						alerta.setMessage("Parabéns. Respondeu a todas. Pontuação: "+contpontos);
						alerta.setNeutralButton("Ok", new DialogInterface.OnClickListener(){
							@Override
					        public void onClick(DialogInterface dialog, int whichButton)
					        {
								db.execSQL("update usuario set pontos = '"+contpontos+"' WHERE nome = '"+m.nomeee.toString()+"';");
								Intent intent1 = new Intent(Futebol.this,MainActivity.class);
								startActivity(intent1);
					        }
						});
						alerta.show();	
						radio2.setChecked(false);
					break;
					case R.id.radio3:
						
						AlertDialog.Builder alerta4 = new AlertDialog.Builder(Futebol.this);
						alerta4.setTitle("Errada");
						alerta4.setMessage("Parabéns. Respondeu a todas. Pontuação: "+contpontos);
						alerta4.setNeutralButton("Ok", new DialogInterface.OnClickListener(){
							@Override
					        public void onClick(DialogInterface dialog, int whichButton)
					        {
								db.execSQL("update usuario set pontos = '"+contpontos+"' WHERE nome = '"+m.nomeee.toString()+"';");
								Intent intent1 = new Intent(Futebol.this,MainActivity.class);
								startActivity(intent1);
					        }
						});
						alerta4.show();	
						
						
						
						
						
						
					break;
					case R.id.radio4:
						AlertDialog.Builder alerta2 = new AlertDialog.Builder(Futebol.this);
						alerta2.setTitle("Errada");
						alerta2.setMessage("Parabéns. Respondeu a todas. Pontuação: "+contpontos);
						alerta2.setNeutralButton("Ok", new DialogInterface.OnClickListener(){
							@Override
					        public void onClick(DialogInterface dialog, int whichButton)
					        {
								db.execSQL("update usuario set pontos = '"+contpontos+"' WHERE nome = '"+m.nomeee.toString()+"';");
								Intent intent1 = new Intent(Futebol.this,MainActivity.class);
								startActivity(intent1);
					        }
						});
						alerta2.show();	
						radio4.setChecked(false);
					break;
					default:
						AlertDialog.Builder alerta3 = new AlertDialog.Builder(Futebol.this);
						alerta3.setTitle("Erro");
						alerta3.setMessage("Você deve selecionar uma opção");
						alerta3.setNeutralButton("Ok", null);
						alerta3.show();
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
		
		return super.onOptionsItemSelected(item);
	}
}
