import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double itemCost = 0; // num itemCost = 0
        double totalCost = 0; // num totalCost = 0
        double shippingCost = 0; // num shippingCost = 0
        String trash = ""; // use for bad input which will read as a String

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the cost of an item: $");  // output “Enter the cost of an item, or 0 when you are finished: ”

        if(in.hasNextDouble()) // OK safe to read in a double
        {
            itemCost = in.nextDouble();  // input itemCost
            in.nextLine(); // clears the newline from the buffer

            totalCost = totalCost + itemCost; // totalCost = totalCost + itemCost

            if (itemCost < 100) // if itemCost < 100 then
            {
                shippingCost = totalCost * 0.02; // shippingCost = totalCost * 0.02
            }
            else  // else
            {
                shippingCost = 0; // shippingCost = 0
            }  // endIf

            totalCost = totalCost + shippingCost; // totalCost = totalCost + shippingCost
            System.out.println("Your shipping cost is : $"+shippingCost+". The total price including shipping is: $" + totalCost); //output "Your total price including shipping is: $" + totalCost
        }
        else // Not a double can't use nextDouble() read as String with nextLine() instead
        {
            trash = in.nextLine(); // Ok have to read the input as a String
            System.out.println("\nYou said your item cost was: " + trash);
            System.out.println("Run the program again and enter a valid amount for the item cost.");
        }
    }
}