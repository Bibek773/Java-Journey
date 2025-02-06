public class calculation{
    public static void main(String[] args){
        double x = 3.14;
        double y = -25;

        //find greater number
        double a = Math.max(x, y);
        System.out.println(a);

        //find smaller number
        double b = Math.min(x, y);
        System.out.println(b);

        // absolute value of y
        double c = Math.abs(y);
        System.out.println(c);

        //square root of y
        double d = Math.sqrt(25);
        System.out.println(d);

        //3.14= 3.0
        double e = Math.round(x);
        System.out.println(e);

        //3.14= 4.0
        double f = Math.ceil(x);
        System.out.println(f);

        //3.14= 3.0
        double g = Math.floor(x);
        System.out.println(g);
    }
}