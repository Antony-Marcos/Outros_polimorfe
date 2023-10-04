public class Veiculo {
    private String modelo;
    private double km;

    public  Veiculo(String modelo, double km){
        this.modelo = modelo;
        this.km = km;
    }
    public double calcularCusto(){
           return 0.0;
    }

    public String getModelo() {
        return this.modelo;
    }



    public double getKm() {
        return km;
    }

}
