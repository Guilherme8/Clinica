package Clinica;

public class Paciente {

    private Integer codigoPaciente;
    private String nomePaciente;

    public Paciente(){

    }

    public Paciente(Integer codigoPaciente, String nomePaciente){

        this.codigoPaciente = codigoPaciente;
        this.nomePaciente = nomePaciente;

    }

    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

}