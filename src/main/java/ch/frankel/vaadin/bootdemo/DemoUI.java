package ch.frankel.vaadin.bootdemo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
public class DemoUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        Label label = new Label("Hello Silicon Valley!");
        VerticalLayout layout = new VerticalLayout(label);
        layout.setMargin(true);
        layout.setSpacing(true);
        setContent(layout);
    }
}
