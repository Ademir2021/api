package br.com.centroinfo.api.api.service.sale;

import br.com.centroinfo.api.api.dto.saleDTO.ItemNotaDTO;
import br.com.centroinfo.api.api.dto.saleDTO.NotaDTO;
import br.com.centroinfo.api.api.entity.sale.Sale;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class NotaService {
    
    public NotaDTO gerarNota(Sale sale) {
        List<ItemNotaDTO> itemDTOs = sale.getItemsSale().stream().map(item -> {
            Long id = item.getItem().getId();
            String itemName = item.getItem().getName();
            Integer amount = item.getAmount();
            Double price = item.getPrice();
            String barCode = item.getItem().getBarCode();
            String sector = item.getItem().getSector().getName();
            String brand = item.getItem().getBrand().getName();
            return new ItemNotaDTO(id, itemName, amount, price, barCode, sector, brand);
        }).collect(Collectors.toList());

        return new NotaDTO(
                sale.getId(),
                sale.getIssueDate(),
                sale.getBranch().getName(),
                sale.getUser().getLogin(),
                sale.getPerson().getName(),
                itemDTOs,
                sale.getTotalSale(),
                sale.getDiscount(),
                sale.getTotalNote()
        );
    }
}

