package com.lautajamdev.starters;

import com.lautajamdev.types.Plant_Type;
import com.lautajamdev.types.Pokemon;

public class Bulbasaur extends Pokemon implements Plant_Type{

	
	
	public Bulbasaur() {
	}

	@Override
	public void paralyzeAttack() {
		System.out.println("I'm Bulbasaur and i use paralyzeAttack");
		
	}

	@Override
	public void drainageAttack() {
		System.out.println("I'm Bulbasaur and i use drainageAttack");
		
	}

	@Override
	public void sharpBladeAttack() {
		System.out.println("I'm Bulbasaur and i use sharpBladeAttack");
		
	}

	@Override
	public void vineWhipAttack() {
		System.out.println("I'm Bulbasaur and i use vineWhipAttack");
		
	}

	@Override
	public void tackleAttack() {
		System.out.println("I'm Bulbasaur and i use tackleAttack");
		
	}

	@Override
	public void scratchAttack() {
		System.out.println("I'm Bulbasaur and i use scratchAttack");
		
	}

	@Override
	public void nibbleAttack() {
		System.out.println("I'm Bulbasaur and i use nibbleAttack");
		
	}

	
	
}
