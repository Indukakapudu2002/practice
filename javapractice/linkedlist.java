import java.util.*;
public class linkedlist
{
    public static void main(String args[])
    {
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(4);
        l.add(2);
        l.add(0);
        l.remove("0");
        l.get(0);
        l.set(1,90);
        System.out.println("before sort");
        System.out.println(l);
        Collections.sort(l);
        System.out.println("after sort");
        System.out.println(l);
        System.out.println("before shuffle");
        System.out.println(l);
        Collections.shuffle(l);
        System.out.println("after shuffle");
        System.out.println(l);
    }
}
