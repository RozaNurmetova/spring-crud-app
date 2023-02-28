package uzcenter.restcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uzcenter.restcrud.domains.Brand;

public interface BrandRepository extends JpaRepository<Brand,Long> {
}
