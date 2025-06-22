package br.com.centroinfo.api.api.repository.address;

import br.com.centroinfo.api.api.dto.addressDTO.AddressSummaryDTO;
import br.com.centroinfo.api.api.entity.address.Address;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepository extends JpaRepository<Address, Long> {
    @Query("""
            SELECT new br.com.centroinfo.api.api.dto.addressDTO.AddressSummaryDTO(
            a.id, a.street, a.number, a.neighbor, a.complement,
            p.id, p.name,
            z.id, z.code,
            c.id, c.name, c.state, c.codeIbge,
            co.id, co.name, co.code)
            FROM Address a
            JOIN a.person p
            JOIN a.zipCode z
            JOIN z.city c
            JOIN c.country co ORDER BY a.id ASC
            """)
    List<AddressSummaryDTO> findSummary();
}
