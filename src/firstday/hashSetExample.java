package firstday;

import java.util.HashSet;

public class hashSetExample {
    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<>();
        hs.add("USA");
        hs.add("UK");
        hs.add("India");
        hs.add("India");
        System.out.println(hs);

        System.out.println(hs.remove("UK"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size())\ ;

    }
}
