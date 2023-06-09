package repository;

import config.DatabaseConnection;
import model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class productRepository {
    private static productRepository single_instance = null;

    public productRepository() {
    }

    public static synchronized productRepository getInstance() {
        if (single_instance == null) {
            single_instance = new productRepository();
        }
        return single_instance;
    }
    public void addProductDB(Product product) {
        String sql = "INSERT INTO product (id, name, price, stock) " +
                "VALUES (?, ?, ?, ?)";
        try {
            Connection connection = DatabaseConnection.getInstance();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, product.getId());
            statement.setString(2, product.getName());
            statement.setDouble(3, product.getPrice());
            statement.setInt(4, product.getStock());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteAllProdcutsDB() {
        String sql = "DELETE FROM product";

        try {
            Connection connection = DatabaseConnection.getInstance();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteProductByIdDB(long id) {
        String sql = "DELETE FROM product WHERE id = ?";

        try {
            Connection connection = DatabaseConnection.getInstance();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean isValidProductIdDB(long id, String productType) {
        String tableName = getTableNameByProductType(productType);
        if (tableName == null) {
            return false;
        }

        String sql = "SELECT COUNT(*) FROM " + tableName + " WHERE id = ?";

        try {
            Connection connection = DatabaseConnection.getInstance();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public Product getProductById(long id) {


        String sql = "SELECT * FROM product WHERE id = ?";

        try {
            Connection connection = DatabaseConnection.getInstance();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                long productId = resultSet.getLong("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int stock = resultSet.getInt("stock");


                Product product = new Product(productId, name, price, stock);

                return product;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean isValidProductIdOrdersDB(long id, String productType) {
        String tableName = getTableNameByProductType(productType);
        if (tableName == null) {
            return false;
        }

        String sql = "SELECT COUNT(*) FROM " + tableName + " WHERE id = ?";
        String ordersSql = "SELECT COUNT(*) FROM orders WHERE product_id = ?";

        try {
            Connection connection = DatabaseConnection.getInstance();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count > 0) {

                    PreparedStatement ordersStatement = connection.prepareStatement(ordersSql);
                    ordersStatement.setLong(1, id);
                    ResultSet ordersResultSet = ordersStatement.executeQuery();

                    if (ordersResultSet.next()) {
                        int ordersCount = ordersResultSet.getInt(1);
                        return ordersCount == 0;
                    }

                    ordersResultSet.close();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public int getNumberOfProductsDB() {
        String sql = "SELECT COUNT(*) FROM product";
        int numberOfProducts = 0;

        try {
            Connection connection = DatabaseConnection.getInstance();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                numberOfProducts = resultSet.getInt(1);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return numberOfProducts;
    }

    public void printProductsDetailsByRangeDB(double lower, double higher) {
        String sql = "SELECT * FROM product WHERE price >= " + lower + " AND price <= " + higher;

        try {
            Connection connection = DatabaseConnection.getInstance();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            int i = 0;
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int stock = resultSet.getInt("stock");

                i++;
                System.out.println(i + "-> ID: " + id + ", Name: " + name + ", Price: " + price + ", Stock: " + stock);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printProductsDetailsSortedDB() {
        String sql = "SELECT * FROM product";

        try {
            Connection connection = DatabaseConnection.getInstance();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            List<Product> sortedProducts = new ArrayList<>();

            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int stock = resultSet.getInt("stock");

                Product product = new Product(id, name, price, stock);
                sortedProducts.add(product);
            }

            Collections.sort(sortedProducts);

            int i = 0;
            for (Product p : sortedProducts) {
                i++;
                System.out.println(i + "-> ID: " + p.getId() + ", Name: " + p.getName() +
                        ", Price: " + p.getPrice() + ", Stock: " + p.getStock());
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private String getTableNameByProductType(String productType) {
        switch (productType) {
            case "1":
                return "furniture";
            case "2":
                return "lighting";
            case "3":
                return "smarthome";
            default:
                return null;
        }
    }
    public void printAllProductsDB() {
        String sql = "SELECT * FROM product";

        try {
            Connection connection = DatabaseConnection.getInstance();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int stock = resultSet.getInt("stock");

                System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Stock: " + stock);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateProductByIdDB(long id, Product updatedProduct) {
        String sql = "UPDATE product SET name = ?, price = ?, stock = ? WHERE id = ?";

        try {
            Connection connection = DatabaseConnection.getInstance();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, updatedProduct.getName());
            statement.setDouble(2, updatedProduct.getPrice());
            statement.setInt(3, updatedProduct.getStock());
            statement.setLong(4, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}






