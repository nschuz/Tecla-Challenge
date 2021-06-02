package Package_Main;

import java.util.*;

public class FuncionesAyuda {
//Funciones que ayudan 'HELPERS'
    public  static  HashMap<Integer, Integer> odernaPorValor(HashMap<Integer, Integer> hm)
    {
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static  void  MenorFacturacion (){
        HashMap<Integer,Integer> recaudaciones = new HashMap<>();
        recaudaciones.put(1,Alquiler.getTotal(1));
        recaudaciones.put(2,Alquiler.getTotal(2));
        recaudaciones.put(3,Alquiler.getTotal(3));
        recaudaciones.put(4,Alquiler.getTotal(4));
        recaudaciones.put(5,Alquiler.getTotal(5));
        Map<Integer, Integer> hm1 = odernaPorValor(recaudaciones);
        int ciudad = 0;
        for (Map.Entry<Integer, Integer> en : hm1.entrySet()) {
            ciudad = en.getKey();
            break;
        }
        System.out.println("Ciudad con menor facturación total: " + Ciudad.getNombre(ciudad));
    }

}
