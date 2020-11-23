package tw.com.carrefour.main;
import tw.com.carrefour.utilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		System.out.println(MyClass.hello());
		
	}

}
