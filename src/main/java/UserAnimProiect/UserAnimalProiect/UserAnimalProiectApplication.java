package UserAnimProiect.UserAnimalProiect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

@SpringBootApplication
public class UserAnimalProiectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAnimalProiectApplication.class, args);
	}


}

