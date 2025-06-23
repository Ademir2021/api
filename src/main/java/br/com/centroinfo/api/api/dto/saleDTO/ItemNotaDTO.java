package br.com.centroinfo.api.api.dto.saleDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
