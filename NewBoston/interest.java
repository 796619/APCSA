public class interest{
    public static void main(){
        double amount;
        double principal = 100000;
        double rate = .01;
        for(int day=1;day<=20;day++){
            amount=principal*Math.pow(1+rate,day);
            System.out.println(day + " " + amount);
        }
    }
}    