package execute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.HelloWorld;

/**
 * Created by Administrator on 2016/11/17.
 */
public class AopTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld hw = (HelloWorld) ac.getBean("helloWorldImpl");
        hw.doPrint();
        hw.printHelloWorld();
    }
}
