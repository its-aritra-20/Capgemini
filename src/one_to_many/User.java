package one_to_many;

public class User {
	String userName;
	static int count = 0;
	Post[] posts;

	public User(int size, String userName) {
		this.posts = new Post[size];
		// System.out.println("Enter userName");
		this.userName = userName;
	}

	public void addUser(Post post) {
		if (count < posts.length) {
			posts[count++] = post;
			// this.userName=name;
			System.out.println("Post added");
		} else {
			System.out.println("Post not added");
		}
	}

	public void displayUsers() {
		for (int i = 0; i < count; i++) {
			System.out.println(posts[i].postId + " " + posts[i].postDescription + " " + this.userName);
		}
	}

}
