package br.com.centroinfo.api.api.controller.brandcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.centroinfo.api.api.dto.brandDTO.BrandDTO;
import br.com.centroinfo.api.api.entity.brand.Brand;
import br.com.centroinfo.api.api.service.brand.BrandService;

@RestController
@RequestMapping("items")
public class BrandController {

    @Autowired
    BrandService brandService;

    @PostMapping("/brands")
    public Brand create(@RequestBody BrandDTO body) {
        Brand brand = brandService.create(body);
        return brand;
    }

    @GetMapping("/brands")
    List<Brand> list() {
        return brandService.list();
    }

    @PutMapping("/brands")
    public Brand update(@RequestBody BrandDTO body) {
        Brand brand = brandService.update(body);
        return brand;
    }

    @DeleteMapping("/brands/{id}")
     public List<Brand> delete(@PathVariable("id") Long id){
        brandService.delete(id);
        return brandService.list();
    }

}
