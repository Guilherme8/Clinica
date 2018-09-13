package Clinica;

public class Medico {

    private String nomeMedico;

    public Medico() {

    }

    public Medico(String especialidade, String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public  String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

}
