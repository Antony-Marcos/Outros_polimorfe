public class Carro extends Veiculo{
    public Carro(String modelo, double km){
        super(modelo, km);
    }
    @Override
    public double calcularCusto(){
        return  super.getKm() * 0.05;
    }
}
