package example.design.pattern.behavioral.iterator;

import example.design.pattern.behavioral.iterator.builder.NameRepository;

import java.util.Iterator;

/**
 * Created by 1532082 on 10/17/2016.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = (Iterator) namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
