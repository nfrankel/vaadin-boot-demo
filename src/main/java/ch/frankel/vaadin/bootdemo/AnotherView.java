package ch.frankel.vaadin.bootdemo;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;

import javax.annotation.PostConstruct;

@SpringView
public class AnotherView extends Label implements View {

    @PostConstruct
    void afterPropertiesSet() {
        setValue("Another view");
    }
}
