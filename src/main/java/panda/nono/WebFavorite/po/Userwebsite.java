package panda.nono.WebFavorite.po;

public class Userwebsite {
	private String url;
	private String account;
	private String name;
	private String logo;
	private String detail;
	private String id;
	public String getUrl() {
		return url;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Userwebsite [url=" + url + ", account=" + account + ", name=" + name + ", logo=" + logo + ", detail="
				+ detail + "]";
	}
	
}
