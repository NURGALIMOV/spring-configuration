package ru.inurgallimov.configuration.programmatic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.sql.DataSource;

@RequiredArgsConstructor
@Getter
public class ProgrammaticSQLiteConnector {
    private final String login;
    private final String password;
    private final DataSource ds;
}
