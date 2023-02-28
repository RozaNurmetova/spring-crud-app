package uzcenter.restcrud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uzcenter.restcrud.domains.Brand;
import uzcenter.restcrud.services.BrandService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BrandController {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;

    }
    @PostMapping("/brand/save")
    public ResponseEntity<String> saveBrand(@RequestBody Brand brand){
        brandService.save(brand);
        return ResponseEntity.ok("Brand saved");
    }
    @GetMapping("/brands")
    public ResponseEntity<List<Brand>> getAllBrands(){
        return ResponseEntity.ok(brandService.getAllBrands());
    }
    @GetMapping("/brand/{id}")
    public ResponseEntity<Brand> findBrandById(@PathVariable("id") Long id){
        return ResponseEntity.ok(brandService.findBrandById(id));
    }
}
