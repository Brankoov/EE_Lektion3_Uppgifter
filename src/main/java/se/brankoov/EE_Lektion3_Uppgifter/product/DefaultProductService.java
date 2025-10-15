package se.brankoov.EE_Lektion3_Uppgifter.product;

import org.springframework.stereotype.Service;

@Service
public class DefaultProductService implements ProductService {
    @Override
    public Product createProduct(Product p) {

        return p;
    }
}