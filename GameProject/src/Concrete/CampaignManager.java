package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.ICampaign;
import Entities.Campaign;

public class CampaignManager implements ICampaign {

	private List<Campaign> campaigns = new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName());
		
	}

	
	@Override
	public void update(Campaign campaign) {
		Campaign campaignToUpdate = campaigns.stream().filter(c -> c.getCampaignId() == campaign.getCampaignId())
				.findFirst().orElse(null);
		
		if(campaignToUpdate == null) {
			System.out.println("Aradýðýnýz kampanya bulunamadý");
			return;
		}
		
		campaignToUpdate.setCampaignName(campaign.getCampaignName());
		campaignToUpdate.setDiscount(campaign.getDiscount());
		
		System.out.println("Kampanya bilgileri güncellendi");
	}

}
