package ru.inurgallimov.configuration.kotlin;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

@Getter
public class KotlinSQLiteConnector {
    private final String login;
    private final String password;
    private final DataSource ds;

    @Autowired
    public KotlinSQLiteConnector(String login, String password, DataSource ds) {
        this.login = login;
        this.password = password;
        this.ds = ds;
    }
}
