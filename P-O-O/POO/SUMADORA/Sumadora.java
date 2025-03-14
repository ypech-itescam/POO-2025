public class Sumadora {

    public String suma1(int i, int j){
        return "la suma es:" + (i + j);
      }
      public String suma2(char i, char j){
        return " la suma es:" + i + j;
      }
      public String suma3(double i, double j){
        return " la suma es:" + (i + j);
      }
        public String suma4(double i, int j){
        return " la suma es:" +(i + j);
      
     }
     
     public static void main(String[] args){
        Sumadora sumadora= new Sumadora();

        System.out.println(sumadora.suma1(1,2));
        System.out.println(sumadora.suma2('A','B'));
        System.out.println(sumadora.suma3(24.5,12.9));
        System.out.println(sumadora.suma4(23.02,5));
    }
    
}