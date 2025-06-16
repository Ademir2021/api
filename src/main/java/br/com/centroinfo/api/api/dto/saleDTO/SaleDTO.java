package br.com.centroinfo.api.api.dto.saleDTO;

import java.util.List;

public class SaleDTO {
    public Long idBranch;
    public Long idUser;
    public Long idPerson;
    public Double discount;
    public List<ItemSaleDTO> itemsSale;
}
