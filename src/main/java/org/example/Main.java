package org.example;

import java.util.Objects;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    /* Canonical Constructor */
    record Human(String fname){

//        Human(String fname){
//            Objects.requireNonNull(fname, "fname is null");
//            this.fname = fname.toUpperCase();
//        }
        /* Compact Constructor */
        Human{
            Objects.requireNonNull(fname,"First Name Should not be null");
            if (fname.length()<3){
                throw new IllegalArgumentException("First Name should have at least 3 characters");
            }
            fname = fname.toUpperCase();
        }
    }
    public static void main(String[] args) {
        var person = new Human("hellos");
        LOGGER.info("Human name: " + person.fname());
    }

}