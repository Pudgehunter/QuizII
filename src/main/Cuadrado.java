package main;

import processing.core.PApplet;

public class Cuadrado implements Runnable{
	PApplet app;
	private int posX,posY,tamX,tamY,vel,dirX,dirY;

	public Cuadrado (PApplet app,int posX,int posY, int tamX, int tamY) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;

		this.vel = (int) app.random(1,5);
		this.dirX = (int) app.random(-2, 2);
		this.dirY = (int) app.random(-2, 2);
	}

	public void run() {
		mover();
	}
	
	public void dibujar() {
		app.rect(posX, posY, tamX, tamY);
	}
	
	public void mover() {
		posY = posY + 5;
	}
	public void stop() {
		posY = 0;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTamX() {
		return tamX;
	}

	public void setTamX(int tamX) {
		this.tamX = tamX;
	}

	public int getTamY() {
		return tamY;
	}

	public void setTamY(int tamY) {
		this.tamY = tamY;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getDirY() {
		return dirY;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}
	
	
}
