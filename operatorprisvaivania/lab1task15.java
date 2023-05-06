package operatorprisvaivania;

public class lab1task15 {
    public static void main (String []args){
        int a=3,b=4,c=5;
        double La=Math.sqrt(b*c*(Math.pow((b+c),2)-a*a))/(b+c);
        double Lb=Math.sqrt(a*c*(Math.pow((a+c),2)-b*b))/(a+c);
        double Lc = Math.sqrt(b*a*(Math.pow((b+a),2)-c*c))/(b+a);

        System.out.println(La);
        System.out.println(Lb);
        System.out.println(Lc);

    }
}
