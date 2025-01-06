import java.util.Scanner;

public class IT24104273Lab10Q1
{
    public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter mark (0 - 100): ");
    int mark = input.nextInt();

   
    //First Assertion - to check if the mark is in the valid range
    assert(mark >= 0 && mark <= 100) : "Invalid mark" ;

    System.out.println();
    System.out.print("Mark is validated");

    System.out.println();


    //determine the grade according to mark
    char grade;


	     if(mark >= 75 && mark <= 100)
	{ grade = 'A'; }

	else if(mark >= 60 && mark <= 74)
	{ grade = 'B'; }

	else if(mark >= 50 && mark <= 59)
	{ grade = 'C'; }

	else if(mark >= 40 && mark <= 49)
	{ grade = 'D'; }

	else
	{ grade = 'F'; }


   //second assertion - to check if the correct grade as assigned

assert(
        (grade == 'A' && mark >= 75 && mark <= 100) ||
	(grade == 'B' && mark >= 60 && mark <=  74) ||
	(grade == 'C' && mark >= 50 && mark <=  59) ||
	(grade == 'D' && mark >= 40 && mark <=  49) ||
	(grade == 'F' && mark <= 39 )	           
      )  					         : "Incorrect Grade Assigned" ;
	
	System.out.print("The Grade for the entered Mark is: "+grade);

  }

}


