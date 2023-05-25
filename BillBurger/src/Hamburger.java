


public class Hamburger {

    protected String meat;
    protected double price;
    protected String addition1Name;
    protected double addition1Price;
    protected String addition2Name;
    protected double addition2Price;
    private String name;
    private String breadRollType;
    private String addition3Name;

    private double addition3Price;

    private String addition4Name;

    private double addition4Price;

    public Hamburger(String name, String meat, double price,
                     String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

    }

    public String getName() {

        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public void setAddition1Name(String addition1Name) {
        this.addition1Name = addition1Name;
    }

    public void setAddition2Name(double addition2Price) {
        this.addition2Name = addition2Name;
    }

    public void setAddition3Name(String addition3Name) {
        this.addition3Name = addition3Name;
    }

    public void setAddition4Name(String addition4Name) {
        this.addition4Name = addition4Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public void setAddition3Price(double addition3Price) {
        this.addition3Price = addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setAddition4Price(double addition4Price) {
        this.addition4Price = addition4Price;
    }

    public void addHamburgerAddition1(String name, double price) {

        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {

        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {

        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {

        this.addition4Name = name;
        this.addition4Price = price;
    }

    public String itemizeHamburger() {
        double totalPrice = price;
        StringBuilder sb = new StringBuilder(name + " hamburger on a " + breadRollType + " roll, price is " + String.format("%.2f", price));
        if (addition1Name != null) {
            totalPrice += addition1Price;
            sb.append(" + ").append(addition1Name).append(" for ").append(String.format("%.2f", addition1Price));
        }
        if (addition2Name != null) {
            totalPrice += addition2Price;
            sb.append(" + ").append(addition2Name).append(" for ").append(String.format("%.2f", addition2Price));
        }
        if (addition3Name != null) {
            totalPrice += addition3Price;
            sb.append(" + ").append(addition3Name).append(" for ").append(String.format("%.2f", addition3Price));
        }
        if (addition4Name != null) {
            totalPrice += addition4Price;
            sb.append(" + ").append(addition4Name).append(" for ").append(String.format("%.2f", addition4Price));
        }
        sb.append(". Total price is ").append(String.format("%.2f", totalPrice));
        return sb.toString();
    }

}





