
public class RetweetPost extends TweetPost {
	private TweetPost original;
	
	public RetweetPost(String username, String text, TweetPost original) {
		super(username, text);
		this.original = original;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " RT "+original.toString();
	}

	
}
