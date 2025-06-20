package br.com.centroinfo.api.api.controller.addresscontroller;

import br.com.centroinfo.api.api.dto.addressDTO.AddressDTO;
import br.com.centroinfo.api.api.entity.address.Address;
import br.com.centroinfo.api.api.service.address.AddressService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/address")
    public List<Address> create(@RequestBody AddressDTO addressDTO) {
        addressService.create(addressDTO);
        return addressService.list();
    }

    @GetMapping("/address")
    public List<Address> list() {
        return addressService.list();
    }

    @PutMapping("/address")
    public List<Address> update(@RequestBody AddressDTO addressDTO) {
        addressService.update(addressDTO);
        return addressService.list();
    }

    @DeleteMapping("/address/{id}")
    public List<Address> delete(@PathVariable("id") Long id) {
        addressService.delete(id);
        return addressService.list();
    }

}
