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

public class Dijkstra {
    public static void dijkstra(Grafo grafo, int nodoInicio) {
        int V = grafo.V;
        int[] distancias = new int[V];
        Arrays.fill(distancias, Integer.MAX_VALUE); // Inicializamos todas las distancias como infinito
        distancias[nodoInicio] = 0; // La distancia al nodo de inicio es 0

        PriorityQueue<Integer> colaPrioridad = new PriorityQueue<>((a, b) -> distancias[a] - distancias[b]);
        colaPrioridad.add(nodoInicio);

        while (!colaPrioridad.isEmpty()) {
            int u = colaPrioridad.poll();
            for (Grafo.Vertice vertice : grafo.listaAdyacencia[u]) {
                int v = vertice.destino;
                int peso = vertice.peso;
                if (distancias[u] + peso < distancias[v]) {
                    distancias[v] = distancias[u] + peso;
                    colaPrioridad.add(v);
                }
            }
        }

        // Imprimir las distancias mínimas
        for (int i = 0; i < V; i++) {
            System.out.println("Distancia mínima desde " + nodoInicio + " hasta " + i + ": " + distancias[i]);
        }
    }
        public static void main(String[] args) {
        int V = 5;
        Grafo grafo = new Grafo(V);
        // A=o
        //B=1
        //C=2
        //D=3
        //E=4
        grafo.listaAdyacencia[0].add(grafo.new Vertice(1, 7));
        grafo.listaAdyacencia[0].add(grafo.new Vertice(4, 4));
        grafo.listaAdyacencia[1].add(grafo.new Vertice(3, 5));
        grafo.listaAdyacencia[1].add(grafo.new Vertice(4, 3));
        grafo.listaAdyacencia[2].add(grafo.new Vertice(1, 7));
        grafo.listaAdyacencia[2].add(grafo.new Vertice(0, 9));
        grafo.listaAdyacencia[3].add(grafo.new Vertice(4, 1));
        grafo.listaAdyacencia[4].add(grafo.new Vertice(2, 8));
      
        // ... Agrega más aristas según tu grafo
        dijkstra(grafo, 0); // Llama al algoritmo desde el nodo de inicio
    }
}


