package se.lexicon.data_access;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "se.lexicon")
public class ComponentScanConfig {

    @Bean
    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}
