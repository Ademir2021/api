package br.com.centroinfo.api.api.dto.saleDTO;


public class ItemNotaDTO {
    private Long id;
    private String item;
    private Integer quantity;
    private Double unitPrice;
    private Double total;
    private String barCode;
    private String sector;
    private String marca;

    public ItemNotaDTO(
            Long id,
            String item,
            Integer quantity,
            Double unitPrice,
            String barCode,
            String setcor,
            String marca) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.total = unitPrice * quantity;
        this.barCode = barCode;
        this.sector = setcor;
        this.marca = marca;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        // total = this.unitPrice * this.quantity;
        this.total = total;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
