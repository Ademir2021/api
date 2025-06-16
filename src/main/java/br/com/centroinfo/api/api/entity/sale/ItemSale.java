package br.com.centroinfo.api.api.entity.sale;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "items_sales")
@Entity
@Getter
@Setter
public class ItemSale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_product")
    private Long idProduct;

    private Integer amount;

    private Double price;

    @Column(name = "total_item")
    private Double totalItem;

    @ManyToOne
    @JoinColumn(name = "id_sale")
    private Sale sale;
    
}

