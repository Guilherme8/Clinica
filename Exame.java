package Clinica;

public class Exame {

    private String tipoExame;

    public Exame(){

    }

    public Exame(String tipo) {
        this.tipoExame = tipo;
    }

    public String getTipo() {
        return tipoExame;
    }

    public void setTipo(String tipo) {
        this.tipoExame = tipo;
    }
}
