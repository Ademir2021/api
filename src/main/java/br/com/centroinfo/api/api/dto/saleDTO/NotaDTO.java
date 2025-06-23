package br.com.centroinfo.api.api.dto.saleDTO;

import java.time.LocalDateTime;
import java.util.List;

public class NotaDTO {
    private Long saleId;
    private LocalDateTime issueDate;
    private String branchName;
    private String userName;
    private String personName;
    private List<ItemNotaDTO> items;
    private Double totalSale;
    private Double discount;
    private Double totalNote;

    public NotaDTO(Long saleId, LocalDateTime issueDate, String branchName, String userName, String personName, List<ItemNotaDTO> items, Double totalSale, Double discount, Double totalNote) {
        this.saleId = saleId;
        this.issueDate = issueDate;
        this.branchName = branchName;
        this.userName = userName;
        this.personName = personName;
        this.items = items;
        this.totalSale = totalSale;
        this.discount = discount;
        this.totalNote = totalNote;
    }

    public Long getSaleId() {
        return this.saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public LocalDateTime getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List<ItemNotaDTO> getItems() {
        return this.items;
    }

    public void setItems(List<ItemNotaDTO> items) {
        this.items = items;
    }

    public Double getTotalSale() {
        return this.totalSale;
    }

    public void setTotalSale(Double totalSale) {
        this.totalSale = totalSale;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTotalNote() {
        return this.totalNote;
    }

    public void setTotalNote(Double totalNote) {
        this.totalNote = totalNote;
    }

}

