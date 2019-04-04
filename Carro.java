package testecarro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Carro (int w, double x, String y, String z){
        this.ano = w;
        this.quilometragem = x;
        this.marca = y;
        this.modelo = z;
    }
    public int getW() {
        return ano;   }
    public double getX() {
        return quilometragem;  }
    public String getY() {
        return marca;   }
    public String getZ() {
        return modelo;  }
    
    public void setW(int w){
        this.ano = w; }
    public void setX(double x){
        this.quilometragem = x; }
    public void setY(String y){
        this.marca = y; }
    public void setZ(String z){
        this.modelo = z; }
}