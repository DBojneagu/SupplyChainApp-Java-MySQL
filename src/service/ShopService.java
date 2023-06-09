package service;
import repository.*;
import model.*;
import java.util.*;

public class ShopService {

    public void addProduct(Shop shop, Product product) {
        shop.getProducts().add(product);
    }


    public void removeProduct(Shop shop, long id) {
        shop.getProducts().removeIf(obj -> obj.getId() == id);
        System.out.println("Produsul a fost sters");
    }

    public void addAction(Shop shop, Action action) {
        shop.getActions().add(action);

    }
    public void addActionDb(Action action) {
        actionRepository.getInstance().addActionDB(action);
    }

    public void addOrder(Shop shop, Order order) {
        shop.getOrders().put(order.getId(), order);
    }

    public void removeAction(Shop shop, long id) {
        shop.getActions().removeIf(obj -> obj.getId() == id);
        System.out.println("Action deleted");
    }

    public void addDelivery(Shop shop, Delivery delivery) {

        shop.getDeliveries().add(delivery);

    }

    public void addAssembly(Shop shop, Assembly assembly) {

        shop.getAssemblies().add(assembly);

    }

    public void addMeasuring(Shop shop, Measuring measuring) {

        shop.getMeasurings().add(measuring);

    }

    public void removeFurniture(Shop shop, long id) {
        shop.getFurnitures().removeIf(obj -> obj.getId() == id);
        System.out.println("Furniture a fost sters");
    }

    public void removeDelivery(Shop shop, long id) {
        shop.getDeliveries().removeIf(obj -> obj.getId() == id);
        System.out.println("Delivery deleted");
    }
    public void removeAssembly(Shop shop, long id) {
        shop.getAssemblies().removeIf(obj -> obj.getId() == id);
        System.out.println("Assembly deleted");
    }
    public void removeMeasuring(Shop shop, long id) {
        shop.getMeasurings().removeIf(obj -> obj.getId() == id);
        System.out.println("Measuring deleted");
    }

    public void addLighting(Shop shop, Lighting lighting) {
        shop.getLightings().add(lighting);

    }

    public void addSmartHome(Shop shop, SmartHome smartHome) {
        shop.getSmartHomes().add(smartHome);

    }

    public void addFurniture(Shop shop, Furniture furniture) {
        shop.getFurnitures().add(furniture);

    }

    public void removeLighting(Shop shop, long id) {
        shop.getLightings().removeIf(obj -> obj.getId() == id);
        System.out.println("Lighting deleted");
    }
    public void removeOrders(Shop shop, long id) {
        shop.getOrders().remove(id);
        System.out.println("Order deleted");
    }

    public void removeSmartHome(Shop shop, long id) {
        shop.getSmartHomes().removeIf(obj -> obj.getId() == id);
        System.out.println("SmartHome deleted");
    }

    public int getNumberOfProducts(Shop shop) {
        int numberOfProducts = 0;
        for (Product p : shop.getProducts()) {
            if (p != null) {
                numberOfProducts++;
            }
        }
        return numberOfProducts;
    }

    public int getNumberOfActions(Shop shop) {
        int numberOfActions = 0;
        for (Action a : shop.getActions()) {
            if (a != null) {
                numberOfActions++;
            }
        }
        return numberOfActions;
    }

    public int getNumberOfFurnitures(Shop shop) {
        int numberOfFurnitures = 0;
        for (Product f : shop.getFurnitures()) {
            if (f != null) {
                numberOfFurnitures++;
            }
        }
        return numberOfFurnitures;
    }

    public int getNumberOfSmartHomes(Shop shop) {
        int numberOfSmartHomes = 0;
        for (Product sm : shop.getSmartHomes()) {
            if (sm != null) {
                numberOfSmartHomes++;
            }
        }
        return numberOfSmartHomes;
    }

    public int getNumberOfDeliveries(Shop shop) {
        int numberOfDeliveries = 0;
        for (Delivery d : shop.getDeliveries()) {
            if (d != null) {
                numberOfDeliveries++;
            }
        }
        return numberOfDeliveries;
    }



    public int getNumberOfMeasurings(Shop shop) {
        int numberOfMeasurings = 0;
        for (Measuring m : shop.getMeasurings()) {
            if (m != null) {
                numberOfMeasurings++;
            }
        }
        return numberOfMeasurings;
    }

    public int getNumberOfAssembly(Shop shop) {
        int numberOfAssemblys = 0;
        for ( Assembly a : shop.getAssemblies()) {
            if (a != null) {
                numberOfAssemblys++;
            }
        }
        return numberOfAssemblys;
    }

    public int getNumberOfLightings(Shop shop) {
        int numberOfLightings = 0;
        for (Product l : shop.getLightings()) {
            if (l != null) {
                numberOfLightings++;
            }
        }
        return numberOfLightings;
    }

    public int getNumberOfOrders(Shop shop) {
        return shop.getOrders().size();
    }

    public void printFurnituresDetails(Shop shop) {
        int i = 0;
        for (Product f : shop.getFurnitures()) {
            i++;
            if (f != null) {
                System.out.println(i + "->" + f);
            }
        }
    }

    public void printOrdersDetails(Shop shop) {
        int i = 0;
        for (Order order : shop.getOrders().values()) {
            i++;
            System.out.println(i + "->" + order);
        }
    }

    public void printLightingsDetails(Shop shop) {
        int i = 0;
        for (Product l : shop.getLightings()) {
            i++;
            if (l != null) {
                System.out.println(i + "->" + l);
            }
        }
    }

    public void printSmartHomesDetails(Shop shop) {
        int i = 0;
        for (Product sm : shop.getSmartHomes()) {
            i++;
            if (sm != null) {
                System.out.println(i + "->" + sm);
            }
        }
    }



    public void printProductsDetails(Shop shop) {
        int i = 0;
        for (Product p : shop.getProducts()) {
            i++;
            if (p != null) {
                System.out.println(i + "->" + p);
            }
        }

    }

    public void printActionsDetails(Shop shop) {
        int i = 0;
        for (Action a : shop.getActions()) {
            i++;
            if (a != null) {
                System.out.println(i + "->" + a);
            }
        }

    }

    public void printDeliveryDetails(Shop shop) {
        int i = 0;
        for (Delivery d : shop.getDeliveries()) {
            i++;
            if (d != null) {
                System.out.println(i + "->" + d);
            }
        }

    }

    public void printMeasuringDetails(Shop shop) {
        int i = 0;
        for (Measuring m : shop.getMeasurings()) {
            i++;
            if (m != null) {
                System.out.println(i + "->" + m);
            }
        }

    }

    public void printAssemblyDetails(Shop shop) {
        int i = 0;
        for (Assembly a : shop.getAssemblies()) {
            i++;
            if (a != null) {
                System.out.println(i + "->" + a);
            }
        }

    }

    public void printProductsDetailsByRange(Shop shop, int lower, int higher) {
        int i = 0;
        for (Product p : shop.getProducts()) {
            i++;
            if (p != null && p.getPrice() >= lower && p.getPrice() <= higher) {
                System.out.println(i + "->" + p);
            }
        }
    }

    public void printProductsDetailsSorted(Shop shop) {
         List<Product> sorted_products = shop.getProducts();
        Collections.sort(sorted_products);
        int i = 0;
        for (Product p : sorted_products) {
            i++;
            if (p != null ) {
                System.out.println(i + "->" + p);
            }
        }
    }

    public Product getProductById(Shop shop, int id) {

        for (Product p : shop.getProducts()) {
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public Action getActionById(Shop shop, int id) {

        for (Action a : shop.getActions()) {
            if (a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public boolean isValidProductId(Shop shop, long id, String productType) {
        List<? extends Product> productList = null; // ? extends Product is the way that my list knows to work
        // with any type of product, either furniture, lighting or smarthome, aka "downcasting"

        switch (productType) {
            case "1":
                productList = shop.getFurnitures();
                break;
            case "2":
                productList = shop.getLightings();
                break;
            case "3" :
                productList = shop.getSmartHomes();
        }

        if (productList == null) {
            return false;
        }

        for (Product p : productList) {
            if (p.getId() == id) {
                return true;
            }
        }

        return false;
    }

    public boolean isValidProductOnlyId(Shop shop, long id) {
        List<? extends Product> productList = null; // ? extends Product is the way that my list knows to work
        // with any type of product, either furniture, lighting or smarthome, aka "downcasting"

       productList = shop.getProducts();

        if (productList == null) {
            return false;
        }

        for (Product p : productList) {
            if (p.getId() == id) {
                return true;
            }
        }

        return false;
    }

    public boolean isValidActionId(Shop shop, long id, String actionType) {
        List<? extends Action> actionList = null; // ? extends Product is the way that my list knows to work
        // with any type of product, either furniture, lighting or smarthome, aka "downcasting"

        switch (actionType) {
            case "1":
                actionList = shop.getDeliveries();
                break;
            case "2":
                actionList = shop.getMeasurings();
                break;
            case "3" :
                actionList = shop.getAssemblies();
        }

        if (actionList == null) {
            return false;
        }

        for (Action a : actionList) {
            if (a.getId() == id) {
                return true;
            }
        }

        return false;
    }

    public boolean isValidActionOnlyId(Shop shop, long id) {
        List<? extends Action> actionList = null; // ? extends Product is the way that my list knows to work
        // with any type of product, either furniture, lighting or smarthome, aka "downcasting"

        actionList = shop.getActions();

        if (actionList == null) {
            return false;
        }

        for (Action a : actionList) {
            if (a.getId() == id) {
                return true;
            }
        }

        return false;
    }

    public boolean isValidOrder(Shop shop, long id) {
        Map<Long, ? extends Order> orderMap = null; // ? extends Product is the way that my map knows to work with any type of product, either furniture, lighting or smarthome, aka "downcasting"

        orderMap = shop.getOrders();

        if (orderMap == null) {
            return false;
        }

        return orderMap.containsKey(id);
    }


}
// nu stiu sigur daca l facem
