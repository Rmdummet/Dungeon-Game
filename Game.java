import java.util.Scanner;

public class Game{

	private static Player hero;
	private static Monster monster = null;
	
	public static int Indicator = 0;
	
	public int startGame(Monster monster, Room room){
		
		Scanner input = new Scanner(System.in);

	
		hero = new Player("Bubba",100,10,30);
		this.monster = monster;
		boolean combat = true;
		
		if(room.getInventory() != null){
		
			System.out.println("The room has items. Which item would you like?");
		
			for(int i=0;i< (room.getInventory()).length;i++){
			
				System.out.print(i+1);
				System.out.println(room.getInventory()[i]);
			
			}
			int choice = input.nextInt();
			if(choice == 1){
			
				hero.addHealthPotion();//increases the health
				System.out.println("You have chosen the Health potion. Your health has increased by 20.");
			}
			else if(choice == 2){
			
				hero.addAttackPowerPotion();//increases the health
				System.out.println("You have chosen the Stamina potion. Your Attack has increased by 20.");//increases attack
			}
			else{
				System.out.println("Please enter correct value. Either 1 or 2.");
			
			}
		
		}
		
		System.out.printf("You encounter a %s and it attacks.\n","Monster");
		while(combat){
		
			combat = combat();
		}//end loop
		return Indicator;
	}
	
	
	private static boolean combat(){
	
		while(hero.getHealth() > 0 && monster.getHealth() > 0 && hero.getRun() != true){
			hero.takeTurn(monster);
			monster.takeTurn(hero);
		
		}//end while
		if(hero.getHealth() == 0 && hero.getRun() != true){
		
			System.out.println("You have died.");
			Indicator = 1;
		
		}
		else if(hero.getRun() == true){
		
			System.out.println("You have escaped!");
		
		}
		else{
		
			System.out.printf("You defeated %s\nYou gain %d Xp.\n",monster.getName(), monster.getXP());
			
		}
		return false;
	
	}//end combat

}//end class