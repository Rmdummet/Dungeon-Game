import java.util.Scanner;
import java.util.NoSuchElementException;

public class Player extends GameCharacter{

	private int mana;
	private Scanner input;
	boolean hasRun = false;
	
	
	public Player(String name, int health, int atk, int mana){
	
		super(name, health, atk);
		this.mana = mana;
		input = new Scanner(System.in);
	
	}//end player
	
	public void addHealthPotion(){
	
		super.addHealth();
	
	}
	public void addAttackPowerPotion(){
	
		super.addAttackPower();
	
	}
	
	
	public void attack(Monster monster){
	
		monster.takeDamage(super.getAttackPower());
	
	}//end attack
	
	public void castSpell(Monster monster){
	
		if(this.mana > 10){
		
			monster.takeDamage(super.getAttackPower()*3);
		
		}//end if
		else{
		
			System.out.println("Not Enough Mana!\n");
			
		}
	
	}//end spell
	
	public void chargeMana(){
	
		this.mana += 8;
	
	}//end Mana
	
	public void AddItems(){
		
		System.out.println("You have added monsters Treasure to your inventory!");
	
	}
	
	public void run(){
	
		hasRun = true;
		
	
	}
	
	public boolean getRun(){
	
		return hasRun;
	
	}
	
	
	
	public void takeTurn(Monster monster){
	
		int choice;
		boolean correct = false;
		
		while(!correct){
		
			System.out.println("What would you like to do?\n1. Attack\n" + "2. Cast Spell\n3. Charge Mana\n4. Add Items\n5. run\n");
			
			try{
				choice = input.nextInt();
					if(choice > 0 && choice < 6){
						takeTurn(choice, monster);
						correct = true;
				
					}//end if
				}//end try
			catch(NoSuchElementException e){
			
				System.out.println("Please enter a number between 1 and 5");
			
			}//end catch
		
		}//end while
	
	}//end take turn 
	
	private void takeTurn(int choice, Monster monster){
	
		switch(choice){
		
			case 1: { 
				this.attack(monster); 
				break;}
			case 2: { 
				this.castSpell(monster); 
				break;}
			case 3: { 
				this.chargeMana(); 
				break;}
			case 4: { 
				this.AddItems();
				 break;}
			case 5: { 
				this.run();
				break;}
		}//end switch
	
	}//end take turn
	
	public int getMana() {return this.mana;}
	
	public String toString(){
	
		return String.format("%s, Mana: [%d]", super.toString(), this.mana);
	
	}

}//end class







