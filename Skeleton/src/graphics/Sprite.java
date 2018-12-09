package graphics;

import java.awt.Image;

public  class Sprite {
	private Image image;
	private double width;
	private double height;
	private double posX;
	private double posY;
	private int spriteNumber;
	
	
	public  void draw(double posX, double posY, Image img);

	public void add(Image img) {} 
	public void load(String string) {}
	
	public double getPosX() {
		return posX;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public double getPosY() {
		return posY;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
	
	
	
}
