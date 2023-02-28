package uzcenter.restcrud.services;

import uzcenter.restcrud.domains.Brand;

import java.util.List;

public interface BrandService {

    void save(Brand brand);

    List<Brand> getAllBrands();

    Brand findBrandById(Long id);

    void update(Brand brand,Long id);

    void delete(Long id);

}
