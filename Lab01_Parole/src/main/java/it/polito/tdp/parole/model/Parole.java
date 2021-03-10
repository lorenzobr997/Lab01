package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Parole {
	ArrayList<String> parole;
	ArrayList<String> paroleo;
	
	public Parole() {
		//TODO
		parole = new ArrayList<>();
		paroleo = new ArrayList<>();
	}
	
	public void addParola(String p) {
		//TODO
		parole.add(p);
	}
	
	public class Comp implements Comparator<String>{
		public int compare(String p1, String p2) {
			p1 = p1.toUpperCase();
			p2 = p2.toUpperCase();
			return p1.compareTo(p2);
		}
	}
	
	public List<String> getElenco() {
		//TODO
		paroleo.addAll(parole);
		Collections.sort(paroleo, new Comp());
		return paroleo;
	}
	
	public void reset() {
		// TODO
		parole.clear();
		paroleo.clear();
	}
	
	public List<String> canc(String p) {
		for(int i = 0; i < paroleo.size(); i++) {
			if(paroleo.get(i).equals(p)) {
				paroleo.remove(i);
			}
		}
		return paroleo;
	}

}
