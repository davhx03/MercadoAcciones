import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Acciones")
public class Acciones {
    private List<DatosAcciones> acciones;

    @XmlElement(name = "acciones")
    public List<DatosAcciones> getStocks() {
        return acciones;
    }

    public void setStocks(List<DatosAcciones> stocks) {
        this.acciones = stocks;
    }
}