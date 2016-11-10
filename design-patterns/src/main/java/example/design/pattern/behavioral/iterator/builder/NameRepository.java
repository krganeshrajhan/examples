package example.design.pattern.behavioral.iterator.builder;

/**
 * Created by 1532082 on 10/17/2016.
 */
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        public boolean hasNext() {

            if(index < names.length){
                return true;
            }
            return false;
        }

        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
