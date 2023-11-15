package six;

public class Employee {
    String name;
    String address;
    private int rnn;
    protected int salary;

    public Employee(int rnn,String name,String address,int salary){
        this.rnn=rnn;
        this.name=name;
        this.address=address;
        this.salary=salary;
    }
 
   public int getrnn(){
    return rnn;
   }

   public void setrnn(int rnn){
    this.rnn=rnn;
   }
   
    public void rnn(){
        System.out.println(rnn); 
    }
}
