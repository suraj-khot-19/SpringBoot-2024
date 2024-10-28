package com.suraj.spring_boot_Course;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//define it as ConfigurationProperties
@ConfigurationProperties(prefix = "currency-service")
@Component //hey jpa create an instance
public class CurrencyConfiguration {

    //properties will be like =>
    /*
    currency-service.url
    currency-service.username
    currency-service.key

    because we assigned prefix as "currency-service" in annotation
     */
    private String url;
    private String username;
    private String key;


    //getters and setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    //0 arg constructor
    public CurrencyConfiguration() {
    }


    //arg constructor
    public CurrencyConfiguration(String url, String username, String key) {
        this.url = url;
        this.username = username;
        this.key = key;
    }
}
