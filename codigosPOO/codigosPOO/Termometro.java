public class Termometro {
    public String nombre;
    private Temperatura temperatura;

    public Termometro(){
        this.temperatura = new Temperatura(39,"celcius");
    }
    
    public void mostrarTemp(){
        System.out.println("La temperatura es "+temperatura.getTemp()+" "+temperatura.getCelciusCambio());
    }

    public void cambioFarengei(){
        int tempFarengei = ((temperatura.getTemp()*9/5)+32);
        temperatura.setTemp(tempFarengei);
        temperatura.setCelciusCambio("Fahrenheit");
    }
    public void cambioKelvin(){
        int tempKelvin = (temperatura.getTemp()+273);
        temperatura.setTemp(tempKelvin);
        temperatura.setCelciusCambio("Kelvin");
    }
}
