package br.com.centroinfo.api.api.dto.saleDTO;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
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
}
