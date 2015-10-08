package br.com.kronos.kronos;

/**
 * Created on 23/09/15.
 */
public class Atividade {
    private String nome;
    private double duracao; //em horas

    private double qualidade; //qualidade do tempo gasto para realizar a tarefa
    private String data; //ddmmyyyy

    public Atividade(String nome, double duracao, int qualidade, int dia, int mes, int ano) {
        this.nome = nome;
        this.duracao = duracao;
        this.qualidade = qualidade;
        this.data = setData(dia, mes, ano);
    }

    /*
    Esse método formata a data da maneira certa para salvar no banco de dados: ddmmaaaa
     */
    private String setData(int dia, int mes, int ano) {
        String data = "";

        //Caso a dia seja de apenas um digito (menor que 10), acrescentar dígito '0'
        if (dia < 10) {
            data += 0 + ""+dia;
        }else{
            data += ""+dia;
        }

        //Caso a mes seja de apenas um digito (menor que 10), acrescentar dígito '0'
        if (mes < 10) {
            data += 0 + ""+mes;
        }else{
            data += ""+mes;
        }

        data += ""+ano;

        return data;
    }

    public String getNome() {
        return nome;
    }

    public int getHora() {
        return (int) duracao;
    }


    public int getMinuto() {
        return (int) (duracao*60)%60;
    }
}
