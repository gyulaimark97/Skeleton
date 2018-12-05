package gameEngine;

import java.util.ArrayList;

import org.lwjgl.util.vector.Vector2f;

import graphics.Sprite;

public class GameObject {
	
	private Vector2f position;
	private Vector2f direction;
	private float speed;
	private ArrayList<Sprite> animations;
	private int currentFrame;
	private int width;
	private int height;
	
	public Vector2f getPosition() {
		return null;
	}
	public void setPosition(Vector2f position) {}
	public float getSpeed() {
		return 0;
	}
	public void setSpeed(float speed) {}
	public int getCurrentFrame() {
		return 0;
	}
	
	public void draw() {}
	public void spawn() {}
	public void unSpawn() {}
	public void interpolate(Vector2f a, Vector2f b) {}
	public void update() {}
	public void collided() {}
	

}
