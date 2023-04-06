
package pe.cibertec.eCommerce.ApiCostumer.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.eCommerce.ApiCostumer.Entity.Costumer;
import pe.cibertec.eCommerce.ApiCostumer.Service.CustomerService;

@RestController
@RequestMapping("/api/costumer") //
public class CustomerController {
   @Autowired
    private CustomerService customerService;
    
    @GetMapping("/findAll") // enpoin
    public List<Costumer> findAll(){
        return customerService.findAll();
    }
    
    @GetMapping("/findById/(id)")
    public Costumer findById(@PathVariable Long id){
        return customerService.findById(id);
    }
}
