import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static boolean working = true;

    public static void main(String[] args) {

        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("espresso", 250, 0, 16, 4));
        coffeeList.add(new Coffee("latte", 350, 75, 20, 7));
        coffeeList.add(new Coffee("cappuccino", 200, 100, 12, 6));

        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);
        Scanner scanner = new Scanner(System.in);

        while (Main.working == true) {
            doAction(coffeeList, coffeeMachine, scanner);
        }
    }

    public static void doAction (List<Coffee> coffeeList, CoffeeMachine coffeeMachine, Scanner scanner) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String actionType = scanner.next();
        switch (actionType) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                String coffeeType = scanner.next();
                switch (coffeeType) {
                    case "1":
                        coffeeMachine.buy(coffeeList.get(0));
                        break;
                    case "2":
                        coffeeMachine.buy(coffeeList.get(1));
                        break;
                    case "3":
                        coffeeMachine.buy(coffeeList.get(2));
                        break;
                    case "back":
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                int water = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int milk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int coffeeBeans = scanner.nextInt();
                System.out.println("Write how many disposable cups do you want to add:");
                int disposableCups = scanner.nextInt();
                coffeeMachine.fill(water, milk, coffeeBeans, disposableCups);
                break;
            case "take":
                coffeeMachine.take();
                System.out.println();
                break;
            case "remaining":
                System.out.println(coffeeMachine);
                break;
            case "exit":
                Main.working = false;
                break;
        }
    }
}
