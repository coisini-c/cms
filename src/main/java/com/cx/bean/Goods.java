package com.cx.bean;

public class Goods {
	private Integer gid;
	private String gname;
	private String gename;
	private Integer kid;
	private Integer bid;
	private Integer gsize;
	private Double gprice;
	private Integer gnum;
	private String ginput;
	private String gimg;
	private Brand brand;
	private Kind kind;
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
	public String getGename() {
		return gename;
	}
	public void setGename(String gename) {
		this.gename = gename;
	}
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getGsize() {
		return gsize;
	}
	public void setGsize(Integer gsize) {
		this.gsize = gsize;
	}
	public Double getGprice() {
		return gprice;
	}
	public void setGprice(Double gprice) {
		this.gprice = gprice;
	}
	public Integer getGnum() {
		return gnum;
	}
	public void setGnum(Integer gnum) {
		this.gnum = gnum;
	}
	public String getGinput() {
		return ginput;
	}
	public void setGinput(String ginput) {
		this.ginput = ginput;
	}
	public String getGimg() {
		return gimg;
	}
	public void setGimg(String gimg) {
		this.gimg = gimg;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Kind getKind() {
		return kind;
	}
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	public Goods(Integer gid, String gname, String gename, Integer kid, Integer bid, Integer gsize, Double gprice,
			Integer gnum, String ginput, String gimg, Brand brand, Kind kind) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gename = gename;
		this.kid = kid;
		this.bid = bid;
		this.gsize = gsize;
		this.gprice = gprice;
		this.gnum = gnum;
		this.ginput = ginput;
		this.gimg = gimg;
		this.brand = brand;
		this.kind = kind;
	}
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gename=" + gename + ", kid=" + kid + ", bid=" + bid
				+ ", gsize=" + gsize + ", gprice=" + gprice + ", gnum=" + gnum + ", ginput=" + ginput + ", gimg=" + gimg
				+ ", brand=" + brand + ", kind=" + kind + "]";
	}
	
	
}
