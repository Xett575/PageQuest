import java.util.Scanner;

public class SevenChoiceOneTrue{

	public void InvestigateRoom(){
	
			System.out.println("");
			System.out.println("You shut the door and walk into the room now seeing it in its entirety.");
			System.out.println("You set your supplies down by the bed and stand in a moment of thought.");
			System.out.println(" ");
			System.out.println("1. I'm tired. See y'all in the morning. ");
			System.out.println("2. I'm hungry. I wonder if they server meals in the gathering area.");
			
			Scanner EightScanOne = new Scanner(System.in);
			String EightAnswerOne = EightScanOne.nextLine();

					if(EightAnswerOne.equals("one")){ //Go to sleep
							System.out.println(" ");
							System.out.println("You lie down on the bed and try to go to sleep.");
							System.out.println("1. Sleep. ");
							System.out.println("2. Lie on the bed pretending you're a sleep but you're actually awake listening and thinking and growing more tired.");


						}	
					else if(EightAnswerOne.equals("two")){ // Get some food
							System.out.println(" ");
							System.out.println("Your stomach growls at you to feed it, and you give in.");
							System.out.println("You can't remember if you still have food in your bag or if you should just try the counter downstairs.");
							System.out.println(" ");
							System.out.println("1. Check your bag for food.");
							System.out.println("2. Don't bother looking in the bag and go downstairs.");


						}		
	}
}