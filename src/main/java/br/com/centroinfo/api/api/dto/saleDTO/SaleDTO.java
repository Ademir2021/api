package br.com.centroinfo.api.api.dto.saleDTO;


import java.util.List;
import br.com.centroinfo.api.api.entity.branch.Branch;
import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.entity.user.User;

public class SaleDTO {
    private Branch branch;
    private User user;
    private Person person;
    private Double discount;
    private List<ItemSaleDTO> itemsSale;



    public Branch getBranch() {
        return this.branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public List<ItemSaleDTO> getItemsSale() {
        return this.itemsSale;
    }

    public void setItemsSale(List<ItemSaleDTO> itemsSale) {
        this.itemsSale = itemsSale;
    }

}