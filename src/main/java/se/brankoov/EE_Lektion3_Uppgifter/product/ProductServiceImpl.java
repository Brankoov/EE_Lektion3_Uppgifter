package se.brankoov.EE_Lektion3_Uppgifter.product;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepo;

    public ProductServiceImpl(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product createProduct(Product p) {

        return productRepo.save(p);
    }
}