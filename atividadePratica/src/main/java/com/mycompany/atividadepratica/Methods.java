/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepratica;

import java.util.ArrayList;

/**
 *
 * @author Ra
 */
public class Methods {
    
    
    ArrayList<testProd> produtos = new ArrayList<testProd>();
    Double valorTotal = 0.0;
    Double valorDesconto = 0.0;
    
    public void addProduto(int qtd, int valor){
    
        
        if(qtd > 0 && valor > 0){
            testProd obj = new testProd(qtd,valor );
            produtos.add(obj);
        
        } else {
        
            System.out.println("Valor inválido");
        
        }
        
    
    
    }
    
    
    
    
    public double listProduto(){
    
    
     
     
    
        for (int i = 0; i < produtos.size(); i++) {
            
            int valorQtd = produtos.get(i).getValor() * produtos.get(i).getQuantidade();
            System.out.println("Produto:"+ i +" Quantidade:" + produtos.get(i).getQuantidade()+ " Valor Base:" + produtos.get(i).getValor() + " ValorQtd:" + valorQtd);
            
            valorTotal += valorQtd;
            
            
        }
        
        return valorTotal;
    
    }
    
    public double applyDesconto(){
    
    if (valorTotal > 100){
        
           valorDesconto = valorTotal - (valorTotal * 10 / 100);
            
            return valorDesconto;
        }
        
    return valorTotal;
    
    
    }
    
    
    
    
    
    
    
}
