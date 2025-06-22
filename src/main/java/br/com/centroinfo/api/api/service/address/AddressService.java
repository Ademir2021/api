package br.com.centroinfo.api.api.service.address;

import br.com.centroinfo.api.api.dto.addressDTO.AddressDTO;
import br.com.centroinfo.api.api.dto.addressDTO.AddressSummaryDTO;
import br.com.centroinfo.api.api.entity.address.Address;
import br.com.centroinfo.api.api.repository.address.AddressRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public List<Address> create(AddressDTO addressDTO) {
        Address address = new Address();
        address.setStreet(addressDTO.street);
        address.setNumber(addressDTO.number);
        address.setNeighbor(addressDTO.neighbor);
        address.setComplement(addressDTO.complement);
        address.setZipCode(addressDTO.zipCode);
        address.setPerson(addressDTO.person);
        addressRepository.save(address);
        return list();
    }

    public List<Address> list() {
        return addressRepository.findAll();
    }

    public List<AddressSummaryDTO> findSummary() {
        return addressRepository.findSummary();
    }

    public Address update(AddressDTO addressDTO) {
        Address address = new Address();
        address.setId(addressDTO.id);
        address.setStreet(addressDTO.street);
        address.setNumber(addressDTO.number);
        address.setNeighbor(addressDTO.neighbor);
        address.setComplement(addressDTO.complement);
        address.setZipCode(addressDTO.zipCode);
        address.setPerson(addressDTO.person);
        //
        return addressRepository.save(address);
    }

    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

}
