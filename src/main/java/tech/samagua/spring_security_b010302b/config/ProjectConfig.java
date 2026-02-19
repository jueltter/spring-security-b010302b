package tech.samagua.spring_security_b010302b.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class ProjectConfig {

    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {
        String usersByUsernameQuery = "select username, password, enabled from users where username = ?";
        String authoritiesByUsernameQuery = "select username, authority from authorities where username = ?";

        var userDetailsService = new JdbcUserDetailsManager(dataSource);
        userDetailsService.setUsersByUsernameQuery(usersByUsernameQuery);
        userDetailsService.setAuthoritiesByUsernameQuery(authoritiesByUsernameQuery);

        return userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
