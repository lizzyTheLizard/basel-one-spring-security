package ch.baselone.springsecurity.example.flux.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * An application with the most basic security setup, basically none except for adding the
 * library. If no configuration is found, the default configuration from
 * {@link org.springframework.security.config.annotation.web.reactive.WebFluxSecurityConfiguration}
 * is used,configuring basic and form authentication. A user detail service is generated by
 * {@link org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration}
 * with a user named "user" and a random password logged out
 * <p></p>
 * You can set you own username and password with spring.security.user and spring.security.password
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}