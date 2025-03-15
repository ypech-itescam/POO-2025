package Sumadora;
public class Sumadora {
    public String suma(int i, int j){
        return"La suma: " + (i + j);
    }

    public String suma(char i, char j){
        return "La suma: " + i + j;
    }

    public String suma(double i, double j){
        return "La suma: " + (i + j);
    }

    public static String suma(double i, int j){
        return "La suma: " + (i + j);
    }

    public static void main(String[] args) {
        Sumadora s = new Sumadora();
        
        System.out.println(s.suma('A', 'B'));
        System.out.println(s.suma(5, 4));
        System.out.println(s.suma(2, 4));
        System.out.println(s.suma(5, 2));
    }
}










































































































































































