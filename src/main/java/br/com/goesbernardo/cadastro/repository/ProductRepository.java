package br.com.goesbernardo.cadastro.repository;

import br.com.goesbernardo.cadastro.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
