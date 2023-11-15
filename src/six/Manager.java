package six;

public class Manager extends Employee{
  
    protected int bonus;
  public Manager(int rnn,String name,String address,int salary,int bonus) {
        super(rnn,name,address,salary); //  값 전달 
        this.bonus=bonus;
    }

    public int getbonus(){
      return bonus;
     }
  
     public void setbonus(int bonus){
      this.bonus=bonus;
     }

    public void test(){
    System.out.println("이름 = "+super.name);
     System.out.println("월급 ="+super.salary);
     System.out.println("보너스 = " + bonus);
      System.out.println("집 = "+super.address);
  }
}
