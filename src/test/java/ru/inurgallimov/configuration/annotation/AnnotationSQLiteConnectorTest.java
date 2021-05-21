package ru.inurgallimov.configuration.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationSQLiteConnectorTest {

    @Test
    void annotationConfig() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("ru.inurgallimov.configuration.annotation");
        AnnotationSQLiteConnector connector = context.getBean(AnnotationSQLiteConnector.class);
        assertNotNull(connector.getDs());
        assertEquals("app", connector.getLogin());
        assertEquals("pass", connector.getPassword());
    }

}