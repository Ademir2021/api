package br.com.centroinfo.api.api.repository.item;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.centroinfo.api.api.entity.item.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
     List<Item> findByNameContainingIgnoreCase(String name);
}
