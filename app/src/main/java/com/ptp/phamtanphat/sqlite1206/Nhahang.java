package com.ptp.phamtanphat.sqlite1206;

public class Nhahang {
    private Integer id;
    private String tenmonan;
    private Integer giamonan;
    private String diadiem;

    public Nhahang(Integer id, String tenmonan, Integer giamonan, String diadiem) {
        this.id = id;
        this.tenmonan = tenmonan;
        this.giamonan = giamonan;
        this.diadiem = diadiem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenmonan() {
        return tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }

    public Integer getGiamonan() {
        return giamonan;
    }

    public void setGiamonan(Integer giamonan) {
        this.giamonan = giamonan;
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }
}
