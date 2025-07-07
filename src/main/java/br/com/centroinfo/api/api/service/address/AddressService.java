package br.com.centroinfo.api.api.service.address;

import br.com.centroinfo.api.api.dto.addressDTO.AddressDTO;
import br.com.centroinfo.api.api.dto.addressDTO.AddressResponseDTO;
import br.com.centroinfo.api.api.entity.address.Address;
import br.com.centroinfo.api.api.repository.address.AddressRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address create(AddressDTO addressDTO) {
        Address address = new Address();
        address.setStreet(addressDTO.getStreet());
        address.setNumber(addressDTO.getNumber());
        address.setNeighbor(addressDTO.getNeighbor());
        address.setComplement(addressDTO.getComplement());
        address.setZipCode(addressDTO.getZipCode());
        address.setPerson(addressDTO.getPerson());
        return addressRepository.save(address);
        
    }

    public List<AddressResponseDTO> findAllAddresses(){
        return addressRepository.findAllAddresses();
    }

    public Address update(AddressDTO addressDTO) {
        Address address = new Address();
        address.setId(addressDTO.getId());
        address.setStreet(addressDTO.getStreet());
        address.setNumber(addressDTO.getNumber());
        address.setNeighbor(addressDTO.getNeighbor());
        address.setComplement(addressDTO.getComplement());
        address.setZipCode(addressDTO.getZipCode());
        address.setPerson(addressDTO.getPerson());
        return addressRepository.save(address);
    }

    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

}
