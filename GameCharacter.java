public class GameCharacter{

	private String name;
	private int health;
	private int attackPower;
	
	public GameCharacter(String name, int health, int atk){
	
		this.name = name;
		this.health = health;
		this.attackPower = atk;
	
	}//end constructor
	
	public void addHealth(){
	
		this.health +=20;
	}
	
	public void addAttackPower(){
	
		this.attackPower +=20;
	}
	
	
	public void takeDamage(int damage){
	
		if(this.health > damage){
		
			this.health -= damage;
			
		}
		else{
		
			this.health = 0;
			
		}
	
	}//end takeDamage
	
	public String getName() { 
		return this.name; 
	}
	public int getHealth() { 
		return this.health;
	}
	
	public int getAttackPower() { 
		return this.attackPower; 
	}
	
	public String toString(){
	
		return String.format("Name: [%s], Health: [%s], Attack: [%s]", this.name, this.health, this.attackPower);
	
	}//end toString

}//end class