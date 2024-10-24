import java.util.*;


public class JavaArraylist {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        l.add(1);
        l.add(9);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(8);
        l.add(9);
        l.add(8);
        System.out.println(l);

        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.remove();
        System.out.println(d);

//        l.reversed();



    }
}
