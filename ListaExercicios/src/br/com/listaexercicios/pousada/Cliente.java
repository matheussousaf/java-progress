package br.com.listaexercicios.pousada;

class Cliente {
    private String nome;
    private int diasHospedado;
    private int custoTotal;

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public int getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(int custoTotal) {
        this.custoTotal = custoTotal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiasHospedado() {
        return diasHospedado;
    }

    public void setDiasHospedado(int diasHospedado) {
        this.diasHospedado = diasHospedado;
    }
}
