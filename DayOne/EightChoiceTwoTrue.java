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
									System.out.println("");
                                                                        System.out.println("You wander over to your rugged backpack and search for some type of food.");
                                                                        System.out.println("After a little search you find a bag of left over rations or what ever they used to be.");
                                                                        System.out.println("1. Eat the Rations.");
                                                                        System.out.println("2. I'll try downstairs.");
                                                                        System.out.println("3. Maybe I don't need to eat");
                                                                        
                                                                        Scanner ElevenScanOne = new Scanner(System.in);
                                                                        String ElevenAnswerOne = ElevenScanOne.nextLine();
                                                                        
                                                                                if(ElevenAnswerOne.equals("one")){
                                                                               
                                                                                }
                                                                               else if(ElevenAnswerOne.equals("two")){
                                                                               
                                                                                }
                                                                               else{
                                                                               
                                                                                }
								}
								else if(TenAnswerTwo.equals("two")){ //Just go downstairs
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
