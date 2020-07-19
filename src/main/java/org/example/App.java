package org.example;

import org.example.constructionCost.ConstructionCost;
import org.example.interestCalculation.CompoundInterest;
import org.example.interestCalculation.Interest;
import org.example.interestCalculation.SimpleInterest;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice : Enter 'I' for interest calculation or 'C' for construction cost calculation");
        char choice = sc.next().charAt(0);

        Interest interest;

        switch (choice) {
            case 'I':
                System.out.println("Kindly enter the kind of interest you want to calculate : Enter 'SI' for simple interest calculation or 'CI' for compound interest cost calculation ");
                switch (sc.next()) {
                    case "SI":
                        interest = new SimpleInterest();
                        System.out.println("Kindly enter \"Principal Amount\" , \"Duration in Years\" and \"Rate of Interest\"...");
                        System.out.println("Your calculated interest is " + interest.calculateInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                        break;
                    case "CI":
                        interest = new CompoundInterest();
                        System.out.println("Kindly enter \"Principal Amount\" , \"Duration in Years\" and \"Rate of Interest\"...");
                        System.out.println("Your calculated interest is " + interest.calculateInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                        break;
                    default:
                        System.out.println("Wrong Choice");
                }
                break;
            case 'C':
                System.out.println("Kindly enter the kind of material you want: Enter 'Low_Quality_Material' for Low Quality Material, 'Medium_Quality_Material' for medium material, 'High_Quality_Material' for high Quality material");
                String material = sc.next();
                System.out.println("Kindly enter total area of house\n");
                double area = sc.nextDouble();
                System.out.println("Do you want fully automated home ? (True/False)\n");
                Boolean automationHouse = sc.nextBoolean();
                Double totalCost = ConstructionCost.calculateCost(material, area, automationHouse);
                System.out.println("Total cost for construction of your house is "+totalCost);
                break;
            default :
                System.out.println("Wrong choice");
                break;
        }
    }
}
