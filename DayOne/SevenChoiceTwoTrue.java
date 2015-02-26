import java.util.Scanner;

public class SevenChoiceTwoTrue {
 
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
                }
    
    }
    
}