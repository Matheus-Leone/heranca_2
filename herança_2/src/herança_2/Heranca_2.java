package herança_2;

import java.time.LocalDate;

//Atributos da SuperClasse, que irá repassar para outras classes
class Vendedor {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private LocalDate dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, double percentualComissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    // Getters e Setters, ou seja, pega e utiliza a informação quando necessária
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Data de Contratação: " + dataContratacao);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Percentual de Comissão: " + percentualComissao + "%");
    }
}

//Atributos da SuperClasse, que irá repassar para outras classes
class Gerente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private LocalDate dataContratacao;
    private double salarioBase;
    private String departamento;

    public Gerente(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // Getters e Setters, ou seja, pega e utiliza a informação quando necessária
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Data de Contratação: " + dataContratacao);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Departamento: " + departamento);
    }
}

//Atributos da SuperClasse, que irá repassar para outras classes
class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;

    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    // Getters e Setters, ou seja, pega e utiliza a informação quando necessária
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
        System.out.println("Número do Cartão de Fidelidade: " + numeroCartaoFidelidade);
        System.out.println("Telefone: " + telefone);
    }
}