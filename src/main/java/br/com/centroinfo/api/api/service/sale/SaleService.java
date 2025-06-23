package br.com.centroinfo.api.api.service.sale;

import br.com.centroinfo.api.api.dto.saleDTO.ItemSaleDTO;
import br.com.centroinfo.api.api.dto.saleDTO.SaleDTO;
import br.com.centroinfo.api.api.entity.sale.ItemSale;
import br.com.centroinfo.api.api.entity.sale.Sale;
import br.com.centroinfo.api.api.repository.sale.SaleRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    private Double totalSalse = 0.0;

    public Sale createSale(SaleDTO saleDTO) {
        Sale sale = new Sale();
        sale.setIssueDate(LocalDateTime.now());
        sale.setPerson(saleDTO.person);
        sale.setDiscount(saleDTO.discount);
        sale.setBranch(saleDTO.branch);
        sale.setUser(saleDTO.user);

        List<ItemSale> itemList = new ArrayList<>();
        for (ItemSaleDTO itemDTO : saleDTO.itemsSale) {
            ItemSale item = new ItemSale();
            item.setItem(itemDTO.item);
            item.setAmount(itemDTO.amount);
            item.setPrice(itemDTO.price);
            item.setTotalItem(itemDTO.price * itemDTO.amount);
            totalSalse += item.getTotalItem();
            item.setSale(sale);
            itemList.add(item);
        }

        sale.setItemsSale(itemList);
        sale.setTotalSale(totalSalse);
        sale.setTotalNote(totalSalse - sale.getDiscount());
        return saleRepository.save(sale);
    }

    public List<Sale> listSale() {
      return  saleRepository.findAll();
    }

}
