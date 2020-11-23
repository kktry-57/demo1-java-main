package tw.com.carrefour.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tw.com.carrefour.utilities.Bean.HelloBean;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		
		HelloBean h = new HelloBean();
		System.out.println(h.hello());
		
		
	}

}
