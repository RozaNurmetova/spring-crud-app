package uzcenter.restcrud.services.impl;

import org.springframework.stereotype.Service;
import uzcenter.restcrud.domains.Brand;
import uzcenter.restcrud.repositories.BrandRepository;
import uzcenter.restcrud.services.BrandService;

import java.util.List;
@Service
public class BrandServiceImplament implements BrandService {

    private final BrandRepository brandRepository;

    public BrandServiceImplament(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void save(Brand brand) {
        brandRepository.save(brand);

    }

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Brand findBrandById(Long id) {
        return brandRepository.findById(id).orElseThrow();
    }

    @Override
    public void update(Brand brand, Long id) {
        Brand newBrand =brandRepository.findById(id).orElseThrow();
        newBrand.setBrandName(brand.getBrandName());
        brandRepository.saveAndFlush(brand);

    }

    @Override
    public void delete(Long id) {
        brandRepository.deleteById(id);

    }
}
