package jack.ProductAPIMySql.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jack.ProductAPIMySql.model.Product;
import jack.ProductAPIMySql.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
 
    @Autowired
    private ProductRepository repo;
     
    public List<Product> listAll() {
        return repo.findAll();
    }
     
    public void save(Product product) {
        repo.save(product);
    }
     
    public Product get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}