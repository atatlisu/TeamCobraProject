
//CLASS IS JUST FOR TESTING, WILL NOT INCLUDE IN FINAL PRODUCT

public class tester {
	
	public static void main(String[] args) {
		
		ResourceManager rm = new ResourceManager();
		
		rm.writeToMonsterList();
		rm.writeToRoomList();
		rm.writeToPuzzleList();
		rm.writeToItemList();
		
//		for(Monster i : rm.getMonsterList()){
//			System.out.println(i.getName());
//			System.out.println(i.getHp());
//			System.out.println(i.getDescription());
//			System.out.println("Skill: " + i.getAction().getActionName1());
//			System.out.println(i.toString());
//		}
		
		
//		for(Room i : rm.getRoomList()){
//			System.out.println(i.getRoomNumber());
//			System.out.println(i.getRoomDescription());
//			System.out.println(i.getExits());
//		}
		
		
		for(Item i : rm.getItemList()){
			System.out.println(i.getName());
			System.out.println(i.getDescription());
			System.out.println(i.getType());
		}
		
		
	}

}
