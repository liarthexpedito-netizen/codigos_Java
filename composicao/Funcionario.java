package composicao;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Funcionario {
   
    private String nome;
    private Experiencia xp;
    private Double salario_base;

    //A classe 'Departamento' está contida em na classe 'Funcionario'
    private Departamento departamento;
    //Como um funcionário pode ter vários contratos, iremos colocá-los em uma lista
    private List <Contrato_por_hora> contratos = new ArrayList<>();

    public Funcionario() {}

    public Funcionario(String nome, Experiencia xp, Double salario_base, Departamento departamento) {
        this.nome = nome;
        this.xp = xp;
        this.salario_base = salario_base;
        this.departamento = departamento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Experiencia getXp() {
        return xp;
    }

    public void setXp(Experiencia xp) {
        this.xp = xp;
    }

    public Double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(Double salario_base) {
        this.salario_base = salario_base;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    //Depois de criamos a lista, essa linha irá pegar/buscar os contratos.
    public List <Contrato_por_hora> getContratos() {
        return contratos;
    }

    //Adicionando novos contratos
    public void Adicionando_contrato(Contrato_por_hora contrato) {
        contratos.add(contrato);
    }

    //Removando contratos()
    public void Removendo_contrato(Contrato_por_hora contrato) {
        contratos.remove(contrato);
    }

    //Calcular a renda do funcionário
    public double renda (int mes, int ano) {
        double soma = salario_base;

        //Viajando pela lista
        for (Contrato_por_hora c : contratos) {

            LocalDate data_do_contrato = c.getData();

            if (data_do_contrato.getYear() == ano && data_do_contrato.getMonthValue() == mes) {
                soma += c.valor_total();
            }

        }

        return soma;
    }

}