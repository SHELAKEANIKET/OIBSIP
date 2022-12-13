import java.util.Random;
import java.util.Scanner;

class SimpleGame{
    public int generatedNumber;
    public int userInputnumber;
    public int noOfGuesses=0; // initialize with 0

    public void setNoofGuesses(int noOfGuesses) 
	{
        this.noOfGuesses = noOfGuesses;
    }

    public int getNoofGuesses() 
	{
        return noOfGuesses;
    }

  //constuctor of class
    SimpleGame() 
   {
        Random R=new Random(); // ramdom Number generated
        this.generatedNumber=R.nextInt(100); // range of number is in between 0 to 100
    }
    
void TakeUserInput()
    {
        System.out.println("Guess the number:");
        Scanner s = new Scanner(System.in);
        userInputnumber=s.nextInt(); // taking numbers from uesr
    }

    boolean isCorrectNumber() // method to check the number is correct or not
{
        noOfGuesses++;
if(userInputnumber==generatedNumber)
{
	System.out.println("****************************************************");
    System.out.format("You guessed the Correct number,it was %d",generatedNumber);
	System.out.print("\n****************************************************");
	System.out.format("\nYou guessed it in %d attempts",noOfGuesses);
	System.out.print("\n****************************************************");
    return true;
}
else if (userInputnumber < generatedNumber) 
{
    System.out.println("Number is Lower.....");
}
else if (userInputnumber > generatedNumber) 
{
    System.out.println("Number is Higher.....");
}

return false;
    }
}


public class NumberGuessingGame {
    public static void main(String[] args) {
        SimpleGame g = new SimpleGame();
        boolean b=false;
        while (!b) // continuously checking
		{
            g.TakeUserInput();
            b = g.isCorrectNumber();
        }
    }
}