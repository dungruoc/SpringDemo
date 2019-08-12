package org.dungmd.javaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;
	private float radius;
	private ApplicationEventPublisher applicationEventPublisher;

	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
        System.out.println(this.messageSource.getMessage("drawing.circle", new Object [] {this.getCenter().toString(), this.getRadius()}, null, null));
        DrawEvent event = new DrawEvent(this);
        applicationEventPublisher.publishEvent(event);
	}

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.applicationEventPublisher = publisher;
    }

}
