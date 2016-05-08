import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Paul Banach on 2016-05-08.
 */
public class IngredientProvider {
    Map<Integer, Ingredient> Ingredients = new HashMap<Integer, Ingredient>();

    public Ingredient getIngredient(int id) {
        return Ingredients.get(id);
    }
    public IngredientProvider(){
        Ingredients.put(1, new Ingredient(1, "Milk", "Warm milk to you delicious coffee\nPrice: 1.5$", new BigDecimal(1.5)));
        Ingredients.put(2, new Ingredient(2, "Double milk", "More milk to your coffee\nPrice: 2.5$", new BigDecimal(2.5)));
        Ingredients.put(3, new Ingredient(3, "Sugar", "Sweet, sweet sugar\nPrice: 2$", new BigDecimal(2)));
        Ingredients.put(4, new Ingredient(4, "Bronze sugar", "Healthy sugar\nPrice: 3$", new BigDecimal(3)));
        Ingredients.put(5, new Ingredient(5, "Vanilla", "Extras to you coffee\nPrice: 3.5$", new BigDecimal(3.5)));
        Ingredients.put(6, new Ingredient(6, "Carmel", "Only for gourmand\nPrice: 4$", new BigDecimal(4)));
    }
}
