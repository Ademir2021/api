package br.com.centroinfo.api.api.repository.sale;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.centroinfo.api.api.entity.sale.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {}
