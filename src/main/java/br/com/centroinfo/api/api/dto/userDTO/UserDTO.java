package br.com.centroinfo.api.api.dto.userDTO;

import br.com.centroinfo.api.api.entity.user.UserRole;

public class UserDTO {
    public Long id;
    public String login;
    public String password;
    public UserRole role;
}
