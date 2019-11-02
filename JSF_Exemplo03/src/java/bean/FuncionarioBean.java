package bean;

import java.util.ArrayList;
import javax.faces.component.html.HtmlInputHidden;

public class FuncionarioBean {

    private String nome;
    private String idade;
    private String salario;
    private String erros;
    private HtmlInputHidden tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getErros() {
        return erros;
    }

    public void setErros(String erros) {
        this.erros = erros;
    }

    public HtmlInputHidden getTipo() {
        return tipo;
    }

    public void setTipo(HtmlInputHidden tipo) {
        this.tipo = tipo;
    }

    public String cadastrar() {
        String t = getTipo().getValue().toString();
        if (t.equals("1")) {
            return validacaoManual();
        } else if (t.equals("2")) {
            return "sucesso";
        } else if (t.equals("3")) {
            return "sucesso";
        }
        return "erro";
    }

    public String validacaoManual() {
        ArrayList<String> msg = new ArrayList<String>();

        if (getNome().equals("")) {
            msg.add("Nome do funcionário não preenchido.");
        }
        try {
            if (Double.parseDouble(getSalario()) < 500.00) {
                msg.add("O salário de ser maior que o piso salarial(R$ 500,00).");
            }
        } catch (NumberFormatException e) {
            msg.add("O valor informado no campo salário é inválido");
        }

        try {
            if (Integer.parseInt(getIdade()) < 18) {
                msg.add(
                        "A idade do funcionário deve ser no mínimo18 anos.");
            }
        } catch (NumberFormatException e) {
            msg.add("O valor informado no campo idade é inválido");
        }

        if (msg.size() > 0) {
            erros = "<ul>";
            for (int i = 0; i < msg.size(); i++) {
                erros += "<li>" + msg.get(i) + "</li>";
            }
            erros += "</ul>";
            return "erro";
        } else {
            return "sucesso";
        }
    }

}
