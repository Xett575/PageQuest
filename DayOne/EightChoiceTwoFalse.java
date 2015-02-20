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
                                                
                                                if(TenAnswerOne.equals("one")){ //Go to sleep for real
                                                    System.out.println(" ");
                                                    System.out.println("You close your eyes and try to fall asleep in this little room far from the place you used to call your home.");
                                                    System.out.println("With the thoughts of endless possibilities on your mind you finally fall asleep...");
                                                    System.out.println("END DAY ONE.");
                                                    System.out.println(" ");
                                                    System.out.println("1. Continue your adventure?");
                                                    System.out.println("2. Pause for the moment.");
                                                    }
                                                else if(TenAnswerOne.equals("two")){ //Fake sleep
                                                    System.out.println(" ");
                                                    System.out.println("You lie awake lying to yourself about going to sleep");
                                                    }
                                                
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
                                                
                                                if(TenAnswerTwo.equals("one")){ //Check your bag for food
                                                        System.out.println("");
                                                        System.out.println("You wander over to your rugged backpack and search for some type of food.");
                                                        System.out.println("After a little search you find a bag of left over rations or what ever they used to be.");
                                                        System.out.println("1. Eat the Rations.");
                                                        System.out.println("2. I'll try downstairs.");
                                                        System.out.println("3. Maybe I don't need to eat");
                                                        
                                                        Scanner ElevenScanThree = new Scanner(System.in);
                                                        String ElevenAnswerThree = ElevenScanThree.nextLine();
                                                        
                                                            if(ElevenAnswerThree.equals("one")){ //Eat the rations
                                                                System.out.println("");
                                                                System.out.println("You scarf down the remainder of the rations and toss the wrapper.");
                                                             }
                                                            else if(ElevenAnswerThree.equals("two")){ //Try downstairs
                                                                System.out.println("");
                                                                System.out.println("You are about to go to the hall when you realize yo've pushed your bed in front of the door.");
                                                                System.out.println("You stop and contemplate whether you should move the bed or not.");
                                                                System.out.println("");
                                                                System.out.println("1. Pull the bed back out of the way to get to the hall.");
                                                                System.out.println("2. Forget it and find something else to do.");
                                                             }
                                                            else{ //Don't eat
                                                                System.out.println("");
                                                                System.out.println("The rations seem to have scared your appetite away.");
                                                                System.out.println("With your hunger suppressed for now you look back at your room.");
                                                                System.out.println("1. The bed looks nice maybe try a snooze");
                                                                System.out.println("2. Explore the room to waste time.");
                                                             }
                                                    }
                                                else if(TenAnswerTwo.equals("two")){ //Skip your bag and go down stairs
                                                        System.out.println("");
                                                        System.out.println("You are about to go to the hall when you realize yo've pushed your bed in front of the door.");
                                                        System.out.println("You stop and contemplate whether you should move the bed or not.");
                                                        System.out.println("");
                                                        System.out.println("1. Pull the bed back out of the way to get to the hall.");
                                                        System.out.println("2. Forget it and find something else to do.");
                                                        
                                                        Scanner ElevenScanFour = new Scanner(System.in);
                                                        String ElevenAnswerFour = ElevenScanFour.nextLine();
                                                        
                                                                if(ElevenAnswerFour.equals("one")){ //Pull the bed pack
                                                                     System.out.println("");
                                                                    }
                                                                else if(ElevenAnswerFour.equals("two")){ //Forget about it
                                                                     System.out.println("");
                                                                    }
                                                }

					}
	}
}
