package spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 2020/5/23 9:14
 *
 * @author hujiansong
 * @since 1.8
 **/
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext("spring.test.component");


        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
