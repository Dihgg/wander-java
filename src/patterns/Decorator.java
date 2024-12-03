package patterns;
// Decorator Pattern
// Purpose: Dynamically adds behavior to an object.

interface Coffee {
    String getDescription();
    double cost();
}

class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple patterns.Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}

/* class CoffeeWithMilk extends patterns.SimpleCoffe {
    @Override
    public String getDescription() {
        return "Simple patterns.Coffee with milk";
    }

    @Override
    public double cost() {
        return 3.0;
    }

} */

class MilkDecorator implements Coffee {

    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}

class SugarDecorator implements Coffee {
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + " with Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.1;
    }

}

public class Decorator {
    public static void main(String[] args) {
        System.out.println("patterns.Decorator Pattern");
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " = $" + coffee.cost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " = $" + coffee.cost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " = $" + coffee.cost());
    }
}
