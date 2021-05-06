package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Abstract.IGamerCheck;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheck {


		@Override
		public boolean CheckIfRealPerson(Gamer gamer) {
			
			KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
			
			boolean result = true;
			
			try {
				result = kpsPublic.TCKimlikNoDogrula(
						Long.parseLong(gamer.getNationalityId()),
					    gamer.getFirstName().toUpperCase(),
						gamer.getLastName().toUpperCase(),
						gamer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());

				
			}catch(RemoteException e){
				e.printStackTrace();
			}
			
			
			return result;
		}
		

}
