package ru.inurgallimov.configuration.xml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class XMLSQLiteConnectorTest {

    @Test
    void xmlConfig() {
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("context.xml");
        context.refresh();
        XMLSQLiteConnector connector = context.getBean("connector", XMLSQLiteConnector.class);
        assertNotNull(connector.getDs());
        assertEquals("app", connector.getLogin());
        assertEquals("pass", connector.getPassword());
    }

}