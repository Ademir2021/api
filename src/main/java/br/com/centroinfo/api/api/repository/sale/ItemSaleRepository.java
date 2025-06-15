package br.com.centroinfo.api.api.repository.sale;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.centroinfo.api.api.entity.sale.ItemSale;

public interface ItemSaleRepository extends JpaRepository<ItemSale, Long> {}

