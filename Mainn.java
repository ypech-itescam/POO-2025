public class Mainn {
    public static void main(String[] args) {
        Sumadora T=new Sumadora();
        System.out.println(T.suma(1,1));
        Sumadora S=new Sumadora();
        System.out.println(S.suma('d','f'));
        Sumadora P=new Sumadora();
        System.out.println(P.suma(2.00,1.50));
        Sumadora Y=new Sumadora();
        System.out.println(Y.suma('d',1));
        Sumadora O=new Sumadora();
        System.out.println(O.suma(2.00,1));

    }
    
}