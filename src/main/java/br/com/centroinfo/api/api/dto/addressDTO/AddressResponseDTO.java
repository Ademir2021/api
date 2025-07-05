package br.com.centroinfo.api.api.dto.addressDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
public class AddressResponseDTO {
  private Long id;
  private String street;
  private String number;
  private String neighbor;
  private String complement;
  private PersonResponseDTO person;
  private ZipcodeResponseDTO zipCode;
  private CityResponseDTO city;
  private CountryResponseDTO country;

  public AddressResponseDTO(
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
    this.person = new PersonResponseDTO(zId, pName);
    this.zipCode = new ZipcodeResponseDTO(zId, zCode);
    this.city = new CityResponseDTO(cId, cName, cState, cIbge);
    this.country = new CountryResponseDTO(coId, coName, coCode);
  };

  /** Person */
  @Getter
  @Setter
  public class PersonResponseDTO {
    private Long id;
    private String name;

    public PersonResponseDTO(Long id, String name) {
      this.id = id;
      this.name = name;
    }
  };

  /** City */
  @Getter
  public class CityResponseDTO {
    private Long id;
    private String name;
    private String state;
    private String codeIbge;

    public CityResponseDTO(Long id, String name, String state, String cIbge) {
      this.id = id;
      this.name = name;
      this.state = state;
      this.codeIbge = cIbge;
    }
  };

  /** Country */
  @Getter
  public class CountryResponseDTO {
    private Long id;
    private String name;
    private String code; // Ex: BR, US, PT

    public CountryResponseDTO(Long id, String name, String code) {
      this.id = id;
      this.name = name;
      this.code = code;
    }
  };

  /** Zipcode */
  @Getter
  public class ZipcodeResponseDTO {
    private Long id;
    private String code;

    ZipcodeResponseDTO(Long id, String code) {
      this.id = id;
      this.code = code;
    }
  }
}