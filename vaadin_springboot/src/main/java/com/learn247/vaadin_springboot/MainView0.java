package com.learn247.vaadin_springboot;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView0 extends VerticalLayout {

	public MainView0() {
		add(new Button("Click me", e -> Notification.show("Hello, Spring+Vaadin user!")));
	}
}