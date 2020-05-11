package LinkListEX;

import java.util.LinkedList;
import java.util.ListIterator;

public class OrderedList {
    private LinkedList<Town> towns=new LinkedList<>();
    ListIterator<Town> i=towns.listIterator();
    public boolean addInOrder(Town element) {
        i=towns.listIterator();
        while (i.hasNext()) {

            boolean cond=i.next().equals(element);
            if(cond==true) {
                return false;
            }
            i.previous();
            if (i.next().getDistance() > element.getDistance()) {
                i.previous();
                i.add(element);
                return true;
            }
        }
        i.add(element);
        return true;
    }
    public void print(){
        i=towns.listIterator();
        while(i.hasNext()){
            System.out.print(i.next().getTownsName()+" ");
            i.previous();
            System.out.println(i.next().getDistance());
        }
    }
}