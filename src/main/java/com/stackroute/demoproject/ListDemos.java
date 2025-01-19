package com.stackroute.demoproject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemos {
	
	public static void demo1() {
		
		List<Employe> emplist = new ArrayList<Employe>();
//		studentlist.add("Sam");
//		studentlist.add("Tom");
		
		emplist.add(new Employe("e001","Chris"));
		emplist.add(new Employe("e002","Tom"));
		Employe newEmploye = new Employe("e003","Kris");
		
		emplist.add(newEmploye);
//		
//		System.out.println(emplist.get(1));
//		System.out.println(emplist.get(2));
		
//		for(Employe employe :emplist){
//			System.out.println(employe);
//		}
//		
		ListIterator<Employe> listitr =  emplist.listIterator();
		
		System.out.println(listitr.next());
		System.out.println(listitr.next());
		System.out.println(listitr.previous());
		System.out.println(listitr.previous());
		
	}
	
	public static void main(String[] args) {
		
		demo1();
		
	}

}


class Employe{
	
	public String empid;
	public String empname;
	
	public Employe(String empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return empid + " - " + empname;
	}
	
	
	
}