package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBox strBox = new StringBox("BBC");
        System.out.println(strBox.getElement());
        IntBox intBox = new IntBox(-3);
        System.out.println(intBox.getElement());
        UnicornBox uniBox = new UnicornBox(new Unicorn("Black", true));
        System.out.println(uniBox.getElement());
        ObjectBox objectBox = new ObjectBox(new Unicorn("Black", true));
        System.out.println(objectBox.getObject());

        Box<String> box = new Box<String>("This is String Box");
        System.out.println(box.getElement());
        Box<Double> doubleBox = new Box<>(122.56);

        Box<Unicorn> unicornBox = new Box<>(new Unicorn("white", true));
        System.out.println(unicornBox.getElement().getHornColor());

        Box<List<Integer>>box1=new Box<>(new ArrayList<Integer>());
        System.out.println(box1.getElement().size());

    }
}
