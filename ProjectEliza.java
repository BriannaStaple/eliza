package project2;
import java.util.Scanner;

public class ProjectEliza {
	
   public static void main(String[] args) {
	   
       runEliza();
   }
   private static void runEliza() {
       PromptBank pb = new PromptBank();
       Scanner scnr = new Scanner(System.in);
       String userInput;
       // Ask for the user's name and initial thoughts
       System.out.println("ELIZA: Hello, my name is Eliza. What is your name? ");
       System.out.print("USER: ");
       String userName = scnr.nextLine();
       System.out.println("ELIZA: Hello, " + userName + ". Tell me what is on your mind today in 1 sentence.");
       System.out.print("USER: ");
       userInput = scnr.nextLine();
       
       // Continue the conversation until the user decides to exit
       while (!userInput.equalsIgnoreCase("EXIT")) {
           // If the input is not a question or an exclamation, ask a random question
           if (userInput.endsWith(".")) {
               System.out.println("ELIZA: " + replaceBlanks(pb.getRandomStatementTrunk(), userInput));
           }
           // Check if the user's input is a question
           
           else if (userInput.endsWith("?")) {
               System.out.println("ELIZA: " + replaceBlanks(pb.getRandomQuestionTrunk(), userInput));
           } else if (userInput.endsWith("!")) {
               // Handle exclamation statements
               System.out.println("ELIZA: WOW! DRAMATIC! " + replaceBlanks(pb.getRandomStatementTrunk(), userInput));
           } else {
               // If the input is not a question or an exclamation, ask a random question
               System.out.println("ELIZA: " + replaceBlanks(pb.getRandomQuestionTrunk(), userInput));
           }
           System.out.print("USER: ");
           userInput = scnr.nextLine();
       }
       // Ask if the user wants to run the session again
       System.out.println("ELIZA: Do you want to run the session again?");
       System.out.print("USER: ");
       userInput = scnr.nextLine();
       if (userInput.equalsIgnoreCase("no")) {
           System.out.println("Goodbye, until next time");
           scnr.close();
           System.exit(0);
       } else if (userInput.equalsIgnoreCase("yes")) {
           runEliza(); // Restart the program
       } else {
           System.out.println("Invalid response. Goodbye, until next time");
           scnr.close();
           System.exit(0);
       }
   }
   // Replace "BLANK1" and "BLANK2" with the first and last word of the user's input
   private static String replaceBlanks(String input, String userResponse) {
       String[] words = userResponse.split("\\s+");
       String firstWord = words.length > 0 ? words[0] : "";
       String lastWord = words.length > 0 ? words[words.length - 1] : "";
       return input.replace("BLANK1", firstWord).replace("BLANK2", lastWord);
   }
}





	
    