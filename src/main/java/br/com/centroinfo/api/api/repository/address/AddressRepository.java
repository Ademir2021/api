package br.com.centroinfo.api.api.repository.address;

import br.com.centroinfo.api.api.entity.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {}
