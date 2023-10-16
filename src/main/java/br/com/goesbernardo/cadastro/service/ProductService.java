package br.com.goesbernardo.cadastro.service;

import br.com.goesbernardo.cadastro.domain.Product;
import br.com.goesbernardo.cadastro.exception.ObjectNotFoundException;
import br.com.goesbernardo.cadastro.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product findById(Long id){
        Optional<Product> result = productRepository.findById(id);

        return result.orElseThrow(()-> new ObjectNotFoundException("object not found id " + id));
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product save(Product product){
        product.setId(null);
        return productRepository.save(product);
    }

    public Product update(Product product){
        Product newProduct = new Product();
        updateProduct(product,newProduct);
        return productRepository.save(newProduct);
    }
    private void updateProduct(Product product, Product newProduct){

        newProduct.setName(product.getName());
        newProduct.setAmount(product.getAmount());
        newProduct.setValue(product.getValue());
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }


}
