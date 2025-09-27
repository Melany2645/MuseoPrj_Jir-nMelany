
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase VentaDelDia, maneja el control de la venta de los boletos y puede asignar
 * a un comprador.
 *
 * @author Melany Jirón
 * @version 1.0
 */
public class VentaDelDia{
  /*
   * Fecha del dia de la venta
   *
   */
  private String fechaDeLaVenta;
  /*
   * Lista tipo BoletoMuseo que almacena los boletos vendidos
   * 
   */
  private List<BoletoMuseo> boletosVendidos;
  
  /*
   * Crea la venta de un boleto/Constructor
   * 
   */
  public VentaDelDia(){
    fechaDeLaVenta = establecerFechaDeLaVenta();
    boletosVendidos = new ArrayList<>();
  }
  
  /*
   * Crea a una persona/Primer constructor
   * @param el boleto que se vendio
   * 
   */
  public void registrarVentaBoleto(BoletoMuseo boleto){
    boletosVendidos.add(boleto);
  }
  
  /*
   * Calcula la cantidad en dinero de la venta de boletos
   * @return la cantidad total vendida
   * 
   */
  public double calcularTotalVentaDelDia(){
    double total = 0.0;
    for(BoletoMuseo b : boletosVendidos){
      total += b.getPrecio();
    }
    return total;
  }
  
  /*
   * Establece el dia de la venta del boleto
   * @return nos devuelve la fecha de venta
   * 
   */
  private String establecerFechaDeLaVenta(){
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return LocalDate.now().format(f);
  }
  
  /*
   * Devuelve información respecto a la venta
   * @return nos devuelve información de la venta y el total de las ventas
   * 
   */
  public String toString() {
    String msg = "VentaDelDia\n";
    msg += " Fecha: " + fechaDeLaVenta + "\n";
    msg += " Cantidad de boletos: " + boletosVendidos.size() + "\n";
    msg += " Detalle:\n";
    for (BoletoMuseo b : boletosVendidos) {
      msg += " - Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
    }
    msg += " Total: " + calcularTotalVentaDelDia();
    return msg;
  }
}
