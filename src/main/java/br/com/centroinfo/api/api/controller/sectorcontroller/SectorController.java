package br.com.centroinfo.api.api.controller.sectorcontroller;

import br.com.centroinfo.api.api.dto.sectorDTO.SectorDTO;
import br.com.centroinfo.api.api.entity.sector.Sector;
import br.com.centroinfo.api.api.service.sector.SectorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class SectorController {

    @Autowired
    private SectorService sectorService;

    public SectorController(SectorService sectorService) {
        this.sectorService = sectorService;
    }

    @PostMapping("/sectors")
    public List<Sector> create(@RequestBody @Validated SectorDTO sectorDTO) {
        sectorService.create(sectorDTO);
        return sectorService.list();
    }

    @GetMapping("/sectors")
    List<Sector> list() {
        return sectorService.list();
    }

    @PutMapping("/sectors")
    List<Sector> update(@RequestBody @Validated SectorDTO sectorDTO) {
        return sectorService.update(sectorDTO);
    }

    @DeleteMapping("/sectors/{id}")
    List<Sector> delete(@PathVariable("id") Long id) {
        return sectorService.delete(id);

    }

}
