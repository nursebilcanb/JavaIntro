package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.IGamer;
import Abstract.IGamerCheck;
import Entities.Gamer;

public class GamerManager implements IGamer {
	
	private List<Gamer> gamers = new ArrayList<Gamer>();
	
	private IGamerCheck _gamerCheck;

	public GamerManager() {
		
	}
	
	public GamerManager(IGamerCheck _gamerCheck) {
		super();
		this._gamerCheck = _gamerCheck;
	}

	
	public void register(Gamer gamer) {
		System.out.println("Kayýt olundu : " + gamer.getFirstName());
	}
	
	public void login(Gamer gamer) {
		if(_gamerCheck.CheckIfRealPerson(gamer)) {
			System.out.println("Kimlik bilgileri doðrulandý ve giriþ yapýldý : " + gamer.getFirstName());			
		}else {
			System.out.println("Kimlik bilgileri doðrulanamadý : " + gamer.getFirstName());	
		}
		
	}
	
	public void update(Gamer gamer) {
		Gamer gamerToUpdate = gamers.stream().filter(g -> g.getGamerId() == gamer.getGamerId() )
				.findFirst().orElse(null);
		
		if (gamerToUpdate == null) {
			System.out.println("Kullanýcý bulunamadý");
			return;
		}
		
		gamerToUpdate.setGamerName(gamer.getGamerName());
		gamerToUpdate.setEmail(gamer.getEmail());
		gamerToUpdate.setPassword(gamer.getPassword());
		
		System.out.println("Kullanýcý bilgileri güncellendi : ");
	}
	
	public void delete (Gamer gamer) {
		Gamer gamerToDelete = gamers.stream().filter(g -> g.getGamerId() == gamer.getGamerId() )
				.findFirst().orElse(null);
		
		if (gamerToDelete == null) {
			System.out.println("Kullanýcý bulunamadý");
			return;
		}
		
		gamers.remove(gamerToDelete);
		System.out.println("Kullanýcý silindi");
		
	}

}
