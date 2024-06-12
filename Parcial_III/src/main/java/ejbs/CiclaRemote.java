package ejbs;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import jakarta.ejb.Remote;

@Remote
public interface CiclaRemote {
	void setCicla(int id, String color, String marca, int precio_dia, Date fecha_prestamo, Date fecha_emtrega, String tipo, String talla, String referencia); 
    long tiempoPrestamo(Date fecha_prestamo, Date fecha_emtrega, TimeUnit timeUnit);
    double precioPrestamo(int precio_dia, long dias_pestamo);
}
