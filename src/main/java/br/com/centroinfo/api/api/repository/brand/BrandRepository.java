package br.com.centroinfo.api.api.repository.brand;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.centroinfo.api.api.entity.brand.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long>{
}
