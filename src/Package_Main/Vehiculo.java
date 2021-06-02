package Package_Main;
import  static Package_Main.Constantes.*;

public class Vehiculo {

  //Atributos
  private int costo;
  private String tipoVehiculo;
  private int tiempoRenta;
  private int cantidadVehiculos;


  //Constructor
  public Vehiculo(int tipo, int tiempoRenta, int cantidad){
    this.cantidadVehiculos = cantidad;
    this.tiempoRenta = tiempoRenta;
    switch(tipo){
      case 1:
        this.tipoVehiculo = BICICLETA.getKey();
        this.costo = BICICLETA.getValor();
        break;
      case 2:
        this.tipoVehiculo = MOTO.getKey();
        this.costo = MOTO.getValor();
        break;
      case 3:
        this.tipoVehiculo = CUATRIMOTO.getKey();
        this.costo = CUATRIMOTO.getValor();
        break;
      case 4:
        this.tipoVehiculo = CARRO_GOLF.getKey();
        this.costo = CARRO_GOLF.getValor();
        break;
      default:
        this.tipoVehiculo = INVALIDO.getKey();
        this.costo = 0;
        this.tiempoRenta = 0;
        break;
    }
  }

  //Setter and Getters
  public int getCosto() {
    return costo;
  }
  public String getTipoVehiculo() {
    return tipoVehiculo;
  }
  public int getTiempoRenta() {
    return tiempoRenta;
  }
  public int getCantidadVehiculos() {
    return cantidadVehiculos;
  }


}