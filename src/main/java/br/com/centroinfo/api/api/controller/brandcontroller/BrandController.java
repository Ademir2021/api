package br.com.centroinfo.api.api.controller.brandcontroller;

import br.com.centroinfo.api.api.entity.brand.Brand;
import br.com.centroinfo.api.api.service.brand.BrandService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("items")
public class BrandController {

    @Autowired
    private BrandService brandService;

    public BrandController(BrandService brandService){
        this.brandService = brandService;
    }

    @PostMapping("/brands")
    List <Brand> create(@RequestBody @Validated Brand brand){
        return brandService.create(brand);
    }

    @GetMapping("/brands")
    List<Brand> list(){
        return brandService.list();
    }

    @PutMapping("/brands")
    List<Brand> update(@RequestBody @Validated Brand brand){
        return brandService.update(brand);
    }

    @DeleteMapping("/brands/{id}")
    List<Brand> delete(@PathVariable("id") Long id){
        return brandService.delete(id);

    }

}

