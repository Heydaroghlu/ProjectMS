package ProjectMS;

import ProjectMS.config.security.JwtUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.HashMap;
import java.util.Hashtable;

@SpringBootApplication
public class ProjectMsApplication {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Hashtable<String, Integer> map2 = new Hashtable<>();

		map.put(null,null);
		map2.put("null",1);
		SpringApplication.run(ProjectMsApplication.class, args);
		String token= JwtUtil.generateToken("IsaHeydaroghlu");
		System.out.println(token);
		System.out.println(JwtUtil.extractUsername(token));

		System.out.println(JwtUtil.isTokenExpired(token));




	}
	@KafkaListener(topics = "my-topic", groupId = "my-group")
	public static void Listner(String message)
	{
		System.out.println(message);
	}

}
