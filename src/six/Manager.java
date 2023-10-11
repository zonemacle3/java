package six;

public class Manager extends Employee{
  
    private int bonus;
  public Manager(int rnn,String name,String address,int salary) {
        super(rnn,name,address,salary); //  값 전달 
        this.bonus=0;
    }
    public void test(){
    System.out.println("이름 = "+super.name);
     System.out.println("샐러리 ="+super.salary);
      System.out.println("집 = "+super.address);
  }
}
