import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.sqlite.SQLiteDataSource
import ru.inurgallimov.configuration.groovy.GroovySQLiteConnector

beans {
    propertyPlaceholderConfigurer PropertySourcesPlaceholderConfigurer, {
        location = 'classpath:db.properties'
    }

    dataSource SQLiteDataSource

    connector GroovySQLiteConnector, '${login}', '${password}', ref(dataSource)
}