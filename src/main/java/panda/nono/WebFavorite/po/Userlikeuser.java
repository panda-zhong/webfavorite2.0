package panda.nono.WebFavorite.po;

import java.io.Serializable;

public class Userlikeuser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String  idolAccount;
	private String funsAccount;
	public String getIdolAccount() {
		return idolAccount;
	}
	public void setIdolAccount(String idolAccount) {
		this.idolAccount = idolAccount;
	}
	public String getFunsAccount() {
		return funsAccount;
	}
	public void setFunsAccount(String funsAccount) {
		this.funsAccount = funsAccount;
	}
	@Override
	public String toString() {
		return "Userlikeuser [idolAccount=" + idolAccount + ", funsAccount=" + funsAccount + "]";
	}
	
	
}
