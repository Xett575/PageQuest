import java.util.Scanner;

public class SevenChoiceOneTrue{

	public void InvestigateRoom(){
	
			System.out.println("");
			System.out.println("You shut the door and walk into the room now seeing it in its entirety.");
			System.out.println("You set your supplies down by the bed and stand in a moment of thought.");
			System.out.println(" ");
			System.out.println("1. I'm tired. See y'all in the morning. ");
			System.out.println("2. I'm hungry. Let's find something to eat.");
			
			Scanner EightScanOne = new Scanner(System.in);
			String EightAnswerOne = EightScanOne.nextLine();

					if(EightAnswerOne.equals("one")){ //Go to sleep
							System.out.println(" ");
							System.out.println("You lie down on the bed and try to go to sleep.");
							System.out.println("1. Sleep. ");
							System.out.println("2. Lie on the bed pretending you're a sleep but you're actually awake listening and thinking and growing more tired.");

                                                        Scanner NineScanOne = new Scanner(System.in);
                                                        String NineAnswerOne = NineScanOne.nextLine();
                                                        
                                                                if(NineAnswerOne.equals("one")){ //Sleep for real
                                                                        System.out.println(" ");
                                                                        System.out.println("You close your eyes and try to fall asleep in this little room far from the place you used to call your home.");
                                                                        System.out.println("With the thoughts of endless possibilities on your mind you finally fall asleep...");
                                                                        System.out.println("END DAY ONE.");
                                                                        System.out.println(" ");
                                                                        System.out.println("1. Continue your adventure?");
                                                                        System.out.println("2. Pause for the moment.");
                                                                    }
                                                                else if(NineAnswerOne.equals("two")){ //Don't sleep but just lie there
                                                                        System.out.println(" ");
									System.out.println("You lie awake lying to yourself about going to sleep");
                                                                    }
						}	
					else if(EightAnswerOne.equals("two")){ // Get some food
							System.out.println(" ");
							System.out.println("Your stomach growls at you to feed it, and you give in.");
							System.out.println("You can't remember if you still have food in your bag or if you should see if they serve food downstairs.");
							System.out.println(" ");
							System.out.println("1. Check your bag for food.");
							System.out.println("2. Don't bother looking in the bag and go downstairs.");

                                                        Scanner NineScanTwo = new Scanner(System.in);
                                                        String NineAnswerTwo = NineScanTwo.nextLine();
                                                            
                                                                if(NineAnswerTwo.equals("one")){ //Check your bag
                                                                        System.out.println("");
                                                                        System.out.println("You wander over to your rugged backpack and search for some type of food.");
                                                                        System.out.println("After a little search you find a bag of left over rations or what ever they used to be.");
                                                                        System.out.println("1. Eat the Rations.");
                                                                        System.out.println("2. I'll try downstairs.");
                                                                        System.out.println("3. Maybe I don't need to eat");
                                                                        
                                                                        Scanner TenScanThree = new Scanner(System.in);
                                                                        String TenAnswerThree = TenScanThree.nextLine();
                                                                        
                                                                               if(TenAnswerThree.equals("one")){ //Eat the rations
                                                                                   System.out.println("");
                                                                                   System.out.println("You scarf down the remainder of the rations and toss the wrapper.");
                                                                                }
                                                                               else if(TenAnswerThree.equals("two")){ //Try downstairs
                                                                                   System.out.println("");
                                                                                   System.out.println("You put the rations back into your pack and head downstairs to see if you can get a meal");
                                                                                }
                                                                               else{ //Don't eat
                                                                                   System.out.println("");
                                                                                   System.out.println("The rations seem to have scared your appetite away.");
                                                                                   System.out.println("With your hunger suppressed for now you look back at your room.");
                                                                                   System.out.println("1. The bed looks nice maybe try a snooze");
                                                                                   System.out.println("2. Explore the room to waste time.");
                                                                                }
                                                                    }
                                                                else if(NineAnswerTwo.equals("two")){ //Go downstairs
                                                                        System.out.println("");
                                                                        System.out.println("You decide that looking through your pack would be too much time and there would be anything good.");
                                                                        System.out.println("You enter the hallway once again and descend to the gathering area");
                                                                        System.out.println("You go to open the door when you notice how loud it is in there.");
                                                                        System.out.println("");
                                                                        System.out.println("1. Open the door a crack and peek in.");
                                                                        System.out.println("2. Burst through and save someone whether they like it or not.");
                                                                        
                                                                        Scanner TenScanTwo = new Scanner(System.in);
                                                                        String TenAnswerTwo = TenScanTwo.nextLine();
                                                                        
                                                                               if(TenAnswerTwo.equals("one")){
                                                                                   System.out.println("");
                                                                                   System.out.println("You slowly go for the door handle and twist at a turtle's pace.");
                                                                                   System.out.println("Through the sliver you create you can see the men that were once only loud and rowdy are now all out fighting.");
                                                                                   System.out.println("The other customs including the hostess have all taken cover and are trying not to make any sudden movements.");
                                                                                   System.out.println("");
                                                                                   System.out.println("1. Join in and attempt to subdue the men.");
                                                                                   System.out.println("2. Queitly close the door and go back to your room.");
                                                                                   
                                                                                   Scanner ElevenScanFive = new Scanner(System.in);
                                                                                   String ElevenAnswerFive = ElevenScanFive.nextLine();
                                                                                   
                                                                                        if(ElevenAnswerFive.equals("one")){ //Attempt to subdue the men
                                                                                            System.out.println("");
                                                                                        }
                                                                                        else if(ElevenAnswerFive.equals("two")){ //Go back to your room
                                                                                            System.out.println("");
                                                                                        }
                                                                                }
                                                                               else if(TenAnswerTwo.equals("two")){
                                                                                   System.out.println("");
                                                                                   System.out.println("You burst through the door and try to find something to do.");
                                                                                   System.out.println("You are quickly jolted out of your thinking by the sound of bullets going off inside the inn.");
                                                                                   System.out.println("You duck down to take cover and gather your thoughts.");
                                                                                   System.out.println("");
                                                                                   System.out.println("1. Stand up and tell the men to take it outside.");
                                                                                   System.out.println("2. Make your way back to hall and back to your room.");
                                                                                   
                                                                                   Scanner ElevenScanSix = new Scanner(System.in);
                                                                                   String ElevenAnswerSix = ElevenScanSix.nextLine();
                                                                                   
                                                                                   	if(ElevenAnswerSix.equals("one")){ //Tell the men to take it outside
                                                                                   		System.out.println("");	
                                                                                   	}
                                                                                   	else if(ElevenAnswerSix.equals("two")){ //Try to get back to your room
                                                                                   		System.out.println("");
                                                                                   	}
                                                                                }
                                                                    }
						}		
	}
}
