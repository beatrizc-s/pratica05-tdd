package com.gqs.aula.tdd;

public class CalculadoraNota {

    public double calcularNotaFinal(double n1, double n2) {
        if (n1 < 0 || n2 < 0) {
            throw new IllegalArgumentException("As notas não podem ser negativas.");
        }
        
        double total = n1 + n2;
        
        if (total > 100.0) {
            throw new IllegalArgumentException("A nota final não pode ser superior a 100.");
        }
        
        return total;
    }
}
