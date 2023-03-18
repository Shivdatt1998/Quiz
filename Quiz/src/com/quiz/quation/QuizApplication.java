package com.quiz.quation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizApplication {

	  
	//take a two variable set value is 0
	 int correctAnsCount=0;
	    int wrongAnsCount=0;
	    
	    
	    
	// take a method
	public void  quizLogic()
	{
		
		
		/// create a object Question class inside Object store the question and option
		Question q1 = new Question("1.Which statement is true about Java?", "A. Java is a sequence-dependent programming language ", "B. Java is a code dependent programming language ", "C. Java is a platform-dependent programming language ", "D. Java is a platform-independent programming language ");
        Question q2 = new Question("8.What is the extension of java code files?", "A. .txt", "B. .pdf", "C. .sql", "D. .java");
        Question q3= new  Question("4.Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
        Question q4 = new Question("2.Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
        Question q5 = new Question("3.Which of these cannot be used for a variable name in Java?", "A. identifier & keyword", "B. identifier", "C. Keyword", "D. none of the mentioned");
        Question q6 = new Question("10.Which keyword is used for accessing the features of a package?", "A. import", "B. package", "C. extends", "D. expert");
        Question q7 = new Question("7.What is the return type of the hashCode() method in the Object class?", "A. Int", "B. Object", "C. void", "D. long");
        Question q8 = new Question("6.Which of the following is a marker interface?", "A. Runnable interface", "B. Remote interface", "C. Result interface", "D. none of the mentioned");
        Question q9 = new Question("9.Which of the following is a mutable class in java?", "A. java.lang.string.bulider", "B. java.long.Short", "C. java.lang.String", "D. none of the mentioned");
        Question q10 = new Question("5.In which memory a String is stored, when we create a string using new operator?", "A. Stack", "B. String memory", "C. Random Store Space", "D. Heap memory");
        
        
        
        //create a loosely couple relation Map and HashMap
       
        
             //set key is question and set value is Character
        Map<Question,Character> hmap=new HashMap<>();
        
        hmap.put(q1,'C');// pass the key is q1,q2 object name and value is correct option a,b,c,d any correct option
        hmap.put(q2,'D');
        hmap.put(q3,'B');
        hmap.put(q4,'B');
        hmap.put(q5,'C');
        hmap.put(q6,'B');
        hmap.put(q7,'B');
        hmap.put(q8,'B');
        hmap.put(q9,'A');
        hmap.put(q10,'D');

        
        // take a for loop 
        for(Map.Entry<Question,Character> map:hmap.entrySet()){/// Entry set method return collection view of the map 
            System.out.println(map.getKey().getQuestion());/// our quation store in key that resin use getkey() mehtod  after that  take getQuation method print the quation
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());
      
            
            // create a scanner class for take a input user
            Scanner sc=new Scanner(System.in);
            
            
            // user massage
            System.out.println("Enter Your Answer: ");
            
            
            Character ans=sc.next().charAt(0);/// store the user input in Ans name variable by using chrAt method
            
          
            
            int cans=Character.compare(ans,map.getValue());/// take  compare method and pass the value for method key, value format store cans variable
           
            
            if(cans==0){/// we are compare chatAt method compare at 0 position  that resin take 0
                System.out.println("Correct");
               correctAnsCount ++; //increment the create ans
            }
            else{
                System.out.println("Wrong");////increment the wrong  ans
                wrongAnsCount ++;
            }
            
            }
        int percentage=(100*correctAnsCount)/hmap.size();/// store the ans in percentage variable // calcute the result 100 * coorect ans 

	       
        if(percentage>=90){
            System.out.println("Performance is grade: A");// If your precentage is greater than 90 your Anser is gread A
        }
        else if(percentage>=70 && percentage<=90){
            System.out.println("Performance is grade: B");// If your precentage is greater than 70 your Anser is gread B
        }
        else if(percentage>=40 && percentage<=70){
            System.out.println("Performance is grade: C");// If your precentage is greater than 40 your Anser is gread C
        }
        else if(percentage<=40 && percentage>=20){
            System.out.println("Performance is grade: D");// If your precentage is greater than 20 your Anser is gread D
        }  
       else{
          System.out.println("You are fail.."); /// If your precentage is  10 You are fail...
       }
        
        
         System.out.println("--------Result---------");
        System.out.println("Total Questions: "+hmap.size());/// take size method check the how manny quation take 
        System.out.println("Correct Answered Questions : "+correctAnsCount); /// coorectAnsCount store in coorct ans count variable that resion take it 
        System.out.println("Wrong Answered Questions : "+wrongAnsCount);   ////// wrongAnsCount store in wrong ans count variable that resion take it 
        
        
	}
}
