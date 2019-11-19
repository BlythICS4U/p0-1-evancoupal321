/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0.pkg1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class P01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("QUESTION 1");
        double principal, rate, time, interest;
        System.out.println("Enter the principal in dollars.");
        principal = keyboard.nextDouble();
        System.out.println("Enter the interest rate as a percent.");
        rate = keyboard.nextDouble();
        System.out.println("Enter the amount of time in years.");
        time = keyboard.nextDouble();
        interest = Math.round((principal * rate * time) * 100)/100.0;
        System.out.printf("%s%-1.2f", "The interest added is $", interest);
        System.out.println();
        System.out.println();
        System.out.println("QUESTION 2");
        double hours, hourlyRate, pay;
        System.out.println("Enter the number of hours worked.");
        hours = keyboard.nextDouble();
        System.out.println("Enter the hourly pay in dollars.");
        hourlyRate = keyboard.nextDouble();
        pay = Math.round((hours * hourlyRate) * 100)/100.0;
        System.out.printf("%s%-1.2f", "The pay is $", pay);
        System.out.println();
        System.out.println();
        System.out.println("QUESTION 3");
        double quantity, pricePerItem, totalCost;
        System.out.println("Enter the Quantity of the item.");
        quantity = keyboard.nextDouble();
        System.out.println("Enter the price per item in dollars.");
        pricePerItem  = keyboard.nextDouble();
        totalCost = Math.round((quantity * pricePerItem) * 100)/100.0;
        System.out.printf("%s%-1.2f", "The total cost is $", totalCost);
        System.out.println();
        System.out.println();
        System.out.println("QUESTION 4");
        double baseLength, height, area;
        System.out.println("Enter the base's length in metres.");
        baseLength = keyboard.nextDouble();
        System.out.println("Enter the height in metres.");
        height = keyboard.nextDouble();
        area = Math.round((baseLength * height / 2) * 100)/100.0;
        System.out.printf("%s%-1.1f%s", "The area is ", area, " square metres.");
        System.out.println();
        System.out.println();
        System.out.println("QUESTION 5");
        double capacityWeight, averageWeight, capacityPeople;
        System.out.println("Enter the lifting capacity of the elevator in pounds.");
        capacityWeight = keyboard.nextDouble();
        System.out.println("Enter the average adult weight in pounds.");
        averageWeight = keyboard.nextDouble();
        capacityPeople = Math.floor(capacityWeight/averageWeight);
        System.out.printf("%s%-1.0f%s", "The safe capacity of the elevator is ", capacityPeople, " Adults.");
        System.out.println();
        System.out.println();
        System.out.println("QUESTION 6");
        int totalDonuts, boxes, leftoverDonuts;
        System.out.println("Enter the number of donuts in the batch.");
        totalDonuts = keyboard.nextInt();
        boxes = (totalDonuts - totalDonuts % 12)/12;
        leftoverDonuts = totalDonuts%12;
        System.out.println("You will need " + boxes + " boxes." );
        System.out.println("There will be " + leftoverDonuts + " donuts left over to donate to the Food Bank.");
        System.out.println();
        System.out.println("QUESTION 7");
        int cents7, quarters7, dimes7, nickels7, pennies7; //When two variables are the same, the question number is used to tell the variables apart.
        System.out.println("Enter the number of cents.");
        cents7 = keyboard.nextInt();
        quarters7 = (cents7 - cents7 % 25)/25;
        cents7 -= quarters7 * 25;
        dimes7= (cents7 - cents7 % 10)/10;
        cents7 -= dimes7 * 10;
        nickels7 = (cents7 - cents7 % 5)/5;
        cents7 -= nickels7 * 5;
        pennies7 = cents7;
        System.out.println("Number of Quarters: " + quarters7);
        System.out.println("Number of Dimes: " + dimes7);
        System.out.println("Number of Nickels: " + nickels7);
        System.out.println("Number of Pennies: " + pennies7);
        System.out.println();
        System.out.println("QUESTION 8");
        int cents8, twenties, tens, fives, twos, ones, quarters8, dimes8, nickels8, pennies8; //When two variables are the same, the question number is used to tell the variables apart.
        System.out.println("Enter the number of cents.");
        cents8 = keyboard.nextInt();
        twenties = (cents8 - cents8 % 2000)/2000;
        cents8 -= twenties * 2000;
        tens = (cents8 - cents8 % 1000)/1000;
        cents8 -= tens * 1000;
        fives = (cents8 - cents8 % 500)/500;
        cents8 -= fives * 500;
        twos = (cents8 - cents8 % 200)/200;
        cents8 -= twos * 200;
        ones = (cents8 - cents8 % 100)/100;
        cents8 -= ones * 100;
        quarters8 = (cents8 - cents8 % 25)/25;
        cents8 -= quarters8 * 25;
        dimes8= (cents8 - cents8 % 10)/10;
        cents8 -= dimes8 * 10;
        nickels8 = (cents8 - cents8 % 5)/5;
        cents8 -= nickels8 * 5;
        pennies8 = cents8;
        System.out.println("Number of Twenties: " + twenties);
        System.out.println("Number of Tens: " + tens);
        System.out.println("Number of Fives: " + fives);
        System.out.println("Number of Twos: " + twos);
        System.out.println("Number of Ones: " + ones);
        System.out.println("Number of Quarters: " + quarters8);
        System.out.println("Number of Dimes: " + dimes8);
        System.out.println("Number of Nickels: " + nickels8);
        System.out.println("Number of Pennies: " + pennies8);
        System.out.println();
        System.out.println("QUESTION 9");
        int totalInches, miles, yards, feet, inches;
        System.out.println("Enter the number of inches.");
        totalInches = keyboard.nextInt();
        miles = (totalInches - totalInches % 63360)/63360;
        totalInches -= miles * 63360;
        yards = (totalInches - totalInches % 36)/36;
        totalInches -= yards * 36;
        feet = (totalInches - totalInches % 12)/12;
        totalInches -= feet * 12;
        inches = totalInches;
        System.out.println("Number of Miles: " + miles);
        System.out.println("Number of Yards: " + yards);
        System.out.println("Number of Feet: " + feet);
        System.out.println("Number of Inches: " + inches);
    }
    
}
