package com.cummins.printer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrintdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrintdataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("`No` is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("`No` is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("`No` =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("`No` <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("`No` >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("`No` >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("`No` <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("`No` <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("`No` like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("`No` not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("`No` in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("`No` not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("`No` between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("`No` not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("`data` is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("`data` is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(String value) {
            addCriterion("`data` =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(String value) {
            addCriterion("`data` <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(String value) {
            addCriterion("`data` >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(String value) {
            addCriterion("`data` >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(String value) {
            addCriterion("`data` <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(String value) {
            addCriterion("`data` <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLike(String value) {
            addCriterion("`data` like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotLike(String value) {
            addCriterion("`data` not like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<String> values) {
            addCriterion("`data` in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<String> values) {
            addCriterion("`data` not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(String value1, String value2) {
            addCriterion("`data` between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(String value1, String value2) {
            addCriterion("`data` not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPartnoIsNull() {
            addCriterion("partNo is null");
            return (Criteria) this;
        }

        public Criteria andPartnoIsNotNull() {
            addCriterion("partNo is not null");
            return (Criteria) this;
        }

        public Criteria andPartnoEqualTo(String value) {
            addCriterion("partNo =", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoNotEqualTo(String value) {
            addCriterion("partNo <>", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoGreaterThan(String value) {
            addCriterion("partNo >", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoGreaterThanOrEqualTo(String value) {
            addCriterion("partNo >=", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoLessThan(String value) {
            addCriterion("partNo <", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoLessThanOrEqualTo(String value) {
            addCriterion("partNo <=", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoLike(String value) {
            addCriterion("partNo like", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoNotLike(String value) {
            addCriterion("partNo not like", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoIn(List<String> values) {
            addCriterion("partNo in", values, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoNotIn(List<String> values) {
            addCriterion("partNo not in", values, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoBetween(String value1, String value2) {
            addCriterion("partNo between", value1, value2, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoNotBetween(String value1, String value2) {
            addCriterion("partNo not between", value1, value2, "partno");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(String value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(String value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(String value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(String value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(String value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLike(String value) {
            addCriterion("quantity like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotLike(String value) {
            addCriterion("quantity not like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<String> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<String> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(String value1, String value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(String value1, String value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPartnameIsNull() {
            addCriterion("partName is null");
            return (Criteria) this;
        }

        public Criteria andPartnameIsNotNull() {
            addCriterion("partName is not null");
            return (Criteria) this;
        }

        public Criteria andPartnameEqualTo(String value) {
            addCriterion("partName =", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameNotEqualTo(String value) {
            addCriterion("partName <>", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameGreaterThan(String value) {
            addCriterion("partName >", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameGreaterThanOrEqualTo(String value) {
            addCriterion("partName >=", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameLessThan(String value) {
            addCriterion("partName <", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameLessThanOrEqualTo(String value) {
            addCriterion("partName <=", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameLike(String value) {
            addCriterion("partName like", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameNotLike(String value) {
            addCriterion("partName not like", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameIn(List<String> values) {
            addCriterion("partName in", values, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameNotIn(List<String> values) {
            addCriterion("partName not in", values, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameBetween(String value1, String value2) {
            addCriterion("partName between", value1, value2, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameNotBetween(String value1, String value2) {
            addCriterion("partName not between", value1, value2, "partname");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIsNull() {
            addCriterion("traceability is null");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIsNotNull() {
            addCriterion("traceability is not null");
            return (Criteria) this;
        }

        public Criteria andTraceabilityEqualTo(String value) {
            addCriterion("traceability =", value, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityNotEqualTo(String value) {
            addCriterion("traceability <>", value, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityGreaterThan(String value) {
            addCriterion("traceability >", value, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityGreaterThanOrEqualTo(String value) {
            addCriterion("traceability >=", value, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityLessThan(String value) {
            addCriterion("traceability <", value, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityLessThanOrEqualTo(String value) {
            addCriterion("traceability <=", value, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityLike(String value) {
            addCriterion("traceability like", value, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityNotLike(String value) {
            addCriterion("traceability not like", value, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIn(List<String> values) {
            addCriterion("traceability in", values, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityNotIn(List<String> values) {
            addCriterion("traceability not in", values, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityBetween(String value1, String value2) {
            addCriterion("traceability between", value1, value2, "traceability");
            return (Criteria) this;
        }

        public Criteria andTraceabilityNotBetween(String value1, String value2) {
            addCriterion("traceability not between", value1, value2, "traceability");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andDefectdescIsNull() {
            addCriterion("defectDesc is null");
            return (Criteria) this;
        }

        public Criteria andDefectdescIsNotNull() {
            addCriterion("defectDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDefectdescEqualTo(String value) {
            addCriterion("defectDesc =", value, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescNotEqualTo(String value) {
            addCriterion("defectDesc <>", value, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescGreaterThan(String value) {
            addCriterion("defectDesc >", value, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescGreaterThanOrEqualTo(String value) {
            addCriterion("defectDesc >=", value, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescLessThan(String value) {
            addCriterion("defectDesc <", value, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescLessThanOrEqualTo(String value) {
            addCriterion("defectDesc <=", value, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescLike(String value) {
            addCriterion("defectDesc like", value, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescNotLike(String value) {
            addCriterion("defectDesc not like", value, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescIn(List<String> values) {
            addCriterion("defectDesc in", values, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescNotIn(List<String> values) {
            addCriterion("defectDesc not in", values, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescBetween(String value1, String value2) {
            addCriterion("defectDesc between", value1, value2, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andDefectdescNotBetween(String value1, String value2) {
            addCriterion("defectDesc not between", value1, value2, "defectdesc");
            return (Criteria) this;
        }

        public Criteria andRequesterIsNull() {
            addCriterion("requester is null");
            return (Criteria) this;
        }

        public Criteria andRequesterIsNotNull() {
            addCriterion("requester is not null");
            return (Criteria) this;
        }

        public Criteria andRequesterEqualTo(String value) {
            addCriterion("requester =", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotEqualTo(String value) {
            addCriterion("requester <>", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterGreaterThan(String value) {
            addCriterion("requester >", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterGreaterThanOrEqualTo(String value) {
            addCriterion("requester >=", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLessThan(String value) {
            addCriterion("requester <", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLessThanOrEqualTo(String value) {
            addCriterion("requester <=", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLike(String value) {
            addCriterion("requester like", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotLike(String value) {
            addCriterion("requester not like", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterIn(List<String> values) {
            addCriterion("requester in", values, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotIn(List<String> values) {
            addCriterion("requester not in", values, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterBetween(String value1, String value2) {
            addCriterion("requester between", value1, value2, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotBetween(String value1, String value2) {
            addCriterion("requester not between", value1, value2, "requester");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeIsNull() {
            addCriterion("supplierCode is null");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeIsNotNull() {
            addCriterion("supplierCode is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeEqualTo(String value) {
            addCriterion("supplierCode =", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotEqualTo(String value) {
            addCriterion("supplierCode <>", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeGreaterThan(String value) {
            addCriterion("supplierCode >", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeGreaterThanOrEqualTo(String value) {
            addCriterion("supplierCode >=", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLessThan(String value) {
            addCriterion("supplierCode <", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLessThanOrEqualTo(String value) {
            addCriterion("supplierCode <=", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLike(String value) {
            addCriterion("supplierCode like", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotLike(String value) {
            addCriterion("supplierCode not like", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeIn(List<String> values) {
            addCriterion("supplierCode in", values, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotIn(List<String> values) {
            addCriterion("supplierCode not in", values, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeBetween(String value1, String value2) {
            addCriterion("supplierCode between", value1, value2, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotBetween(String value1, String value2) {
            addCriterion("supplierCode not between", value1, value2, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("supplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("supplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("supplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("supplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("supplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("supplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("supplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("supplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("supplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("supplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("supplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("supplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("supplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("supplierName not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("AddTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("AddTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("AddTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AddTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("AddTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("AddTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("AddTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("AddTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("AddTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("AddTime not between", value1, value2, "addtime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}