public class Cuaderno {
   private String color;
   private String marca;
   private String estado;

   // Constructor 1 (original)
   public Cuaderno(String color, String marca, String estado) {
       setColor(color);
       setMarca(marca);
       setEstado(estado);
   }

   // Constructor 2 (nuevo)
   public Cuaderno() {
       setColor("Blanco");
       setMarca("Norma");
       setEstado("Usado");
   }

   public String getColor() {
       return color;
   }

   public void setColor(String color) {
       this.color = color;
   }

   public String getMarca() {
       return marca;
   }

   public void setMarca(String marca) {
       this.marca = marca;
   }

   public String getEstado() {
       return estado;
   }

   public void setEstado(String estado) {
       this.estado = estado;
   }
}