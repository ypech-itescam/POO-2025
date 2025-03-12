public class Sumadora{
    public String suma(int i, int j){
        return "La suma es:" + (i + j);
    }

    public String suma2(char A, char B){
        return "La suma es:" + A + B;
    }

    public String suma3(double i, double j){
        return "La suma es:" + (i + j);
    }

    public String suma4(double i, int j){
        return "La suma es:" + (i + j);
    }
    public static void main(String[] args) {
    
        Sumadora sumadora = new Sumadora();
        System.out.println(sumadora.suma(788, 632));       
        System.out.println(sumadora.suma2('A', 'B')); 
        System.out.println(sumadora.suma3(6.8, 8.9)); 
        System.out.println(sumadora.suma4(1.8, 9));
    }
}