package Abstract;

import Entities.Gamer;

public interface IGamer {
	
	void register(Gamer gamer);
	
	void login(Gamer gamer);
	
	void update(Gamer gamer);
	
	void delete(Gamer gamer);
}
