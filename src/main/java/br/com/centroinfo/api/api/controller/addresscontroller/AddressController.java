package br.com.centroinfo.api.api.controller.addresscontroller;

import br.com.centroinfo.api.api.dto.addressDTO.AddressDTO;
import br.com.centroinfo.api.api.dto.addressDTO.AddressResponseDTO;
import br.com.centroinfo.api.api.entity.address.Address;
import br.com.centroinfo.api.api.service.address.AddressService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public Address create(@RequestBody AddressDTO addressDTO) {
       return addressService.create(addressDTO);
    }

    @GetMapping("/address")
    public ResponseEntity<List<AddressResponseDTO>> getAddressesByPersonId() {
        List<AddressResponseDTO> addresses = addressService.findAllAddresses();
        if (addresses.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(addresses);
    }

    @PutMapping("/address")
    public Address update(@RequestBody AddressDTO addressDTO) {
        return addressService.update(addressDTO);
    }

    @DeleteMapping("/address/{id}")
    public void delete(@PathVariable("id") Long id) {
        addressService.delete(id);
    }
}
