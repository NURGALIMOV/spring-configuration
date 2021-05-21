package ru.inurgallimov.configuration.javaconfig;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JavaSQLiteConnectorTest {

    @Test
    void annotationConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        JavaSQLiteConnector connector = context.getBean(JavaSQLiteConnector.class);
        assertNotNull(connector.getDs());
        assertEquals("app", connector.getLogin());
        assertEquals("pass", connector.getPassword());
    }

}