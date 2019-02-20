package panda.nono.WebFavorite.po;

public class Websitelog {
	private String account;
	private String  url;
	private String time;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Websitelog [account=" + account + ", url=" + url + ", time=" + time + "]";
	}
	
}
