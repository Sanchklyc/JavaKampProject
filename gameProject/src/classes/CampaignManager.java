package classes;

import java.util.ArrayList;
import java.util.List;

import entities.Campaign;
import interfaces.CampaignService;

public class CampaignManager implements CampaignService{
	List<Campaign> campaigns = new ArrayList<Campaign>();
	@Override
	public void add(Campaign campaign) {
       campaigns.add(campaign);
       System.out.println("Kampanya başarıyla eklendi.");
	}

	@Override
	public void remove(Campaign campaign) {
		campaigns.removeIf(obj->obj.getId() == campaign.getId());
	    System.out.println("Kampanya başarıyla silindi.");
	}

	@Override
	public void update(Campaign campaign) {
	   System.out.println("Kampanya başarıyla güncellendi.");
	}

	@Override
	public List<Campaign> getAll() {
        return this.campaigns;
	}

}
