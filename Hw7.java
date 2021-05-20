import java.util.Scanner;

public class Hw7{
	
	private static Dungeon mydungeon;
	private static Room currentRoom;
	public static Game game = new Game();
	public static boolean movement = true;//state a boolean


	public static void main(String[] args){
		System.out.println("Welcome to the Dungeon!");
		mydungeon = new Dungeon();
		currentRoom = mydungeon.getRoom0();
		//System.out.println(currentRoom.toString());
		
		Scanner input = new Scanner(System.in);
		
		
		while(movement){//Start while 
			
			if(currentRoom.getMonster() != null){
			
				System.out.println("You have encounter a monster!!");
				
				
			
				int Indicator = game.startGame(currentRoom.getMonster(), currentRoom);
				
				if(Indicator == 1){
				
					break;
				
				}
			}
			
			System.out.println(currentRoom.toString());
			System.out.println("Which direction would you like to proceed through?");//print a line
			System.out.println("Please select one: ");
			System.out.println("n: go to the north, s:go to the south, w: go to the west, e: go to the east, q:quit the game or exit the program.");//print a line
			String UserChoice =input.nextLine();//input for user
			
			if(UserChoice.equals("n")){//start if
				
				if(currentRoom.getNorth() == null){
					System.out.println("Really! You can't go that way!");//print a line
				}
				else{
					currentRoom = currentRoom.getNorth();
					
					
				}
					
			}//end if
			
			else if(UserChoice.equals("s")){//start if
				 if(currentRoom.getSouth() == null){//start else
						System.out.println("Really! You can't go that way!");//print a line
					}
					else{
						currentRoom = currentRoom.getSouth();
						}
			}
			else if(UserChoice.equals("e")){//start if
				if(currentRoom.getEast() == null){//start else
						System.out.println("Really! You can't go that way!");//print a line
					}
					else{
						currentRoom = currentRoom.getEast();
						}
					}//end if
			
			if(UserChoice.equals("w")){//start if
				if(currentRoom.getWest() == null){//start else
						System.out.println("Really! You can't go that way!");//print a line
					}
					else{
						currentRoom = currentRoom.getWest();
						}
					}//end if
					
			if(UserChoice.equals("q")){//start if
				movement = false;//boolean statement
				System.out.println("You have exited the game.");//print a line
				}//end if
	
		}//end while	
	}

}