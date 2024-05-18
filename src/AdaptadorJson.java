
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class AdaptadorJson implements Libreria {

    private DatosAcciones accion;

    public AdaptadorJson(Acciones acciones) {
        this.accion = accion;
    }

    public String convertToJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(accion);
    }
    public void leerDatosXML(){

    }

    public void analizarLibreria(){

    }
}

