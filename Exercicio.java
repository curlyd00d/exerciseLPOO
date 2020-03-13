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
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FuncionarioApp funcionario1 = new FuncionarioApp();
        funcionario1.setStatusFerias(false);
        funcionario1.setIdade(20);
        funcionario1.setSalario(9580);
        funcionario1.setNome("Carlos");
        funcionario1.imprimir();
        
        FuncionarioApp funcionario2 = new FuncionarioApp();
        funcionario2.setStatusFerias(false);
        funcionario2.setIdade(35);
        funcionario2.setSalario(12520);
        funcionario2.setNome("Roberto");
        funcionario2.imprimir();
        
        FuncionarioApp funcionario3 = new FuncionarioApp();
        funcionario3.setStatusFerias(true);
        funcionario3.setIdade(43);
        funcionario3.setSalario(10580);
        funcionario3.setNome("Samuel");
        funcionario3.imprimir();
        
    }
    
}
