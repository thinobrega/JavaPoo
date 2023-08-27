package com.mycompany.projetoyoutube;


/*
implementação de interfaces, encapsulamento,
herança, poliforfismo de sobreposição*/
public class ProjetoYoutube {

    public static void main(String[] args) {

     Video v[] = new Video[3];
     v[0] = new Video("Aula 1 de Poo");
     v[1] = new Video("Aula 12 de Php");
     v[2] = new Video("Aula 10 de html-5");
     
     Gafanhoto g[] = new Gafanhoto[2];
     g[0] = new Gafanhoto("Jubileu",22, "M","juba");
     g[1] = new Gafanhoto("Creuza",23, "F","creuzita");

     Visualizacao vis[] = new Visualizacao[5];
     vis[0] = new Visualizacao (g[0],v[2]);
     vis[0].avaliar();
      System.out.println(vis[0].toString());
      
      
      vis[1] = new Visualizacao(g[0],v[1]);
      vis[0].avaliar(35.0f);
        System.out.println(vis[1].toString());
        
     
        
        
    }
}
