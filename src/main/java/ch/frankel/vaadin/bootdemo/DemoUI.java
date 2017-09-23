package ch.frankel.vaadin.bootdemo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
public class DemoUI extends UI {

    @Autowired
    private HelloService helloService;

    @Override
    protected void init(VaadinRequest request) {
        Label label = new Label(helloService.sayHelloTo("Silicon Valley!"));
        VerticalLayout layout = new VerticalLayout(label);
        layout.setMargin(true);
        layout.setSpacing(true);
        setContent(layout);
    }
}
