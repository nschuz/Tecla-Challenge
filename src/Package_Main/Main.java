package Package_Main;

import java.util.*;
import static Package_Main.FuncionesAyuda.*;
public class Main {
 //Atributos de la Clase (Eststaticos)
  static ArrayList<Alquiler> coleccionAlquileres = new ArrayList<>();
  static Scanner sc = new Scanner(System.in);



  public static void main(String[] args) {


    System.out.println("\n" +
            " +---+-------------+------+---------------+--------+\n" +
            " |N0 | Ciudad      | N0   |    Vehiculo   |Precio  |\n" +
            " +---+-------------+------+---------------+--------+\n" +
            " | 1 | Guadalajara |    1 | Bicicleta     | 4usd   |\n" +
            " | 2 | Tijuana     |    2 | Moto          | 6usd   |\n" +
            " | 3 | Culiacan    |    3 | Cuatrimoto    | 15usd  |\n" +
            " | 4 | Toluca      |    4 | Carro de golf | 18 usd |\n" +
            " | 5 | Merida      |      |               |        |\n" +
            " +---+-------------+------+---------------+--------+\n" +
            "\n");

    int opcion;
    do {
      System.out.println("¿Insertar un numero valido para iniciar?\n");
      System.out.println("1. Alquilar un vehículo");
      System.out.println("2. Indicar para cada ciudad la recaudación por cada tipo de vehículo");
      System.out.println("3. Numero de ciudad con menor facturación total");
      System.out.println("4. Porcentaje de cada ciudad con la facturación total");
      System.out.println("5. Ordenar de forma creciente por  la recaudación total");
      System.out.println("6. Salir");
      opcion = sc.nextInt();
      switch (opcion) {
        case 1:
          System.out.println("Ingresa el número de ciudad: ");
          int numeroCiudad = sc.nextInt();
          System.out.println("Ingresa tipo de vehiculo: ");
          int tipoVehiculo = sc.nextInt();
          System.out.println("Ingresa cuantos vehículos vas a querer: ");
          int cantidadVehiculos = sc.nextInt();
          System.out.println("Ingresa por cuantas horas lo vas a rentar: ");
          int horasTotales = sc.nextInt();
          Alquiler objeto = new Alquiler(numeroCiudad, tipoVehiculo, cantidadVehiculos, horasTotales);
          coleccionAlquileres.add(objeto);
          System.out.println("Se agrego exitosamente el alquiler.");
          break;
        case 2:
          System.out.println("\n" +
                  " +---+-------------+------+-------+\n" +
                  " |N0 | Ciudad      | Recaudacion  |\n" +
                  " +---+-------------+------+-------+\n" +
                  " | 1 | Guadalajara |"+Alquiler.getTotal(1)+"           \n" +
                  " | 2 | Tijuana     |"+Alquiler.getTotal(2)+"           \n" +
                  " | 3 | Culiacan    |"+Alquiler.getTotal(3)+"           \n" +
                  " | 4 | Toluca      |"+Alquiler.getTotal(4)+"           \n" +
                  " | 5 | Merida      |"+Alquiler.getTotal(5)+"           \n" +
                  " +---+-------------+------+------+\n" +
                  "\n");

          break;
        case 3:
          MenorFacturacion();
          break;
        case 4:
          int total=0;
          for(int i=1;i<=5;i++){
            total += Alquiler.getTotal(i);
          }
          System.out.println(total);
          System.out.println("\n" +
                  " +---+-------------+------+-------+\n" +
                  " |N0 | Ciudad      | Recaudacion  |\n" +
                  " +---+-------------+------+-------+\n" +
                  " | 1 | Guadalajara |"+(Alquiler.getTotal(1)/(float)total)*100 + "%"+"\n" +
                  " | 2 | Tijuana     |"+(Alquiler.getTotal(2)/(float)total)*100 + "%"+"\n" +
                  " | 3 | Culiacan    |"+(Alquiler.getTotal(3)/(float)total)*100 + "%"+"\n" +
                  " | 4 | Toluca      |"+(Alquiler.getTotal(4)/(float)total)*100 + "%"+"\n" +
                  " | 5 | Merida      |"+(Alquiler.getTotal(5)/(float)total)*100 + "%"+"\n" +
                  " +---+-------------+------+------+\n" +
                  "\n");

          break;
        case 5:
          HashMap<Integer,Integer> recaudaciones2 = new HashMap<>();
          recaudaciones2.put(1,Alquiler.getTotal(1));
          recaudaciones2.put(2,Alquiler.getTotal(2));
          recaudaciones2.put(3,Alquiler.getTotal(3));
          recaudaciones2.put(4,Alquiler.getTotal(4));
          recaudaciones2.put(5,Alquiler.getTotal(5));
          Map<Integer, Integer> hm2 = odernaPorValor(recaudaciones2);
          System.out.println("\n" +
                  " +---+-------------+------+-------+\n" +
                  " |N0 | Ciudad      | %Recaudacion |\n" +
                  " +---+-------------+------+-------+\n" );
          ArrayList<Integer> llaves = new ArrayList<>();
          for (Map.Entry<Integer, Integer> en : hm2.entrySet()) {
            llaves.add(en.getKey());
          }
          for(int i =0;i<=4;i++){
            if(i==0) System.out.println("  "+llaves.get(i)+"  |"+Ciudad.getNombre(llaves.get(i))+" | " + Alquiler.getTotal(llaves.get(i)));

            if(i==2) System.out.println("  "+llaves.get(i)+"  |"+Ciudad.getNombre(llaves.get(i))+"     | " + Alquiler.getTotal(llaves.get(i)));

            if( i==3 || i==4) System.out.println("  "+llaves.get(i)+"  |"+Ciudad.getNombre(llaves.get(i))+"       | " + Alquiler.getTotal(llaves.get(i)));

            if(i==1) System.out.println("  "+llaves.get(i)+"  |"+Ciudad.getNombre(llaves.get(i))+"      | " + Alquiler.getTotal(llaves.get(i)));
          }
          break;

        default:
          System.out.printf("Error");

          break;
      }
    } while(opcion != 6);

  }


}
