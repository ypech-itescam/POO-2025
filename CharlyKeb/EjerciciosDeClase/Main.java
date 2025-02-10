package CharlyKeb.EjerciciosDeClase;

public class Main {

        public static void main(String[] args) {
                // COCHE
                Coche coche1 = new Coche("NISSAN ", "NEGRO ", "AVEO ", "ESTANDAR ", 2024, 0);
                System.out.println(coche1.getMarca() + coche1.getColor() + coche1.getModelo() +
                                coche1.getTipo() + coche1.getAnio());
                coche1.abrirPuerta();
                coche1.cerrarPuerta();
                coche1.arrancar();
                coche1.acelerar();
                coche1.frenar();
                System.out.println("");
                // JUGADORFUTBOL Y DT
                System.out.println("DATOS DEL JUGADOR");
                JugadorFutbol j1 = new JugadorFutbol("Roberto Carlos", "delantero", 9, "Brasileño");
                System.out.println(j1.getNombre());
                System.out.println(j1.getPosicion());
                System.out.println(j1.getNumero());
                System.out.println(j1.getNacionalidad());
                j1.correr();
                j1.defender();
                j1.entrenar(4);
                System.out.println();

                DT dt = new DT("Zinidine", "Zidane", "Francés", "Champions league");
                System.out.println("DATOS DEL DIRECTOR TÉCNICO");
                System.out.println(dt.getNombre());
                System.out.println(dt.getApellido());
                System.out.println(dt.getNacionalidad());
                System.out.println(dt.getCampeonatos());
                dt.planear(2);
                dt.dirigir(1);
                System.out.println();

                // Perro
                Perro miperro = new Perro("Hercules", "Doberman", 3, 59, 70.5);
                System.out.println("DATOS DEL PERRO");
                System.out.println(miperro.getNombre());
                System.out.println(miperro.getRaza());
                System.out.println(miperro.getEdad() + " anios");
                System.out.println(miperro.getAltura() + "cm");
                System.out.println(miperro.getPeso() + " kilogramos");
                System.err.println("");

                // HELLO WORLD
                /*
                 * Texto t = new Texto("Morado", "HOLA MUNDO", 14);
                 * System.out.println(t.getTexto());
                 */

                // notas
                Nota n = new Nota("Urgente",
                                "odshfsflahslkfahlkfhlas", "15/03/2024", "Charly", "Verde");
                System.out.println(n.imprimirTexto());

                Nota n2 = new Nota("Urgente",
                                "Esta nota la estooy escribiendo como prueba",
                                "15/03/2024", "Charly", "Azul");
                System.out.println(n2.imprimirTexto());

                // Block de notas

                BlockDeNotas bc = new BlockDeNotas();
                Nota n1 = new Nota("Urgente", "sdfsdf", "10/03/2024",
                                "Charly Keb", "Verde");

                Nota nota2 = new Nota("Urgente", "sdfsdf", "10/03/2024",
                                "Charly Keb", "Verde");

                System.out.println(n1.imprimirTexto());

        }
}

/*
 * documental examen
 * 
 */

/*

 */
