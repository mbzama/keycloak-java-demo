package zama.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@ComponentScan({"zama.learning.controller", "zama.learning.service",
		"zama.learning.security"})
@EntityScan("zama.learning.entity")
@EnableJpaRepositories("zama.learning.repository")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class StudentAppApplication {

	public static void main(String[] args) {
		
		/*
		 * BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		 * String password1 = bCryptPasswordEncoder.encode("john123"); String password2
		 * = bCryptPasswordEncoder.encode("sachin123");
		 */
		
		SpringApplication.run(StudentAppApplication.class, args);
	}

}
