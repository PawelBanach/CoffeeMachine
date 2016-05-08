/**
 * Created by Paul Banach on 2016-05-08.
 */
public class GUI {
    CoffeeConfiguration configuration;
    IngredientProvider provider = new IngredientProvider();
    public CoffeeConfiguration createCoffeeConfiguration(CoffeeType coffee){
        configuration = new CoffeeConfiguration(coffee);
        return configuration;
    }
    public void addIngreedient(int idIngredient, CoffeeConfiguration coffee){
        configuration.addIngredient(idIngredient, provider);
    }
    public void finishOrder(CoffeeConfiguration coffee){ //earlier displayConfiguration
        configuration.display();

    }
}
