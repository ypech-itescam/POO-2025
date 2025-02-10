public class Temperatura {
    private int temp;
    private String celciusCambio;

    public Temperatura(int temp, String celciusCambio){
        this.temp=temp;
        this.celciusCambio=celciusCambio;


    }

    public int getTemp(){
        return temp;
    }
    public void setTemp(int temp){
        this.temp = temp;
    }

    public String getCelciusCambio(){
        return celciusCambio;
    }
    public void setCelciusCambio(String celciusCambio){
        this.celciusCambio = celciusCambio;
    }
  


}
