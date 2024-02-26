package web.id.matteo;

public class Pokemon {
	// Father class

	// objects
	String name;
	String type;
	int attackPower;
	int health;

	// getter and setter
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	// constructor
	public Pokemon(String name, String Pokemontype, int attackPower, int health) {
		this.name = name;
		this.type = Pokemontype;
		this.attackPower = attackPower;
		this.health = health;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Health: " + health);
		System.out.println("Power: " + attackPower);
		System.out.println("Type: " + type);
		System.out.println();
	}

	public void attack(Pokemon pokemon) {
		int attack = attackPower;
		System.out.printf("%s attacks %s\n", name, pokemon.getName());

		if (pokemon.getHealth() > 0)
			takeDamage(attack, pokemon);
		else
			System.out.printf("%s has already fainted!\n", pokemon.getName());

		System.out.println();

	}

	public static void takeDamage(int attack, Pokemon pokemon) {
		int health = pokemon.getHealth() - attack;
		pokemon.setHealth(health);
		System.out.printf("%s receives damage: %d\n", pokemon.getName(), attack);

		// if the pokemon health is zero or under,
		// it reset to zero again.
		if (pokemon.getHealth() <= 0) {
			pokemon.setHealth(0);
			System.out.printf("%s fainted!\n", pokemon.getName());
		}

	}

	// ============== Child classes (Pokemon Types) ==============

	public static class PokemonTypeFire extends Pokemon {

		// Initialize
		private static String pokemonType = "fire";

		public PokemonTypeFire(String name, int attackPower, int health) {
			super(name, pokemonType, attackPower, health);
		}

		// Constructor
		public void useFireMove(Pokemon pokemon) {
			String effect = "burns";
			int attack = 10;
			System.out.printf("%s use a %s move on %s and %s them\n", name, pokemonType, pokemon.getName(), effect);
			if (pokemon.getHealth() > 0)
				takeDamage(attack, pokemon);
			else
				System.out.printf("%s has already fainted!\n", pokemon.getName());

			System.out.println();
		}
	}

	public static class PokemonTypeElectric extends Pokemon {
		// Initialize
		private static String pokemonType = "electric";

		public PokemonTypeElectric(String name, int attackPower, int health) {
			super(name, pokemonType, attackPower, health);

		}

		// Constructor
		public void useElectricMove(Pokemon pokemon) {
			String effect = "paralyze";
			int attack = 5;
			System.out.printf("%s use an %s move on %s and %s them\n", name, pokemonType, pokemon.getName(), effect);
			if (pokemon.getHealth() > 0)
				takeDamage(attack, pokemon);
			else
				System.out.printf("%s has already fainted!\n", pokemon.getName());
			System.out.println();
		}
		// Ooh-wee-hoo, I look just like Buddy Holly
		// Oh-oh, and you're Mary Tyler Moore
		// I don't care what they say about us anyway
		// I don't care about that
		// ~ weezer ~
	}
}
