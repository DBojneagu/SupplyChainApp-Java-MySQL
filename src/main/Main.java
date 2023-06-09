package main;
import repository.*;
import model.*;
import service.*;

import java.io.IOException;
import  java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        Shop shop = new Shop();
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
           //deliveryRepository.getInstance().printAllDeliveries();
            System.out.println("Ikea Menu");
            System.out.println("1. Products Menu & Actions Menu");
            System.out.println("2. Orders Menu");
            System.out.println("3. Initialize the database");
            System.out.println("4. Delete the DataBase ");
            System.out.println("5. Exit");
            input = scanner.nextLine();
            while (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4") && !input.equals("5")) {
                System.out.println("Invalid input. Please enter a valid option: ");
                input= scanner.nextLine();
            }
            if (input.equals("1")) {
                shop.menu_productsAndActions();
            }
        else if (input.equals("2")) {
                shop.menu_orders();
            }
        else if (input.equals("3")) {
                shop.init();
            }
        else if (input.equals("4")) {
                ordersRepository.getInstance().deleteAllorderssDB();
                actionRepository.getInstance().deleteAllActionsDB();
                deliveryRepository.getInstance().deleteAllDeliveriesDB();
                productRepository.getInstance().deleteAllProdcutsDB();
                assemblyRepository.getInstance().deleteAllAssembliesDB();
                measuringRepository.getInstance().deleteAllMeasuringsDB();
                furnitureRepository.getInstance().deleteAllFurnitureDB();
                lightingRepository.getInstance().deleteAllLighting();
                smarthomeRepository.getInstance().deleteAllsmarthome();
            }
        } while (!input.equals("5"));
    }
}
