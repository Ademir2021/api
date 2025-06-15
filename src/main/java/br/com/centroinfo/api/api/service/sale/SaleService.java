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
    
    private Double total = 0.0;

    public Sale createSale(SaleDTO saleDTO) {

        Sale sale = new Sale();
        sale.setIssueDate(LocalDate.now());
        sale.setIdPerson(saleDTO.idPerson);
        sale.setDiscount(saleDTO.discount);
        sale.setIdBranch(saleDTO.idBranch);
        sale.setIdUser(saleDTO.idUser);

        List<ItemSale> itemList = new ArrayList<>();

        for (ItemSaleDTO itemDTO : saleDTO.itemsSale) {
            ItemSale item = new ItemSale();
            item.setIdProduct(itemDTO.idProduct);
            item.setAmount(itemDTO.amount);
            item.setPrice(itemDTO.price);
            item.setTotalItem(itemDTO.price * itemDTO.amount);
            total += item.getTotalItem();
            item.setSale(sale);
            itemList.add(item);
        }

        sale.setItemsSale(itemList);

        sale.setTotalSale(total);
        sale.setTotalNote(total - sale.getDiscount());

        return saleRepository.save(sale);
    }
}
