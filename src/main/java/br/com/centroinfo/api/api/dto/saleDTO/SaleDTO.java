package br.com.centroinfo.api.api.dto.saleDTO;

import java.util.List;
import br.com.centroinfo.api.api.entity.branch.Branch;
import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.entity.user.User;
import lombok.Getter;

@Getter
public class SaleDTO {
    private Branch branch;
    private User user;
    private Person person;
    private Double discount;
    private List<ItemSaleDTO> itemsSale;
}