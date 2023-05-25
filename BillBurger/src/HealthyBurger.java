public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("CHEESE", meat, price, "BREAD");
    }

    public void addHealthyAddition1(String name,double price){
     this.addition1Name = name;
     this.addition1Price = price;
    }

    public void addHealthyAddition2(String name,double price){
        this.addition2Name = name;

        this.addition2Price = price;

    }

    @Override
    public String  itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
