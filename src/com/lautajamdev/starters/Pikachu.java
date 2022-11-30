package com.lautajamdev.starters;

import com.lautajamdev.types.Electric_Type;
import com.lautajamdev.types.Pokemon;

public class Pikachu extends Pokemon implements Electric_Type{
	
	public Pikachu() {
	}

	@Override
	public void impacthunderAttack() {
		System.out.println("I'm Pikachu and i use impacthunderAttack");
		
	}

	@Override
	public void thunderPunchAttack() {
		System.out.println("I'm Pikachu and i use thunderPunchAttack");
		
	}

	@Override
	public void rayAttack() {
		System.out.println("I'm Pikachu and i use rayAttack");
		
	}

	@Override
	public void chargeRayAttack() {
		System.out.println("I'm Pikachu and i use chargeRayAttack");
		
	}

	@Override
	public void tackleAttack() {
		System.out.println("I'm Pikachu and i use tackleAttack");
		
	}

	@Override
	public void scratchAttack() {
		System.out.println("I'm Pikachu and i use scratchAttack");
		
	}

	@Override
	public void nibbleAttack() {
		System.out.println("I'm Pikachu and i use nibbleAttack");
		
	}

	
}
