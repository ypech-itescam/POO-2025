public class Sumadora {
    public String suma(int i , int j){
        return "La suma es:" + (i+j);
    }

    public String suma2(char i , char j){
        return "La suma es:" + (i+j);
    }

    public String suma3(double i , double j){
        return "La suma es:" + (i+j);
    }

    public String suma4(double i, int j){
        return "La suma es:" + (i+j);
    }

    public static void main(String[] args){
        Sumadora sumadora = new Sumadora();

        System.out.println(sumadora.suma(46, 74));
        System.out.println(sumadora.suma2('A', 'B'));
        System.out.println(sumadora.suma3(7.2, 2.8));
        System.out.println(sumadora.suma4(5.7, 3));
    }
}