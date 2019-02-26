package example.java.design.patterns.principles.structural.decorator.beverage;

public class BeverageMain {

    public static void main(String[] args) {

        Beverage expresso = new Expresso();
        System.out.println(expresso.toString());

        Beverage houseblend = new Sugar(new Milk(new HouseBlend()));
        System.out.println(houseblend.toString());

    }
}
