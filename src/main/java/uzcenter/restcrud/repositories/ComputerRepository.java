package uzcenter.restcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uzcenter.restcrud.domains.Computer;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer,Long> {
    List<Computer>findAllByBrand_Id(Long id);
}
