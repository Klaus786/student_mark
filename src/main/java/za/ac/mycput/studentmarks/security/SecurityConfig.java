//package za.ac.mycput.studentmarks.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.Collections;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig  extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("userA")
//                .password("{noop}@test123")
//                .roles("admin")
//                .and()
//                .withUser("userB")
//                .password("{noop}").roles("client");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http
//                .csrf().disable()
//                .authorizeRequests().antMatchers(HttpMethod.POST, "/student/create").hasRole("client")
//                .antMatchers(HttpMethod.DELETE, "/student/delete/**").hasRole("admin")
//                .antMatchers(HttpMethod.GET, "/student/**", "**/student/list").hasRole("admin")
//                .antMatchers(HttpMethod.POST, "/student/**").hasRole("admin")
//                .and()
//                .formLogin().disable()
//                .httpBasic();
//    }
//    @Bean
//    CorsConfigurationSource corsConfigurationSource() {
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
//        configuration.setAllowedOrigins(Collections.singletonList("*"));
//        configuration.addAllowedMethod(HttpMethod.GET);
//        configuration.addAllowedMethod(HttpMethod.POST);
//        configuration.addAllowedMethod(HttpMethod.OPTIONS);
//
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//
//}}