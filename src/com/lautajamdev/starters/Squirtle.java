package com.lautajamdev.starters;

import com.lautajamdev.types.Aqua_Type;
import com.lautajamdev.types.Pokemon;

public class Squirtle extends Pokemon implements Aqua_Type{
	
	public Squirtle() {
		super();
	}

	@Override
	public void hydroBombAttack() {
		System.out.println("I'm Squirtle and i use hydroBombAttack");
		
	}

	@Override
	public void waterGunAttack() {
		System.out.println("I'm Squirtle and i use waterGunAttack");
		
	}

	@Override
	public void bubbleAttack() {
		System.out.println("I'm Squirtle and i use bubbleAttack");
		
	}

	@Override
	public void hydroPulseAttack() {
		System.out.println("I'm Squirtle and i use hydroPulseAttack");
		
	}

	@Override
	public void tackleAttack() {
		System.out.println("I'm Squirtle and i use tackleAttack");
		
	}

	@Override
	public void scratchAttack() {
		System.out.println("I'm Squirtle and i use scratchAttack");
		
	}

	@Override
	public void nibbleAttack() {
		System.out.println("I'm Squirtle and i use nibbleAttack");
		
	}

}
