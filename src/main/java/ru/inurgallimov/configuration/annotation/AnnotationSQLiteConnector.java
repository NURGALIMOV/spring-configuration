package ru.inurgallimov.configuration.annotation;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Getter
@PropertySource("classpath:db.properties")
public class AnnotationSQLiteConnector {
    private String login;
    private String password;
    private DataSource ds;

    @Autowired
    public AnnotationSQLiteConnector(@Value("${login}") String login, @Value("${password}") String password,  DataSource ds) {
        this.ds = ds;
        this.login = login;
        this.password = password;
    }

}
