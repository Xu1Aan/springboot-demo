package com.pzhu.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    String url;
    String driveClassName;
    String username;
    String password;

}
