package com.lautajamdev.AppPokemon;

import com.lautajamdev.starters.Bulbasaur;
import com.lautajamdev.starters.Charmander;
import com.lautajamdev.starters.Pikachu;
import com.lautajamdev.starters.Squirtle;

public class App {

	public static void main(String[] args) {
		
		Pikachu pikachu = new Pikachu();
		Bulbasaur bulbasaur = new Bulbasaur();
		Charmander charmander = new Charmander();
		Squirtle squirtle = new Squirtle();
		
		pikachu.rayAttack();
		
		bulbasaur.sharpBladeAttack();

		charmander.firePunchAttack();

		squirtle.hydroPulseAttack();

		pikachu.nibbleAttack();
		bulbasaur.nibbleAttack();
		charmander.nibbleAttack();
		squirtle.nibbleAttack();
		

	}

}
