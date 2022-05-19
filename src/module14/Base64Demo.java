package module14;

import sun.misc.*;
import  java.io.*;
import java.util.Base64;


public class Base64Demo {
    public void foo(){

        byte[] encodedBytes = Base64.getEncoder().encode("Test".getBytes());
        System.out.println("encodedBytes " + new String(encodedBytes));
        byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
        System.out.println("decodedBytes " + new String(decodedBytes));
    }
}
