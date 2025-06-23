package br.com.centroinfo.api.api.dto.addressDTO;

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

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getStreet() {
    return this.street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getNumber() {
    return this.number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getNeighbor() {
    return this.neighbor;
  }

  public void setNeighbor(String neighbor) {
    this.neighbor = neighbor;
  }

  public String getComplement() {
    return this.complement;
  }

  public void setComplement(String complement) {
    this.complement = complement;
  }

  public PersonSummaryDTO getPerson() {
    return this.person;
  }

  public void setPerson(PersonSummaryDTO person) {
    this.person = person;
  }

  public ZipcodeSumaryDTO getZipCode() {
    return this.zipCode;
  }

  public void setZipCode(ZipcodeSumaryDTO zipCode) {
    this.zipCode = zipCode;
  }

  public CitySummaryDTO getCity() {
    return this.city;
  }

  public void setCity(CitySummaryDTO city) {
    this.city = city;
  }

  public CountrySumaryDTO getCountry() {
    return this.country;
  }

  public void setCountry(CountrySumaryDTO country) {
    this.country = country;
  }

}