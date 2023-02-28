package uzcenter.restcrud.domains;

import lombok.Data;
import lombok.Generated;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Data
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    private String cpu;

    private Integer ram;

    private Integer rom;

    private Integer cost;

    private String videoCard;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand id")
    private Brand brand;

    public Computer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
