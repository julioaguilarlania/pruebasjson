import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Servicio {
    private String descripcion;
    private BigDecimal costo;
    private LocalDateTime momentoInicio;
    private LocalDateTime momentoFin;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public LocalDateTime getMomentoInicio() {
        return momentoInicio;
    }

    public void setMomentoInicio(LocalDateTime momentoInicio) {
        this.momentoInicio = momentoInicio;
    }

    public LocalDateTime getMomentoFin() {
        return momentoFin;
    }

    public void setMomentoFin(LocalDateTime momentoFin) {
        this.momentoFin = momentoFin;
    }
}
