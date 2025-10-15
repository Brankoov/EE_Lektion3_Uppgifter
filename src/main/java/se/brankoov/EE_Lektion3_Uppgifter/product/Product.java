package se.brankoov.EE_Lektion3_Uppgifter.product;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class Product {
    private Long id;
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, message = "Name must be at least 2 characters")
    private String name;

    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.01", inclusive = true, message = "Price must be at least 0.01")
    private BigDecimal price;

    public Product() {}
    public Product(Long id, String name, BigDecimal price) {
        this.id = id; this.name = name; this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
}
