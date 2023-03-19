package com.quiz.admin;

import java.util.Scanner;

public class QuizAdmin {
	
	public static void main(String[] args) { 
		
	Scanner Scanner = new Scanner(System.in); 
		
    
		
	    
	    //take a score varaible
	    int score = 0;  
	     
	    System.out.println("Welcome to the Quiz!"); 
	     
	    // Question 1 
	    System.out.println("1.Which statement is true about Java?");
		System.out.println("A. Java is a sequence-dependent programming language");
		System.out.println("B. Java is a code dependent programming l anguage");
		System.out.println("C. Java is a platform-dependent programming language");
        System.out.println("D. Java is a platform-independent programming language");
        System.out.println("Enter the correct answer");
	    String answer1 = Scanner.nextLine().toLowerCase(); // use two method toLowerCase method and nextLine method
	   
	    if (answer1.equals("c")) {        /// use equals method to camper your answer
	      System.out.println("Correct!"); 
	      score++; //increment score variable
	    } else { 
	    	System.out.println("Wrong!"); 
	    	} 
	    
	    // Question 2 
	    System.out.println("2.Which one of the following is not a Java feature?");
        System.out.println("A. Object-oriented");
        System.out.println("B. Use of pointers");
        System.out.println("C. Portable");
        System.out.println("D. Dynamic and Extensible");
        System.out.println("Enter the correct answer");
	    String answer2 = Scanner.nextLine().toLowerCase(); 
	   
	    if (answer2.equals("b")) { 
	    	  System.out.println("Correct!"); 
	      score++; 
	    } else { 
	    	System.out.println("Wrong!"); 

	    } 
	    
	    // Question 3
	    System.out.println("3.Which of these cannot be used for a variable name in Java?");
        System.out.println("A. identifier & keyword");
        System.out.println("B. identifier");
        System.out.println("C. Keyword");
        System.out.println("D. none of the mentioned");
        System.out.println("Enter the correct answer");
        String answer3 = Scanner.nextLine().toLowerCase(); 
        
	    if (answer3.equals("b")) { 
	    System.out.println("Correct!"); 
	      score++; 
	    } else { 
	    	System.out.println("Wrong!"); 

	    }
	    // Question 4
	    System.out.println("4.Who invented Java Programming? ");
        System.out.println("A. Guido van Rossum");
        System.out.println("B. James Gosling");
        System.out.println("C. Dennis Ritchie");
        System.out.println("D. Bjarne Stroustrup");
        System.out.println("Enter the correct answer");
        String answer4 = Scanner.nextLine().toLowerCase(); 
	    
        if (answer4.equals("b")) { 
	    System.out.println("Correct!"); 
	      score++; 
	    } else { 
	    	System.out.println("Wrong!"); 

	    } 
	    // Question 5 
	    System.out.println("5.In which memory a String is stored, when we create a string using new operator?");
        System.out.println("A. Stack");
        System.out.println("B. String memory");
        System.out.println("C. Random Store Space");
        System.out.println("D. Heap memory");
        System.out.println("Enter the correct answer");
        String answer5 = Scanner.nextLine().toLowerCase(); 
        
	    if (answer5.equals("d")) {
	    System.out.println("Correct!"); 
	      score++; 
	    } else { 
	    	System.out.println("Wrong!"); 

	    } 
	    // Question 6 
	    System.out.println("6.Which of the following is a marker interface?");
        System.out.println("A. Runnable interface");
        System.out.println("B. Remote interface");
        System.out.println("C. Result interface");
        System.out.println("D. none of the mentioned");
        System.out.println("Enter the correct answer");
        String answer6 = Scanner.nextLine().toLowerCase(); 
        
	    if (answer6.equals("b")) { 
	    System.out.println("Correct!"); 
	      score++; 
	    } else { 
	    	System.out.println("Wrong!"); 

	    } 
	    // Question 7
	    System.out.println("7.What is the return type of the hashCode() method in the Object class?");
        System.out.println("A. Int");
        System.out.println("B. Object");
        System.out.println("C. void");
        System.out.println("D. long");
        System.out.println("Enter the correct answer");
        String answer7 = Scanner.nextLine().toLowerCase(); 
	    
        if (answer7.equals("b")) { 
	    System.out.println("Correct!"); 
	      score++; 
	    } else { 
	    	System.out.println("Wrong!"); 

	    } 
	    // Question 8 
	    System.out.println("8.What is the extension of java code files?");
        System.out.println("A. .txt");
        System.out.println("B. .pdf");
        System.out.println("C. .sql");
        System.out.println("D. .java");
        System.out.println("Enter the correct answer");
        String answer8 = Scanner.nextLine().toLowerCase(); 
	    
	    if (answer8.equals("d")) {
	    System.out.println("Correct!"); 
	      score++; 
	    } else { 
	    	System.out.println("Wrong!"); 

	    } 
	    // Question 9 
	    System.out.println("9.Which of the following is a mutable class in java?");
        System.out.println("A. java.lang.string.bulider");
        System.out.println("B. java.long.Short");
        System.out.println("C. java.lang.String");
        System.out.println("D. none of the mentioned");
        System.out.println("Enter the correct answer");
        String answer9 = Scanner.nextLine().toLowerCase();
        
	    if (answer9.equals("a")) { 
	    System.out.println("Correct!"); 
	      score++; 
	    } else { 
	    	System.out.println("Wrong!"); 

	    } 
	    // Question 10 
	    System.out.println("10.Which keyword is used for accessing the features of a package?");
        System.out.println("A. import");
        System.out.println("B. package");
        System.out.println("C. extends");
        System.out.println("D. expert");
        System.out.println("Enter the correct answer");
        String answer10 = Scanner.nextLine().toLowerCase(); 
	    
	    if (answer10.equals("b")) {
	    System.out.println("Correct!"); 
	      score++; 
	    } else { 
	    	System.out.println("Wrong!"); 

	    } 
	    
	    // Display final score 
	    System.out.println("Your final score is: " + score); /// print the your increment score
	    if(score >=8  && score <=10)
	    {
	    	System.out.println("your grade is A :");
	    }
	    else if(score >=5  && score <=7)
	    {
	    	System.out.println("your grade is B :");
	    }
	    else if(score >2  && score <=4)
	    {
	    	System.out.println("your grade is C :");
	    }
	    else
	    {
	    	System.out.println("your grade is D:");// 2 or 2 is lessthan your marks is grade D
	    }
	   
	    }
	    
	  } 
	
	