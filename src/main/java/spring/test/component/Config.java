package spring.test.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * 2020/5/23 9:15
 *
 * @author hujiansong
 * @since 1.8
 **/
@ComponentScan("spring.test.component")
//@Configuration
public class Config {
    @Bean
    public A a(){
        return new A(ddmzService());
    }

    @Bean
    public DmzService ddmzService() {
        return new DmzService();
    }

}
