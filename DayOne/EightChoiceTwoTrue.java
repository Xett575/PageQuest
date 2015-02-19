import java.util.Scanner;

public class EightChoiceTwoTrue{

	public void ChairAgainstDoor(){ //Lean the chair against the door
	
			System.out.println(" ");
			System.out.println("You take the wooden chair from the desk and prop it against the door underneath the handle.");
			System.out.println("It doesn't look like a vault but you figure it's safe enough.");
			System.out.println(" ");
			System.out.println("You look back at the room and start wondering what to do.");
			System.out.println("1. Try to sleep.");
			System.out.println("2. Try to find something to eat.");

			Scanner NineScanOne = new Scanner(System.in);
			String NineAnswerOne = NineScanOne.nextLine();

				if(NineAnswerOne.equals("one")){ //Go to sleep
						System.out.println(" ");
						System.out.println("You lie down on the bed and try to go to sleep.");
						System.out.println("1. Sleep. ");
						System.out.println("2. Lie on the bed pretending you're a sleep but you're actually awake listening and thinking and growing more tired.");
						
						Scanner TenScanOne = new Scanner(System.in);
						String TenAnswerOne = TenScanOne.nextLine();
						
								if(TenAnswerOne.equals("one")){ //Sleep for real
										System.out.println(" ");
										System.out.println("You close your eyes and try to fall asleep in this little room far from the place you used to call your home.");
										System.out.println("With the thoughts of endless possibilities on your mind you finally fall asleep...");
										System.out.println("END DAY ONE.");
										System.out.println(" ");
										System.out.println("1. Continue your adventure?");
										System.out.println("2. Pause for the moment.");
								}
								else if(TenAnswerOne.equals("two")){ //Pretend sleep
										System.out.println(" ");
										System.out.println("You lie awake lying to yourself about going to sleep");
								}
					}		
				else if(NineAnswerOne.equals("two")){ //Get some food
						System.out.println(" ");
						System.out.println("Your stomach growls at you to feed it, and you give in.");
						System.out.println("You can't remember if you still have food in your bag or if you should just try the counter downstairs.");
						System.out.println(" ");
						System.out.println("1. Check your bag for food.");
						System.out.println("2. Don't bother looking in the bag and go downstairs.");
						
						Scanner TenScanTwo = new Scanner(System.in);
						String TenAnswerTwo = TenScanTwo.nextLine();
						
								if(TenAnswerTwo.equals("one")){ //Check your bag
									
								}
								else if(TenAnswerTwo.equals("two")){ //Just go downstairs
									
								}
					}
		}
}
