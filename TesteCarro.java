package testecarro;
import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Scanner texto = new Scanner (System.in);
        System.out.println("Insira o ano do Carro:");
        int ano = texto.nextInt();
        System.out.println("Insira a kilometragem do Carro:");
        double km = texto.nextDouble();
        Carro Teste = new Carro(ano, km, "Chevrolet", "Captiva");
        System.out.println(" Modelo = "+Teste.getZ()+" | Marca = "+ Teste.getY()+" | Ano = "+Teste.getW()+" | Km = "+Teste.getX()+"km");
        
        /*Contas*/
        Double resultado;
        int anoAtt = 2019;
        anoAtt = anoAtt - Teste.getW();
        resultado = Teste.getX() / anoAtt;
        
        if(resultado > 10000){
            System.out.println("Distancia:"+resultado);
            System.out.println("Carro roda muito");
        }
        else{
    System.out.println("Distancia:"+resultado);
    System.out.println("Carro roda normal");
    System.out.println(""+anoAtt);
        }
    }
}
