package ru.inurgallimov.configuration.javaconfig;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Getter
@RequiredArgsConstructor
public class JavaSQLiteConnector {
    private final String login;
    private final String password;
    private final DataSource ds;
}
