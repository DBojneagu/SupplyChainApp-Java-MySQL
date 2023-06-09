package model;
import repository.*;
import service.ProductService;
import service.ShopService;
import service.*;
import model.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import java.util.*;

public class Shop {
    String input;
    String menutype;

    String input2;
    ShopService shopService = new ShopService();
    ProductService productService = new ProductService();
    OrderService orderService = new OrderService();
    ActionService actionService = new ActionService();
    Scanner scanner = new Scanner(System.in);
    private List < Product > products = new ArrayList < > ();
    private List < Furniture > furnitures = new ArrayList < > ();
    private List < Lighting > lightings = new ArrayList < > ();
    private List < SmartHome > smartHomes = new ArrayList < > ();
    private List < Action > actions = new ArrayList < > ();
    private Map < Long, Order > orders = new HashMap < > ();
    private List < Delivery > deliveries = new ArrayList < > ();
    private List < Measuring > measurings = new ArrayList < > ();
    private List < Assembly > assemblies = new ArrayList < > ();
    private static Shop single_instance = null;

    public Map < Long, Order > getOrders() {
        return orders;
    }

    public void setOrders(Map < Long, Order > orders) {
        this.orders = orders;
    }

    public List < Action > getActions() {
        return actions;
    }

    public void setActions(List < Action > actions) {
        this.actions = actions;
    }

    public List < Delivery > getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List < Delivery > deliveries) {
        this.deliveries = deliveries;
    }

    public List < Measuring > getMeasurings() {
        return measurings;
    }

    public void setMeasurings(List < Measuring > measurings) {
        this.measurings = measurings;
    }

    public List < Assembly > getAssemblies() {
        return assemblies;
    }

    public void setAssemblies(List < Assembly > assemblies) {
        this.assemblies = assemblies;
    }

    public static synchronized Shop getInstance() {
        if (single_instance == null) {
            single_instance = new Shop();
        }
        return single_instance;
    }
    public List < Product > getProducts() {
        return products;
    }

    public void setProducts(List < Product > products) {
        this.products = products;
    }

    public List < Furniture > getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(List < Furniture > furnitures) {
        this.furnitures = furnitures;
    }

    public List < Lighting > getLightings() {
        return lightings;
    }

    public void setLightings(List < Lighting > lightings) {
        this.lightings = lightings;
    }

    public List < SmartHome > getSmartHomes() {
        return smartHomes;
    }

    public void setSmartHomes(List < SmartHome > smartHomes) {
        this.smartHomes = smartHomes;
    }
    actionRepository repositoryAction = new actionRepository();

    public void init() {
        Furniture added_furniture = productService.buildFurniture("Scaun", 200, 100, "bumbac", 10, 10);
        shopService.addProduct(getInstance(), added_furniture);
        shopService.addFurniture(getInstance(), added_furniture);
        productRepository.getInstance().addProductDB(added_furniture);
        furnitureRepository.getInstance().addfurnitureDB(added_furniture);

        Furniture added_furniture2 = productService.buildFurniture("Canapea", 500, 60, "Piele Naturala", 200, 100);
        shopService.addProduct(getInstance(), added_furniture2);
        shopService.addFurniture(getInstance(), added_furniture2);
        productRepository.getInstance().addProductDB(added_furniture2);
        furnitureRepository.getInstance().addfurnitureDB(added_furniture2);

        Furniture added_furniture3 = productService.buildFurniture("Birou", 700, 250, "Stejar", 200, 160);
        shopService.addProduct(getInstance(), added_furniture3);
        shopService.addFurniture(getInstance(), added_furniture3);
        productRepository.getInstance().addProductDB(added_furniture3);
        furnitureRepository.getInstance().addfurnitureDB(added_furniture3);

        Furniture added_furniture4 = productService.buildFurniture("Noptiera", 50, 10, "Brad", 300, 450);
        shopService.addProduct(getInstance(), added_furniture4);
        shopService.addFurniture(getInstance(), added_furniture4);
        productRepository.getInstance().addProductDB(added_furniture4);
        furnitureRepository.getInstance().addfurnitureDB(added_furniture4);

        Furniture added_furniture5 = productService.buildFurniture("Fotoliu", 500, 150, "Piele", 400, 450);
        shopService.addProduct(getInstance(), added_furniture5);
        shopService.addFurniture(getInstance(), added_furniture5);
        productRepository.getInstance().addProductDB(added_furniture5);
        furnitureRepository.getInstance().addfurnitureDB(added_furniture5);

        Furniture added_furniture6 = productService.buildFurniture("Masa", 1000, 5, "Lemn", 500, 150);
        shopService.addProduct(getInstance(), added_furniture6);
        shopService.addFurniture(getInstance(), added_furniture6);
        productRepository.getInstance().addProductDB(added_furniture6);
        furnitureRepository.getInstance().addfurnitureDB(added_furniture6);

        Furniture added_furniture7 = productService.buildFurniture("Canapea", 3000, 1403, "Piele Intoarsa", 200, 350);
        shopService.addProduct(getInstance(), added_furniture7);
        shopService.addFurniture(getInstance(), added_furniture7);
        productRepository.getInstance().addProductDB(added_furniture7);
        furnitureRepository.getInstance().addfurnitureDB(added_furniture7);

        Furniture added_furniture8 = productService.buildFurniture("Scaun", 20, 110, "Lemn", 100, 150);
        shopService.addProduct(getInstance(), added_furniture8);
        shopService.addFurniture(getInstance(), added_furniture8);
        productRepository.getInstance().addProductDB(added_furniture8);
        furnitureRepository.getInstance().addfurnitureDB(added_furniture8);

        Lighting added_lighting1 = productService.buildLighting("Bec", 200, 100, 300, "electric");
        shopService.addProduct(getInstance(), added_lighting1);
        shopService.addLighting(getInstance(), added_lighting1);
        productRepository.getInstance().addProductDB(added_lighting1);
        lightingRepository.getInstance().addlightingDB(added_lighting1);

        Lighting added_lighting2 = productService.buildLighting("Lanterna", 500, 20, 30, "electric");
        shopService.addProduct(getInstance(), added_lighting2);
        shopService.addLighting(getInstance(), added_lighting2);
        productRepository.getInstance().addProductDB(added_lighting2);
        lightingRepository.getInstance().addlightingDB(added_lighting2);

        SmartHome added_smarthome1 = productService.buildSmartHome("Dumbell", 200, 100, "LifeStyle", "Stepper");
        shopService.addProduct(getInstance(), added_smarthome1);
        shopService.addSmartHome(getInstance(), added_smarthome1);
        productRepository.getInstance().addProductDB(added_smarthome1);
        smarthomeRepository.getInstance().addsmarthomeDB(added_smarthome1);

        SmartHome added_smarthome2 = productService.buildSmartHome("Treadmill", 1000, 100, "Fitness", "Now");
        shopService.addProduct(getInstance(), added_smarthome2);
        shopService.addSmartHome(getInstance(), added_smarthome2);
        productRepository.getInstance().addProductDB(added_smarthome2);
        smarthomeRepository.getInstance().addsmarthomeDB(added_smarthome2);


        Delivery added_delivery1 = actionService.buildDelivery("UPS", 200, "Mazda", "SUV");
        actionRepository.getInstance().addActionDB(added_delivery1);
        deliveryRepository.getInstance().addDeliveryDB(added_delivery1);
        shopService.addAction(getInstance(), added_delivery1);

        shopService.addDelivery(getInstance(), added_delivery1);

        Delivery added_delivery2 = actionService.buildDelivery("DHL", 500, "Ford", "Sedan");
        actionRepository.getInstance().addActionDB(added_delivery2);
        deliveryRepository.getInstance().addDeliveryDB(added_delivery2);
        shopService.addAction(getInstance(), added_delivery2);
        shopService.addDelivery(getInstance(), added_delivery2);

        Delivery added_delivery3 = actionService.buildDelivery("SameDay", 1000, "Dacia", "Van");
        shopService.addAction(getInstance(), added_delivery3);
        actionRepository.getInstance().addActionDB(added_delivery3);
        deliveryRepository.getInstance().addDeliveryDB(added_delivery3);
        shopService.addDelivery(getInstance(), added_delivery3);

        Delivery added_delivery4 = actionService.buildDelivery("Fan", 1000, "Renault", "Van");
        shopService.addAction(getInstance(), added_delivery4);
        actionRepository.getInstance().addActionDB(added_delivery4);
        deliveryRepository.getInstance().addDeliveryDB(added_delivery4);
        shopService.addDelivery(getInstance(), added_delivery4);

        Measuring added_measuring1 = actionService.buildMeasuring("Ikea_Measuring", 2000, "Outside");
        shopService.addAction(getInstance(), added_measuring1);
        shopService.addMeasuring(getInstance(), added_measuring1);
        actionRepository.getInstance().addActionDB(added_measuring1);
        measuringRepository.getInstance().addMeasuringDB(added_measuring1);

        Measuring added_measuring2 = actionService.buildMeasuring("Ikea_Measuring", 1000, "Inside");
        shopService.addAction(getInstance(), added_measuring2);
        shopService.addMeasuring(getInstance(), added_measuring2);
        actionRepository.getInstance().addActionDB(added_measuring2);
        measuringRepository.getInstance().addMeasuringDB(added_measuring2);

        Assembly added_assembly1 = actionService.buildAssembly("Jenga", 10000, 10, 20);
        shopService.addAction(getInstance(), added_assembly1);
        shopService.addAssembly(getInstance(), added_assembly1);
        actionRepository.getInstance().addActionDB(added_assembly1);
        assemblyRepository.getInstance().addAssemblyDB(added_assembly1);

        Assembly added_assembly2 = actionService.buildAssembly("Ikea_Assemblers", 20000, 12, 15);
        shopService.addAction(getInstance(), added_assembly2);
        shopService.addAssembly(getInstance(), added_assembly2);
        actionRepository.getInstance().addActionDB(added_assembly2);
        assemblyRepository.getInstance().addAssemblyDB(added_assembly2);

        Order added_order = orderService.buildOrder(added_assembly1, added_furniture3);
        ordersRepository.getInstance().addordersDB(added_order);
        shopService.addOrder(getInstance(), added_order);

        Order added_order2 = orderService.buildOrder(added_assembly2, added_smarthome1);
        shopService.addOrder(getInstance(), added_order2);
        ordersRepository.getInstance().addordersDB(added_order2);

        Order added_order3 = orderService.buildOrder(added_delivery1, added_lighting2);
        shopService.addOrder(getInstance(), added_order3);
        ordersRepository.getInstance().addordersDB(added_order3);

        Order added_order4 = orderService.buildOrder(added_measuring1, added_furniture4);
        shopService.addOrder(getInstance(), added_order4);
        ordersRepository.getInstance().addordersDB(added_order4);
    }
    public void menu_productsAndActions() throws IOException {
        do {
            System.out.println("Ikea Menu");
            System.out.println("1. Products");
            System.out.println("2. Actions ");
            System.out.println("3. Exit  ");
            menutype = scanner.nextLine();
            while (!menutype.equals("1") && !menutype.equals("2") && !menutype.equals("3")) {
                System.out.println("Invalid input. Please enter a valid option: ");
                menutype = scanner.nextLine();
            }


            if (menutype.equals("1")) {

                do {
                    System.out.println("Ikea Menu");
                    //                    System.out.println("1. Add a new Product Information" + "                                       " + "Total number of Products " + shopService.getNumberOfProducts(getInstance()));
                    System.out.println("1. Add a new Product Information" + "                                       " + "Total number of Products " + productRepository.getInstance().getNumberOfProductsDB());
                    System.out.println("2. Get the description of  products  " + "                                  " + "Number of Furnitures : " + furnitureRepository.getInstance().getNumberOfFurnitureDB());
                    System.out.println("3. Delete a product  " + "                                                  " + "Number of Lightings : " + lightingRepository.getInstance().getNumberOfLightingDB());
                    System.out.println("4. Search products by price range " + "                                     " + "Number of SmartHomes : " + smarthomeRepository.getInstance().getNumberOfSmartHomeDB());
                    System.out.println("5. Sort the products by price ");
                    System.out.println("6. Edit Product ");
                    System.out.println("7. Go back to main menu ");
                    input = (scanner.nextLine());
                    while (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4") && !input.equals("5") && !input.equals("6") && !input.equals("7")) {
                        System.out.println("Invalid input. Please enter a valid option: ");
                        input = scanner.nextLine();
                    }
                    if (input.equals("1")) {
                        System.out.println("Please specify the details for creating a new product: What category do you want it to be?");
                        System.out.println("1. Furniture");
                        System.out.println("2. Lighting");
                        System.out.println("3. SmartHome");
                        String productType = scanner.nextLine();

                        while (!productType.equals("1") && !productType.equals("2") && !productType.equals("3")) {
                            System.out.println("Invalid input. Please enter a valid option: ");
                            productType = scanner.nextLine();
                        }
                        switch (productType) {
                            case "1":
                                System.out.println("Name:");
                                String name = scanner.nextLine();
                                int price = 0;
                                boolean validPrice = false;
                                while (!validPrice) {
                                    try {
                                        System.out.println("Price:");
                                        price = Integer.parseInt(scanner.nextLine());
                                        validPrice = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the price.");
                                    }
                                }
                                int stock = 0;
                                boolean validStock = false;
                                while (!validStock) {
                                    try {
                                        System.out.println("Stock:");
                                        stock = Integer.parseInt(scanner.nextLine());
                                        validStock = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the stock.");
                                    }
                                }

                                System.out.println("Material:");
                                String material = scanner.nextLine();
                                double height = 0.0;
                                boolean validHeight = false;
                                while (!validHeight) {
                                    try {
                                        System.out.println("height:");
                                        height = Double.parseDouble(scanner.nextLine());
                                        validHeight = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid double for the height.");
                                    }
                                }

                                double width = 0.0;
                                boolean validWidth = false;
                                while (!validWidth) {
                                    try {
                                        System.out.println("Width:");
                                        width = Double.parseDouble(scanner.nextLine());
                                        validWidth = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid double for the width.");
                                    }
                                }

                                Furniture added_furniture = productService.buildFurniture(name, price, stock, material, height, width);
                                shopService.addProduct(getInstance(), added_furniture);
                                shopService.addFurniture(getInstance(), added_furniture);
                                productRepository.getInstance().addProductDB(added_furniture);
                                furnitureRepository.getInstance().addfurnitureDB(added_furniture);
                                Audit.logAction("addFurniture");
                                break;
                            case "2":
                                System.out.println("Name:");
                                name = scanner.nextLine();
                                price = 0;
                                validPrice = false;
                                while (!validPrice) {
                                    try {
                                        System.out.println("Price:");
                                        price = Integer.parseInt(scanner.nextLine());
                                        validPrice = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the price.");
                                    }
                                }
                                stock = 0;
                                validStock = false;
                                while (!validStock) {
                                    try {
                                        System.out.println("Stock:");
                                        stock = Integer.parseInt(scanner.nextLine());
                                        validStock = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the stock.");
                                    }
                                }

                                int power = 0;
                                boolean validPower = false;
                                while (!validPower) {
                                    try {
                                        System.out.println("power:");
                                        power = Integer.parseInt(scanner.nextLine());
                                        validPower = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the power.");
                                    }
                                }

                                System.out.println("type:");
                                String type = scanner.nextLine();
                                Lighting added_lighting = productService.buildLighting(name, price, stock, power, type);
                                shopService.addProduct(getInstance(), added_lighting);
                                shopService.addLighting(getInstance(), added_lighting);
                                productRepository.getInstance().addProductDB(added_lighting);
                                lightingRepository.getInstance().addlightingDB(added_lighting);
                                Audit.logAction("addLighting");
                                break;
                            case "3":
                                System.out.println("Name:");
                                name = scanner.nextLine();
                                price = 0;
                                validPrice = false;
                                while (!validPrice) {
                                    try {
                                        System.out.println("Price:");
                                        price = Integer.parseInt(scanner.nextLine());
                                        validPrice = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the price.");
                                    }
                                }
                                stock = 0;
                                validStock = false;
                                while (!validStock) {
                                    try {
                                        System.out.println("Stock:");
                                        stock = Integer.parseInt(scanner.nextLine());
                                        validStock = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the stock.");
                                    }
                                }
                                System.out.println("Category:");
                                scanner.nextLine();
                                String category = scanner.nextLine();
                                System.out.println("appname : ");
                                String appname = scanner.nextLine();

                                SmartHome added_smarthome = productService.buildSmartHome(name, price, stock, category, appname);
                                shopService.addProduct(getInstance(), added_smarthome);
                                shopService.addSmartHome(getInstance(), added_smarthome);
                                productRepository.getInstance().addProductDB(added_smarthome);
                                smarthomeRepository.getInstance().addsmarthomeDB(added_smarthome);
                                Audit.logAction("addSmartHome");
                                break;
                        }
                    }
                    if (input.equals("2")) {
                        while (true) {
                            System.out.println("What products do you exactly want to see?");
                            System.out.println("1. All products");
                            System.out.println("2. Only Furniture Products");
                            System.out.println("3. Only Lighting Products");
                            System.out.println("4. Only Smarthome Products");
                            String input_afis = scanner.nextLine();

                            switch (input_afis) {
                                case "1":
                                    //shopService.printProductsDetails(getInstance());
                                    productRepository.getInstance().printAllProductsDB();
                                    Audit.logAction("ShowProducts");
                                    break;
                                case "2":
                                    //shopService.printFurnituresDetails(getInstance());
                                    furnitureRepository.getInstance().printAllFurnitureDB();
                                    Audit.logAction("ShowFurniture");
                                    break;
                                case "3":
                                    //shopService.printLightingsDetails(getInstance());
                                    lightingRepository.getInstance().printAllLightingDB();
                                    Audit.logAction("ShowLighting");
                                    break;
                                case "4":
                                    //shopService.printSmartHomesDetails(getInstance());
                                    smarthomeRepository.getInstance().printAllSmartHomeDB();
                                    Audit.logAction("ShowSmartHome");
                                    break;
                                default:
                                    System.out.println("Invalid input. Please enter a valid option.");
                                    continue;
                            }
                            break;
                        }
                    }
                    if (input.equals("3")) {
                        System.out.println("What type of Product do you want to remove? ");
                        System.out.println("1. Furniture ");
                        System.out.println("2. Lighting");
                        System.out.println("3. SmartHome ");
                        String product_type = scanner.nextLine();
                        while (!product_type.equals("1") && !product_type.equals("2") && !product_type.equals("3")) {
                            System.out.println("Invalid input. Please enter a valid option: ");
                            product_type = scanner.nextLine();
                        }
                        while (true) {
                            switch (product_type) {
                                case "1":
                                    //shopService.printFurnituresDetails(getInstance());
                                    furnitureRepository.getInstance().printAllFurnitureDB();
                                    System.out.print("Enter the ID of the furniture you want to remove: ");
                                    long furnitureId = scanner.nextLong();
                                    scanner.nextLine();


                                    //                                    if (!shopService.isValidProductId(getInstance(), furnitureId, "1")) {
                                    //                                        System.out.println("Invalid ID entered. Please try again.");
                                    //                                        continue;
                                    //                                    }
                                    if (!productRepository.getInstance().isValidProductIdOrdersDB(furnitureId, "1")) {
                                        System.out.println("Invalid ID entered or this Product is currently in an order.");
                                        continue;
                                    }

                                    //shopService.removeFurniture(getInstance(), furnitureId);
                                    // shopService.removeProduct(getInstance(), furnitureId);
                                    furnitureRepository.getInstance().deleteFurnitureByIdDB(furnitureId);
                                    productRepository.getInstance().deleteProductByIdDB(furnitureId);
                                    Audit.logAction("DeleteFurniture");
                                    break;
                                case "2":
                                    //shopService.printLightingsDetails(getInstance());
                                    lightingRepository.getInstance().printAllLightingDB();
                                    System.out.print("Enter the ID of the Lighting you want to remove: ");
                                    long lightingId = scanner.nextLong();
                                    scanner.nextLine();

                                    if (!productRepository.getInstance().isValidProductIdOrdersDB(lightingId, "2")) {
                                        System.out.println("Invalid ID entered or this Product is currently in an order.");
                                        continue;
                                    }

                                    //                                    shopService.removeLighting(getInstance(), lightingId);
                                    //                                    shopService.removeProduct(getInstance(), lightingId);
                                    productRepository.getInstance().deleteProductByIdDB(lightingId);
                                    lightingRepository.getInstance().deleteLightingByIdDB(lightingId);
                                    Audit.logAction("DeleteLighting");
                                    break;
                                case "3":
                                    //shopService.printSmartHomesDetails(getInstance());
                                    smarthomeRepository.getInstance().printAllSmartHomeDB();
                                    System.out.print("Enter the ID of the SmartHome you want to remove: ");
                                    long smarthomeId = scanner.nextLong();
                                    scanner.nextLine();

                                    //                                    if (!shopService.isValidProductId(getInstance(), smarthomeId, "3")) {
                                    //                                        System.out.println("Invalid ID entered. Please try again.");
                                    //                                        continue;
                                    //                                    }
                                    if (!productRepository.getInstance().isValidProductIdOrdersDB(smarthomeId, "3")) {
                                        System.out.println("Invalid ID entered or this Product is currently in an order.");
                                        continue;
                                    }

                                    //                                    shopService.removeSmartHome(getInstance(), smarthomeId);
                                    //                                    shopService.removeProduct(getInstance(), smarthomeId);

                                    smarthomeRepository.getInstance().deleteSmarthomeByIdDB(smarthomeId);
                                    productRepository.getInstance().deleteProductByIdDB(smarthomeId);
                                    Audit.logAction("DeleteSmartHome");
                                    break;
                                default:
                                    continue;
                            }
                            break;
                        }
                    }
                    if (input.equals("4")) { // show products by price range
                        int min = 0;
                        boolean validMin = false;
                        while (!validMin) {
                            try {
                                System.out.println("Minumum:");
                                min = Integer.parseInt(scanner.nextLine());
                                validMin = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a valid integer for the min value.");
                            }
                        }


                        int max = 0;
                        boolean validMax = false;
                        while (!validMax) {
                            try {
                                System.out.println("Maximum:");
                                max = Integer.parseInt(scanner.nextLine());
                                validMax = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a valid integer max value.");
                            }
                        }


                        //shopService.printProductsDetailsByRange(getInstance(), min, max);
                        productRepository.getInstance().printProductsDetailsByRangeDB(min, max);
                        Audit.logAction("ShowByPriceRange");

                    }

                    if (input.equals("5")) {
                        //shopService.printProductsDetailsSorted(getInstance());
                        productRepository.getInstance().printProductsDetailsSortedDB();
                        Audit.logAction("ShowProductsSorted");
                    }
                    if (input.equals("6")) {
                        System.out.println("What type of Product do you want to edit? ");
                        System.out.println("1. Furniture ");
                        System.out.println("2. Lighting");
                        System.out.println("3. SmartHome ");
                        String product_type = scanner.nextLine();
                        while (!product_type.equals("1") && !product_type.equals("2") && !product_type.equals("3")) {
                            System.out.println("Invalid input. Please enter a valid option: ");
                            product_type = scanner.nextLine();
                        }
                        while (true) {
                            switch (product_type) {
                                case "1":
                                    //shopService.printFurnituresDetails(getInstance());
                                    furnitureRepository.getInstance().printAllFurnitureDB();
                                    System.out.print("Enter the ID of the furniture you want to Edit : ");
                                    long furnitureId = scanner.nextLong();
                                    scanner.nextLine();



                                    //                                    if (!shopService.isValidProductId(getInstance(), furnitureId, "1")) {
                                    //                                        System.out.println("Invalid ID entered. Please try again.");
                                    //                                        continue;
                                    //                                    }
                                    if (!productRepository.getInstance().isValidProductIdOrdersDB(furnitureId, "1")) {
                                        System.out.println("Invalid ID entered or this Product is currently in an order.");
                                        continue;
                                    }

                                    // New Values
                                    System.out.println("Name:");
                                    String name = scanner.nextLine();
                                    int price = 0;
                                    boolean validPrice = false;
                                    while (!validPrice) {
                                        try {
                                            System.out.println("Price:");
                                            price = Integer.parseInt(scanner.nextLine());
                                            validPrice = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the price.");
                                        }
                                    }
                                    int stock = 0;
                                    boolean validStock = false;
                                    while (!validStock) {
                                        try {
                                            System.out.println("Stock:");
                                            stock = Integer.parseInt(scanner.nextLine());
                                            validStock = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the stock.");
                                        }
                                    }

                                    System.out.println("Material:");
                                    String material = scanner.nextLine();
                                    double height = 0.0;
                                    boolean validHeight = false;
                                    while (!validHeight) {
                                        try {
                                            System.out.println("height:");
                                            height = Double.parseDouble(scanner.nextLine());
                                            validHeight = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid double for the height.");
                                        }
                                    }

                                    double width = 0.0;
                                    boolean validWidth = false;
                                    while (!validWidth) {
                                        try {
                                            System.out.println("Width:");
                                            width = Double.parseDouble(scanner.nextLine());
                                            validWidth = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid double for the width.");
                                        }
                                    }

                                    Furniture added_furniture = productService.buildFurniture(name, price, stock, material, height, width);
                                    productRepository.getInstance().updateProductByIdDB(furnitureId, added_furniture);
                                    furnitureRepository.getInstance().updateFurnitureByIdDB(furnitureId, added_furniture);
                                    Audit.logAction("EditFurniture");
                                    break;
                                case "2":
                                    //shopService.printLightingsDetails(getInstance());
                                    lightingRepository.getInstance().printAllLightingDB();
                                    System.out.print("Enter the ID of the Lighting you want to Edit: ");
                                    long lightingId = scanner.nextLong();
                                    scanner.nextLine();

                                    if (!productRepository.getInstance().isValidProductIdOrdersDB(lightingId, "2")) {
                                        System.out.println("Invalid ID entered or this Product is currently in an order.");
                                        continue;
                                    }

                                    System.out.println("Name:");
                                    name = scanner.nextLine();
                                    price = 0;
                                    validPrice = false;
                                    while (!validPrice) {
                                        try {
                                            System.out.println("Price:");
                                            price = Integer.parseInt(scanner.nextLine());
                                            validPrice = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the price.");
                                        }
                                    }
                                    stock = 0;
                                    validStock = false;
                                    while (!validStock) {
                                        try {
                                            System.out.println("Stock:");
                                            stock = Integer.parseInt(scanner.nextLine());
                                            validStock = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the stock.");
                                        }
                                    }

                                    int power = 0;
                                    boolean validPower = false;
                                    while (!validPower) {
                                        try {
                                            System.out.println("power:");
                                            power = Integer.parseInt(scanner.nextLine());
                                            validPower = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the power.");
                                        }
                                    }

                                    System.out.println("type:");
                                    String type = scanner.nextLine();
                                    Lighting added_lighting = productService.buildLighting(name, price, stock, power, type);
                                    productRepository.getInstance().updateProductByIdDB(lightingId, added_lighting);
                                    lightingRepository.getInstance().updateLightingByIdDB(lightingId, added_lighting);

                                    Audit.logAction("EditLighting");
                                    break;
                                case "3":
                                    //shopService.printSmartHomesDetails(getInstance());
                                    smarthomeRepository.getInstance().printAllSmartHomeDB();
                                    System.out.print("Enter the ID of the SmartHome you want to Edit: ");
                                    long smarthomeId = scanner.nextLong();
                                    scanner.nextLine();

                                    //                                    if (!shopService.isValidProductId(getInstance(), smarthomeId, "3")) {
                                    //                                        System.out.println("Invalid ID entered. Please try again.");
                                    //                                        continue;
                                    //                                    }
                                    if (!productRepository.getInstance().isValidProductIdOrdersDB(smarthomeId, "3")) {
                                        System.out.println("Invalid ID entered or this Product is currently in an order.");
                                        continue;
                                    }

                                    System.out.println("Name:");
                                    name = scanner.nextLine();
                                    price = 0;
                                    validPrice = false;
                                    while (!validPrice) {
                                        try {
                                            System.out.println("Price:");
                                            price = Integer.parseInt(scanner.nextLine());
                                            validPrice = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the price.");
                                        }
                                    }
                                    stock = 0;
                                    validStock = false;
                                    while (!validStock) {
                                        try {
                                            System.out.println("Stock:");
                                            stock = Integer.parseInt(scanner.nextLine());
                                            validStock = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the stock.");
                                        }
                                    }
                                    System.out.println("Category:");
                                    scanner.nextLine();
                                    String category = scanner.nextLine();
                                    System.out.println("appname : ");
                                    String appname = scanner.nextLine();

                                    SmartHome added_smarthome = productService.buildSmartHome(name, price, stock, category, appname);
                                    productRepository.getInstance().updateProductByIdDB(smarthomeId, added_smarthome);
                                    smarthomeRepository.getInstance().updateSmartHomeByIdDB(smarthomeId, added_smarthome);
                                    Audit.logAction("EditSmartHome");
                                    break;
                                default:
                                    continue;
                            }
                            break;
                        }

                    }
                } while (!input.equals("7"));

            } else if (menutype.equals("2")) {

                do {
                    System.out.println("Ikea Menu");
                    System.out.println("1. Add a new Action" + "                                                " + "Total number of Actions " + actionRepository.getInstance().getNumberOfActionsDB());
                    System.out.println("2. Get all the actions available " + "                                  " + "Number of Deliveries : " + deliveryRepository.getInstance().getNumberOfDeliveryDB());
                    System.out.println("3. Delete an existing action " + "                                      " + "Number of Measurings : " + measuringRepository.getInstance().getNumberOfMeasuringDB());
                    System.out.println("4. Edit an Action ");
                    System.out.println("5. Go back to main menu " + "                                           " + "Number of Assemblies : " + assemblyRepository.getInstance().getNumberOfAssemblyDB());
                    input2 = scanner.nextLine();

                    while (!input2.equals("1") && !input2.equals("2") && !input2.equals("3") && !input2.equals("4") && !input2.equals("5")) {
                        System.out.println("Invalid input. Please enter a valid option: ");
                        input2 = scanner.nextLine();
                    }

                    if (input2.equals("1")) {
                        System.out.println("Please specify the details for creating a new action: What category do you want it to be?");
                        System.out.println("1. Delivery");
                        System.out.println("2. Measuring");
                        System.out.println("3. Assembly");
                        String actionType = scanner.nextLine();

                        while (!actionType.equals("1") && !actionType.equals("2") && !actionType.equals("3")) {
                            System.out.println("Invalid input. Please enter a valid option: ");
                            actionType = scanner.nextLine();
                        }
                        switch (actionType) {
                            case "1":
                                System.out.println("Name:");
                                String name = scanner.nextLine();
                                int price = 0;
                                boolean validPrice = false;
                                while (!validPrice) {
                                    try {
                                        System.out.println("Price:");
                                        price = Integer.parseInt(scanner.nextLine());
                                        validPrice = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the price.");
                                    }
                                }

                                System.out.println("Vehicle Brand");
                                String vehicle_brand = scanner.nextLine();
                                System.out.println("Vehicle Type:");
                                String vehicle_type = scanner.nextLine();


                                Delivery added_delivery = actionService.buildDelivery(name, price, vehicle_brand, vehicle_type);
                                shopService.addDelivery(getInstance(), added_delivery);
                                shopService.addAction(getInstance(), added_delivery);
                                deliveryRepository.getInstance().addDeliveryDB(added_delivery);
                                actionRepository.getInstance().addActionDB(added_delivery);
                                Audit.logAction("AddDelivery");
                                break;
                            case "2":
                                System.out.println("Name:");
                                name = scanner.nextLine();
                                price = 0;
                                validPrice = false;
                                while (!validPrice) {
                                    try {
                                        System.out.println("Price:");
                                        price = Integer.parseInt(scanner.nextLine());
                                        validPrice = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the price.");
                                    }
                                }

                                System.out.println("Category:");
                                String category = scanner.nextLine();

                                Measuring added_measuring = actionService.buildMeasuring(name, price, category);
                                shopService.addAction(getInstance(), added_measuring);
                                actionRepository.getInstance().addActionDB(added_measuring);
                                measuringRepository.getInstance().addMeasuringDB(added_measuring);
                                shopService.addMeasuring(getInstance(), added_measuring);
                                Audit.logAction("AddMeasuring");
                                break;

                            case "3":
                                System.out.println("Name:");
                                name = scanner.nextLine();
                                price = 0;
                                validPrice = false;
                                while (!validPrice) {
                                    try {
                                        System.out.println("Price:");
                                        price = Integer.parseInt(scanner.nextLine());
                                        validPrice = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the price.");
                                    }
                                }
                                int nr_of_prod = 0;
                                boolean validNr_of_prod = false;
                                while (!validNr_of_prod) {
                                    try {
                                        System.out.println("Number of Products:");
                                        nr_of_prod = Integer.parseInt(scanner.nextLine());
                                        validNr_of_prod = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the number of products.");
                                    }
                                }
                                int nr_of_emp = 0;
                                boolean validNr_of_emp = false;
                                while (!validNr_of_emp) {
                                    try {
                                        System.out.println("Number of Employees:");
                                        nr_of_emp = Integer.parseInt(scanner.nextLine());
                                        validNr_of_emp = true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid input. Please enter a valid integer for the number of products.");
                                    }
                                }

                                Assembly added_assembly = actionService.buildAssembly(name, price, nr_of_prod, nr_of_emp);
                                shopService.addAction(getInstance(), added_assembly);
                                shopService.addAssembly(getInstance(), added_assembly);
                                actionRepository.getInstance().addActionDB(added_assembly);
                                assemblyRepository.getInstance().addAssemblyDB(added_assembly);
                                Audit.logAction("AddAssembly");
                                break;
                        }
                    } else if (input2.equals("2")) {
                        System.out.println("What Actions do you exactly want to see?");
                        System.out.println("1. All Actions");
                        System.out.println("2. Only Delivery Actions");
                        System.out.println("3. Only Measuring Actions");
                        System.out.println("4. Only Assembly Actions");
                        String input_afis = scanner.nextLine();
                        switch (input_afis) {
                            case "1":
                                //shopService.printActionsDetails(getInstance());
                                actionRepository.getInstance().printAllActionsDB();
                                Audit.logAction("ShowActions");
                                break;
                            case "2":
                                //shopService.printDeliveryDetails(getInstance());
                                deliveryRepository.getInstance().printAllDeliveriesDB();
                                Audit.logAction("ShowDeliveries");
                                break;
                            case "3":
                                //shopService.printMeasuringDetails(getInstance());
                                measuringRepository.getInstance().printAllMeasuringDB();

                                Audit.logAction("ShowMeasurings");
                                break;
                            case "4":
                                //shopService.printAssemblyDetails(getInstance());
                                assemblyRepository.getInstance().printAllAssembliesDB();
                                Audit.logAction("ShowAssemblies");
                                break;
                        }

                    } else if (input2.equals("3")) {

                        System.out.println("What type of action do you want to remove? ");
                        System.out.println("1. Delivery ");
                        System.out.println("2. Measuring");
                        System.out.println("3. Assembly ");
                        String action_type = scanner.nextLine();
                        while (!action_type.equals("1") && !action_type.equals("2") && !action_type.equals("3")) {
                            System.out.println("Invalid input. Please enter a valid option: ");
                            action_type = scanner.nextLine();
                        }
                        while (true) {
                            switch (action_type) {
                                case "1":
                                    //shopService.printDeliveryDetails(getInstance());
                                    deliveryRepository.getInstance().printAllDeliveriesDB();
                                    System.out.print("Enter the ID of the delivery you want to remove: ");
                                    long deliveryId = scanner.nextLong();
                                    //                                    if (!shopService.isValidActionId(getInstance(), deliveryId, "1")) {
                                    //                                        System.out.println("Invalid ID entered. Please try again.");
                                    //                                        continue;
                                    //                                    }
                                    if (!actionRepository.getInstance().isValidActionIdOrdersDB(deliveryId, "1")) {
                                        System.out.println("Invalid ID entered or this Action is currently in an order.");
                                        continue;
                                    }
                                    scanner.nextLine();



                                    Audit.logAction("DeleteDelivery");
                                    break;
                                case "2":
                                    //shopService.printMeasuringDetails(getInstance());
                                    measuringRepository.getInstance().printAllMeasuringDB();
                                    System.out.print("Enter the ID of the measuring you want to remove: ");
                                    long measuringId = scanner.nextLong();
                                    if (!actionRepository.getInstance().isValidActionIdOrdersDB(measuringId, "2")) {
                                        System.out.println("Invalid ID entered or this Action is currently in an order.");
                                        continue;
                                    }
                                    scanner.nextLine();
                                    //                                    shopService.removeMeasuring(getInstance(), measuringId);
                                    //                                    shopService.removeAction(getInstance(), measuringId);
                                    measuringRepository.getInstance().deleteMeasuringByIdDB(measuringId);
                                    actionRepository.getInstance().deleteActionByIdDB(measuringId);
                                    Audit.logAction("DeleteMeasuring");
                                    break;
                                case "3":
                                    //                                    shopService.printAssemblyDetails(getInstance());
                                    assemblyRepository.getInstance().printAllAssembliesDB();
                                    System.out.print("Enter the ID of the assembly you want to remove: ");
                                    long assemblyId = scanner.nextLong();

                                    if (!actionRepository.getInstance().isValidActionIdOrdersDB(assemblyId, "3")) {
                                        System.out.println("Invalid ID entered or this Action is currently in an order.");
                                        continue;
                                    }
                                    scanner.nextLine();
                                    //                                    shopService.removeAssembly(getInstance(), assemblyId);
                                    //                                    shopService.removeAction(getInstance(), assemblyId);
                                    assemblyRepository.getInstance().deleteAssemblyByIdDB(assemblyId);
                                    actionRepository.getInstance().deleteActionByIdDB(assemblyId);
                                    Audit.logAction("DeleteAssembly");
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }
                    } else if (input2.equals("4")) {
                        System.out.println("What type of action do you want to Edit? ");
                        System.out.println("1. Delivery ");
                        System.out.println("2. Measuring");
                        System.out.println("3. Assembly ");
                        String action_type = scanner.nextLine();
                        while (!action_type.equals("1") && !action_type.equals("2") && !action_type.equals("3")) {
                            System.out.println("Invalid input. Please enter a valid option: ");
                            action_type = scanner.nextLine();
                        }
                        while (true) {
                            switch (action_type) {
                                case "1":
                                    //shopService.printDeliveryDetails(getInstance());
                                    deliveryRepository.getInstance().printAllDeliveriesDB();
                                    System.out.print("Enter the ID of the delivery you want to Edit: ");
                                    long deliveryId = scanner.nextLong();
                                    //                                    if (!shopService.isValidActionId(getInstance(), deliveryId, "1")) {
                                    //                                        System.out.println("Invalid ID entered. Please try again.");
                                    //                                        continue;
                                    //                                    }
                                    if (!actionRepository.getInstance().isValidActionIdOrdersDB(deliveryId, "1")) {
                                        System.out.println("Invalid ID entered or this Action is currently in an order.");
                                        continue;
                                    }
                                    scanner.nextLine();

                                    System.out.println("Name:");
                                    String name = scanner.nextLine();
                                    int price = 0;
                                    boolean validPrice = false;
                                    while (!validPrice) {
                                        try {
                                            System.out.println("Price:");
                                            price = Integer.parseInt(scanner.nextLine());
                                            validPrice = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the price.");
                                        }
                                    }

                                    System.out.println("Vehicle Brand");
                                    String vehicle_brand = scanner.nextLine();
                                    System.out.println("Vehicle Type:");
                                    String vehicle_type = scanner.nextLine();


                                    Delivery added_delivery = actionService.buildDelivery(name, price, vehicle_brand, vehicle_type);
                                    actionRepository.getInstance().updateActionByIdDB(deliveryId, added_delivery);
                                    deliveryRepository.getInstance().updateDeliveryByIdDB(deliveryId, added_delivery);
                                    Audit.logAction("EditDelivery");
                                    break;
                                case "2":
                                    //shopService.printMeasuringDetails(getInstance());
                                    measuringRepository.getInstance().printAllMeasuringDB();
                                    System.out.print("Enter the ID of the measuring you want to remove: ");
                                    long measuringId = scanner.nextLong();
                                    if (!actionRepository.getInstance().isValidActionIdOrdersDB(measuringId, "2")) {
                                        System.out.println("Invalid ID entered or this Action is currently in an order.");
                                        continue;
                                    }
                                    scanner.nextLine();
                                    System.out.println("Name:");
                                    name = scanner.nextLine();
                                    price = 0;
                                    validPrice = false;
                                    while (!validPrice) {
                                        try {
                                            System.out.println("Price:");
                                            price = Integer.parseInt(scanner.nextLine());
                                            validPrice = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the price.");
                                        }
                                    }

                                    System.out.println("Category:");
                                    String category = scanner.nextLine();

                                    Measuring added_measuring = actionService.buildMeasuring(name, price, category);
                                    actionRepository.getInstance().updateActionByIdDB(measuringId, added_measuring);
                                    measuringRepository.getInstance().updateMeasuringByIdDB(measuringId, added_measuring);
                                    Audit.logAction("EditMeasuring");
                                    break;
                                case "3":
                                    //                                    shopService.printAssemblyDetails(getInstance());
                                    assemblyRepository.getInstance().printAllAssembliesDB();
                                    System.out.print("Enter the ID of the assembly you want to remove: ");
                                    long assemblyId = scanner.nextLong();

                                    if (!actionRepository.getInstance().isValidActionIdOrdersDB(assemblyId, "3")) {
                                        System.out.println("Invalid ID entered or this Action is currently in an order.");
                                        continue;
                                    }
                                    scanner.nextLine();
                                    System.out.println("Name:");
                                    name = scanner.nextLine();
                                    price = 0;
                                    validPrice = false;
                                    while (!validPrice) {
                                        try {
                                            System.out.println("Price:");
                                            price = Integer.parseInt(scanner.nextLine());
                                            validPrice = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the price.");
                                        }
                                    }
                                    int nr_of_prod = 0;
                                    boolean validNr_of_prod = false;
                                    while (!validNr_of_prod) {
                                        try {
                                            System.out.println("Number of Products:");
                                            nr_of_prod = Integer.parseInt(scanner.nextLine());
                                            validNr_of_prod = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the number of products.");
                                        }
                                    }
                                    int nr_of_emp = 0;
                                    boolean validNr_of_emp = false;
                                    while (!validNr_of_emp) {
                                        try {
                                            System.out.println("Number of Employees:");
                                            nr_of_emp = Integer.parseInt(scanner.nextLine());
                                            validNr_of_emp = true;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a valid integer for the number of products.");
                                        }
                                    }

                                    Assembly added_assembly = actionService.buildAssembly(name, price, nr_of_prod, nr_of_emp);
                                    actionRepository.getInstance().updateActionByIdDB(assemblyId, added_assembly);
                                    assemblyRepository.getInstance().updateAssemblyByIdDB(assemblyId, added_assembly);
                                    Audit.logAction("EditAssembly");
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }

                    }

                } while (!input2.equals("5"));
            }
        } while (!menutype.equals("3"));

    }
    public void menu_orders() throws IOException {
        String input_orders;
        do {
            System.out.println("Ikea Menu");
            System.out.println("1. Add a new Order " + "                                                " + "Total number of Orders " + ordersRepository.getInstance().getNumberOfOrdersDB());
            System.out.println("2. See all orders ");
            System.out.println("3. Delete an order ");
            System.out.println("4. Go back to main menu ");
            input_orders = (scanner.nextLine());

            if (input_orders.equals("1")) {

                boolean validProductId = false;
                int product_id = 0;

                while (!validProductId) {
                    System.out.println("Please select what type of product you want: ");

                    System.out.println("1. Furniture ");
                    System.out.println("2. Lighting ");
                    System.out.println("3. Smarthome ");
                    String input_product_type;
                    input_product_type = (scanner.nextLine());

                    if (input_product_type.equals("1")) {
                        while (!validProductId) {
                            furnitureRepository.getInstance().printAllFurnitureDB();
                            System.out.println("The id of the furniture");
                            String product_id_input = scanner.nextLine();

                            try {
                                product_id = Integer.parseInt(product_id_input);
                                if (!productRepository.getInstance().isValidProductIdDB(product_id, "1")) {
                                    System.out.println("Invalid ID entered. Please try again.");
                                } else {
                                    validProductId = true;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid ID format. Please enter a valid integer ID.");
                            }
                        }
                    } else if (input_product_type.equals("2")) {
                        while (!validProductId) {
                            lightingRepository.getInstance().printAllLightingDB();
                            System.out.println("The id of the lighting");
                            String product_id_input = scanner.nextLine();
                            try {
                                product_id = Integer.parseInt(product_id_input);
                                if (!productRepository.getInstance().isValidProductIdDB(product_id, "2")) {
                                    System.out.println("Invalid ID entered. Please try again.");
                                    System.out.println(product_id);
                                } else {
                                    validProductId = true;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid ID format. Please enter a valid integer ID.");
                            }
                        }
                    } else if (input_product_type.equals("3")) {
                        while (!validProductId) {
                            smarthomeRepository.getInstance().printAllSmartHomeDB();
                            System.out.println("The id of the SmartHome");
                            String product_id_input = scanner.nextLine();

                            try {
                                product_id = Integer.parseInt(product_id_input);
                                if (!productRepository.getInstance().isValidProductIdDB(product_id, "3")) {
                                    System.out.println("Invalid ID entered. Please try again.");
                                } else {
                                    validProductId = true;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid ID format. Please enter a valid integer ID.");
                            }
                        }
                    }
                }

                boolean validActionId = false;
                int action_id = 0;

                while (!validActionId) {
                    System.out.println("Please select what type of action you want: ");

                    System.out.println("1. Delivery ");
                    System.out.println("2. Measuring ");
                    System.out.println("3. Assembly ");
                    String input_action_type;
                    input_action_type = (scanner.nextLine());

                    if (input_action_type.equals("1")) {
                        while (!validActionId) {
                            deliveryRepository.getInstance().printAllDeliveriesDB();
                            System.out.println("The id of the delivery service ");
                            String action_id_input = scanner.nextLine();

                            try {
                                action_id = Integer.parseInt(action_id_input);
                                if (!actionRepository.getInstance().isValidActionIdDB(action_id, "1")) {
                                    System.out.println("Invalid ID entered. Please try again.");
                                } else {
                                    validActionId = true;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid ID format. Please enter a valid integer ID.");
                            }
                        }
                    } else if (input_action_type.equals("2")) {
                        while (!validActionId) {
                            measuringRepository.getInstance().printAllMeasuringDB();
                            System.out.println("The id of the measuring service ");
                            String action_id_input = scanner.nextLine();

                            try {
                                action_id = Integer.parseInt(action_id_input);
                                if (!actionRepository.getInstance().isValidActionIdDB(action_id, "2")) {
                                    System.out.println("Invalid ID entered. Please try again.");
                                } else {
                                    validActionId = true;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid ID format. Please enter a valid integer ID.");
                            }
                        }
                    } else if (input_action_type.equals("3")) {
                        while (!validActionId) {
                            assemblyRepository.getInstance().printAllAssembliesDB();
                            System.out.println("The id of the assembly service ");
                            String action_id_input = scanner.nextLine();

                            try {
                                action_id = Integer.parseInt(action_id_input);
                                if (!actionRepository.getInstance().isValidActionIdDB(action_id, "3")) {
                                    System.out.println("Invalid ID entered. Please try again.");
                                } else {
                                    validActionId = true;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid ID format. Please enter a valid integer ID.");
                            }
                        }
                    }

                    Order added_order = orderService.buildOrder(actionRepository.getInstance().getActionById(action_id), productRepository.getInstance().getProductById(product_id));
                    ordersRepository.getInstance().addordersDB(added_order);
                    Audit.logAction("AddOrder");
                }
            } else if (input_orders.equals("2")) {
                ordersRepository.getInstance().printAllOrdersDB();
                Audit.logAction("ShowOrders");
            } else if (input_orders.equals("3")) {
                ordersRepository.getInstance().printAllOrdersDB();

                while (true) {
                    System.out.print("Enter the ID of the order you want to remove: ");
                    long orderId = scanner.nextLong();
                    scanner.nextLine();
                    if (!ordersRepository.getInstance().isValidOrderIdDB(orderId)) {
                        System.out.println("Invalid ID entered. Please try again.");
                        continue;
                    }
                    ordersRepository.getInstance().deleteOrderByIdDB(orderId);
                    Audit.logAction("DeleteOrder");
                    break;
                }
            }
        } while (!input_orders.equals("4"));
    }

}

// Nu stiu sigur daca facem si shop