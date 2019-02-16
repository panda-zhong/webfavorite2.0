package panda.nono.WebFavorite.po;

import java.io.Serializable;

/**
 * @author Berenice
 *用户类
 */
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String account;
	private String password;
	private String logo;
	private String email;
	private String regeditTime;
	public String getAccount() {
		return account;
	}
	
	public User(String account, String password) {
		super();
		this.account = account;
		this.password = password;
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
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegeditTime() {
		return regeditTime;
	}
	public void setRegeditTime(String regeditTime) {
		this.regeditTime = regeditTime;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
}
