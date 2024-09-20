//********************************************************************
//  BBMiniQuiz.java       Author: Brandon Bocanegra
//
//  MiniQuiz Program
// Due 11/21/23
//  Demonstrates the use of a class that implements an interface.
//********************************************************************

import java.util.Scanner;

public class BBMiniQuiz
{
   //-----------------------------------------------------------------
   //  Presents a short quiz.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      Question q1, q2, q3, q4;
      String possible;

      Scanner scan = new Scanner(System.in);
      
      // Define Question 1
      q1 = new Question("Which country hosted the 2014 World Cup?",
                        "Brazil");
      q1.setComplexity(6);
      
      // Define Question 2

      q2 = new Question("Who are arguably the two best soccer players at the moment?",
                        "Messi And Ronaldo");
      q2.setComplexity(10);
      
      //Define Question 3
      
      q3 = new Question("What is 2+2?",
                        "4");
      q3.setComplexity(1);
      
      //Define Question 4
      
      q4 = new Question("What's the name of a popular guitar brand made in Japan?",
                        "Takamine");
      q4.setComplexity(8);
                         
      
      
      // Question 1
      // Displays the question to the screen.
      // Accepts input from user and test input for 
      // correctness

      System.out.print(q1.getQuestion());
      System.out.println(" (Level: " + q1.getComplexity() + ")");
      possible = scan.nextLine();
      if (q1.answerCorrect(possible))
         System.out.println("Correct");
      else
         System.out.println("No, the answer is " + q1.getAnswer());

      System.out.println();
      
      // Question 2
      // Displays the question to the screen.
      // Accepts input from user and test input for 
      // correctness
      
      System.out.print(q2.getQuestion());
      System.out.println(" (Level: " + q2.getComplexity() + ")");
      possible = scan.nextLine();
      if (q2.answerCorrect(possible))
         System.out.println("Correct");
      else
         System.out.println("No, the answer is " + q2.getAnswer());
         
      // Question 3
      // Displays the question to the screen.
      // Accepts input from user and test input for 
      // correctness 
      
      System.out.print(q3.getQuestion());
      System.out.println(" (Level: " + q3.getComplexity() + ")");
      possible = scan.nextLine();
      if (q3.answerCorrect(possible))
         System.out.println("Correct");
      else
         System.out.println("No, the answer is " + q3.getAnswer());
         
      // Question 4
      // Displays the question to the screen.
      // Accepts input from user and test input for 
      // correctness
      
      System.out.print(q4.getQuestion());
      System.out.println(" (Level: " + q4.getComplexity() + ")");
      possible = scan.nextLine();
      if (q4.answerCorrect(possible))
         System.out.println("Correct");
      else
         System.out.println("No, the answer is " + q4.getAnswer());  
   }
}
