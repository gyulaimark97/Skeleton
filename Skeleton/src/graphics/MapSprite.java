package graphics;

import java.util.ArrayList;

public class MapSprite {

	private ArrayList<Sprite> mapObject;
	private double width;
	private double height;
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

	
	public void draw(double posX, double posY, Sprite mapObject) {}
	
	public boolean isActive() {return false;}
	
	public void animate() {}
	
	public void update() {}
	
	public void delet() {}
}
