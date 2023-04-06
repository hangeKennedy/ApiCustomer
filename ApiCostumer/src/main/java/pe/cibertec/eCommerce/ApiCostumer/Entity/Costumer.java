
package pe.cibertec.eCommerce.ApiCostumer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;

@Entity
@Data // ayuda a no crea get y set
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;
    private Date createAt;
    
    
}
