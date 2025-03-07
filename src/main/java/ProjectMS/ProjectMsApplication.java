package ProjectMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

@SpringBootApplication
public class ProjectMsApplication {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Hashtable<String, Integer> map2 = new Hashtable<>();

		map.put(null,null);
		map2.put("null",1);
		SpringApplication.run(ProjectMsApplication.class, args);

	}

}
