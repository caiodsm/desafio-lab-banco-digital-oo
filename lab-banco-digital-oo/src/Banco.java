
// ABSTRAÇÃO  - é transformar algo que era abstrato que tava no mundo das ideias
// interpretar o mundo real, pegar as coisas que esta ali nas entrelinhas e trazer computacionalmente

// ENCAPSULAMENTO - esconder a implementação do objeto que precisa esconder (não expor mais que o necessario), 
// definindo a interface de uso 
// tendo muitas relação com get e set

// herança 

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    } 
    
}
