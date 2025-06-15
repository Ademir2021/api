package br.com.centroinfo.api.api.dto.saleDTO;

import java.util.List;

public class SaleDTO {
    public Long idBranch;
    public Long idUser;
    public Long idPerson;
    public Double totalSale;
    public Double discount;
    public Double totalNote;
    public List<ItemSaleDTO> itemsSale;
}
