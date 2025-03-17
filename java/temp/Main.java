import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Jack");
        students.put(2, "Chris");
        students.put(3, "Chris"); 
        students.put(2, "Jon");

        for(Integer key : students.keySet()){
        System.out.println(students.get(key));
    }
}
}
