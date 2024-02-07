package se.lexicon;

import se.lexicon.data_access.ComponentScanConfig;
import se.lexicon.data_access.StudentDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.util.UserInputService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

        UserInputService userInputService =context.getBean(UserInputService.class);


    }
}