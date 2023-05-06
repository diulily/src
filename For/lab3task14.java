package For;

public class lab3task14 {
    public static void main(String []args){
        double result =99;
        for(int i=96; i>=3;i=i-3){
            result =i+Math.sqrt(result);
        }
        result=Math.sqrt(result);
        result= Math.round(result*1000000)/1000000.0;
        System.out.println(result);
    }

}
