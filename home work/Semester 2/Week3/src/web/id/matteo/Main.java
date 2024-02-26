package web.id.matteo;
import web.id.matteo.Pokemon.PokemonTypeFire;
import web.id.matteo.Pokemon.PokemonTypeElectric;

public class Main {
	public static void main(String[] args) {
		
		PokemonTypeFire pokemon1 = new PokemonTypeFire("Charmander", 20, 100);
		PokemonTypeElectric pokemon2 = new PokemonTypeElectric("Pikachu", 25, 100);
		
		pokemon1.display();
		pokemon2.display();
		
		pokemon1.attack(pokemon2);
		pokemon2.display();
		
		pokemon2.attack(pokemon1);
		pokemon1.display();
		
		pokemon1.attack(pokemon2);
		pokemon1.useFireMove(pokemon2);
		pokemon2.display();
		
		pokemon2.attack(pokemon1);
		pokemon2.useElectricMove(pokemon1);
		pokemon1.display();
		
		pokemon1.attack(pokemon2);
		pokemon1.useFireMove(pokemon2);
		pokemon2.display();
		
		pokemon2.attack(pokemon1);
		pokemon2.useElectricMove(pokemon1);
		pokemon1.display();
		
		pokemon1.attack(pokemon2);
		pokemon1.useFireMove(pokemon2);
		pokemon2.display();
	}
}
