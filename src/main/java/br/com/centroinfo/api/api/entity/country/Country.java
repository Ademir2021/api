package br.com.centroinfo.api.api.entity.country;

import java.util.List;

import br.com.centroinfo.api.api.entity.city.City;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name="countries")
@Entity
@Getter
@Setter

public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code; // Ex: BR, US, PT

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<City> cities;
}
