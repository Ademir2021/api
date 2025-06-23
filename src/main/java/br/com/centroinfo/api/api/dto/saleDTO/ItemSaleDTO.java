package br.com.centroinfo.api.api.dto.saleDTO;

import br.com.centroinfo.api.api.entity.item.Item;

public class ItemSaleDTO {
    private Item item;
    private Integer amount;
    private Double price;
    
    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}