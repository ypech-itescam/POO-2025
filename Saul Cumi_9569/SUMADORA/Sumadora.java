package Otros;

    public class Sumadora {



        //METODOS
        public String sum1 (int a, int b){
            return ("La sumatoria es : " + (a + b));

        }
        
        public String sum2 ( char a, char b){
            return    "La sumatoria es : " +  a + b ;
        }


        public String sum3 (double a, double b){
            return ("La sumatoria es : " + (a + b));
        }


        public String sum4 (double a, int b){
            return ("La sumatoria es : " + ( a + b));
        }




        //METODO MAIN
        public static void main(String[] args) {

        //INSTANCIA DE LA SUMADORA
        Sumadora suma = new Sumadora();
        
        
        System.out.println(suma.sum1(5, 5));
        System.out.println(suma.sum2('d', 'j'));
        System.out.println(suma.sum3(1.5, 1.5));
        System.out.println(suma.sum4(2.5, 5));
        

        }
    }
