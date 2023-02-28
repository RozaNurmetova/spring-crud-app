package uzcenter.restcrud.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brandName;

    public Brand() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    @OneToMany(mappedBy = "brand", fetch= FetchType.LAZY, cascade = CascadeType.ALL)
   private List<Computer> computers;

}
