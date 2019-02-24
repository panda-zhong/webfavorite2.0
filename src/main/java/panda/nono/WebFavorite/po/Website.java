package panda.nono.WebFavorite.po;

public class Website {
	private String url;
	private String logo;
	private String kind;
	private String state;
	private String name;
	private String regeditTime;
	private String account;
	private String good;
	private String bad;
	private String readwebsite;
	private String detail;
	private String click;
	private String id;
	private String userWebsiteId;
	private String userRegeditTime;
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Website(String url, String logo, String kind, String name, String regeditTime, String account,
			String good, String bad, String readwebsite, String click, String id) {
		super();
		this.url = url;
		this.logo = logo;
		this.kind = kind;
		this.name = name;
		this.regeditTime = regeditTime;
		this.account = account;
		this.good = good;
		this.bad = bad;
		this.readwebsite = readwebsite;
		this.click = click;
		this.id = id;
	}
	public Website() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReadwebsite() {
		return readwebsite;
	}
	public void setReadwebsite(String readwebsite) {
		this.readwebsite = readwebsite;
	}
	@Override
	public String toString() {
		return "Website [url=" + url + ", logo=" + logo + ", kind=" + kind + ", state=" + state + ", name=" + name
				+ ", regeditTime=" + regeditTime + ", account=" + account + ", good=" + good + ", bad=" + bad
				+ ", readwebsite=" + readwebsite + ", click=" + click + "]";
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegeditTime() {
		return regeditTime;
	}
	public void setRegeditTime(String regeditTime) {
		this.regeditTime = regeditTime;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getGood() {
		return good;
	}
	public void setGood(String good) {
		this.good = good;
	}
	public String getBad() {
		return bad;
	}
	public void setBad(String bad) {
		this.bad = bad;
	}
	public String getClick() {
		return click;
	}
	public void setClick(String click) {
		this.click = click;
	}
	public String getUserWebsiteId() {
		return userWebsiteId;
	}
	public void setUserWebsiteId(String userWebsiteId) {
		this.userWebsiteId = userWebsiteId;
	}
	public String getUserRegeditTime() {
		return userRegeditTime;
	}
	public void setUserRegeditTime(String userRegeditTime) {
		this.userRegeditTime = userRegeditTime;
	}
}
