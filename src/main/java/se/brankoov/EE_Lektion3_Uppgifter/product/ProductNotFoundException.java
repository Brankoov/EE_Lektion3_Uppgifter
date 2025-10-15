package se.brankoov.EE_Lektion3_Uppgifter.product;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String name) {
        super("Product with name '%s' not found".formatted(name));
    }
}
