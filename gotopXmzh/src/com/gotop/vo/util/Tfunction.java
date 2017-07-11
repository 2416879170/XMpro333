package com.gotop.vo.util;

/**
 * Tfunction generated by MyEclipse Persistence Tools
 */

public class Tfunction implements java.io.Serializable {

	// Fields

	private TfunctionId id;

	private String gnmc;

	private Long gnlx;
	
	private String gntp;
	
	private String gnsj;
	
	private Long gnsx;
	
	private String note;
	// Constructors

	/** default constructor */
	public Tfunction() {
	}

	/** minimal constructor */
	public Tfunction(TfunctionId id, String gnmc) {
		this.id = id;
		this.gnmc = gnmc;
	}

	/** full constructor */
	public Tfunction(TfunctionId id, String gnmc, Long gnlx) {
		this.id = id;
		this.gnmc = gnmc;
		this.gnlx = gnlx;
	}

	// Property accessors

	public TfunctionId getId() {
		return this.id;
	}

	public void setId(TfunctionId id) {
		this.id = id;
	}

	public String getGnmc() {
		return this.gnmc;
	}

	public void setGnmc(String gnmc) {
		this.gnmc = gnmc;
	}

	public Long getGnlx() {
		return this.gnlx;
	}

	public void setGnlx(Long gnlx) {
		this.gnlx = gnlx;
	}

	public String getGntp() {
		return gntp;
	}

	public void setGntp(String gntp) {
		this.gntp = gntp;
	}

	public String getGnsj() {
		return gnsj;
	}

	public void setGnsj(String gnsj) {
		this.gnsj = gnsj;
	}

	public Long getGnsx() {
		return gnsx;
	}

	public void setGnsx(Long gnsx) {
		this.gnsx = gnsx;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}