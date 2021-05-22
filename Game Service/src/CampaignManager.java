
public class CampaignManager implements CampaignServiceManager{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya " + campaign.getCampaignName() + " sizlerle");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya " + campaign.getCampaignName() + " silindi");
		
	}

}
