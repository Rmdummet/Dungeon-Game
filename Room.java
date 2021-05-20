
public class Room{ 

	private String description; 
	private Room north = null;
	private Room east = null;
	private Room west = null;
	private Room south = null;
	
	
	
	private Monster monster = null;
	
	String inventoryArray[] = new String[3];
	
	public Room(String description){
		this.description = description;
		
	}
	
	
	public void setNorth(Room north){
		this.north = north;
	}
	
	public void setEast(Room east){
		this.east = east;
	}
	
	public void setWest(Room west){
		this.west = west;
	}
	
	public void setSouth(Room south){
		this.south = south;
	}
	
	public void setMonster(String name, int health, int atk, int xp){
	
		monster = new Monster(name, health, atk, xp);
	
	}
	public void setInventory(String item1, String item2){
	
		inventoryArray[0] = item1;
		inventoryArray[1] = item2;
	}
	
	public String[] getInventory(){
	
		return inventoryArray;
	
	}
	
	public void setExits(Room north, Room east, Room west, Room south){
		setNorth(north);
		setEast(east);
		setWest(west);
		setSouth(south);
	}
	
	public Monster getMonster(){
	
		return monster;
	
	}
	
	
	
	public Room getNorth(){
		return north;
	}
	
	public Room getEast(){
		return east;
	}
	
	public Room getWest(){
		return west;
	}
	
	public Room getSouth(){
		return south;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String getExits(){
		String exitString = "";
		if(north != null){
			exitString = exitString + "north";
		}
		if(east != null){
			exitString = exitString + ", east";
		}
		if(west != null){
			exitString = exitString + ", west"; 
		}
		if(south != null){
			exitString = exitString + ", south";
		}
		return "There are exits towards " + exitString + ".";
	}
	
	public String toString(){
		return getDescription() + getExits();
	}
	

}