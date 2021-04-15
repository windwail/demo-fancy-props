package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static java.lang.String.format;

@Component
public class MyCommandRunner implements CommandLineRunner {

    @Autowired
    private FieldReplacingProperties props;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Заменяю поля");

        for(String field: props.getMap().keySet()) {
            FieldReplacingInfo info = props.getMap().get(field);
            System.out.println(format("Заменяю поле %s из таблицы %s на поле %s", field, info.table, info.replaceTo));
        }


    }
}
