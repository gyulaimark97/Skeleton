package gameEngine.gameEntities;

public class Enemy extends GameEntity {
	
	
	private int health;
	
	public void attack() {}
	public void decraseHealth(int decraseWith) {}
	public void incraseHealth(int incraseWith) {}
	
	public int getHealth() {
		return 0;
	}
	public void setHealth(int health) {}
	
	public void behave() {}
	
	@Override
	public void setName(String name) {}
	@Override
	public void getName() {}
	


}
