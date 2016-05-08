public class Main {

    public static void main(String[] args) {
        //Examples:
        GUI coffeeMachine = new GUI();
        CoffeeConfiguration order = coffeeMachine.createCoffeeConfiguration(CoffeeType.DarkRoast);
        coffeeMachine.addIngreedient(1, order);
        coffeeMachine.addIngreedient(3, order);
        coffeeMachine.addIngreedient(6, order);
        coffeeMachine.finishOrder(order);
    }
    /*
    * Coffee types:
    * Espresso
    * DarkRoast
    * HouseBlend
    * DeCafe
    * */
    /*
    * Ingredients:
    * 1. Milk
    * 2. Double Milk
    * 3. Sugar
    * 4. Bronze Sugar
    * 5. Vanilla
    * 6. Carmel
    * */
}
