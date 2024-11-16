package com.learn247.vaadin_springboot;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.util.StringUtils;

@Route("/api")
public class MainView1 extends VerticalLayout {

	private final CustomerRepository repo;
	final Grid<Customer> grid;

	public MainView1(CustomerRepository repo) {
		this.repo = repo;
		this.grid = new Grid<>(Customer.class);
		add(grid);
		listCustomers();
	}

	private void listCustomers() {
		grid.setItems(repo.findAll());
	}

}