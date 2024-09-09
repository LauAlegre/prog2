package ej3;

import java.util.ArrayList;
import java.util.List;


class Pila {
    private List<Object> stack; // Lista para almacenar los elementos de la pila

    // Constructor que inicializa la lista de la pila
    public Pila() {
        this.stack = new ArrayList<>();
    }

    // Método para agregar un elemento a la pila
    public void push(Object o) {
        stack.add(o);
    }

    // Método para retirar y retornar el último elemento agregado (tope de la pila)
    public Object pop() {
        if (stack.isEmpty()) {

            throw new IllegalStateException("La pila está vacía. No se puede realizar pop.");
        }
        return stack.remove(stack.size() - 1); // Remueve y retorna el último elemento
    }

    // Método para consultar el elemento en el tope de la pila sin retirarlo
    public Object top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("La pila está vacía. No se puede consultar el tope.");
        }
        return stack.get(stack.size() - 1); // Retorna el último elemento sin eliminarlo
    }

    // Método que retorna la cantidad de elementos en la pila
    public int size() {
        return stack.size();
    }

    // Método para retornar una copia de la pila con los mismos elementos en el mismo orden
    public Pila copy() {
        Pila nuevaPila = new Pila();
        nuevaPila.stack.addAll(this.stack); // Copia los elementos de la pila original
        return nuevaPila;
    }

    // Método para retornar una copia de la pila con los elementos en orden inverso
    public Pila reverse() {
        Pila pilaInversa = new Pila();
        for (int i = stack.size() - 1; i >= 0; i--) {
            pilaInversa.push(stack.get(i)); // Agrega los elementos en orden inverso
        }
        return pilaInversa;
    }

    // Método para mostrar la pila como cadena de texto
    @Override
    public String toString() {
        return "Pila" + stack.toString();
    }


    public static void main(String[] args) {
        Pila pila = new Pila();

        // Agregar elementos a la pila
        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");

        // Mostrar la pila
        System.out.println("Pila original: " + pila);

        // Consultar el tope de la pila
        System.out.println("Elemento en el tope: " + pila.top());

        // Retirar el tope de la pila
        System.out.println("Elemento retirado: " + pila.pop());

        // Mostrar la pila después de un pop
        System.out.println("Pila después de pop: " + pila);

        // Mostrar el tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.size());

        // Crear una copia de la pila
        Pila copiaPila = pila.copy();
        System.out.println("Copia de la pila: " + copiaPila);

        // Crear una pila invertida
        Pila pilaInvertida = pila.reverse();
        System.out.println("Pila invertida: " + pilaInvertida);

        // Verificar que la pila original no cambia
        System.out.println("Pila original después de copy y reverse: " + pila);
    }
}
