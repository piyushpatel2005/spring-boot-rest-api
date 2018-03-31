package io.piyushpatel2005.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "A spring framework description"),
				new Topic("hiebrnate", "Hibernate Framework", "A Hibernate framework description"),
				new Topic("jsf", "JSF Framework", "A JSF framework description")
				);
	}
}