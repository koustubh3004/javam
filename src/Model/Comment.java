package Model;

public class Comment implements Feedback {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int id;
	private StringBuilder comment;
	private Integer userId;
	private Integer contentId;
	
	public Comment(StringBuilder commentText, Integer userId, Integer contentId) {
		this.comment = commentText;
		this.userId = userId;
		this.contentId = contentId;
	}
		public StringBuilder getComment() {
			
		return comment;
	}
	public void setComment(StringBuilder comment) {
		this.comment = comment;
	}

		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public Integer getContentId() {
			return contentId;
		}
		public void setContentId(Integer contentId) {
			this.contentId = contentId;
		}

	}

