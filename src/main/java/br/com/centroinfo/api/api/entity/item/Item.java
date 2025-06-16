package br.com.centroinfo.api.api.entity.item;

import java.time.LocalDateTime;

import br.com.centroinfo.api.api.entity.brand.Brand;
import br.com.centroinfo.api.api.entity.sector.Sector;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "items")
@Entity
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    //
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private String name;

    @Column(name = "price_max")
    private double priceMax;

    @Column(name = "price_min")
    private double priceMin;

    @ManyToOne
    @JoinColumn(name = "id_brand")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "id_sector")
    private Sector sector;

    @Column(name = "bar_code")
    private String barCode;
    private String imagem;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

}
