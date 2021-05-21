package ru.inurgallimov.configuration.groovy;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericGroovyApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GroovySQLiteConnectorTest {

    @Test
    void groovyConfig() {
        GenericGroovyApplicationContext context = new GenericGroovyApplicationContext("context.groovy");
        GroovySQLiteConnector connector = context.getBean("connector", GroovySQLiteConnector.class);
        assertNotNull(connector.getDs());
        assertEquals("app", connector.getLogin());
        assertEquals("pass", connector.getPassword());
    }

}