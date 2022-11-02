import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class

public class CreditCard {


    // Things to consider for a CC:
    /*
        1. credit card number: typically 16 digits (We'll use 6 for simplicity)
        2.  Users: 1 main + other users (
        2.1 Users can be: Authorized or Non-authorized
        3. Name: fname + mName(optional) +  lname
        4. Brand: Visa, MC, AMEX, DSC,
        5. exp date:
        6. cvc
     */

    // Write a program: Takes my credit cards balanances and prints the balances

    public static void main(String[] arg) {

        String name = "json";
        name = "Bil";
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many credit cards do you have? " );

        int numOfCards = userInput.nextInt();
        // create an arry of size 'numOfCards'
        double [] cards = new double[numOfCards];
        System.out.println("Okay, you have " + numOfCards + " credit cards" );

       cards = promptUserForCardBalance(numOfCards);
        printCardBalances(cards);


    }

    //write a method that takes in the number of cards a user has and prompts the
    // the user to enter in balance for each card

    public static double[] promptUserForCardBalance(int num){


        double[] cards = new double[num];
        for(int i = 0; i < cards.length; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter the balance for the credit card " + (i+1) + ": ");
            cards[i] = userInput.nextDouble();
        }

        return cards;
    }

    //write a method that takes in a list of credit cards then prints out the balance for each
    public static void printCardBalances(double[] cards) {

        System.out.println("Here are your  Card Balances");

        int clen = cards.length;
        for(int i= 0; i < clen; i++){
            System.out.println("Card Account: " + (i+1) + " Balance: $" + String.format("%.2f",cards[i]));
        }
    }
}
