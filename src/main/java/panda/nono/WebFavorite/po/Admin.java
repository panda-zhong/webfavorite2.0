package panda.nono.WebFavorite.po;

public class Admin {
	private String account;
	private String password;
	private String email;
	private String logo;
	private String state;
	private String regeditTime;
	private String name;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRegeditTime() {
		return regeditTime;
	}
	public void setRegeditTime(String regeditTime) {
		this.regeditTime = regeditTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Admin [account=" + account + ", password=" + password + ", email=" + email + ", logo=" + logo
				+ ", state=" + state + ", regeditTime=" + regeditTime + ", name=" + name + "]";
	}
}
