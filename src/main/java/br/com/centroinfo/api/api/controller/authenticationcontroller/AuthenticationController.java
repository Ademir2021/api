package br.com.centroinfo.api.api.controller.authenticationcontroller;

import br.com.centroinfo.api.api.dto.userDTO.AuthenticationDTO;
import br.com.centroinfo.api.api.dto.userDTO.LoginResponseDTO;
import br.com.centroinfo.api.api.dto.userDTO.RegisterDTO;
import br.com.centroinfo.api.api.dto.userDTO.UpdateUserDTO;
import br.com.centroinfo.api.api.entity.user.User;
import br.com.centroinfo.api.api.provider.security.TokenService;
import br.com.centroinfo.api.api.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserRepository repository;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Validated AuthenticationDTO authenticationDTO) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(authenticationDTO.login(),
                authenticationDTO.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);
        var token = tokenService.generateToken((User) auth.getPrincipal());
        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Validated RegisterDTO authenticationDTO) {
        if (this.repository.findByLogin(authenticationDTO.login()) != null)
            return ResponseEntity.badRequest().build();
        String encryptedPassword = new BCryptPasswordEncoder().encode(authenticationDTO.password());
        User newUser = new User(authenticationDTO.login(), encryptedPassword, authenticationDTO.role());
        this.repository.save(newUser);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/register")
    public List<User> list() {
        return repository.findAll();
    }

    @PutMapping("/register")
    public ResponseEntity<?> update(@RequestBody @Validated UpdateUserDTO updateUserDTO) {
        if (this.repository.findByLogin(updateUserDTO.login) != null)
            return ResponseEntity.badRequest().build();
        String encryptedPassword = new BCryptPasswordEncoder().encode(updateUserDTO.password);
        User newUser = new User(updateUserDTO.id, updateUserDTO.login, encryptedPassword, updateUserDTO.role);
        this.repository.save(newUser);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/register/{id}")
    public List<User> delete(@PathVariable("id") Long id) {
        this.repository.deleteById(id);
        return repository.findAll();
    }

}
