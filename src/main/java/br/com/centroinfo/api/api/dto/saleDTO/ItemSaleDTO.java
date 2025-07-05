package br.com.centroinfo.api.api.dto.saleDTO;

import br.com.centroinfo.api.api.entity.item.Item;
import lombok.Getter;

@Getter
public class ItemSaleDTO {
    private Item item;
    private Integer amount;
    private Double price;
}