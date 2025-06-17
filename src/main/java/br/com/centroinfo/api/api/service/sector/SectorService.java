package br.com.centroinfo.api.api.service.sector;

import br.com.centroinfo.api.api.dto.sectorDTO.SectorDTO;
import br.com.centroinfo.api.api.entity.sector.Sector;
import br.com.centroinfo.api.api.repository.sector.SectorRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectorService {

    @Autowired
    private SectorRepository sectorRepository;

    public List<Sector> create(SectorDTO sectorDTO) {
        Sector sector = new Sector();
        sector.setName(sectorDTO.name);
        sectorRepository.save(sector);
        return list();
    }

    public List<Sector> list() {
        return sectorRepository.findAll();
    }

    public List<Sector> update(SectorDTO sectorDTO) {
        Sector sector = new Sector();
        sector.setId(sectorDTO.id);
        sector.setName(sectorDTO.name);
        sectorRepository.save(sector);
        return list();
    }

    public List<Sector> delete(Long id) {
        sectorRepository.deleteById((id));
        return list();
    }
}
