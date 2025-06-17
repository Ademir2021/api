package br.com.centroinfo.api.api.dto.saleDTO;

import java.util.List;

import br.com.centroinfo.api.api.entity.user.User;

public class SaleDTO {
    public Long idBranch;
    public User user;
    public Long idPerson;
    public Double discount;
    public List<ItemSaleDTO> itemsSale;
}
