package bean;

import java.util.List;
import javax.faces.component.html.HtmlOutputText;

public class PessoaBean {

    private String nome;
    private String sexo;
    private List<String> interesse;
    private String observacoes;
    private String data;

    public PessoaBean() {
        setData(String.valueOf(new java.util.Date()));
    }

    public String cadastrar() {
        return !nome.equals("") ? "sucesso" : "erro";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<String> getInteresse() {
        return interesse;
    }

    public void setInteresse(List<String> interesse) {
        this.interesse = interesse;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public HtmlOutputText getDados() {
        String info = "Nome: " + getNome() + "<br/>"
                + "Sexo: " + getSexo() + "<br/>"
                + "Interesse: " + getInteresse() + "<br/>"
                + "Observações: " + getObservacoes() + "<br/><br/>"
                + "Data: " + getData();

        HtmlOutputText dados = new HtmlOutputText();
        dados.setValue(info);
        return dados;
    }

}
