package SUMADORA;

public class Sumadora {
    
    public String suma1(int i, int j){
        return ("la suma es :" + (i + j));
    }

    public String suma2(char i, char j){
        return"la suma es : " + i + j;
    }
    
    public String suma3(double i, double j){
        return("la suma es : " + (i + j));
    }

    public String suma4(double i, int j){
        return("la suma es :" + (i + j));
    }

public static void main(String[] args) {
        
        Sumadora sumadora = new Sumadora();
        System.out.println(sumadora.suma1(5, 18));  
        System.out.println(sumadora.suma2('a', 'b'));  
        System.out.println(sumadora.suma3(3.5, 7.2));  
        System.out.println(sumadora.suma4(5.5, 3));  
    }

}
