package LinkListEX;



import java.util.*;

public class Ex3 {

    public static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {

        if(op1.size()>op2.size()){
            LinkedList<Integer> aux = op1;
            op1=op2;
            op2=aux;
        }
        ListIterator<Integer> it1 = op1.listIterator(op1.size());
        ListIterator<Integer> it2 = op2.listIterator(op2.size());
        LinkedList<Integer> result = new LinkedList<>();

        int val1, val2, val3;
        int reminder = 0;

        while(it1.hasPrevious() && it2.hasPrevious()){

            val1 = it1.previous();
            val2 = it2.previous();

            val3 = val1 + val2;


            result.addFirst(val3%10+reminder);
            reminder = val3/10;

        }

            while (it2.hasPrevious()) {

                result.addFirst(it2.previous() + reminder);


        }
        if(reminder!= 0){
            result.addFirst(reminder);
        }
        return result;


    }
    public static void main(String[] args) {
    LinkedList<Integer> op1 = new LinkedList<>();
    LinkedList<Integer> op2 = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
        System.out.println("Introdu numarul de cifre pentru primul operator:");
        int nr1 = sc.nextInt();
        System.out.println("Introdu cifrele pentru primul operator");
        for(int i = 0; i < nr1; i++){
            op1.add(sc.nextInt());
        }
        System.out.println("Introdu numarul de cifre pentru al doilea operator:");
        int nr2 = sc.nextInt();
        System.out.println("Introdu cifrele pentru al doilea operator");
        for(int i = 0; i < nr2;i++){
            op2.add(sc.nextInt());
        }

        System.out.println("Suma celor 2 operatori este: "+sum(op1,op2));

     }
}


