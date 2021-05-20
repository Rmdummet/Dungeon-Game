public class Dungeon{

	String descriptionBalcony = "You are on the Balcony. ";
	String descriptionKitchen = "You are in the Kitchen. ";
	String descriptionNorthhall = "You are in the North Hall. ";
	String descriptionSouthhall = "You are in the South Hall. ";
	String descriptionBedroom1 = "You are in the Master Bedroom. ";
	String descriptionBedroom2 = "You are in the guest bedroom. ";
	String descriptionDining = "You are in the Dining Room. ";

	private Room balcony = new Room(descriptionBalcony);
	private Room bedroom1 = new Room(descriptionBedroom1);
	private Room bedroom2 = new Room(descriptionBedroom2);
	private Room dining = new Room(descriptionDining);
	private Room kitchen = new Room(descriptionKitchen);
	private Room northHall = new Room(descriptionNorthhall);
	private Room southHall = new Room(descriptionSouthhall);

	public Dungeon(){
	
		balcony.setExits(null,null,null,northHall);
		bedroom1.setExits(null,northHall, null, bedroom2);
		bedroom2.setExits(bedroom1, southHall, null, null);
		dining.setExits(kitchen, null, southHall, null);
		kitchen.setExits(null, null, northHall, dining);
		northHall.setExits(balcony, kitchen, bedroom1, southHall);
		southHall.setExits(northHall, dining, bedroom2, null);
		
		kitchen.setMonster("Kitchen Monster", 60, 8, 13);
		dining.setMonster("Dining Monster", 70, 10, 20);
		
		kitchen.setInventory("Health potion", "Stamina potion");
		dining.setInventory("Health potion", "Stamina potion");
		
	
	}
	
	public Room getRoom0(){
		return bedroom2;
	}
}
