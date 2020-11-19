package Check;

import constants.Constants;


public class Check{
	
	private static String firstName = "片山";
	private static  String lastName = "航";
	private static String printName = firstName+lastName;
	
	
	public static void main(String[] args) { 
		System.out.println("printNameメソッド　→　"+printName);
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}
}