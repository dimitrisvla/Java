
public abstract class SocialMediaPost {
	private String username;
	private String text;
	private String platformName;
	
	public SocialMediaPost(String platformName, String username, String text) {
		this.username = username;
		this.text = text;
		this.platformName = platformName;
	}
	
	public abstract String getPlatform();
	
	public abstract int getPopularity();

	@Override
	public String toString() {
		return "SocialMediaPost [username=" + username + ": text=" + text + "]";
	}
	
	public void display() {
		//getPlatform();
		//getPopularity();
		//toString();
		System.out.println(platformName +" post:");
		System.out.println(this);
		System.out.println("Popularity:"+getPopularity());
	}
	
}
