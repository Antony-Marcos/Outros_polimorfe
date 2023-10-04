import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("optmus",500.00);
        Moto m1 = new Moto("shineray",20.00);
        System.out.println("O custo do " + c1.getModelo() +"é:" + c1.calcularCusto());
        System.out.println("O custo do " + m1.getModelo() +"é:" + m1.calcularCusto());

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(c1);
        veiculos.add(m1);
    }
}
