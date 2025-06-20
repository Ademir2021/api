package br.com.centroinfo.api.api.repository.address;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.centroinfo.api.api.entity.address.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
