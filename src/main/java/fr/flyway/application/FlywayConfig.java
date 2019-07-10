package fr.flyway.application;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    Flyway flyway() {

        Flyway flyway = new Flyway();

        flyway.setBaselineOnMigrate(true);

        flyway.setLocations("classpath:db/migration");

        flyway.setDataSource(dataSource);

        flyway.clean();
        flyway.migrate();

        return flyway;
    }
}
