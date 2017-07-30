package org.naren.kadiri;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.support.ManagedMap;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/*@Component
@Service
@Controller*/
@Repository
public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}
	
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Resource(name = "point2")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Inside the triangle");
		//System.out.println("Center point is (" + center.getX() + "," + center.getY() + ")");
		System.out.println(messageSource .getMessage("greeting", null, "Default Greeting", null));
		System.out.println(messageSource .getMessage("Drawing.cricle", null, "Default Greeting", null));
		System.out.println(messageSource .getMessage("Drawing.points", new Object [] {center.getX(), center.getY()}, "Default Greeting", null));
	}

	@PostConstruct
	public void initilize() {
		System.out.println("It's a initialize method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("It's a initialize method");
	}
}
