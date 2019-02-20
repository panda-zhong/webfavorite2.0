package panda.nono.WebFavorite.po;

import java.io.Serializable;

public class Message implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String detail;
	private String from;
	private String to;
	private String time;
	private String state;
	private String id;
	public String getDetail() {
		return detail;
	}
	public Message() {
		// TODO Auto-generated constructor stub
	}
	public Message(String detail, String from, String time, String id) {
		super();
		this.detail = detail;
		this.from = from;
		this.time = time;
		this.id = id;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "message [detail=" + detail + ", from=" + from + ", to=" + to + ", time=" + time + ", state=" + state
				+ ", id=" + id + "]";
	}
}
