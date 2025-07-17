package xyz.linuwux.curriculo_gamer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(servers = { @Server(url="/", description = "Default server url") } )

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//try {
			SpringApplication.run(Application.class, args);
		//}
		//catch (Throwable t) {
		//	t.printStackTrace();
		//}
	}

}
