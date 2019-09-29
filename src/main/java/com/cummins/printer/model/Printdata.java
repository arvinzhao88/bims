package com.cummins.printer.model;

import java.io.Serializable;
import java.util.Date;

/**
 * printdata
 * @author 
 */
public class Printdata implements Serializable {
    private Integer id;

    private String no;

    private String data;

    private String type;

    private String partno;

    private String quantity;

    private String partname;

    private String traceability;

    private String area;

    private String defectdesc;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String remark;

    private String requester;

    private String suppliercode;

    private String suppliername;

    private String ip;

    private String status;

    private Date addtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPartno() {
        return partno;
    }

    public void setPartno(String partno) {
        this.partno = partno;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    public String getTraceability() {
        return traceability;
    }

    public void setTraceability(String traceability) {
        this.traceability = traceability;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDefectdesc() {
        return defectdesc;
    }

    public void setDefectdesc(String defectdesc) {
        this.defectdesc = defectdesc;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getSuppliercode() {
        return suppliercode;
    }

    public void setSuppliercode(String suppliercode) {
        this.suppliercode = suppliercode;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Printdata other = (Printdata) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNo() == null ? other.getNo() == null : this.getNo().equals(other.getNo()))
            && (this.getData() == null ? other.getData() == null : this.getData().equals(other.getData()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPartno() == null ? other.getPartno() == null : this.getPartno().equals(other.getPartno()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getPartname() == null ? other.getPartname() == null : this.getPartname().equals(other.getPartname()))
            && (this.getTraceability() == null ? other.getTraceability() == null : this.getTraceability().equals(other.getTraceability()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getDefectdesc() == null ? other.getDefectdesc() == null : this.getDefectdesc().equals(other.getDefectdesc()))
            && (this.getRequester() == null ? other.getRequester() == null : this.getRequester().equals(other.getRequester()))
            && (this.getSuppliercode() == null ? other.getSuppliercode() == null : this.getSuppliercode().equals(other.getSuppliercode()))
            && (this.getSuppliername() == null ? other.getSuppliername() == null : this.getSuppliername().equals(other.getSuppliername()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNo() == null) ? 0 : getNo().hashCode());
        result = prime * result + ((getData() == null) ? 0 : getData().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPartno() == null) ? 0 : getPartno().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getPartname() == null) ? 0 : getPartname().hashCode());
        result = prime * result + ((getTraceability() == null) ? 0 : getTraceability().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getDefectdesc() == null) ? 0 : getDefectdesc().hashCode());
        result = prime * result + ((getRequester() == null) ? 0 : getRequester().hashCode());
        result = prime * result + ((getSuppliercode() == null) ? 0 : getSuppliercode().hashCode());
        result = prime * result + ((getSuppliername() == null) ? 0 : getSuppliername().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", no=").append(no);
        sb.append(", data=").append(data);
        sb.append(", type=").append(type);
        sb.append(", partno=").append(partno);
        sb.append(", quantity=").append(quantity);
        sb.append(", partname=").append(partname);
        sb.append(", traceability=").append(traceability);
        sb.append(", area=").append(area);
        sb.append(", defectdesc=").append(defectdesc);
        sb.append(", requester=").append(requester);
        sb.append(", suppliercode=").append(suppliercode);
        sb.append(", suppliername=").append(suppliername);
        sb.append(", ip=").append(ip);
        sb.append(", status=").append(status);
        sb.append(", addtime=").append(addtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}