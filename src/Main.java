import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
public class Main {
    public static void main(String[] args) {

        try {
            // Leer y convertir el XML a objetos Java
            File file = new File("acciones.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Acciones.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Acciones acciones = (Acciones) jaxbUnmarshaller.unmarshal(file);

            // Usar el adaptador para convertir los objetos a JSON
            AdaptadorJson adapter = new AdaptadorJson(acciones);
            String json = adapter.convertToJson();

            // Imprimir el JSON resultante
            System.out.println(json);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    }