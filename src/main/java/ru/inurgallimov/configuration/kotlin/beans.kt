package ru.inurgallimov.configuration.kotlin

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.context.support.beans
import org.springframework.core.io.DefaultResourceLoader
import org.springframework.core.io.Resource
import org.springframework.core.io.ResourceLoader
import org.sqlite.SQLiteDataSource
import javax.sql.DataSource

val beans = beans {
    bean<ResourceLoader>() {
        DefaultResourceLoader()
    }
    bean<Resource>() {
        ref<ResourceLoader>().getResource("classpath:db.properties")
    }
    bean<PropertySourcesPlaceholderConfigurer>() {
        PropertySourcesPlaceholderConfigurer().apply {
            setLocation(ref<Resource>())
        }
    }
    bean<DataSource>() {
        SQLiteDataSource()
    }
    bean<KotlinSQLiteConnector>() {
        var source = ref<PropertySourcesPlaceholderConfigurer>().appliedPropertySources.get("localProperties")
        KotlinSQLiteConnector(source.getProperty("login") as String?, source.getProperty("password") as String?, ref<DataSource>())
    }
}
