import java.util.ArrayList;
import java.util.List;

public class PokemonMain {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        System.out.println();

        chosenPokemon(pokemonOfAsh, wildPokemon);

        // Which pokemon should Ash use?

        System.out.println();

        System.out.print("I choose you, ");
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }

    public static List chosenPokemon(List<Pokemon> pokemonsInPocket, Pokemon wildPokemon) {
        List<Pokemon> chosenPokemons = new ArrayList<>();
        for (int i = 0; i < pokemonsInPocket.size(); i++) {
            if (pokemonsInPocket.get(i).isEffectiveAgainst(wildPokemon)) {
                chosenPokemons.add(pokemonsInPocket.get(i));
            }
        }
        for (int i = 0; i < chosenPokemons.size(); i++) {
            String pokemonName = pokemonName(chosenPokemons.get(i));
            System.out.println(pokemonName);
        }
        return chosenPokemons;
    }

    public static String pokemonName(Pokemon pokemon) {
        return pokemon.name;
    }


}