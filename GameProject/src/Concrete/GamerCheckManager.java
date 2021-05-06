package Concrete;

import Abstract.IGamerCheck;
import Entities.Gamer;

public class GamerCheckManager implements IGamerCheck {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
