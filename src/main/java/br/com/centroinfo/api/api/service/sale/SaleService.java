package br.com.centroinfo.api.api.service.sale;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.centroinfo.api.api.dto.saleDTO.ItemSaleDTO;
import br.com.centroinfo.api.api.dto.saleDTO.SaleDTO;
import br.com.centroinfo.api.api.entity.sale.ItemSale;
import br.com.centroinfo.api.api.entity.sale.Sale;
import br.com.centroinfo.api.api.repository.sale.SaleRepository;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public Sale createSale(SaleDTO saleDTO) {
        Sale sale = new Sale();
        sale.setIssueDate(LocalDate.parse(saleDTO.issueDate));
        sale.setIdClient(saleDTO.id_client);

        List<ItemSale> itemList = new ArrayList<>();

        for (ItemSaleDTO itemDTO : saleDTO.itemsSale) {
            ItemSale item = new ItemSale();
            item.setIdProduct(itemDTO.idProduct);
            item.setAmount(itemDTO.amount);
            item.setPrice(itemDTO.price);
            item.setTotalItem(itemDTO.price * itemDTO.amount);
            item.setSale(sale);
            itemList.add(item);
        }

        sale.setItemsSale(itemList);

        return saleRepository.save(sale);
    }
}
