package pe.edu.tecsup.productosapi.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import pe.edu.tecsup.productosapi.filters.JwtAuthenticationTokenFilter;

public class SpringSecurityConfig {
	
	
}


/*
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
	        .authorizeRequests()
	        .antMatchers("/" , "/**").permitAll()
	        .antMatchers("/auth/login").permitAll()
	        .and().csrf().disable();
        
        http.addFilterBefore(authenticationTokenFilterBean(), 
        		UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public JwtAuthenticationTokenFilter authenticationTokenFilterBean() throws Exception {
        return new JwtAuthenticationTokenFilter("/api/**");
    }

}
*/