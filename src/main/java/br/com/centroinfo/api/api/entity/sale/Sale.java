package br.com.centroinfo.api.api.entity.sale;

import java.time.LocalDateTime;
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
    private LocalDateTime issueDate;

    @Column(name = "id_branch")
    private Long idBranch;
    
    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "id_person")
    private Long idPerson;

    @Column(name = "total_sale")
    private Double totalSale;

    @Column(name = "discount")
    private Double discount;

    @Column(name = "total_note")
    private Double totalNote;

    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private List<ItemSale> itemsSale;

}
