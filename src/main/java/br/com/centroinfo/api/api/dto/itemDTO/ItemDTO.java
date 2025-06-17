package br.com.centroinfo.api.api.dto.itemDTO;

import br.com.centroinfo.api.api.entity.brand.Brand;
import br.com.centroinfo.api.api.entity.sector.Sector;

public class ItemDTO {
  public Long id;
  public String name;
  public double priceMax;
  public double priceMin;
  public Brand brand;
  public Sector sector;
  public String barCode;
  public String imagem;

}
