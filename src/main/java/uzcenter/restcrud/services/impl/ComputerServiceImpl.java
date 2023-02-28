package uzcenter.restcrud.services.impl;

import org.springframework.stereotype.Service;
import uzcenter.restcrud.domains.Brand;
import uzcenter.restcrud.domains.Computer;
import uzcenter.restcrud.dto.BrandComputerDTO;
import uzcenter.restcrud.repositories.ComputerRepository;
import uzcenter.restcrud.services.BrandService;
import uzcenter.restcrud.services.ComputerService;

import java.util.Collections;
import java.util.List;
@Service
public class ComputerServiceImpl implements ComputerService {
    private final ComputerRepository computerRepository;
    private final BrandService brandService;

    public ComputerServiceImpl(ComputerRepository computerRepository, BrandService brandService) {
        this.computerRepository = computerRepository;
        this.brandService = brandService;
    }

    @Override
    public void save(Long brandID, Computer computer) {
        Brand brand=brandService.findBrandById(brandID);
        computer.setBrand(brand) ;
        computerRepository.save(computer);

    }

    @Override
    public List<Computer> getAllComputers() {
        return computerRepository.findAll();
    }

    @Override
    public BrandComputerDTO getAllComputerByBrandID(Long brandID) {
        Brand brand = brandService.findBrandById(brandID);
        List<Computer> computers=computerRepository.findAllByBrand_Id(brandID);
        BrandComputerDTO brandComputerDTO=new BrandComputerDTO();
        brandComputerDTO.setBrand(brand);
        brandComputerDTO.setComputers(computers);
        return brandComputerDTO ;
    }

    @Override
    public Computer getComputerByID(Long id) {
        return null;
    }
}
