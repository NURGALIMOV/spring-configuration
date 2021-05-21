package ru.inurgallimov.configuration.groovy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.sql.DataSource;

@Getter
@RequiredArgsConstructor
public class GroovySQLiteConnector {
    private final String login;
    private final String password;
    private final DataSource ds;
}
