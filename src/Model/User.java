package Model;

public class User {
	
	private String name;
	private String email;
	private String password;
	enum Type {PUBLISHER, CONSUMER}
	private Type userType ;
	
	public Type getUserType() {
		return userType;
	}
	public void setUserType(Type userType) {
		this.userType = userType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
