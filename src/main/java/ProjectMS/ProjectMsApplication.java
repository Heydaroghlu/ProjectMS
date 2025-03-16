package ProjectMS;

import ProjectMS.config.security.JWTHelper;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

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
		String token=JWTHelper.generateToken("IsaHeydaroghlu");
		System.out.println(token);
		System.out.println(JWTHelper.extractUsername(token));

		System.out.println(JWTHelper.isTokenExpired(token));




	}
	@KafkaListener(topics = "my-topic", groupId = "my-group")
	public static void Listner(String message)
	{
		System.out.println(message);
	}

}
