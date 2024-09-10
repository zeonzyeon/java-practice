package ch08.zoo;

import ch08.zoo2.Lion;
import ch08.zoo2.Tiger;
import ch08.zoo2.Zookeeper;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Lion lion = new Lion();
        zookeeper.feed(lion);

        Tiger tiger = new Tiger();
        zookeeper.feed(tiger);
    }
}
