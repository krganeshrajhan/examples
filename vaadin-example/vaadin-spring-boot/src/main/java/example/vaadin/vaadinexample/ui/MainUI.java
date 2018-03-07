package example.vaadin.vaadinexample.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import example.vaadin.vaadinexample.view.ContactsView;
import example.vaadin.vaadinexample.view.ErrorView;

@SpringUI
@SpringViewDisplay
public class MainUI extends UI implements ViewDisplay {

	static final String APP_ROOT = "/vaadin-web-demo";

	private static final String CONTACTS_VIEW = "Contacts";

	private Panel springViewDisplay;

	private static final long serialVersionUID = 4967383498113318791L;

	@Override
	public void showView(View view) {

		springViewDisplay.setContent((Component) view);

	}

	private Button createNavigationButton(String caption, final String viewName) {
		Button button = new Button(caption);
		button.addStyleName(ValoTheme.BUTTON_SMALL);

		button.addClickListener(event -> getUI().getNavigator().navigateTo(viewName));
		return button;
	}

	@Override
	protected void init(VaadinRequest vaadinRequest) {

		final VerticalLayout root = new VerticalLayout();
		root.setSizeFull();
		setContent(root);

		final CssLayout navigationButtons = new CssLayout();

		navigationButtons.addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
		navigationButtons.addComponent(createNavigationButton(CONTACTS_VIEW, ContactsView.VIEW_NAME));

		root.addComponent(navigationButtons);

		springViewDisplay = new Panel();
		springViewDisplay.setSizeFull();
		root.addComponent(springViewDisplay);
		root.setExpandRatio(springViewDisplay, 1.0f);

		getNavigator().setErrorView(ErrorView.class);
	}
}
