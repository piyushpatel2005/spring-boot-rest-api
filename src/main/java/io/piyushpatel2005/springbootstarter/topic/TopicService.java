package io.piyushpatel2005.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("spring", "Spring Framework", "A spring framework description"),
			new Topic("hibernate", "Hibernate Framework", "A Hibernate framework description"),
			new Topic("jsf", "JSF Framework", "A JSF framework description")
		);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}
}
