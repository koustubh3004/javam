package Model;

public class Like implements Feedback {
	private Boolean like;
	private Integer userId;
	private Integer contentId;
	
	public Boolean getLike() {
		return like;
	}
	public void setLike(Boolean like) {
		this.like = like;
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
