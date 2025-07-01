package br.com.centroinfo.api.api.dto.personDTO;

public class PersonAddressDTO {
    private Long idAddrees;


    public PersonAddressDTO(Long idAddrees) {
        this.idAddrees = idAddrees;
    }

    public Long getIdAddrees() {
        return this.idAddrees;
    }

    public void setIdAddrees(Long idAddrees) {
        this.idAddrees = idAddrees;
    }
}
