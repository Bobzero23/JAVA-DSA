package tree.example1;

public class Main {
    public static void main(String[] args) {
        Node drinks = new Node("Drinks");
        Node hot = new Node("hot");
        Node cold = new Node("cold");
        Node tea = new Node("Tea");
        Node coffee = new Node("Coffee");
        Node alcohol = new Node("Alcohol");
        Node nonAlcohol = new Node("Non - Alcohol");

        Node bear = new Node("Bear");
        Node wine = new Node("Wine");

        Node sprite = new Node("Sprite");
        Node coke = new Node("Coke");

        Node greenTea = new Node("Green Tea");
        Node redTea = new Node("Red Tea");

        Node cappuccino = new Node("Cappuccino");
        Node turkishCoffee = new Node("Turkish Coffee");

        drinks.addChild(hot);
        drinks.addChild(cold);

        hot.addChild(tea);
        tea.addChild(greenTea);
        tea.addChild(redTea);

        hot.addChild(coffee);
        coffee.addChild(cappuccino);
        coffee.addChild(turkishCoffee);

        cold.addChild(alcohol);
        alcohol.addChild(wine);
        alcohol.addChild(bear);

        cold.addChild(nonAlcohol);
        nonAlcohol.addChild(coke);
        nonAlcohol.addChild(sprite);

        System.out.println(drinks.printTree(0));

    }
}
