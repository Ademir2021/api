package br.com.centroinfo.api.api.service.zipcode;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.centroinfo.api.api.dto.zipcodeDTO.ZipcodeDTO;
import br.com.centroinfo.api.api.repository.zipcode.ZipcodeRepository;

@Service
public class ZipcodeService {

    @Autowired
    ZipcodeRepository zipcodeRepository;

    public List<ZipcodeDTO> list() {
        return zipcodeRepository.findSummary();
    }
}
