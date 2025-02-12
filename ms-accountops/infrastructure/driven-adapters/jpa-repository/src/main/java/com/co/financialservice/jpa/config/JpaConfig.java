package com.co.financialservice.jpa.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JpaConfig {

    @Bean
    public HikariDataSource hikariDataSource(Environment env) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(env.getProperty("api.datasource.url"));
        config.setUsername(env.getProperty("api.datasource.username"));
        config.setPassword(env.getProperty("api.datasource.password"));
        return new HikariDataSource(config);
    }
    @Bean
    public JdbcTemplate jdbcTemplate(HikariDataSource hikariDataSource) {
        return new JdbcTemplate(hikariDataSource);
    }


}
