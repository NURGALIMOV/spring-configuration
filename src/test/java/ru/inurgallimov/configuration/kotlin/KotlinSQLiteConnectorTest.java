package ru.inurgallimov.configuration.kotlin;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class KotlinSQLiteConnectorTest {

    @Test
    void kotlinConfig() {
        GenericApplicationContext context = new GenericApplicationContext();
        BeansKt.getBeans().initialize(context);
        context.refresh();
        KotlinSQLiteConnector connector = context.getBean(KotlinSQLiteConnector.class);
        assertNotNull(connector.getDs());
        assertEquals("app", connector.getLogin());
        assertEquals("pass", connector.getPassword());
    }

}