package Clinica;

import java.util.Date;


public class Consulta {

    private Integer codigoConsulta;
    private Integer codigoPaciente;
    private Medico medico;
    private Paciente paciente;
    private Date Data;
    private String tipoExame;

    public Consulta() {
    }

    public Consulta (Integer codigoConsulta, Integer codigoPaciente){
        this.codigoConsulta = codigoConsulta;
        this.codigoPaciente = codigoPaciente;
    }


    public Integer getCodigoConsulta() {
        return codigoConsulta;
    }

    public void setCodigoConsulta(Integer codigoConsulta) {
        this.codigoConsulta = codigoConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }
}
