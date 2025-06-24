package br.com.centroinfo.api.api.controller.salecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.centroinfo.api.api.dto.saleDTO.SaleDTO;
import br.com.centroinfo.api.api.entity.sale.Sale;
import br.com.centroinfo.api.api.service.sale.SaleService;

@RestController
@RequestMapping("store")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @PostMapping("/sales")
    public ResponseEntity<String> createSale(@RequestBody SaleDTO saleDTO) {
        try {
            Sale sale = saleService.createSale(saleDTO);
            // return new ResponseEntity<>(sale, HttpStatus.CREATED);
            return ResponseEntity.ok("Venda criada com sucesso nº " + sale.getId());

        } catch (Exception e) {
            return ResponseEntity.ok("Não foi possivel grava a venda: " + e);
        }
    }

    @GetMapping("/sales")
    public List<Sale> listSale() {
        return saleService.listSale();
    }

}
