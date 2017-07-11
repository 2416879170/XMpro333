package com.gotop.vo.util;

import java.util.List;

/**
 * Txtbxx generated by MyEclipse Persistence Tools
 */

public class Txtbxx implements java.io.Serializable {

	// Fields

	private TxtbxxId id;

	private Integer zdxh;

	private String zdzwms;

	private String zdlx;

	private String zdkjlx;

	private Integer zdcd;

	private Integer yyzt;

	private String ksx;
	
	private List options = null;

	public List getOptions() {
		return options;
	}

	public void setOptions(List options) {
		this.options = options;
	}	

	// Constructors

	/** default constructor */
	public Txtbxx() {
	}

	/** minimal constructor */
	public Txtbxx(TxtbxxId id, Integer yyzt) {
		this.id = id;
		this.yyzt = yyzt;
	}

	/** full constructor */
	public Txtbxx(TxtbxxId id, Integer zdxh, String zdzwms, String zdlx,
			String zdkjlx, Integer zdcd, Integer yyzt, String ksx) {
		this.id = id;
		this.zdxh = zdxh;
		this.zdzwms = zdzwms;
		this.zdlx = zdlx;
		this.zdkjlx = zdkjlx;
		this.zdcd = zdcd;
		this.yyzt = yyzt;
		this.ksx = ksx;
	}

	// Property accessors

	public TxtbxxId getId() {
		return this.id;
	}

	public void setId(TxtbxxId id) {
		this.id = id;
	}

	public Integer getZdxh() {
		return this.zdxh;
	}

	public void setZdxh(Integer zdxh) {
		this.zdxh = zdxh;
	}

	public String getZdzwms() {
		return this.zdzwms;
	}

	public void setZdzwms(String zdzwms) {
		this.zdzwms = zdzwms;
	}

	public String getZdlx() {
		return this.zdlx;
	}

	public void setZdlx(String zdlx) {
		this.zdlx = zdlx;
	}

	public String getZdkjlx() {
		return this.zdkjlx;
	}

	public void setZdkjlx(String zdkjlx) {
		this.zdkjlx = zdkjlx;
	}

	public Integer getZdcd() {
		return this.zdcd;
	}

	public void setZdcd(Integer zdcd) {
		this.zdcd = zdcd;
	}

	public Integer getYyzt() {
		return this.yyzt;
	}

	public void setYyzt(Integer yyzt) {
		this.yyzt = yyzt;
	}

	public String getKsx() {
		return this.ksx;
	}

	public void setKsx(String ksx) {
		this.ksx = ksx;
	}

}