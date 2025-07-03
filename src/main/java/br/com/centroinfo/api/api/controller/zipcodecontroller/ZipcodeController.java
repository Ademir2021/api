package br.com.centroinfo.api.api.controller.zipcodecontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.centroinfo.api.api.service.zipcode.ZipcodeService;
import br.com.centroinfo.api.api.dto.zipcodeDTO.ZipcodeDTO;

@RestController
@RequestMapping("zipcodes")
public class ZipcodeController {

    @Autowired
    private ZipcodeService zipcodeService;

    public ZipcodeController(ZipcodeService zipcodeService){
        this.zipcodeService = zipcodeService;
    }

    @GetMapping("/zipcode")
    public List<ZipcodeDTO> list() {
        return zipcodeService.list();
    }

}
