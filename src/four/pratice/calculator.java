package four.pratice;

public class calculator {
    int num1;
    double num2;

    calculator(int num1){this.num1 = num1;}
     calculator(double num2){this.num2 = num2;}
   // constructor 선언 
    int getPlus(double num2){return (int)(num1+num2);} 
    int getMinus(double num2){return (int) (num1-num2);}
    int getMulti(double num2){return (int) (num1*num2);}
    double getDiv(double num2){return (double)(num1+num2);}
    double getPer(double num2){return (double)(num1+num2);}
}
