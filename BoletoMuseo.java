
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Clase BoletoMuseo, maneja todo lo referente al boleto, sobre su precio, la cantidad 
 * creada y serie o número.
 *
 * @author Melany Jirón
 * @version 1.0
 */
public class BoletoMuseo{
  /*
   * El precio del boleto
   * 
   */
  private double precio;
  /*
   * La serie o numero del boleto
   */
  private int numeroBoleto;
  /*
   * Fecha de emisión del boleto
   */
  private String fechaEmision;
  /*
   * Maneja la cantidad de boletos creados/ atributo de clase
   */
  private static int contador = 0;
  
  /*
   * Crea a un boleto/Constructor
   * @param el precio del boleto
   * 
   */
  public BoletoMuseo(double precio){
    this.precio = precio;
    contador++;
    this.numeroBoleto = contador;
    this.fechaEmision = establecerFechaEmisionBoleto();
  }
  
  /*
   * Establece la hora de creación del boleto
   * 
   */
  public String establecerFechaEmisionBoleto(){
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return LocalDate.now().format(f);
  }
  
  /*
   * Consigue la cantidad de boletos creados hasta el momento
   */
  public static int getContador(){
    return contador;
  }
  
  /*
   * Consigue la serie/número del boleto
   */
  public int getNumeroBoleto(){
    return numeroBoleto;
  }
  
  /*
   * Consigue el precio del boleto creado
   */
  public double getPrecio(){
    return precio;
  }
  
  /*
   * Devuelve la información deel boleto creado
   * @return una cadena de texto con la información del boleto
   * 
   */
  public String toString() {
    String msg = "BoletoMuseo\n";
    msg += " Numero: " + numeroBoleto + "\n";
    msg += " Precio: " + precio + "\n";
    msg += " Fecha Emision: " + fechaEmision;
    return msg;
  }
}