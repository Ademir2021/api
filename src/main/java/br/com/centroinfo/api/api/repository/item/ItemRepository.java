package br.com.centroinfo.api.api.repository.item;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.centroinfo.api.api.entity.item.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {}
