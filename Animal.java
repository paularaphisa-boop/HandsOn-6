public class Animal {
    private String nome;
    private int idade;

    public Animal (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    
    public String emitirSom(){
        return "O animal está emitindo um som.";

    }

    public String toString(){
        return " Nome: " + this.nome + "\n Idade: " + idade; 
    
    }
}