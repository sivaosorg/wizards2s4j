package org.wizards2s4j.config.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix = "spring.wizards2s4j")
public class Wizards2s4jProperties implements Serializable {
    public Wizards2s4jProperties() {
        super();
    }
}
