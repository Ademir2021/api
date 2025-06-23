package br.com.centroinfo.api.api.dto.itemDTO;

import java.time.LocalDateTime;

import br.com.centroinfo.api.api.entity.brand.Brand;
import br.com.centroinfo.api.api.entity.sector.Sector;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemDTO {
  public Long id;
  public LocalDateTime createdAt;
  public LocalDateTime updatedAt;
  public String name;
  public double priceMax;
  public double priceMin;
  public Brand brand;
  public Sector sector;
  public String barCode;
  public String imagem;

}
