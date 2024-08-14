package com.solid.srp.models;

public class Cooker extends Employee{
	private void cook(Dish dishType) {
		System.out.println(super.getName() + "is cooking");
		
		switch (dishType) {
		case COOK_LASAGNA:
			cookLasagna();
			break;
		case COOK_PIZZA:
			cookPizza();	
			break;	

		default:
			System.out.println("Opção não encontrada");
			break;
		}
	}
	
	private void cookLasagna() {
		System.out.println(super.getName() + "is cooking lasagna");
	}
	
	private void cookPizza() {
		System.out.println(super.getName() + "is cooking pizza");
	}
}
