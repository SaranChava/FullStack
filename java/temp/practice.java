import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.math.*;

public class practice{

    public static void main(String[] args) throws Exception{
        int[] ls = {1,9,7,4,5,8,2};
        List<Integer> phn1 = List.of(12345,876531);
        List<Integer> phn2 = List.of(54321,190876);
        List<Integer> phn3 = List.of(32145,678965);
        Person p1 = new Person("Sarah", phn1);
        Person p2 = new Person("Skye", phn2);
        Person p3 = new Person("Adam", phn3);

        List<Person> persons = List.of(p1,p2,p3);

        persons.stream()
        .filter(p->p.name.startsWith("S"))
        .flatMap(p->p.phn.stream())
        .forEach(System.out::print);;

        System.out.println(persons.stream()
            .filter(p->p.name.startsWith("S"))
            .map(p->p.phn)
            .collect(Collectors.toList()));

        persons.stream()
            .sorted(Comparator.comparing(p->p.getPhn().isEmpty()?Integer.MAX_VALUE:p.getPhn().get(0)))
            .map(p->p.name)
            .forEach(System.out::println);

        System.out.println(persons.stream()
            .filter(p->p.name.startsWith("K"))
            .findFirst());

        System.out.println(persons.stream()
            .map(p->p.name)
            .reduce("",(a,b)->a.isEmpty()?b:a+" "+b));


        IntStream.rangeClosed(1, 100)
            .mapToObj(a->{
                if(a%3==0 && a%5==0){return "FizzBuzz ";}
                else if(a%3==0){
                    return "Fizz ";
                }
                else if(a%5==0){
                    return "Buzz ";
                }
                else{
                    return String.valueOf(a)+" ";
                }
            })
            .forEach(System.out::print);

        String a = "postman";

        System.out.println(a.chars()
        .mapToObj(c -> (char)c)
        .reduce("",(x,b)->b+x,(o,p)->p+o));
            

        int val = a.compareTo(a.chars().mapToObj(ch->(char)ch).reduce("",(s,c)->c+s,(s1,s2)->s2+s1));
        if(val==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Pal");
        }

        System.out.println();
        int[] sumLargestSubArray = {1,2,-3,4,5,6,-15,8,2};

        //max,currentSum,flag
        int[] result = Arrays.stream(sumLargestSubArray)
            .boxed()
            .reduce(
                new int[]{0, 0, 1},
                (s, c) -> {
                    if (s[1] + c <= 0) {
                        if (s[0] < s[1]) {
                            s[0] = s[1];
                        }
                        s[1] = 0;
                    } else {
                        s[1] += c;
                        if (s[1] > s[0]) {
                            s[0] = s[1];
                        }
                    }
                    return s;
                },
                (arr1, arr2) -> arr1
        
            );

        System.out.println(Arrays.toString(result));


        int[] missNumList = {1,2,3,4,5,6,7,8,9};
        int missNumListSum = ((missNumList.length+2)*(missNumList.length+1))/2;
        System.out.println(missNumListSum+ " " +(missNumListSum - Arrays.stream(missNumList)
            .sum()));

        Stream.iterate(new long[]{0,1}, f->new long[]{f[1],f[0]+f[1]})
            .limit(10)
            .map(i->i[0])
            .forEach(System.out::print);

        

        
    }

    public static void fibonacciItr(int a){
        List<Integer> fibSeries = new ArrayList<>(List.of(1,1));
        int num1=1,num2=1;
        a=a-2;
        while(a>0){
            int temp = num1+num2;
            num1=num2;
            num2 = temp;
            fibSeries.add(temp);
            a--;
        }
        System.out.println(fibSeries);
    }

    public static void fibonacciRec(int k){
        List<Integer> ls = fibonacciRecSupport(1,1,k-2,new ArrayList<>(List.of(1,1)));
        for(Integer i : ls){
            System.out.println(i);
        }
    }

    public static List<Integer> fibonacciRecSupport(int num1, int num2, int k, List<Integer> ls){
        if(k!=0){
            int temp = num1+num2;
            num1=num2;
            num2 = temp;
            ls.add(temp);
            k--;
            fibonacciRecSupport(num1, num2, k, ls);
        }

        return ls;
    }

    public void mostFreqNum(){
        ArrayList<Integer> ar = new ArrayList<Integer>(List.of(1,2,3,3,4,5,6,6,2,2));

        HashMap<Integer,Integer> hm = new HashMap<>();

        int freq=0,maxi = 0;

        for(int i=0;i<ar.size();i++){
            
            int temp = ar.get(i);
            //System.out.println(temp);
            if(hm.containsKey(temp)){
                hm.put(temp, hm.get(temp)+1);
            }
            else{
                hm.put(temp, 1);
            }
        }
        
        System.out.println(hm);
        int maxf=0,maxe=0;
        for(Entry<Integer,Integer> h: hm.entrySet()){
            if(h.getValue()>maxf){
                maxe = h.getKey();
                maxf=h.getValue();
            }
        }
        System.out.println(maxe + " " + maxf);
    }

    public static void hr1Multiples(int n){
        for(int i = 1; i<=10;i++){
            System.out.println(n+"x"+i+" = "+n*i);
        }
    }

    public static void hr2Multiples(int ht, int br) throws Exception{
        if(ht<=0 || br <=0){
            throw new Exception("Breadth and height must be positive");
        }
        System.out.println("Area of the parellelogram : "+br*ht);
    }

    public static String hr3ReverseAString(String s){
        char[] c = new char[s.length()];
        int k = s.length()-1;
        for(char i : s.toCharArray()){
            c[k]=i;
            k--;
        }
        System.out.println(new String(c));
        return new String(c);
    }

    public static String reverseAStringRec(String s){
        if(s.isEmpty()){
            return "";
        }
        return reverseAStringRec(s.substring(1))+s.charAt(0);
    }

    public static void reverseAStringCol(String s){
        List<char[]> cList = List.of(s.toCharArray());
        //[[p,o,s,t]]
        System.out.println(cList);
        Collections.reverse(cList);
        System.out.println(cList.toString());
    }

    class Mycalculator{

        static long power(int n, int p) throws Exception{
            long res=0;
            if(n<0 || p<0){
                throw new Exception("n or p should not be negative");
            }
            else if(n==0 || p==0){
                throw new Exception("n and p should not be zero");
            }
            else{
                res = (long)Math.pow(n,p);
            }
            return res;
        }
    }

    public static void fizzBuzz(){
        int i = 1;
        while(i<=100){
            if(i%3==0){
                if(i%5==0){
                    System.out.println("FizzBuzz");
                }
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
            i++;
        }
    }

    public static void palindromeCheck(String s){
        if(s.compareTo(hr3ReverseAString(s))==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean palindromeCheckRec(String s){
        int strLen = s.length();
        if(s.isEmpty() || strLen==1){
            return true;
        }
        if(s.charAt(0)!=s.charAt(strLen-1)){
            return false;
        }
        else{
            if(strLen==2){
                return true;
            }
            char[] st = s.toCharArray();
            return palindromeCheckRec(new String(st,1,strLen-2));
        }
    }

    public static void palindromeCheckCollections(String s){
        List<char[]> c = Arrays.asList(s.toCharArray());
        Collections.reverse(c);
        String revString = c.toString();
        System.out.println(s.compareTo(revString));
    }

    public static void selectionSort(ArrayList<Integer> ls){
        int len = ls.size();
        for(int i =0;i<len;i++){
            int minEle = ls.get(i);
            int minEleLoc = i;
            for(int j = i+1;j<len-1;j++){
                int temp = ls.get(j);
                if(minEle>temp){
                    minEle = temp;
                    minEleLoc = j;
                }
            }
            ls.add(minEleLoc, ls.get(i));
            ls.add(i, minEle);
            System.out.println(ls);
        }
    }

    public static void missingNumber(int n,int[] ar){
        int sum = (n*(n+1))/2;

        int mSum=0;
        for(int i : ar){
            mSum+=i;
        }
        System.out.println(sum-mSum);
    }

    public static void bubbleSort(int[] ls){
        int len = ls.length;
        for(int i=0;i<len-1; i++){
            boolean swapped = false;
            for(int j=0;j<len-i-1;j++){
                if(ls[j]>ls[j+1]){
                    int temp = ls[j];
                    ls[j] = ls[j+1];
                    ls[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            } 
        }
        for(int i=0;i<len;i++){
            System.out.println(ls[i]);
        }
    }

    public static void insertionSort(int[] ls){

        ArrayList<Integer> aList = new ArrayList<>();

        int len = ls.length;

        for(int i = 0; i<len;i++){
            aList.add(ls[i]);
        }

        for(int i =1;i<len;i++){
            if(aList.get(i-1)>aList.get(i)){
                int j = i-1;
                while(j>=0){
                    if(aList.get(j)<aList.get(i)){
                        //System.out.println(aList);
                        aList.add(j+1, aList.get(i));
                        //System.out.println(aList);
                        aList.remove(i+1);
                        break;
                    }
                    j--;
                }
            }
        }

        System.out.println(aList);
    }  
}


class Person{

    String name;

    List<Integer> phn;

    public Person(String name, List<Integer> phn){
        this.name = name;
        this.phn = phn;
    }

    List<Integer> getPhn(){
        return this.phn;
    }
}

