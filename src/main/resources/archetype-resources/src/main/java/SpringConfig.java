#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringConfig extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringConfig.class, args);
	}
	
}
