package com.gotop.vo.util;

/**
 * TmenuGroup generated by MyEclipse Persistence Tools
 */

public class TmenuGroup implements java.io.Serializable {

	// Fields

	private Integer fzbh;

	private String fzmc;

	private String fzsm;

	private Integer xswz;
	
	private String tp2l;

	// Constructors

	/** default constructor */
	public TmenuGroup() {
	}

	/** full constructor */
	public TmenuGroup(String fzmc, String fzsm, Integer xswz,String tp2l) {
		this.fzmc = fzmc;
		this.fzsm = fzsm;
		this.xswz = xswz;
		this.tp2l = tp2l;
	}

	// Property accessors

	public Integer getFzbh() {
		return this.fzbh;
	}

	public void setFzbh(Integer fzbh) {
		this.fzbh = fzbh;
	}

	public String getFzmc() {
		return this.fzmc;
	}

	public void setFzmc(String fzmc) {
		this.fzmc = fzmc;
	}

	public String getFzsm() {
		return this.fzsm;
	}

	public void setFzsm(String fzsm) {
		this.fzsm = fzsm;
	}

	public Integer getXswz() {
		return this.xswz;
	}

	public void setXswz(Integer xswz) {
		this.xswz = xswz;
	}

	public String getTp2l() {
		return tp2l;
	}

	public void setTp2l(String tp2l) {
		this.tp2l = tp2l;
	}

}