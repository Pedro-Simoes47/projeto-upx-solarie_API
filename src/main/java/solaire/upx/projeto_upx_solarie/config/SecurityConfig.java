package solaire.upx.projeto_upx_solarie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desativa proteção CSRF
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Libera tudo
                )
                .httpBasic(Customizer.withDefaults()); // Habilita HTTP básico (opcional)

        return http.build();
    }
}
