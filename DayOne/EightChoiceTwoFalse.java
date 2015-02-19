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

                                        Scanner TenScanOne = new Scanner(System.in);
                                        String TenAnswerOne = TenScanOne.nextLine();
                                                
                                                
					}
				else if(NineAnswerTwo.equals("two")){ //Get some food
                                        System.out.println(" ");
                                        System.out.println("Your stomach growls at you to feed it, and you give in.");
                                        System.out.println("You can't remember if you still have food in your bag or if you should just try the counter downstairs.");
                                        System.out.println(" ");
                                        System.out.println("1. Check your bag for food.");
                                        System.out.println("2. Don't bother looking in the bag and go downstairs.");

                                        Scanner TenScanTwo = new Scanner(System.in);
                                        String TenAnswerTwo = TenScanTwo.nextLine();
                                                
                                                if(TenAnswerTwo.equals("one")){
                                                        System.out.println("");
                                                        System.out.println("You wander over to your rugged backpack and search for some type of food.");
                                                        System.out.println("After a little search you find a bag of left over rations or what ever they used to be.");
                                                        System.out.println("1. Eat the Rations.");
                                                        System.out.println("2. I'll try downstairs.");
                                                        System.out.println("3. Maybe I don't need to eat");
                                                    }
                                                else if(TenAnswerTwo.equals("two")){
                                                        System.out.println("");
                                                        System.out.println("You decide that looking through your pack would be too much time and there would be anything good.");
                                                        System.out.println("You enter the hallway once again and descend to the gathering area");
                                                        System.out.println("You go to open the door when you notice how loud it is in there.");
                                                        System.out.println("");
                                                        System.out.println("1. open the door a crack and peek in.");
                                                        System.out.println("2. Burst through and save someone whether they like it or not.");
                                                }

					}
	}
}
