package br.com.centroinfo.api.api.provider.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {
    @Autowired
    SecurityFilter securityFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> authorize

                        // Pemite requisições do tipo tems/search_name?name=mouse
                        .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                        .requestMatchers(HttpMethod.POST, "/auth/login").permitAll()
                        .requestMatchers(HttpMethod.POST, "/auth/register").permitAll()
                        .requestMatchers(HttpMethod.POST, "/items/brands").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/items/sectors").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/items/items").permitAll()
                        .requestMatchers(HttpMethod.POST, "/items/items").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/store/sales").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/persons/persons").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/persons/search/**").permitAll()
                        .requestMatchers(HttpMethod.GET, "/notas/nota/**").permitAll()
                        .requestMatchers(HttpMethod.GET, "/address/address").permitAll()
                        .requestMatchers(HttpMethod.GET, "/persons/persons").permitAll()
                        .requestMatchers(HttpMethod.GET, "/zipcodes/zipcode").permitAll()
                        .anyRequest().authenticated())
                .addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
            throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
