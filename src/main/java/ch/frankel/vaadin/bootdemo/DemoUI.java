package ch.frankel.vaadin.bootdemo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@SpringViewDisplay
public class DemoUI extends UI implements ViewDisplay {

    private VerticalLayout layout;

    @Override
    protected void init(VaadinRequest request) {
        layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSpacing(true);
        Button button = new Button("Display other view");
        button.addClickListener(e -> getUI().getNavigator().navigateTo("another"));
        VerticalLayout root = new VerticalLayout(button, layout);
        setContent(root);
    }

    @Override
    public void showView(View view) {
        layout.removeAllComponents();
        layout.addComponentsAndExpand((Component) view);
    }
}
