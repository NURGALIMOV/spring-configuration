package ru.inurgallimov.configuration.kotlin;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.sql.DataSource;

@Getter
@RequiredArgsConstructor
public class KotlinSQLiteConnector {

    private final String login;
    private final String password;
    private final DataSource ds;

}
