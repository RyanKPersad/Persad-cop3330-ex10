/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package SelfCheckout;
import java.util.Scanner;

public class App 
{
    static Scanner myObj = new Scanner(System.in);
    public static void main( String[] args )
    {
        //variables
        String quantity1;
        String quantity2;
        String quantity3;
        String item1;
        String item2;
        String item3;
        double tax =.055;
        double Subtotal;

        //Input
        System.out.print( "Enter the price of item 1:" );
        item1 = myObj.nextLine();
        System.out.print( "Enter the quantity of item 1:" );
        quantity1 = myObj.nextLine();

        System.out.print( "Enter the price of item 2:" );
        item2 = myObj.nextLine();
        System.out.print( "Enter the quantity of item 2:" );
        quantity2 = myObj.nextLine();

        System.out.print( "Enter the price of item 3:" );
        item3 = myObj.nextLine();
        System.out.print( "Enter the quantity of item 3:" );
        quantity3 = myObj.nextLine();

        //Conversion
        double newItem1 = Double.parseDouble(item1);
        double newItem2 = Double.parseDouble(item2);
        double newItem3 = Double.parseDouble(item3);

        int newQuantity1 = Integer.parseInt(quantity1);
        int newQuantity2 = Integer.parseInt(quantity2);
        int newQuantity3 = Integer.parseInt(quantity3);

        //Calculation
        double price1 = newItem1*newQuantity1;
        double price2 = newItem2*newQuantity2;
        double price3 = newItem3*newQuantity3;

        Subtotal = price1+price2+price3;
        double taxTotal = Subtotal * tax;
        double newSubtotal = Subtotal+taxTotal;

        String print1 = String.format("Subtotal: $%.2f\nTax: $%.2f\ntotal: $%.2f", Subtotal,taxTotal,newSubtotal);

        System.out.println(print1);

    }
}
