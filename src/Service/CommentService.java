package Service;

import java.util.ArrayList;

import Model.Comment;

public class CommentService {
	public static Comment createComment(StringBuilder commentText, Integer userId, Integer contentId ) {
		Comment comment = new Comment(commentText, userId, contentId);
		return comment;
	}
	
	public static Boolean deleteComment(Integer commentId) {
		System.out.println("Comment Deleted");
		return true;
	}
	
	public static ArrayList<String> showContentComment(Integer contentId ) {
		ArrayList<String> comments = new ArrayList<String>();
		System.out.println("calling commentDao to fetch records");
		comments.add("first comment for contentId " + contentId);
		comments.add("Second comment for contentId" +contentId);
		
		return comments;
	}
}
