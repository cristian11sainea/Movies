import java.util.ArrayList;

public abstract class Persona {
    protected ArrayList<Suscrito> suscritos;
    protected String name;

    public Persona() {
        this.suscritos = new ArrayList<>();
    }

    public void addSuscrito(Suscrito suscrito){
        suscritos.add(suscrito);

    }

    public void removeSuscrito(Suscrito suscrito){
        suscritos.remove(suscrito);
    }

    public abstract void notifiy(String name);

    public ArrayList<Suscrito> getSuscritos(){
        return suscritos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
