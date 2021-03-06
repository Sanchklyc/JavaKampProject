package classes;

import java.util.ArrayList;
import java.util.List;

import entities.Game;
import interfaces.GameService;

public class GameManager implements GameService{
	
	List<Game> games = new ArrayList<Game>();

	@Override
	public void add(Game game) {
		this.games.add(game);
		System.out.println(game.getName() + " isimli oyun başarıyla eklendi.");
	}

	@Override
	public void remove(Game game) {
		this.games.removeIf(obj->obj.getId() == game.getId());
		System.out.println(game.getName() + " isimli oyun başarıyla silindi.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " isimli oyun başarıyla güncellendi.");
	}

	@Override
	public List<Game> getAll() {
		return this.games;
	}
    
}
