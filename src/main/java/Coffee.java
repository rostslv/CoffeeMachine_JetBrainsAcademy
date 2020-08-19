public class Coffee {
    private String grade;
    private int waterNeed;
    private int milkNeed;
    private int coffeeBeansNeed;
    private int cost;

    public Coffee(String grade, int waterNeed, int milkNeed, int coffeeBeansNeed, int cost) {
        this.grade = grade;
        this.waterNeed = waterNeed;
        this.milkNeed = milkNeed;
        this.coffeeBeansNeed = coffeeBeansNeed;
        this.cost = cost;
    }

    public String getGrade() {
        return grade;
    }

    public int getWaterNeed() {
        return waterNeed;
    }

    public int getMilkNeed() {
        return milkNeed;
    }

    public int getCoffeeBeansNeed() {
        return coffeeBeansNeed;
    }

    public int getCost() {
        return cost;
    }
}
