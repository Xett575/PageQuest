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
                                                                        
                                                                                if(ElevenAnswerOne.equals("one")){ //Eat the rations
                                                                                    System.out.println("");
                                                                                    System.out.println("You scarf down the remainder of the rations and toss the wrapper.");
                                                                                }
                                                                               else if(ElevenAnswerOne.equals("two")){ // Try downstairs
                                                                                   System.out.println("");
                                                                                   System.out.println("You put the rations back into your pack and relieve the chiar of it's guard duties.");
                                                                                   System.out.println("You enter the hall and head back to the gathering area.");
                                                                                }
                                                                               else{ //Don't eat
                                                                                   System.out.println("");
                                                                                   System.out.println("The rations seem to have scared your appetite away.");
                                                                                   System.out.println("With your hunger suppressed for now you look back at your room.");
                                                                                   System.out.println("1. The bed looks nice maybe try a snooze");
                                                                                   System.out.println("2. Explore the room to waste time.");
                                                                                }
								}
								else if(TenAnswerTwo.equals("two")){ //Just go downstairs
									System.out.println("");
                                                                        System.out.println("You head towards the door and relieve the chiar of it's guard duties.");
                                                                        System.out.println("When you enter the hall and appraoch the entrance to the gathering area you notice that it is extremly loud now.");
                                                                        System.out.println("");
                                                                        System.out.println("1. open the door a crack and peek in.");
                                                                        System.out.println("2. Burst through and save someone whether they like it or not!");
                                                                        
                                                                        Scanner ElevenScanTwo = new Scanner(System.in);
                                                                        String ElevenAnswerTwo = ElevenScanTwo.nextLine();
                                                                            
                                                                                if(ElevenAnswerTwo.equals("one")){
                                                                                   System.out.println("");
                                                                                   System.out.println("You slowly go for the door handle and twist at a turtle's pace.");
                                                                                   System.out.println("Through the sliver you create you can see the men that were once only loud and rowdy are now all out fighting.");
                                                                                   System.out.println("The other customs including the hostess have all taken cover and are trying not to make any sudden movements.");
                                                                                   System.out.println("");
                                                                                   System.out.println("1. Join in and attempt to subdue the men.");
                                                                                   System.out.println("2. Queitly close the door and go back to your room.");
                                                                                    }
                                                                                else if(ElevenAnswerTwo.equals("two")){
                                                                                   System.out.println("");
                                                                                   System.out.println("You burst through the door and try to find something to do.");
                                                                                   System.out.println("You are quickly jolted out of your thinking by the sound of bullets going off inside the inn.");
                                                                                   System.out.println("You duck down to take cover and gather your thoughts.");
                                                                                   System.out.println("");
                                                                                   System.out.println("1. Stand up and tell the men to take it outside.");
                                                                                   System.out.println("2. Make your way back to hall and back to your room.");
                                                                                    }
								}
					}
		}
}
