package br.com.centroinfo.api.api.dto.saleDTO;

import java.util.List;

import br.com.centroinfo.api.api.entity.branch.Branch;
import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.entity.user.User;

public class SaleDTO {
    public Branch branch;
    public User user;
    public Person person;
    public Double discount;
    public List<ItemSaleDTO> itemsSale;
}
