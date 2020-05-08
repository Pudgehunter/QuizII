package main;

import excepciones.Excepciones;
import processing.core.PApplet;

public class Main extends PApplet {

	private int pruebaA;
	private int pruebaB;
	Cuadrado[][] cuadrado;
	boolean stop;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
	}
	
	public void settings() {
		size(600,400);
	}
	
	public void setup() {
		pruebaA = 30;
		pruebaB = 20;
		stop = false;
		for (int i = 0; i < pruebaA; i++) {
			for (int j = 0; j < pruebaB; j++) {
				cuadrado = new Cuadrado[i][j];
			}
		}
	}
	
	public void draw() {
		background(200);
		dibujarCuadrados();
	}
	
	public void dibujarCuadrados() {
		for (int i = 0; i < pruebaA; i++) {
			for (int j = 0; j < pruebaB; j++) {
				if(i % 2 == 0 && j % 2 == 0) {
					fill(0);
				}
				else {
					fill(255);
				}
				if((i % 2!=0)& j % 2!=0 )  {
					fill(0);
				}
				cuadrado[i][j] = new Cuadrado(this,0+(600/30)*i,0+(400/20)*j,(600/30),(400/20));
				cuadrado[i][j].dibujar();
				try {
					cuadrado[i][j] = new Cuadrado(this,0+(600/30)*i,0+(400/20)*j,(600/30),(400/20));
					 } catch(java.lang.IndexOutOfBoundsException e){
						 System.out.println("porquenopinta!!");
					 }
				if((i % 2!=0)& j % 2!=0 )  {
					new Thread(cuadrado[i][j]).start();
				}
			}
		}
	}
	
	public void errores() throws Excepciones {
		if(stop == true) {
			throw new Excepciones("no se puede mover");
		}
	}
	
	public void mouseClicked() {
		for (int i = 0; i < pruebaA; i++) {
			for (int j = 0; j < pruebaB; j++) {
		int a = (int) dist(mouseX,mouseY,cuadrado[i][j].getPosX(),cuadrado[i][j].getPosY());
		if(a>30) {
			cuadrado[i][j].stop();
			stop = true;
				}
			}
		}
		
		
	}

}
