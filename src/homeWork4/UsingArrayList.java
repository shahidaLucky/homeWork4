package homeWork4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by Shahida Lucky on 3/28/2016.
 * ) Design a class which should have an ArrayList to store data from Random
 object.Design an another class to demonstrate the use of HashMap that can stor
 e List of
 data and show how to retrieve data from the Map using Iterator and for
 each loop.

 */
public class UsingArrayList {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        Random r = new Random();
        System.out.println(list.get(r.nextInt(list.size())));
//using for each loop

        for(Integer number:list)
        {
            System.out.println(number);
        }



//using Iterator
        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
