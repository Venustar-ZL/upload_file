package com.learn.upload_file.configurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FramConfigurer{

   @Bean
    public WebMvcConfigurer webMvcConfigurer () {
       return new WebMvcConfigurer() {
           @Override
           public void addViewControllers(ViewControllerRegistry registry) {
               registry.addViewController("/file").setViewName("login");
           }
       };
   }

}
