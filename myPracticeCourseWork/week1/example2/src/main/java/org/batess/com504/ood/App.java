package org.batess.com504.ood;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {


        // this is a local comment which doesnt go in javadoc
        App myTestClassLog4j = new App();
        myTestClassLog4j.writeAboutMe();

    }

    /**
     * This is a javadoc comment on writeAboutMe
     *
     */
    public void writeAboutMe() {
        System.out.println("This is a system out message from : "+ App.class);
        logger.error("This is a log4j message from : "+ App.class);
    }

}
