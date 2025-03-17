// I/O in Java
// File permissions
// File Writer : FileWriter class, parent class = Reader
// File Reader : FileReader class, parent class = Writer


import java.io.*;
import java.security.PermissionCollection;

public class CoreDay2 {
    public static void main(String[] args) throws IOException {
        FilePermission perm1 = new FilePermission("IOTesting.txt","read");
        PermissionCollection perm = perm1.newPermissionCollection();
        perm.add(perm1);
        FilePermission perm2 = new FilePermission("IOTesting.txt","write");
        perm.add(perm2);

        if(perm.implies(new FilePermission("IOTesting.txt","read,write"))){
            System.out.println("Read and Write Permission Granted");
        }
        else {
            System.out.println("No Read and Write Permission");
        }

        try{
            Writer w = new FileWriter("IOTestingOutput.txt");
            String content = "this is a test without a file in place. Lets see if this gets written to a new file";
            w.write(content);
            w.close();
            System.out.println("Done");
        }
        catch(IOException e){
            e.printStackTrace();
        }

        try{
            Reader r = new FileReader("IOTesting.txt");
            int data = r.read();
            while(data!=-1){
                if((char)data=='\n') {
                    System.out.println();
                }
                else{
                    System.out.print((char) data);
                }
                data = r.read();
            }
            r.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
