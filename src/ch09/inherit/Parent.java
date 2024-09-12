package ch09.inherit;

import java.io.FileNotFoundException;

public abstract class Parent {
    void method() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
}
