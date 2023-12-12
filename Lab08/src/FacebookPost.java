
public class FacebookPost extends SocialMediaPost {
	private int likes = 0;
	
	public FacebookPost(String username, String text) {
		super("Facebook", username, text);
	}

	@Override
	public String getPlatform() {
		return "Facebook";
	}

	@Override
	public int getPopularity() {
		return likes;
	}

	public void addLike() {
		this.likes ++;
	}
}
