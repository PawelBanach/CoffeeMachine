import java.math.BigDecimal;

/**
 * Created by Paul Banach on 2016-05-08.
 */
public class CoffeeConfiguration {
    private CoffeeType coffee;
    private String description;
    private BigDecimal price = new BigDecimal(0);
    StringBuilder stringBuilder = new StringBuilder();

    public void addIngredient(int id, IngredientProvider provider){
        Ingredient ingredient = provider.getIngredient(id);
        this.price = this.price.add(ingredient.getPrice()); //because are immutable => this.price = this.price.add()
        stringBuilder.append("Ingredient: " + ingredient.getName() + " \n");
        stringBuilder.append("Description: " + ingredient.getDescription() + " \n");
    }
    public void display(){
        stringBuilder.append("\n\n=====> Total Price: " + price.toString());
        description = stringBuilder.toString();
        System.out.println(description);
    }
    public CoffeeConfiguration(CoffeeType coffee){

        this.coffee = coffee;
        this.price = this.price.add(coffee.price);
        stringBuilder.append("Coffee: " + coffee.toString() + " \n");
    }
    //nowa funkcja

}
