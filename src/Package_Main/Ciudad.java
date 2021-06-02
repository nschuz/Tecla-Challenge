package Package_Main;
import   static  Package_Main.Constantes.*;

public class Ciudad {
  private String nombre;

  public static String getNombre(int idCiudad) {
    switch (idCiudad){
      case 1: return GUADALAJARA.getCiudad();
      case 2: return TIJUANA.getCiudad();
      case 3: return CULIACAN.getCiudad();
      case 4: return TOLUCA.getCiudad();
      case 5: return MERIDA.getCiudad();
      default: return "Ciudad invalida";
    }
  }

  public Ciudad(int idCiudad){
    switch (idCiudad){
      case 1:
        this.nombre = GUADALAJARA.getCiudad();
        break;
      case 2:
        this.nombre = TIJUANA.getCiudad();
        break;
      case 3:
        this.nombre = CULIACAN.getCiudad();
        break;
      case 4:
        this.nombre = TOLUCA.getCiudad();
        break;
      case 5:
        this.nombre = MERIDA.getCiudad();
        break;
      default:
        this.nombre = "Ciudad invalida";
        break;
    }
  }




}
