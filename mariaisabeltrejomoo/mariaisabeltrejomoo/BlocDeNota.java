package mariaisabeltrejomoo;

public class BlocDeNota{
    public Nota n;

    public BlocDeNota(Nota n){
        Nota n = new Nota();
    }
    public boolean addNota(Nota n){
        return true;
    }
    public boolean saveNotas(){
        return false;
    }
    public boolean updateNota(Nota n){
        return true;
    }
    public boolean updateNota(String txt, String c){
        return false;
    }
    public boolean deleteNote(){
        return true;
    }
}