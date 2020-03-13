/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author curly
 */
public class FuncionarioApp {
    private boolean statusFerias;
    private int idade;
    private float salario;
    private String nome;
    
    
    public boolean getStatusFerias(){
        return statusFerias;
    }
    public void setStatusFerias(boolean statusFerias){
        this.statusFerias = statusFerias;
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public float getSalario(){
        return salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public String nome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void status(){
        if(this.statusFerias == true){
            System.out.println("O funcionário está de férias");
        }else{
            System.out.println("O funcionário não está de férias");
        }
    }
    public void imprimir(){
        this.status();
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: " + this.salario);
        System.out.println("Nome: " + this.nome);
        System.out.println("\n");
        
    }
}
