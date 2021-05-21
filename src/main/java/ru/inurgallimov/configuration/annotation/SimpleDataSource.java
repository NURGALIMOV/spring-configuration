package ru.inurgallimov.configuration.annotation;

import org.springframework.stereotype.Component;
import org.sqlite.SQLiteDataSource;

@Component
public class SimpleDataSource extends SQLiteDataSource {
}
