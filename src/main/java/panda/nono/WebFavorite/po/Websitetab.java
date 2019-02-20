package panda.nono.WebFavorite.po;

public class Websitetab {
	private String url;
	private String tab;
	
	public Websitetab() {
		super();
	}
	public void Websitetab1() {
		// TODO Auto-generated constructor stub
	}
	
	public Websitetab(String tab) {
		super();
		this.tab = tab;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTab() {
		return tab;
	}
	public void setTab(String tab) {
		this.tab = tab;
	}
	@Override
	public String toString() {
		return "Websitetab [url=" + url + ", tab=" + tab + "]";
	}
	
}
