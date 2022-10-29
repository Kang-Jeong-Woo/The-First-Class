package com.first.boiler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class Config {
    private DataSource dataSource;

    @Autowired
    public Config(DataSource dataSource){this.dataSource = dataSource;}

}
