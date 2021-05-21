package ru.inurgallimov.configuration.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:db.properties")
public class JavaConfiguration {

  @Value("${login}")
  private String login;
  @Value("${password}")
  private String password;

    @Bean
    public DataSource dataSource() {
        return new SQLiteDataSource();
    }

    @Bean
    public JavaSQLiteConnector translator(DataSource dataSource) {
        return new JavaSQLiteConnector(login, password, dataSource);
    }

}
