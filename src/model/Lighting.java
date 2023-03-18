package model;

public abstract class Lighting extends Product {

    private int power;
    private String type;

    public Lighting(long id, int price, int stock, String name, int power, String type) {
        super(id, price, stock, name);
        this.power = power;
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
