package com.example.demotdd;

import com.example.demotdd.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;


    @Test
    public void getProduct_bySku_success() {
        Optional<Product> prod = productRepository.getBySku("CADENA");
        assertThat(prod).isPresent()
                .get().hasFieldOrPropertyWithValue("sku", "i9se");

    }
}
