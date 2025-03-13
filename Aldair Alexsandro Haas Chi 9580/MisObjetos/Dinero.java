public class Dinero {
    private double valor;
    private String moneda;
    private String material;
    private String pais_Origen;

    public Dinero(double valor, String moneda) {
        this.valor = valor <= 0 ? 10.0 : valor;
        this.moneda = moneda.equals("") ? "USD" : moneda;
        this.material = "Papel";
        this.pais_Origen = "Estados Unidos";
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor <= 0 ? 10.0 : valor; 
    }

    public String getMoneda() {
        return moneda;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda.equals("") ? "USD" : moneda;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material.equals("") ? "Papel" : material; 
    }

    public String getPais_Origen() {
        return pais_Origen;
    }
    public void setPaisDeOrigen(String paisDeOrigen) {
        this.pais_Origen = paisDeOrigen.equals("") ? "Estados Unidos" : pais_Origen;
    }

    public void pagar(double precio) {
        if (valor >= precio) {
            System.out.println("se pago" +precio+" "+moneda);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double darCambio(double precio) {
        return valor >=precio? valor-precio:0;

    }

    public void ahorrar() {
        System.out.println("Dinero ahorrado: $"+ valor);
    }

    @Override
    public String toString() {
        return "Dinero [Valor=$" + valor + ", Moneda=" + moneda + ", Material=" + material + 
               ", País de Origen=" + pais_Origen + "]";
    }
}
