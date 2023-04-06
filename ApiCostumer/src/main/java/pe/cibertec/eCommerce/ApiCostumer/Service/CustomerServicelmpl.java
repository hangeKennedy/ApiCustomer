
package pe.cibertec.eCommerce.ApiCostumer.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.eCommerce.ApiCostumer.Dao.CostumerRepository;
import pe.cibertec.eCommerce.ApiCostumer.Entity.Costumer;

@Service
public class CustomerServicelmpl implements CustomerService{
    @Autowired // sirve para crear la instancia (inyeccion de dependencias)
    private CostumerRepository costumerRepository;
    
    @Override
    public List<Costumer> findAll() {
        return (List<Costumer>) costumerRepository.findAll();
    }

    @Override
    public Costumer findById(Long id) {
        return  costumerRepository.findById(id).orElse(null);
    }
    
    
}
