package graphics;

import java.awt.Image;

public abstract class Sprite {
	private Image image;
	private double width;
	private double height;
	private double posX;
	private double posY;
	private int spriteNumber;
	
	public abstract double getWidth();
	public abstract double getHeight();
	public abstract void animate();
	public abstract void draw();

	public void add(Image img) {} 
	public void load(Image img) {}
	
	
}
