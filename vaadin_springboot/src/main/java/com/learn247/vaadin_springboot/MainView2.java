package com.learn247.vaadin_springboot;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import org.springframework.util.StringUtils;

@Route("/api/filter")
public class MainView2 extends VerticalLayout {

    private final CustomerRepository repo;
    final Grid<Customer> grid;

    public MainView2(CustomerRepository repo) {
        this.repo = repo;
        this.grid = new Grid<>(Customer.class);
        add(grid);
        TextField filter = new TextField();
        filter.setPlaceholder("Filter by last name");
        filter.setValueChangeMode(ValueChangeMode.LAZY);
        filter.addValueChangeListener(e -> listCustomers(e.getValue()));
        add(filter, grid);
    }

    private void listCustomers(String filterText) {
        if (StringUtils.hasText(filterText)) {
            grid.setItems(repo.findByLastNameStartsWithIgnoreCase(filterText));
        } else {
            grid.setItems(repo.findAll());
        }
    }

}