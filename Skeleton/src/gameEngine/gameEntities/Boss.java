package gameEngine.gameEntities;

public class Boss extends GameEntity {
	
	private int health;
	
	public void attack() {}
	public void heavyAttack() {}
	public void ability1() {}
	public void ability2() {}
	public void ability3() {}
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
