package br.edu.fateczl.pilhastrings;

public class Pilha {
	
    No topo;

    public Pilha() {
        topo = null; //Começo a pilha sem nada! Estrutura vazia!
    }

    public boolean isEmpty() {
        return topo == null;
    }

    // push
    public void push(String e) {
        No elemento = new No();
        elemento.dado = e;
        if (isEmpty()) {
            topo = elemento;
        } else {
            elemento.proximo = topo;
            topo = elemento;
        }
    }

    // pop
    public String pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Não há elementos para desempilhar!");
        }
        String valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    // top
    public String top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Não há elemento na pilha!");
        }
        return topo.dado;
    }

    // size
    public int size() {
        int cont = 0;
        No auxiliar = topo;
        while (auxiliar != null) {
            auxiliar = auxiliar.proximo;
            cont++;
        }
        return cont;
    }
}
