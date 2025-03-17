package org.example;

import org.example.util.ArithmeticException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> ar = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        Stack<String> st = new Stack<>();
        LinkedList<String> ll = new LinkedList<>();
        ar.add(1);
        hs.add(1);
        st.add("saran");
        ll.add("Nikki");
        ar.remove(0);
        hs.remove(1);
        st.pop();
        ll.remove();

        Map<Integer,String> m = new HashMap<>();

        m.put(1,"Saran");


        File f = new File("/Users/saran/GoaldotIO/FullStack/java/javaRefresh/src/main/java/org/example");
        String[] s = f.list();
        int l=0;
        if (s != null) {
            l = s.length;
        }
        System.out.println(l);
        for(int i=0;i<l;i++){
            System.out.println(s[i]);
            File fi = new File("/Users/saran/GoaldotIO/FullStack/java/javaRefresh/src/main/java/org/example/"+s[i]);
            if(fi.isDirectory()){
                System.out.println(fi);}
        }
        int c = (a,b)-> System.out.println(a+b);
    }
}