package org.example;

import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    record Human(String fname){}
    public static void main(String[] args) {
        var person = new Human("John");
        LOGGER.info("Human name: " + person.fname());
    }
}