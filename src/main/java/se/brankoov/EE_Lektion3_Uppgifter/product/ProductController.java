package se.brankoov.EE_Lektion3_Uppgifter.product;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;
    public ProductController(ProductService service) { this.service = service; }

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("products-api is alive");
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody @Valid Product product) {
        Product create = service.createProduct(product);
        return ResponseEntity.status(201).body(create);
    }
    @GetMapping("/getname")
    public ResponseEntity<Product>getName(@RequestParam String name) {
        Product product = service.findByName(name);
        return ResponseEntity.status(200).body(product);
    }

}
