package br.com.goesbernardo.cadastro.controller;

import br.com.goesbernardo.cadastro.domain.Product;
import br.com.goesbernardo.cadastro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable  Long id){

        Product product = productService.findById(id);

        return ResponseEntity.ok().body(product);
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){

        List<Product> products = productService.findAll();

        return ResponseEntity.ok().body(products);
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){

        return new ResponseEntity(productService.save(product), HttpStatus.CREATED);
    }


    @PutMapping
    public ResponseEntity<Product> update (@RequestBody Product product){

        return new ResponseEntity(productService.update(product), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        productService.delete(id);
        return ResponseEntity.noContent().build();

    }




}
