package Models;

import Models.Drinks;
import helper.DrinksMachine;

import java.util.Scanner;

public class VendingMachineWithDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Select a drink:");
            System.out.println("1. Coffee - price " + Drinks.COFFEE_PRICE);
            System.out.println("2. Tea - price " + Drinks.TEA_PRICE);
            System.out.println("3. Lemonade - price " + Drinks.LEMONADE_PRICE);
            System.out.println("4. Mochito - price " + Drinks.MOCHITO_PRICE);
            System.out.println("5. Mineral water - price " + Drinks.MINERAL_WATER_PRICE);
            System.out.println("6. Coca Cola - price " + Drinks.COCA_COLA_PRICE);
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            DrinksMachine drink;

            switch (choice) {
                case 1:
                    drink = DrinksMachine.COFFEE;
                    break;
                case 2:
                    drink = DrinksMachine.TEA;
                    break;
                case 3:
                    drink = DrinksMachine.LEMONADE;
                    break;
                case 4:
                    drink = DrinksMachine.MOCHITO;
                    break;
                case 5:
                    drink = DrinksMachine.MINERAL_WATER;
                    break;
                case 6:
                    drink = DrinksMachine.COCA_COLA;
                    break;
                case 7:
                    Drinks.displayTotal();
                    return;
                default:

                    System.out.println("Invalid choice.");
                    continue;

            }

            Drinks.makeDrink(drink);
            Drinks.calculateTotalAmount(drink);

        }
    }
}
