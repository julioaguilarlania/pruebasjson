import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws IOException {
        Vehiculo v1 = new Vehiculo();
        v1.setMarca("Volkswagen");

        v1.setFechaIngreso(LocalDateTime.of(2023,1,3,10,30));

        v1.setServicios(new ArrayList<>());
        Servicio s1 = new Servicio();
        s1.setDescripcion("Cambio de Aceite");
        v1.getServicios().add(s1);

        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.writeValue(System.out, v1);
    }
}
