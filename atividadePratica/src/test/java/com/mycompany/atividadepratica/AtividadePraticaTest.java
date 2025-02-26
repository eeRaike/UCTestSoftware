/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.atividadepratica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Ra
 */
public class AtividadePraticaTest {
    
    Methods op = new Methods();
    
    public AtividadePraticaTest() {
    }

    
    
    @Test
    @DisplayName("inserção de valor abaixo de 100 ")
    public void test1(){

    op.addProduto(1, 1);
    op.addProduto(5, 1);
    op.addProduto(6, 10);
    op.listProduto();
    op.applyDesconto();
    assertEquals(66.0, op.applyDesconto());


}
    
    @Test
    @DisplayName("inserção de valor negativo ")
    public void test2(){

    op.addProduto(1, 1);
    op.addProduto(5, 1);
    op.addProduto(6, -10);
    op.listProduto();
    op.applyDesconto();
    assertEquals(6.0, op.applyDesconto());


}
    
    
    @Test
    @DisplayName("listagem com lista vazia")
    public void test3(){
    
        System.out.println("Valor: " + op.listProduto());
        assertEquals(0.0, op.listProduto());
    
    
    
    }


    @Test
    @DisplayName("checar se o desconto é aplicado")
    public void test4(){

    op.addProduto(5, 10);
    op.addProduto(5, 10);
    op.addProduto(6, 10);
    op.listProduto();
        System.out.println(op.applyDesconto());
    assertEquals(144.0, op.applyDesconto());
    
    }
    
    
    
}
