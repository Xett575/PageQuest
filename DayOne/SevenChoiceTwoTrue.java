import java.util.Scanner;

public class SevenChoiceTwoTrue { //Back To your room after 'Maybe I don't need a diferent room'
 
    public void ExamineTheDoor(){
    
        System.out.println(" ");
        System.out.println("You think of what you could do to the door to get a little more privacy.");
        System.out.println("You look around the room and think of the desk chair or the bed.");
        System.out.println(" ");
        System.out.println("1. Lean the chair under the door handle.");
        System.out.println("2. Push the bed against the door.");
        
        Scanner EightScanOne = new Scanner(System.in);
        String EightAnswerOne = EightScanOne.nextLine();
        
                if(EightAnswerOne.equals("one")){ // Chair against door
                    System.out.println(" ");
                    System.out.println("You take the wooden chair from the desk and prop it against the door underneath the handle.");
                    System.out.println("It doesn't look like a vault but you figure it's safe enough.");
                    System.out.println(" ");
                    System.out.println("You look back at the room and start wondering what to do.");
                    System.out.println("1. Try to sleep.");
                    System.out.println("2. Try to find something to eat.");
                    
                    Scanner NineScanOne = new Scanner(System.in);
                    String NineAnswerOne = NineScanOne.nextLine();
                    
                            if(NineAnswerOne.equals("one")){ // Try to sleep
                                System.out.println(" ");
                                System.out.println("You lie down on the bed and try to go to sleep.");
                                System.out.println("1. Sleep. ");
                                System.out.println("2. Lie on the bed pretending you're a sleep but you're actually awake listening and thinking and growing more tired.");
                                
                            }
                            else if(NineAnswerOne.equals("two")){ // Find food
                                System.out.println(" ");
                                System.out.println("Your stomach growls at you to feed it, and you give in.");
                                System.out.println("You can't remember if you still have food in your bag or if you should just try the counter downstairs.");
                                System.out.println(" ");
                            }
                }
                else if(EightAnswerOne.equals("two")){ //Push bed against door
                    System.out.println(" ");
                    System.out.println("It takes you some time to push the bed against the door, but you are rewarded with a sense of security.");
                    System.out.println("You look back at the room and wonder what to do next.");
                    System.out.println("1. Try to sleep.");
                    System.out.println("2. Try to find something to eat.");
                }
    
    }
    
}