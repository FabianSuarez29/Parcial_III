package ejbs;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateful;

/**
 * Session Bean implementation class Cicla
 */
@Stateful
@LocalBean
public class Cicla implements CiclaRemote {
	public int id;
	public String color;
	public String marca;
	public int precio_dia;
	public Date fecha_prestamo;
	public Date fecha_emtrega;
	public String tipo;
	public String talla; 
	public String referencia; 
	public TimeUnit timeUnit;

    /**
     * Default constructor. 
     */
    public Cicla() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void setCicla(int id, String color, String marca, int precio_dia, Date fecha_prestamo, Date fecha_emtrega, String tipo, String talla, String referencia) {
    	this.id = id;
    	this.color = color;
    	this.marca = marca;
    	this.precio_dia = precio_dia;
    	this.fecha_prestamo =  fecha_prestamo;
    	this.fecha_emtrega =  fecha_emtrega;
    	this.tipo = tipo;
    	this.talla = talla; 
    	this.referencia = referencia; 
    }

    @Override
	public long tiempoPrestamo(Date fecha_prestamo, Date fecha_emtrega, TimeUnit timeUnit) {
    	long diffInMillies = fecha_emtrega.getTime() - fecha_prestamo.getTime();
    	long dias_pestamo = timeUnit.convert(diffInMillies,TimeUnit.DAYS);
        return dias_pestamo;
	}
    
    @Override
    public double precioPrestamo(int precio_dia, long dias_pestamo) {
    	double precio_total_prestamo = precio_dia* dias_pestamo;
		return precio_total_prestamo;
    }
}
