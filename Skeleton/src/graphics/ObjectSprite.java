package graphics;

import java.util.ArrayList;

public class ObjectSprite  {
	
	private ArrayList<Sprite> sprites;
	private String objectName;
	private double width;
	private double height;
	private double posX;
	private double posY;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
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
	
	public void draw(double posX, double posY) {}
	
	public void add(Sprite newSprite) {}
	
	public void animate() {}
	
	public void update() {}
	

}
