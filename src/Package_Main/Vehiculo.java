package Package_Main;
import  static Package_Main.Constantes.*;

public class Vehiculo {

  //Atributos
  private int costo;
  private String tipoVehiculo;
  private int tiempoRenta;
  private int cantidadVehiculos;

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

  public Vehiculo(int tipo, int tiempoRenta, int cantidad){
    this.cantidadVehiculos = cantidad;
    this.tiempoRenta = tiempoRenta;
    switch(tipo){
      case 1:
        this.tipoVehiculo = BICICLETA.getKey();
        this.costo = 4;
        break;
      case 2: //moto 6
        this.tipoVehiculo = MOTO.getKey();
        this.costo = 6;
        break;
      case 3: //cuatri 15
        this.tipoVehiculo = CUATRIMOTO.getKey();
        this.costo = 15;
        break;
      case 4: //carrito golf 18
        this.tipoVehiculo = CARRO_GOLF.getKey();
        this.costo = 18;
        break;
      default:
        this.tipoVehiculo = INVALIDO.getKey();
        this.costo = 0;
        this.tiempoRenta = 0;
        break;
    }
  }
}