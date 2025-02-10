/*public class Main {
    public static void main(String [ ]args){
        BlocNotas bloc = new BlocNotas();
        bloc.addNota(null)
        Nota n = new Nota("", "turquesa", 0, "nota1","Pendiente");
        n.setTexto("En la oscuridad, la luz rápidamente desaparecía. Incluso una mano inconscientemente no llega a aferrarse a nada, y mientras caía tenía una sensación de presión en la parte inferior de su cuerpo. La cara de Nagumo Hajime se retorcía de miedo mientras la luz desaparecía de su vista.", false);
        n.setTexto("Actualmente, Hajime estaba cayendo a un profundo acantilado que parecía la entrada al infierno. La única luz visible era la que iluminaba la parte superior. Mientras continuaba cayendo, la luz ya no le alcanzaba, y todo a su alrededor se volvió oscuro. Hajime buscó por los alrededores del hoyo, y en los laterales vio una luz difusa junto al sonido del viento pasando junto él.", true);
        n.setTexto("Siendo japonés, la discriminación que vivió cuando llegó a este mundo era demasiado difícil de describir con palabras, y tenía la esperanza de que un mundo de fantasía le liberase de su actual vida de desgracias, que sufría de forma progresiva.", true);
        n.setTexto("Lunes, el más agobiante de todos los días acaba de empezar. La mayoría de la gente suspiraría tristemente, mientras que el anterior día sería el cielo para ellos.", true);
        n.setTexto("Y Nagumo Hajime no era una excepción a este principio. Sin embargo, en su caso no era una simple molestia, su acogedora escuela era asociaba con una malísima sensación, probablemente porque estaba deprimido. Como siempre, cuando la última campanada sonaba en la escuela, abría la puerta de su clase, con su cuerpo cansado de una noche en vela.", true);
        n.setTexto("En ese momento, Hajime recibió las miradas amenazantes y chasquidos de la mayoría de estudiantes masculinos en su clase. Las chicas tampoco tenían una amigable expresión. Estaba bien si la gente era indiferente, pero había quienes tenían una mirada de desprecio hacia él.", true);
        n.setTexto("Hajime trató de disimular mientras se dirigía hacia su asiento, pero siempre había gente que se metería con él todo el tiempo.", true);
        
        System.out.println();
        System.out.println();
        n.setColor("naranja");
        n.setNum(1);
        n.setNombreDoc("nota 2");
        n.setTipo("Normal");
        n.setTexto("Hola como estas", false);
       
    }
}*/
public class Main {
    public static void main(String[] args) {
        BlocNotas bloc = new BlocNotas();
        Nota nota1 = new Nota("Manuel", "Amarillo", 0, "Arifureta", "Urgente", "En la oscuridad, la luz rápidamente desaparecía. Incluso una mano inconscientemente no llega a aferrarse a nada, y mientras caía tenía una sensación de presión en la parte inferior de su cuerpo. La cara de Nagumo Hajime se retorcía de miedo mientras la luz desaparecía de su vista.");
        nota1.setTexto("Actualmente, Hajime estaba cayendo a un profundo acantilado que parecía la entrada al infierno. La única luz visible era la que iluminaba la parte superior. Mientras continuaba cayendo, la luz ya no le alcanzaba, y todo a su alrededor se volvió oscuro. Hajime buscó por los alrededores del hoyo, y en los laterales vio una luz difusa junto al sonido del viento pasando junto él.", true);
        nota1.setTexto("Siendo japonés, la discriminación que vivió cuando llegó a este mundo era demasiado difícil de describir con palabras, y tenía la esperanza de que un mundo de fantasía le liberase de su actual vida de desgracias, que sufría de forma progresiva.", true);
        nota1.setTexto("Lunes, el más agobiante de todos los días acaba de empezar. La mayoría de la gente suspiraría tristemente, mientras que el anterior día sería el cielo para ellos.", true);
        nota1.setTexto("Y Nagumo Hajime no era una excepción a este principio. Sin embargo, en su caso no era una simple molestia, su acogedora escuela era asociaba con una malísima sensación, probablemente porque estaba deprimido. Como siempre, cuando la última campanada sonaba en la escuela, abría la puerta de su clase, con su cuerpo cansado de una noche en vela.", true);
        nota1.setTexto("En ese momento, Hajime recibió las miradas amenazantes y chasquidos de la mayoría de estudiantes masculinos en su clase. Las chicas tampoco tenían una amigable expresión. Estaba bien si la gente era indiferente, pero había quienes tenían una mirada de desprecio hacia él.", true);
        nota1.setTexto("Hajime trató de disimular mientras se dirigía hacia su asiento, pero siempre había gente que se metería con él todo el tiempo.", true);
        bloc.addNota(nota1);
        bloc.guardar(nota1.getNombreDoc()+".txt");
        Nota nota2 = new Nota("Manuel Orlando Keb Ortiz", "magenta", 1, "Hola Mundo2", "Normal", "Hello Wordl");
        bloc.addNota(nota2);
        bloc.guardar(nota2.getNombreDoc()+".txt");
        bloc.deleteNota(1);
    }
}