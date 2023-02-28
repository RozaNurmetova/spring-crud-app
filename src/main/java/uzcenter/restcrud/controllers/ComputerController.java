package uzcenter.restcrud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uzcenter.restcrud.domains.Computer;
import uzcenter.restcrud.dto.BrandComputerDTO;
import uzcenter.restcrud.services.ComputerService;
import uzcenter.restcrud.services.impl.ComputerServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ComputerController {
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService){
        this.computerService =computerService ;
    }

    @PostMapping("/computer/save/{brandID}")
    public ResponseEntity<String> saveComputer(@PathVariable ("brandID") Long brandID,@RequestBody Computer computer){
        computerService.save(brandID, computer);
        return ResponseEntity.ok("Computer saved");

    }
    @GetMapping ("/computer/brand/ {brandID}")
    private  ResponseEntity<BrandComputerDTO> getComputerWithBrand(@PathVariable("brandID") Long brandID) {
        return ResponseEntity.ok(computerService.getAllComputerByBrandID(brandID));


    }
}

