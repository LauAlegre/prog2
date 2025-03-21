package ProgramacionIII.tp1;

import java.util.NoSuchElementException;

import java.util.Iterator;

public class MySimpleLinkedList<T extends Comparable<T>> implements Iterable<T> {
	
	private Node<T> first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	public void insertarOrdenado(T e) {
		Node<T> nuevo = new Node<>(e, null);


		if (isEmpty() || first.getInfo().compareTo(e) > 0) {
			nuevo.setNext(first);
			first = nuevo;
		} else {

			Node<T> actual = first;
			while (actual.getNext() != null && actual.getNext().getInfo().compareTo(e) <= 0) {
				actual = actual.getNext();
			}
			nuevo.setNext(actual.getNext());
			actual.setNext(nuevo);
		}
		size++;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;

	}
	
	public T extractFront() {
		if (this.first == null) {
			return null;
		}

		T data = this.first.getInfo();
		this.first = this.first.getNext();
		this.size--;

		return data;
	}

	public boolean isEmpty() {
		// TODO
		return size==0;
	}
	
	public T get(int index) {
		// TODO
		if(index<0 || index>=size){
			return null;
		}
		Node<T> aux = this.first;//aux
		for (int i = 0 ; i < size ; i++) {
			if(index==i){
				return aux.getInfo();
			}
			aux = first.getNext();
		}

		return null;
	}
	
	public int size() {
		// TODO
		return size;
	}
	
	@Override
	public String toString() {
		// TODO
		return "";
	}

	public int indexOf(T element){
		Node<T> aux = this.first;
		for (int i=0 ; i < size ; i++) {
			if(aux.getInfo().equals(element)){
				return i;
			}
			aux = aux.getNext();
		}
		return -1;
	}


	@Override
	public Iterator<T> iterator() {
		return new MyIterator();
	}



	private class MyIterator implements Iterator<T> {
		private Node<T> current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			if (!hasNext()) throw new NoSuchElementException();
			T data = current.getInfo();
			current = current.getNext();
			return data;
		}
	}
}
