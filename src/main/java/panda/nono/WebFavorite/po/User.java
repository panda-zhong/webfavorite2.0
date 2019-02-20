package panda.nono.WebFavorite.po;

import java.io.Serializable;

/**
 * @author Berenice
 *鐢ㄦ埛绫�
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
	private String state;
	private String introduction;
	private String name;
	private String funsSize;
	private String salt;
	private String idolSize;


	public User(String account, String password, String logo, String email, String name) {
		super();
		this.account = account;
		this.password = password;
		this.logo = logo;
		this.email = email;
		this.name = name;
	}


	public User(String account, String logo, String email, String regeditTime, String introduction, String name) {
		super();
		this.account = account;
		this.logo = logo;
		this.email = email;
		this.regeditTime = regeditTime;
		this.introduction = introduction;
		this.name = name;
	}


	@Override
	public String toString() {
		return "User [account=" + account + ", password=" + password + ", logo=" + logo + ", email=" + email
				+ ", regeditTime=" + regeditTime + ", state=" + state + ", introduction=" + introduction + ", name="
				+ name + ", funsSize=" + funsSize + "]";
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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

	public String getFunsSize() {
		return funsSize;
	}

	public void setFunsSize(String funsSize) {
		this.funsSize = funsSize;
	}


	public String getSalt() {
		return salt;
	}


	public void setSalt(String salt) {
		this.salt = salt;
	}


	public String getIdolSize() {
		return idolSize;
	}


	public void setIdolSize(String idolSize) {
		this.idolSize = idolSize;
	}
}
