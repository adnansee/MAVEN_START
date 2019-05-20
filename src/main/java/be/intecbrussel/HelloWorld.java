package be.intecbrussel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class HelloWorld {
    private static Logger logger = LogManager.getLogger();

    public String sayHello() {
        logger.debug("HELLO WORLD");
        return "HELLO WORLD";
    }


    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
hw.sayHello();

    }
}
