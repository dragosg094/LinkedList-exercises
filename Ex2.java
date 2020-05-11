package LinkListEX;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ex2 {
    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list){
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            Integer val=it.next();
            while (it.hasNext() && it.next()==val) {
                it.remove();
            }
            if(it.hasNext()==true)
                it.previous();
        }
        return list;
    }
    public static LinkedList<Integer> removeDuplicates2(LinkedList<Integer> list){

        ListIterator<Integer> it= list.listIterator();
        int val = it.next();
        while(it.hasNext()){
            boolean cond=true;

            while (it.hasNext() ) {
                int aux = it.next();
                if (val == aux) {
                    it.previous();
                    it.remove();
                    cond = false;
                } else if (!cond){
                    it.previous();
                    break;
                }
                val = aux;
            }
            if(cond==false){
                it.previous();
                it.remove();
            }
        }
        return list;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Adauga 5 elemente noi in lista");
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        list=removeDuplicates(list);
        System.out.println(list);

        System.out.println("Adauga 5 elemente noi in lista");
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        list=removeDuplicates2(list);
        System.out.println(list);
    }
}
