package LinkListEX;

public class TestOrderedList {

    public static void main(String[] args) {
        OrderedList towns=new OrderedList();
        Town element;
        element=new Town("Timisoara", 100);
        towns.addInOrder(element);
        element=new Town("Arad", 150);
        towns.addInOrder(element);
        element=new Town("Bucuresti", 0);
        towns.addInOrder(element);
        element=new Town("Ploiesti", 30);
        towns.addInOrder(element);
        towns.print();

    }
}