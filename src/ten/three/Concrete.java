package ten.three;

public class Concrete extends Abstact{

    int j;


    public Concrete(int i,int j) {
        super(i);
        //TODO Auto-generated constructor stub
        this.j=j;
    }

    @Override
    void show() {
        // TODO Auto-generated method stub
       System.out.println("i = "+i+" j = "+j);
    }
    

}
