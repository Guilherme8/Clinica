package Clinica;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {

    static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    static ArrayList<Consulta> consultas = new ArrayList<Consulta>();

    static Paciente paciente = new Paciente();
    static Consulta consulta = new Consulta();


    static int lista;
    static int acho;
    static int codigoPaciente;
    static int codigoConsulta;
    static String nomePaciente;
    static String nomeMedico;
    static String tipoExame;
    static String data;

    public static void main(String[] args) {

        Medico m1 = new Medico();
        m1.setNomeMedico("Brandão");

        Medico m2 = new Medico();
        m2.setNomeMedico("Amanda");

        lista = 0;

        menu();

        while(true){
            switch(lista){
                case 1: cadastroPaciente();
                    break;

                case 2: cadastroConsulta();
                    break;

                case 3: sair();
                    break;

                default : JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA!!!", "Aviso", 1);
                    menu();

            }
        }
    }


    public static void menu() {
        lista = 0;
        lista = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU:\n1. Cadastrar o Paciente\n2. Cadastrar a Consulta" +
                "\n3. Sair\n\nDigite a opção:"));

    }

    public static void cadastroPaciente(){

        String nomePaciente;
        int lista = 1;

        do{
            acho=0;
            codigoPaciente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do Paciente"));
            if(pacientes.size()>0)
                for(int i = 0;i<pacientes.size();i++){
                    if(codigoPaciente == pacientes.get(i).getCodigoPaciente())
                        acho=1;
                }
            if(acho==1)
                JOptionPane.showMessageDialog(null, "Paciente já cadastrado","Aviso",1);
        }while(acho==1);

        nomePaciente = JOptionPane.showInputDialog(null, "Digite o nome do paciente: ");

        pacientes.add(new Paciente(codigoPaciente, nomePaciente));

        lista=Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja efetuar outro cadastro de paciente?\n1. Sim\n2. Não"));
        if(lista==1){
            cadastroPaciente();
        }else if(lista==2){
            menu();
        }

    }


    public static void cadastroConsulta(){


        data = null;
        int lista = 1;

        do{
            acho=0;
            codigoConsulta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da consulta"));
            if(consultas.size()>0)
                for(int i = 0;i<consultas.size();i++){
                    if(codigoConsulta == consultas.get(i).getCodigoConsulta())
                        acho=1;
                }
            if(acho==1)
                JOptionPane.showMessageDialog(null, "Consulta já cadastrado","Aviso",1);
        }while(acho==1);

        do{
            acho=0;
            codigoPaciente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do Paciente"));
            if(pacientes.size()>0)
                for(int i = 0;i<pacientes.size();i++){
                    if(codigoPaciente != codigoPaciente)
                        acho=1;
                }
            if(acho==1)
                JOptionPane.showMessageDialog(null, "Paciente não cadastrado","Aviso",1);
        }while(acho==1);

        nomePaciente = JOptionPane.showInputDialog(null, "Digite o nome do paciente: ");

        consultas.add(new Consulta(codigoConsulta, codigoPaciente));

        lista = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja efetuar outro cadastra consulta?\n1. Sim\n2. Não"));
        if(lista==1){
            cadastroConsulta();
        }else if(lista==2){
            menu();
        }
        else {
            JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA!!!", "Aviso", 1);
            menu();
        }
    }



    public static void sair(){

        JOptionPane.showMessageDialog(null, "Obrigado e até logo");
        System.exit(0);

    }

}
