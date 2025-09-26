/**
 * Clase {@code Persona}.
 * <p>
 * Maneja el flujo de las personas que compran boletos de museo y maneja como datos
 * el nombre, la identificación y el boleto comprado.
 * <p>
 *
 * @author Melany Jirón
 * @version 1.0
 */
public class Persona{
  /*
   * Nombre de la persona
   */
  private String nombre;
  /*
   * Identificación de la persona
   */
  private String identificacion;
  /*
   * Boleto que compró la persona
   * Se puede asignar {@code null} si la persona no compró.
   */
  private BoletoMuseo miBoleto;
  
  /*
   * Crea a una persona/Primer constructor
   * @param nombre de la persona
   * @param identificación de la persona
   * 
   */
  public Persona(String nombre, String ident){
    this(nombre);
    identificacion = ident;
  }
  
  /*
   * Crea a una persona/Segundo constructor
   * @param Solo resive el nombre de la persona
   * 
   */
  public Persona(String nombre){
    this.nombre = nombre;
  }

  /*
   * Asigna la identificaión de la persona
   * @param identificación de la persona
   * 
   */
  public void setIdentificacion(String pIdentificacion){
    identificacion = pIdentificacion;
  }
  
  /*
   * Asigna un boleto a la persona
   * @param el boleto a asignar
   * 
   */
  public void asignarBoleto(BoletoMuseo pMiBoleto){
    miBoleto = pMiBoleto;
  }
  
  /*
   * Consulta el numero asociado al boleto
   * @return el numero del boleto
   * 
   */
  public int consultarMiNumeroDeBoleto(){
    return miBoleto.getNumeroBoleto();
  }
  
  /*
   * Devuelve la información de la persona compradora
   * @return una cadena de texto con la información de la persona
   * 
   */
  public String toString(){
    String msg = "Persona\n";
    msg += " Nombre: " + nombre + "\n";
    msg += " Identificación: " + identificacion + "\n";
    if (miBoleto != null){
      msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n"; 
    }else{
      msg += " Boleto asignado: (ninguno)\n";
    }
    return msg;
  }
}