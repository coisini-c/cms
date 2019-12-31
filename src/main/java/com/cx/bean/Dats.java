package com.cx.bean;

public class Dats {
	private String gname;
	private Integer pagenum;
	private Integer gid;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Integer getPagenum() {
		return pagenum;
	}
	public void setPagenum(Integer pagenum) {
		this.pagenum = pagenum;
	}
	
	public Dats(String gname, Integer pagenum, Integer gid) {
		super();
		this.gname = gname;
		this.pagenum = pagenum;
		this.gid = gid;
	}
	public Dats() {
		super();
	}
	@Override
	public String toString() {
		return "Dats [gname=" + gname + ", pagenum=" + pagenum + ", gid=" + gid + "]";
	}
	
	
}
