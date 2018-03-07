package example.vaadin.vaadinexample.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

@UIScope
@SpringView(name = DefaultView.VIEW_NAME)
public class DefaultView  extends VerticalLayout implements View {

	private static final long serialVersionUID = -3903205444585313680L;
	public static final String VIEW_NAME = ""; //default

	@PostConstruct
	void init() {
		addComponent(new Label("Welcome to Vaadin Web Application Demo!!"));
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
		// This view is constructed in the init() method()
	}
}
