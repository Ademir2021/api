package br.com.centroinfo.api.api.service.brand;

import br.com.centroinfo.api.api.entity.brand.Brand;
import br.com.centroinfo.api.api.repository.brand.BrandRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
     @Autowired
    private BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<Brand> create (Brand brand){
        brandRepository.save(brand);
        return list();
    }

    public List<Brand> list(){
        Sort sort = Sort.by("id").ascending();
        return brandRepository.findAll(sort);
    }

    public List<Brand> update(Brand brand){
        brandRepository.save(brand);
        return list();
    }

    public List<Brand> delete(Long id){
        brandRepository.deleteById((id));
        return list();
    }
}
