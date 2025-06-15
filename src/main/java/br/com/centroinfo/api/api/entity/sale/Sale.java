package br.com.centroinfo.api.api.entity.sale;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Table(name = "sales")
@Entity
@Getter
@Setter
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "issue_date")
    private LocalDate issueDate;

    @Column(name = "id_cliente")
    private Long idClient;

    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private List<ItemSale> itemsSale;

    // Getters e Setters
}

