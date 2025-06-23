package br.com.centroinfo.api.api.controller.notecontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.centroinfo.api.api.dto.saleDTO.NotaDTO;
import br.com.centroinfo.api.api.repository.sale.SaleRepository;
import br.com.centroinfo.api.api.service.sale.NotaService;

@RestController
@RequestMapping("notas")
public class NotaController {

    private final SaleRepository saleRepository;
    private final NotaService notaService;

    public NotaController(SaleRepository saleRepository, NotaService notaService) {
        this.saleRepository = saleRepository;
        this.notaService = notaService;
    }

    @GetMapping("/nota/{saleId}")
    public ResponseEntity<NotaDTO> gerarNota(@PathVariable Long saleId) {
        return saleRepository.findById(saleId)
                .map(notaService::gerarNota)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
