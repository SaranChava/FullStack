
public class ReadEmployee {
    public static void main(String args[]) throws EmployeeNotFoundException{
        String s = readDB();
        if(s.isEmpty()){
            throw new EmployeeNotFoundException(s);
        }
    }
    
}
