/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHInfoNote
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p = new Pessoa("Jose", 1,"Tapejara");
        System.out.println("--------------------------------------");
        System.out.println(p.getId()+" "+p.getNome()+""+p.getEndereco());
    }
    
}
