import java.util.Scanner;

public class PageQuest{

	public static void main(String[] args){

	System.out.println("Welcome to Page Quest! The super cool text adventure!");
	System.out.println("Your first task. Do you wish to continue you adventure. What lies ahead is not for the weak of heart.");
	System.out.println("1. Continue. Let's do this.");
	System.out.println("2. Naw man I'm good.");
	System.out.println("Answers are case sensitive please type one or two.");

	Scanner scan = new Scanner(System.in);
	String answer = scan.nextLine();
		
	if(answer.equals("one")) {
        System.out.println(" ");
		System.out.println("Very well you have passed the first of many challenges."); 
		System.out.println("May your supernatural deity or deities watch over you");
	    System.out.println(" "); // put to add a line space
	    System.out.println("After a long voyage to the new land you are exhausted and seek out an inn.");
	    System.out.println("You find a local inn that looks inviting to newcomers. Upon entering you are immediately greeted with singing and a warm crowd.");
	    System.out.println("You see a group of men laughing at a side table but also notice that there is no line at the counter.");
	    System.out.println("1. See what the men are up to");
	    System.out.println("2. Get in line to see if they have a spare room.");

	Scanner TwoScan = new Scanner(System.in);
	String TwoAnswer = TwoScan.nextLine();
	
		if(TwoAnswer.equals("one")){                //See what the men are up to
			System.out.println(" ");
			System.out.println("You approach the table of men with the face of a newcomer.");
			System.out.println("One of the men see you and asks you in a gruff voice 'Whatcha lookin' at' ");
			System.out.println("You are about to speak but one of the others tells him to not be so much of a bastard.");
			System.out.println("The man who you assume is the commander of the group tells you to take a seat and explain yourself");
			System.out.println("1. Make up a grand tale.");
			System.out.println("2. I came to find work and build my life.");
				
			Scanner ThreeScanOne = new Scanner(System.in);
			String ThreeAnswerOne = ThreeScanOne.nextLine();

				if(ThreeAnswerOne.equals("one")){   //Tell the men a huge lie
					System.out.println(" ");
					System.out.println("You make up a huge fib about you being the son of a denounced prince");
					System.out.println("After finishing your tale the men are left with a blank stare.");
					System.out.println("After a brief silence the men return with louder laughter and almost over turn the table.");
					System.out.println("The one who first barked at you says the boat must have knocked your head a little too hard");
					System.out.println("1. Defend your tale.");
					System.out.println("2. Admit as a good joke you made it up and tell the truth.");
					}

					Scanner FourScanOne = new Scanner(System.in);
					String FourAnswerOne = FourScanOne.nextLine();	

							if(FourAnswerOne.equals("one")){       //You try to defend your lie
									System.out.println(" ");
									System.out.println("You're ashamed at the men and start to defend your story.");
									System.out.println("Before you get too invested however the man in charge halts your progress.");
									System.out.println("'Hold up there kid.' he says to you a little annoyed.");
									System.out.println("'I've met a few story tellers in my time and I don't want you to end up like they did so soon.'");
									System.out.println("'I'm gonna give you a minute to start over and if we think you're leading us off at all we'll drop you like a toothpick.'");
									System.out.println(" ");
									System.out.println("1. Tell them the truth.");
									System.out.println("2. YOU CAN'T HANDLE THE TRUTH!");
									
									
								}
							else if(FourAnswerOne.equals("two")){    //Admit you lied 
								System.out.println(" ");
								System.out.println("You admit that you lied to them and that you were trying your luck at story telling.");
								System.out.println("Your response makes the men laugh even more and you start to laugh with them.");
								System.out.println("'Alright there mate how bout you start over now' the man in charge says.");
								System.out.println("'Don't be ashamed to take a minute and get your head straight' he continues as the other men start to stare at you.");
								System.out.println(" ");
								System.out.println("1. Take a minute to tell them the real story.");
								System.out.println("2. Try a different, slightly less intense, story.");
							}
				else if(ThreeAnswerOne.equals("two")){  //Tell your true story
					System.out.println(" ");
					System.out.println("You tell the men how you worked hard for your travel fair so that you could make a good life in the new land");
					System.out.println("After a brief silence the men brake into laughter. You are hurtled with comments of 'good luck' 'fat chance' and 'you got on the wrong boat' ");
					System.out.println("You keep quiet for a moment, thinking of how to respond.");
					System.out.println("1. Defend your beliefs.");
					System.out.println("2. Ask the men what they mean.");	

					Scanner FourScanTwo = new Scanner(System.in);
					String FourAnswerTwo = FourScanTwo.nextLine();

							if(FourAnswerTwo.equals("one")){    //Defend the 'American' dream
									System.out.println(" ");
									System.out.println("You try to convince the men that anyone can make a life for themselves.");
									System.out.println("While you are trying to spit something out about hard work and dreams one of the men interrupts you.");
									System.out.println(" 'Look here kid. The only hard work you'll be doing is under the foot of an overseer.' ");
									System.out.println("Some of the other men start to say things as well and you are slightly overwhelmed by all the information. ");
									System.out.println("1. Listen to what the men have to say.");
									System.out.println("2. What's an overseer?");
								}
							else if(FourAnswerTwo.equals("two")){   //Inquire about the men's knowledge
								System.out.println(" ");
								System.out.println("You ask the men how they know these things and that if there is any things else you should know.");
								System.out.println("You are repaid with an uproar up overseers, deathly wildernesses, and the worst types of plague.");
								System.out.println("Figuring you should absorb the information while it's available you try to listen to what the men have to say. ");
								System.out.println("The talking almost becomes too much but just as it seemed to be approaching a irritable level the men are all silenced my the man in charge.");
								System.out.println("The man starts talking with a certain air about him that seems to pull you into his voice.");
								System.out.println(" ");
								System.out.println(" 'Listen here kid, and listen carefully. I don't know what you were told about this place, but it ain't what you heard.' ");
								System.out.println(" 'You gotta be tough if you want to make and you know what' the man says as he leans against his chair.");
								System.out.println("He continues  to draw you in 'look here prince I think you're a capable kid and might even be able to pull your weight so I'm going to offer you a deal.' ");
								System.out.println(" ");
								System.out.println("His nickname for you goes unnoticed as you are too enthralled with what he has to say next.");
								System.out.println("He pause a moment before he says what you feel like you've been sitting at the table for decades.");
								System.out.println("'If you're willing to be an underling for a little bit I'm sure I could teach ya to be a real good son of a gun.'");
								System.out.println("'That is . . . if you got what it takes.'");
								System.out.println("There is an uproar from the men at the table and you are almost thrown off your chair. ");
								System.out.println("When their leader is finally able to calm them down all the men are staring at you with the face of eternal judgement.");
								System.out.println(" ");
								System.out.println("1. Thank you for the offer but I think you have the wrong man. ");
								System.out.println("2. Ha Where do I sign up!");
							}
					}
			}

		else if(TwoAnswer.equals("two")){ // Beginning of game you walk towards the counter
			System.out.println(" ");
			System.out.println("You walk towards the counter motioning to the hostess.");
			System.out.println("After requesting a simple room she informs you that they have a vacancy and that it will cost 20cliks");
			System.out.println("1. Pay the 20clicks.");
			System.out.println("2. 'I only have 15.' ");

			Scanner ThreeScanTwo = new Scanner(System.in);
			String ThreeAnswerTwo = ThreeScanTwo.nextLine();
				
				if(ThreeAnswerTwo.equals("one")){  //You pay full price
					System.out.println(" ");
					System.out.println("You hand over the 20cliks and the hostess hands you a key with the faded number 13 on it");
					System.out.println("You head over to the stairs to go to your room and look back at the gathering area.");
					System.out.println("1. Go to your room to get some sleep.");
					System.out.println("2. Take a second look around.");

					Scanner FourScanOne = new Scanner(System.in);
					String FourAnswerOne = FourScanOne.nextLine();
						
						if(FourAnswerOne.equals("one")){ //You ignore the gathering area and go to sleep
								System.out.println("You decide that sleep is more important than socializing and go to your room.");
								System.out.println("You make your way to the hall where the rooms are located and find number 13.");
								System.out.println("You unlock the door and notice that the key jiggles a little bit when in the lock.");
								System.out.println(" ");
								System.out.println("1. Ignore the lock and go in.");
								System.out.println("2. Go back to the counter and demand a different room.");
								
							}
						else if(FourAnswerOne.equals("two")){ //You take a second look at the gathering area
							System.out.println("You turn around and examine the gathering area closer.");
							System.out.println("On the far side there is a table surrounded by loud slightly drunk men and scatter through out are some folk who are trying to keep their distance");
							System.out.println("1. Meh this doesn't look that interesting better get some sleep.");
							System.out.println("2. Take a closer look at the folk around the room and perhaps the men at the table.");
						}
				}
				else if(ThreeAnswerTwo.equals("two")){ //you cheat the hostess out of a few clicks
					System.out.println(" ");
					System.out.println("The hostess looks at you reliantly and then decides to take your money and give you a faded key.");
					System.out.println("You look around the gathering room and notice the group of men getting a little rowdy.");
					System.out.println("1. You shrug off the crowd and decide to go to sleep.");
					System.out.println("2. You decide you're not that tired and go to investigate the group of men.");

					Scanner FourScanTwo = new Scanner(System.in);
					String FourAnswerTwo = FourScanTwo.nextLine();

						if(FourAnswerTwo.equals("one")){ //You decide to go to bed
								System.out.println("You decide that sleep is more important than socializing and go to your room.");
								System.out.println("You make your way to the hall where the rooms are located and find number 13.");
								System.out.println("You unlock the door and notice that the key jiggles a little bit when in the lock.");
								System.out.println(" ");
								System.out.println("1. Ignore the lock and go in.");
								System.out.println("2. Go back to the counter and demand a different room.");
							}
						else if(FourAnswerTwo.equals("two")){ //You walk towards the group of men
							System.out.println("You decide to approach the men and see what all the noise is about.");
							System.out.println("While making your way across the room there is another swell in there volume and you question if there voices are pleasant ones.");
							System.out.println("1. Keep your course for the table.");
							System.out.println("2. You change course for a small table next to theirs in hopes of eavesdropping.");
						}
				}
			
		}

        }
        else if(answer.equals("two")){  //You chose not to play the game weirdo
            System.out.println("You have made your choice. Farewell.");
			System.out.println(" ");	
			System.out.println("Do you wish to try again?");
			System.out.println("Reply with a yes or no.");
				
				Scanner ScanTwo = new Scanner(System.in);
				String AnswerTwo = ScanTwo.nextLine();
				
					if(AnswerTwo.equals("yes")){
						System.out.println("Please start the program again using the java file-name method in command prompt.");
					}
					else if(AnswerTwo.equals("no")){
						System.out.println("Goodbye.");
					}
        }
    }
  }
