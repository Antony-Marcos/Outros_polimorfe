public class Moto extends Veiculo {
    public Moto(String modelo, double km){
        super(modelo, km);
    }
    @Override
    public double calcularCusto(){
        return super.getKm() * 0.03;
    }
}
