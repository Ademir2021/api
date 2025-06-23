package br.com.centroinfo.api.api.dto.saleDTO;

import br.com.centroinfo.api.api.entity.item.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSaleDTO {
    public Item item;
    public Integer amount;
    public Double price;
}
