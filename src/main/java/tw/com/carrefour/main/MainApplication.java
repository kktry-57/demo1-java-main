package tw.com.carrefour.main;


import org.apache.maven.plugin.MojoExecutionException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import tw.com.carrefour.utilities.Bean.WorldBean;
import com.github.liufarui.*;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) throws MojoExecutionException {
		MyMojo m = new MyMojo();
		m.execute();
		// WorldBean h = new WorldBean();
		// System.out.println(h.world());	
		
	}

}
