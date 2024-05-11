/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafocamino;

/**
 *
 * @author ferpe
 */

import java.util.*;

class Grafo {
    public int V; // Número de nodos
    public List<Vertice>[] listaAdyacencia; // Lista de adyacencia

    public Grafo(int V) {
        this.V = V;
        listaAdyacencia = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            listaAdyacencia[i] = new ArrayList<>();
        }
    }

    // Clase interna para representar un vértice
    class Vertice {
        int destino;
        int peso;

        public Vertice(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }
}

