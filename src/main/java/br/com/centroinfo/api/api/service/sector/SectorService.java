package br.com.centroinfo.api.api.service.sector;

import br.com.centroinfo.api.api.entity.sector.Sector;
import br.com.centroinfo.api.api.repository.sector.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectorService {

    @Autowired
    private SectorRepository sectorRepository;

    public void create(Sector sector) {
        sectorRepository.save(sector);
    }
}
