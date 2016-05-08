import java.math.BigDecimal;

/**
 * Created by Paul Banach on 2016-05-08.
 */
public class Ingredient {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;

    public Ingredient(int id, String name, String description, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public BigDecimal getPrice(){
        return price;
    }

    public String getDescription() {
        return description;
    }
}
