package com.lautajamdev.starters;

import com.lautajamdev.types.Fire_Type;
import com.lautajamdev.types.Pokemon;

public class Charmander extends Pokemon implements Fire_Type{

	public Charmander() {
	}

	@Override
	public void firePunchAttack() {
		System.out.println("I'm Charmander and i use firePunchAttack");
		
	}

	@Override
	public void embersAttack() {
		System.out.println("I'm Charmander and i use embersAttack");
		
	}

	@Override
	public void flameThrowerAttack() {
		System.out.println("I'm Charmander and i use flameThrowerAttack");
		
	}

	@Override
	public void tackleAttack() {
		System.out.println("I'm Charmander and i use tackleAttack");
		
	}

	@Override
	public void scratchAttack() {
		System.out.println("I'm Charmander and i use scratchAttack");
		
	}

	@Override
	public void nibbleAttack() {
		System.out.println("I'm Charmander and i use nibbleAttack");
		
	}

}
