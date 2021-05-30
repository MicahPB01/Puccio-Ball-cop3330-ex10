package oop.example;

import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args )
    {


        ArrayList<Item> list = new ArrayList<Item>();
        Scanner input = new Scanner(System.in);
        float subTotal = 0;
        double taxRate = 0.055;
        float tax;
        float total;

        for(int i = 1; i < 4; i++)   {
            Item item = new Item();
            System.out.printf("Enter the price of item %d: ", i);
            item.price = Float.parseFloat(input.nextLine());

            System.out.printf("Enter the quantity of item %d: ", i);
            item.quantity = Integer.parseInt(input.nextLine());

            list.add(item);

        }

        for(int i = 0; i < 3; i++)   {
            //System.out.printf("Adding %f to % f\n", (list.get(i).price * list.get(i).quantity), subTotal );
            subTotal = subTotal + (list.get(i).price * list.get(i).quantity);
        }
        
        tax = (float) (subTotal * taxRate);
        total = subTotal + tax;

        System.out.printf("Subtotal: $%.2f\n", subTotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);


    }
}
