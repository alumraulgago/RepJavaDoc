/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;


/**ç
 * 
 * @author Raúl Gago Gómez
 */
public class CCuenta {


  
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Constructor sin argumentos
     */
    public CCuenta ()
    {
    }
    
    /**
    * Constructor de la clase CCuenta
    * @param nom Nombre del titular de la CCuenta
    * @param cue Cuenta de la CCuenta
    * @param sal Saldo de la CCuenta
    * @param tipo Tipo de Interés de la CCuenta 
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    
    /**
     * Asigna un nombre al titular de la CCuenta
     * @param nom Nuevo nombre para la CCuenta
     */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     * Devuelve el nombre del titular de la CCuenta
     * @return el nombre de la CCuenta
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * Devuelve el saldo de la CCuenta
     * @return el saldo de la CCuenta
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad La cantidad ingresada no puede ser menor a cero
     * @throws Exception Así evitamos que introduzcan cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /** 
     * 
     * @param cantidad La cantidad tiene que ser mayor de cero 
     * @throws Exception Aquí nos avisa que no se pueden retirar cantidades negativas
     * @throws Exception Aquí nos dice la insuficiencia de saldo
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * Devuelve la cuenta de CCuenta
     * @return cuenta de CCuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * Modifica la cuenta de CCuenta
   * @param cuenta Nueva cuenta para la CCuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Modifica el saldo de la CCuenta
   * @param saldo Nuevo saldo para la CCuenta
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * Devuelve el TipoInterés de la CCuenta
  * @return tipoInterés de la CCuenta
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * Modifica el tipoInterés de la CCuenta
   * @param tipoInterés Nuevo tipoInterés de la CCuenta
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
