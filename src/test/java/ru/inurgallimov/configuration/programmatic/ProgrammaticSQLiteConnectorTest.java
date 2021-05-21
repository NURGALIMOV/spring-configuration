package ru.inurgallimov.configuration.programmatic;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericApplicationContext;
import org.sqlite.SQLiteDataSource;

import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProgrammaticSQLiteConnectorTest {

    @Test
    void programmaticConfig() throws IOException {
        GenericApplicationContext context = new GenericApplicationContext();
        Properties properties = new Properties();
        properties.load(ProgrammaticSQLiteConnector.class.getClassLoader()
                .getResourceAsStream("db.properties"));
        context.registerBean(SQLiteDataSource.class);
        context.registerBean(ProgrammaticSQLiteConnector.class,
                () -> new ProgrammaticSQLiteConnector(
                        properties.getProperty("login"),
                        properties.getProperty("password"),
                        context.getBean(SQLiteDataSource.class)));
        context.refresh();
        ProgrammaticSQLiteConnector connector = context.getBean(ProgrammaticSQLiteConnector.class);
        assertNotNull(connector.getDs());
        assertEquals("app", connector.getLogin());
        assertEquals("pass", connector.getPassword());
    }

}