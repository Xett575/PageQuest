import java.util.Scanner;

public class EightChoiceTwoFalse{

	public void BedAgainstDoor(){//Push the bed against the door
		
		System.out.println(" ");
		System.out.println("It takes you some time to push the bed against the door, but you are rewarded with a sense of security.");
		System.out.println("You look back at the room and wonder what to do next.");
		System.out.println("1. Try to sleep.");
		System.out.println("2. Try to find something to eat.");
		
		Scanner NineScanTwo = new Scanner(System.in);
		String NineAnswerTwo = NineScanTwo.nextLine();

				if(NineAnswerTwo.equals("one")){ //Go to sleep
						System.out.println(" ");
						System.out.println("You lie down on the bed and try to go to sleep.");
						System.out.println("1. Sleep. ");
						System.out.println("2. Lie on the bed pretending you're a sleep but you're actually awake listening and thinking and growing more tired.");
					}
				else if(NineAnswerTwo.equals("two")){ //Get some food
						System.out.println(" ");
						System.out.println("Your stomach growls at you to feed it, and you give in.");
						System.out.println("You can't remember if you still have food in your bag or if you should just try the counter downstairs.");
						System.out.println(" ");
						System.out.println("1. Check your bag for food.");
						System.out.println("2. Don't bother looking in the bag and go downstairs.");

					}
	}
}