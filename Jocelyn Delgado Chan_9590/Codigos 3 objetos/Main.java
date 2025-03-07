public class Main {
    public static void main(String[] args) {
        // Crear una mochila con ciertos atributos
        Mochila miMochila = new Mochila("Azul", "Nike", false, "Nylon");

        // Imprimir los atributos de la mochila
        System.out.println(miMochila);
        
        // Abrir la mochila
        miMochila.abrir();
        
        // Intentar guardar un objeto en la mochila
        miMochila.guardarObjeto("Laptop");
        
        // Intentar sacar un objeto de la mochila
        miMochila.sacarObjeto("Laptop");
        
        // Cerrar la mochila
        miMochila.cerrar();
        
        // Intentar guardar un objeto en la mochila cuando está cerrada
        miMochila.guardarObjeto("Cuaderno");
        
        // Volver a abrir la mochila
        miMochila.abrir();
        
        // Intentar guardar un objeto después de abrirla
        miMochila.guardarObjeto("Cuaderno");
        
        // Imprimir nuevamente el estado de la mochila
        System.out.println(miMochila);
    }
}
