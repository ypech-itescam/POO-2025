package DanaChin.Progrmas.avatar;

public class Eva {
    private String modelo;
    private String color;
    private String piloto;
    private String pais;
    private double altura;// 200 metros

    // Constructor
    public Eva(String modelo, String piloto, String color, String pais, double altura) {
        setModelo(modelo);
        setColor(color, color);
        setPiloto(piloto);
        setPais(pais);
        setAltura(altura);

    }

    // Métodos getter y setter para el modelo y el piloto
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Color, String string) {
        this.color = string;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
