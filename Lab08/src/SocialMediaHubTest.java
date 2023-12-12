
public class SocialMediaHubTest {

	public static void main(String[] args) {
		SocialMediaHub hub = new SocialMediaHub();
		FacebookPost fbPost = new FacebookPost("Marc","Facebook is the best social media platform");
		TweetPost tweet = new TweetPost("@Alice","Good morning world!");
		hub.addPost(fbPost);
		hub.addPost(tweet);
		fbPost.addLike(); fbPost.addLike(); fbPost.addLike();
		hub.displayPosts();
		//System.out.println();
		hub.displayMostPopular();
		//-----------------------------------------//
		System.out.println();
		RetweetPost rt1 = tweet.retweet("@Bob","");
		RetweetPost rt2 = tweet.retweet("@Charlie","Good morning Alice!");	
		hub.addPost(rt1);
		hub.addPost(rt2);
		hub.displayPosts();
		//System.out.println();
		hub.displayMostPopular(); 
	}

}
