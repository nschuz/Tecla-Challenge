package Package_Main;

public enum Constantes {
    // CONSTANTES AUTOMOVILES
    BICICLETA("Bicicleta", 4),
    MOTO("Moto", 6),
    CUATRIMOTO("Cuatrimoto", 15),
    CARRO_GOLF("Carro de Golf", 18),
    INVALIDO("Auto Invalido", 0),
    //CONSTANTES CIUDADES
    GUADALAJARA(1 , "Guadalajara"),
    TIJUANA (2, "Tijuana"),
    CULIACAN(3 , "Culiacan"),
    TOLUCA(4 , "Toluca"),
    MERIDA (5 , "Merida");

    //Atributos
    private String key="";
    private Integer valor=0;
    private String ciudad="";
    private Integer numeroCiudad=0;

    //Constructor
    Constantes(String key, Integer valor) {
        this.key = key;
        this.valor = valor;
    }
    //Constructor
    Constantes (Integer numeroCiudad , String ciudad){
        this.numeroCiudad=numeroCiudad;
        this.ciudad=ciudad;
    }
    //Getters
    public String getKey() {
        return key;
    }
    public Integer getValor() {
        return valor;
    }
    public String getCiudad() {
        return ciudad;
    }
    public Integer getNumeroCiudad() {
        return numeroCiudad;
    }
}
