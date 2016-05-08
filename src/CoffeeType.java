import java.math.BigDecimal;

/**
 * Created by Paul Banach on 2016-05-08.
 */
public enum CoffeeType {
    Espressso(new BigDecimal(5)),
    DarkRoast(new BigDecimal(6)),
    HouseBlend(new BigDecimal(5)),
    DeCafe(new BigDecimal(4));
    BigDecimal price;

    //toString(); zdefiniowana domyślnie
    CoffeeType(BigDecimal p) {
        price = p;
    }
}
