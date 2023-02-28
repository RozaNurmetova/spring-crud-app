package uzcenter.restcrud.services;

import uzcenter.restcrud.domains.Computer;
import uzcenter.restcrud.dto.BrandComputerDTO;
import uzcenter.restcrud.repositories.ComputerRepository;

import java.util.List;

public interface ComputerService  {

    void save(Long brandID,Computer computer);

    List<Computer> getAllComputers();

    BrandComputerDTO getAllComputerByBrandID(Long brandID);

    Computer getComputerByID(Long id);

}
