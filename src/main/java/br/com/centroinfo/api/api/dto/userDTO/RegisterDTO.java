package br.com.centroinfo.api.api.dto.userDTO;

import br.com.centroinfo.api.api.entity.user.UserRole;;

public record RegisterDTO(Long id, String login, String password, UserRole role) {}
