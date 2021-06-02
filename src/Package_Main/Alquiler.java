package Package_Main;
import static  Package_Main.Constantes.*;

public class Alquiler {
  //Atributos
  private Ciudad ciudad;
  private Vehiculo vehiculo;
  private int cantidadVehiculos;
  private int horasTotales;
  private static int totalGuadalajara = 0;
  private static int totalTijuana = 0;
  private static int totalCuliacan = 0;
  private static int totalToluca = 0;
  private static int totalMerida = 0;

  //Constructores
  public Alquiler(int numeroCiudad, int tipoVehiculo, int cantidadVehiculos, int horasTotales){
    this.vehiculo = new Vehiculo(tipoVehiculo,horasTotales, cantidadVehiculos);
    this.ciudad = new Ciudad(numeroCiudad);
    this.horasTotales = horasTotales;
    if(cantidadVehiculos <= 0){
      this.cantidadVehiculos = 1;
    } else{
      this.cantidadVehiculos = cantidadVehiculos;
    }
    int costoTotal = setCosto(cantidadVehiculos, tipoVehiculo, horasTotales);
    setTotal(numeroCiudad,costoTotal);
  }
// Constructor 2
  public Alquiler(Ciudad ciudad, Vehiculo vehiculo) {
    this.ciudad = ciudad;
    this.vehiculo = vehiculo;
  }



  //Setters and Getters
  public static void setTotal(int idCiudad, int costoTotal){
    switch (idCiudad){
      case 1: totalGuadalajara += costoTotal;
        break;
      case 2: totalTijuana += costoTotal;
        break;
      case 3: totalCuliacan += costoTotal;
        break;
      case 4: totalToluca += costoTotal;
        break;
      case 5: totalMerida += costoTotal;
        break;
    }
  }

  public static int getTotal(int idCiudad){
    switch (idCiudad){
      case 1: return totalGuadalajara;
      case 2: return totalTijuana;
      case 3: return totalCuliacan;
      case 4: return totalToluca;
      case 5: return totalMerida;
      default: return 0;
    }
  }

  private int setCosto(int cantidadVehiculos, int tipoVehiculo, int horasTotales){
    switch (tipoVehiculo){
      case 1:
        return cantidadVehiculos * BICICLETA.getValor() * horasTotales;
      case 2: //Moto
        return cantidadVehiculos * MOTO.getValor() * horasTotales;
      case 3:
        return cantidadVehiculos * CUATRIMOTO.getValor() * horasTotales;
      case 4:
        return cantidadVehiculos * CARRO_GOLF.getValor() * horasTotales;
      default:
        return 0;
    }
  }
  public Vehiculo getVehiculo(){
    return this.vehiculo;
  }
  public Ciudad getCiudad(){
    return this.ciudad;
  }
  public int getCantidadVehiculos() {
    return cantidadVehiculos;
  }
  public int getHorasTotales() {
    return horasTotales;
  }
}