package it.polito.tdp.hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// utilizzo dell'Hash Set
		
		Set<Impiegato> impiegati = new HashSet<Impiegato>();
		Impiegato i1 = new Impiegato(25, "Enrico", "Ponzetto");
		Impiegato i2 = new Impiegato(28, "Gianluigi", "Ponzetto");
		Impiegato i3 = new Impiegato(67, "Angela", "Brunetto");
		
		impiegati.add(i1);
		impiegati.add(i2);
		impiegati.add(i3);
		
		Iterator<Impiegato> it = impiegati.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		// confronto tempi add / remove tra diversi ADT
		
		Set<String> set = new HashSet<String>();
		List<String> ll = new LinkedList<String>();
		List<String> al = new ArrayList<String>();
		
		int MAX = 100000;
		
		Long start = System.nanoTime();
		for(int i=0; i<MAX; i++){
			String s = new String("s_"+i);
			set.add(s);
		}
		Long stop = System.nanoTime();
		System.out.println("Set add: "+(stop-start)/1e9);
		
		start = System.nanoTime();
		for(int i=0; i<MAX; i++){
			String s = new String("s_"+i);
			ll.add(s);
		}
		stop = System.nanoTime();
		System.out.println("Linked List add: "+(stop-start)/1e9);
		
		start = System.nanoTime();
		for(int i=0; i<MAX; i++){
			String s = new String("s_"+i);
			al.add(s);
		}
		stop = System.nanoTime();
		System.out.println("Array List add: "+(stop-start)/1e9);
		
		start = System.nanoTime();
		for(int i=MAX-1; i<=0; i++){
			String s = new String("s_"+i);
			set.remove(s);
		}
		stop = System.nanoTime();
		System.out.println("Set remove: "+(stop-start)/1e9);
		
		start = System.nanoTime();
		for(int i=MAX-1; i<=0; i++){
			String s = new String("s_"+i);
			ll.remove(s);
		}
		stop = System.nanoTime();
		System.out.println("Linked List remove: "+(stop-start)/1e9);
		
		start = System.nanoTime();
		for(int i=MAX-1; i<=0; i++){
			String s = new String("s_"+i);
			al.remove(s);
		}
		stop = System.nanoTime();
		System.out.println("Array List remove: "+(stop-start)/1e9);

	}

}
