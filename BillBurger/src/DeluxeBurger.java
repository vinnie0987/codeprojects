public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("", "sausage & bacon", 19.10, "bread");
        super.addHamburgerAddition1("chips",0.0);
        super.addHamburgerAddition2("drink",0.0);


    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("no additional items can be added");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("no additional items can be added");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("no addtional items can be added");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("no additional items can be added");
    }
}
