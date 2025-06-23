package br.com.centroinfo.api.api.dto.itemDTO;

import br.com.centroinfo.api.api.entity.brand.Brand;
import br.com.centroinfo.api.api.entity.sector.Sector;
import java.time.LocalDateTime;

public class ItemDTO {
  private Long id;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private String name;
  private double priceMax;
  private double priceMin;
  private Brand brand;
  private Sector sector;
  private String barCode;
  private String imagem;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPriceMax() {
    return this.priceMax;
  }

  public void setPriceMax(double priceMax) {
    this.priceMax = priceMax;
  }

  public double getPriceMin() {
    return this.priceMin;
  }

  public void setPriceMin(double priceMin) {
    this.priceMin = priceMin;
  }

  public Brand getBrand() {
    return this.brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public Sector getSector() {
    return this.sector;
  }

  public void setSector(Sector sector) {
    this.sector = sector;
  }

  public String getBarCode() {
    return this.barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public String getImagem() {
    return this.imagem;
  }

  public void setImagem(String imagem) {
    this.imagem = imagem;
  }

}
