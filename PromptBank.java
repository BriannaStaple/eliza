package project2;

import java.util.Random;

public class PromptBank {
	String [] questions;
	String [] statements;
	Random rand = new Random();
	
	public PromptBank(){
		questions = new String[5]; 
		statements = new String[5];
		populateStatementsArray();
		populateQuestionsArray();
	}

	public void populateStatementsArray(){
		statements[0] = "Tell me more about BLANK1 and BLANK2";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[3] = "Hmm...it seems you like BLANK1 more than BLANK2. Expain why.";
		statements[4] = "Just to clarify, You believe that BLANK1 and BLANK2 are both reasonable things to think about. Tell me why.";
	}
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "Are you sure BLANK1 and BLANK2 are really on your mind?";
		questions[4] = "Did you ever think that BLANK1 and BLANK2 would be on your mind right now? ";
		
	}
	  
	public String getRandomStatementTrunk(){
		int Value = rand.nextInt(5);
		return statements[Value];
		
		
	}
	
	
	public String getRandomQuestionTrunk(){
		int Value = rand.nextInt(5);
		return questions[Value];
		
	}
	
	


}


	  



