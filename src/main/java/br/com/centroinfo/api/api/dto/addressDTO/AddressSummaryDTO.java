package br.com.centroinfo.api.api.dto.addressDTO;

import lombok.Getter;

@Getter
public class AddressSummaryDTO {
  private Long id;
  private String street;
  private String number;
  private String neighbor;
  private String complement;
  private PersonSummaryDTO person;
  private ZipcodeSumaryDTO zipCode;
  private CitySummaryDTO city;
  private CountrySumaryDTO country;

  public AddressSummaryDTO(
      Long id,
      String street,
      String number,
      String neighbor,
      String complement,
      Long pId,
      String pName,
      Long zId,
      String zCode,
      Long cId,
      String cName,
      String cState,
      String cIbge,
      Long coId,
      String coName,
      String coCode) {
    this.id = id;
    this.street = street;
    this.number = number;
    this.neighbor = neighbor;
    this.complement = complement;
    this.person = new PersonSummaryDTO(zId, pName);
    this.zipCode = new ZipcodeSumaryDTO(zId, zCode);
    this.city = new CitySummaryDTO(cId, cName, cState, cIbge);
    this.country = new CountrySumaryDTO(coId, coName, coCode);
  }
}
