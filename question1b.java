class interest{//defining class
    public static double amount(double p, double r, double t){
        return p*r*t;
    }
}
public class question1b{
    public static void main(String [] args){
        interest myinterest= new interest();
        double result= myinterest.amount(100000, 0.05, 5);
        System.out.println(+result);
    }
}
