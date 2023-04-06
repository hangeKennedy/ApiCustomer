
package pe.cibertec.eCommerce.ApiCostumer.Service;

import java.util.List;
import pe.cibertec.eCommerce.ApiCostumer.Entity.Costumer;


public interface CustomerService {
    public List<Costumer> findAll();
    public Costumer findById(Long id);
    
    
}
