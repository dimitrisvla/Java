
public class TweetPost extends SocialMediaPost{
	private int retweets = 0;

	public TweetPost(String username, String text) {
		super("Twitter", username, text);
	}

	@Override
	public String getPlatform() {
		return "Twitter";
	}

	@Override
	public int getPopularity() {
		return retweets;
	}
	
	public RetweetPost retweet(String handle, String text){
		retweets++;
		return new RetweetPost(handle, text, this);
	}

}
