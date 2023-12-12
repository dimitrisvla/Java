import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SocialMediaHub {
	private ArrayList<SocialMediaPost> posts = new ArrayList<SocialMediaPost>();
	
	public void addPost(SocialMediaPost post){
		posts.add(post);
	}
	
	public void displayPosts() {
		// Iterate over the ArrayList
        System.out.println("All posts:");
        for (SocialMediaPost post : posts) {
        	post.display();
        }
	}
	
	void displayMostPopular() {
		System.out.println("Most popular post:");
		if (posts.size() == 0){
			return;
		}
		SocialMediaPost mostPopularPost = posts.get(0);
		for (SocialMediaPost post: posts){
			if (mostPopularPost.getPopularity() < post.getPopularity()){
				mostPopularPost = post;
			}	
		}
		mostPopularPost.display();
	}
	
	
	
}
