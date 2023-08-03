public class Main {
    public static void main (String[] args) {
        double x = Math.sqrt (108);
        double y = Math.sqrt (x);
        double z = -55.4;
        z = Math.abs (z);
        double a = 7;
        double a_cube = Math.pow (a, 3);
        double s = Math.floor (2.7);
        double s1 = Math.ceil (2.7);
        double res = Math.signum (-5);
        double rek = Math.sin (Math.PI /3);
        double w = Math.abs (Math.sqrt(81) - Math.pow(2,4));
        System.out.println(x+" "+y+" "+z+" "+a_cube+" "+s+" "+s1+" "+res+" "+rek+" "+w);
    }
}