package com.lautajamdev.types;

public abstract class Pokemon {

	protected int num_pokedex;
	protected String name;
	protected double weight;
	protected String gender;
	protected int season;
	
	protected abstract void tackleAttack();
	
	protected abstract void scratchAttack();
	
	protected abstract void nibbleAttack();
	
	
}
