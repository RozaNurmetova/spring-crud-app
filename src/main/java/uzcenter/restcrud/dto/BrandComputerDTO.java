package uzcenter.restcrud.dto;

import uzcenter.restcrud.domains.Brand;
import uzcenter.restcrud.domains.Computer;

import java.util.List;

public class BrandComputerDTO {
    private Brand brand;
    private List<Computer> computers;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
}
