import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClassCsv {
    
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getQnt() {
        return qnt;
    }

    public void setQnt(double qnt) {
        this.qnt = qnt;
    }

    private double precoUnitario;
    private  double qnt;

    public ClassCsv (String nome, double precoUnitario, double qnt){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.qnt = qnt;
    }
  

}
