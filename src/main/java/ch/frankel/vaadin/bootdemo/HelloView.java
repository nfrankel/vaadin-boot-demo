package ch.frankel.vaadin.bootdemo;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;

import javax.annotation.PostConstruct;

@SpringView(name = "")
public class HelloView extends Label implements View {

    private final HelloService helloService;

    public HelloView(HelloService helloService) {
        this.helloService = helloService;
    }

    @PostConstruct
    void afterPropertiesSet() {
        setValue(helloService.sayHelloTo("Silicon Valley!"));
    }
}
