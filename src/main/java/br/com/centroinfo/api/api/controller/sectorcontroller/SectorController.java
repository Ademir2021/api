package br.com.centroinfo.api.api.controller.sectorcontroller;

import br.com.centroinfo.api.api.entity.sector.Sector;
import br.com.centroinfo.api.api.service.sector.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
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
    public void create(@RequestBody @Validated Sector sector) {
        sectorService.create(sector);
    }
}
