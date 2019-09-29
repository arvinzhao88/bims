package com.cummins.receipt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScrapTicketCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScrapTicketCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andQuestiondIdIsNull() {
            addCriterion("questiond_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdIsNotNull() {
            addCriterion("questiond_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdEqualTo(Integer value) {
            addCriterion("questiond_id =", value, "questiondId");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdNotEqualTo(Integer value) {
            addCriterion("questiond_id <>", value, "questiondId");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdGreaterThan(Integer value) {
            addCriterion("questiond_id >", value, "questiondId");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("questiond_id >=", value, "questiondId");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdLessThan(Integer value) {
            addCriterion("questiond_id <", value, "questiondId");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdLessThanOrEqualTo(Integer value) {
            addCriterion("questiond_id <=", value, "questiondId");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdIn(List<Integer> values) {
            addCriterion("questiond_id in", values, "questiondId");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdNotIn(List<Integer> values) {
            addCriterion("questiond_id not in", values, "questiondId");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdBetween(Integer value1, Integer value2) {
            addCriterion("questiond_id between", value1, value2, "questiondId");
            return (Criteria) this;
        }

        public Criteria andQuestiondIdNotBetween(Integer value1, Integer value2) {
            addCriterion("questiond_id not between", value1, value2, "questiondId");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersIsNull() {
            addCriterion("in_plant_customers is null");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersIsNotNull() {
            addCriterion("in_plant_customers is not null");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersEqualTo(Integer value) {
            addCriterion("in_plant_customers =", value, "inPlantCustomers");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersNotEqualTo(Integer value) {
            addCriterion("in_plant_customers <>", value, "inPlantCustomers");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersGreaterThan(Integer value) {
            addCriterion("in_plant_customers >", value, "inPlantCustomers");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_plant_customers >=", value, "inPlantCustomers");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersLessThan(Integer value) {
            addCriterion("in_plant_customers <", value, "inPlantCustomers");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersLessThanOrEqualTo(Integer value) {
            addCriterion("in_plant_customers <=", value, "inPlantCustomers");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersIn(List<Integer> values) {
            addCriterion("in_plant_customers in", values, "inPlantCustomers");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersNotIn(List<Integer> values) {
            addCriterion("in_plant_customers not in", values, "inPlantCustomers");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersBetween(Integer value1, Integer value2) {
            addCriterion("in_plant_customers between", value1, value2, "inPlantCustomers");
            return (Criteria) this;
        }

        public Criteria andInPlantCustomersNotBetween(Integer value1, Integer value2) {
            addCriterion("in_plant_customers not between", value1, value2, "inPlantCustomers");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberIsNull() {
            addCriterion("parts_engine_number is null");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberIsNotNull() {
            addCriterion("parts_engine_number is not null");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberEqualTo(String value) {
            addCriterion("parts_engine_number =", value, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberNotEqualTo(String value) {
            addCriterion("parts_engine_number <>", value, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberGreaterThan(String value) {
            addCriterion("parts_engine_number >", value, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("parts_engine_number >=", value, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberLessThan(String value) {
            addCriterion("parts_engine_number <", value, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberLessThanOrEqualTo(String value) {
            addCriterion("parts_engine_number <=", value, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberLike(String value) {
            addCriterion("parts_engine_number like", value, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberNotLike(String value) {
            addCriterion("parts_engine_number not like", value, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberIn(List<String> values) {
            addCriterion("parts_engine_number in", values, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberNotIn(List<String> values) {
            addCriterion("parts_engine_number not in", values, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberBetween(String value1, String value2) {
            addCriterion("parts_engine_number between", value1, value2, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andPartsEngineNumberNotBetween(String value1, String value2) {
            addCriterion("parts_engine_number not between", value1, value2, "partsEngineNumber");
            return (Criteria) this;
        }

        public Criteria andSoIsNull() {
            addCriterion("so is null");
            return (Criteria) this;
        }

        public Criteria andSoIsNotNull() {
            addCriterion("so is not null");
            return (Criteria) this;
        }

        public Criteria andSoEqualTo(String value) {
            addCriterion("so =", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotEqualTo(String value) {
            addCriterion("so <>", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoGreaterThan(String value) {
            addCriterion("so >", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoGreaterThanOrEqualTo(String value) {
            addCriterion("so >=", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoLessThan(String value) {
            addCriterion("so <", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoLessThanOrEqualTo(String value) {
            addCriterion("so <=", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoLike(String value) {
            addCriterion("so like", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotLike(String value) {
            addCriterion("so not like", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoIn(List<String> values) {
            addCriterion("so in", values, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotIn(List<String> values) {
            addCriterion("so not in", values, "so");
            return (Criteria) this;
        }

        public Criteria andSoBetween(String value1, String value2) {
            addCriterion("so between", value1, value2, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotBetween(String value1, String value2) {
            addCriterion("so not between", value1, value2, "so");
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

        public Criteria andQuantityEqualTo(Double value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Double value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Double value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Double value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Double value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Double value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Double> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Double> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Double value1, Double value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Double value1, Double value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("part_name is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("part_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("part_name =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("part_name <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("part_name >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_name >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("part_name <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("part_name <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("part_name like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("part_name not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("part_name in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("part_name not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("part_name between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("part_name not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNull() {
            addCriterion("supplier_code is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNotNull() {
            addCriterion("supplier_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeEqualTo(String value) {
            addCriterion("supplier_code =", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotEqualTo(String value) {
            addCriterion("supplier_code <>", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThan(String value) {
            addCriterion("supplier_code >", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_code >=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThan(String value) {
            addCriterion("supplier_code <", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThanOrEqualTo(String value) {
            addCriterion("supplier_code <=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLike(String value) {
            addCriterion("supplier_code like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotLike(String value) {
            addCriterion("supplier_code not like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIn(List<String> values) {
            addCriterion("supplier_code in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotIn(List<String> values) {
            addCriterion("supplier_code not in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeBetween(String value1, String value2) {
            addCriterion("supplier_code between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotBetween(String value1, String value2) {
            addCriterion("supplier_code not between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdIsNull() {
            addCriterion("traceability_id is null");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdIsNotNull() {
            addCriterion("traceability_id is not null");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdEqualTo(String value) {
            addCriterion("traceability_id =", value, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdNotEqualTo(String value) {
            addCriterion("traceability_id <>", value, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdGreaterThan(String value) {
            addCriterion("traceability_id >", value, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdGreaterThanOrEqualTo(String value) {
            addCriterion("traceability_id >=", value, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdLessThan(String value) {
            addCriterion("traceability_id <", value, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdLessThanOrEqualTo(String value) {
            addCriterion("traceability_id <=", value, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdLike(String value) {
            addCriterion("traceability_id like", value, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdNotLike(String value) {
            addCriterion("traceability_id not like", value, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdIn(List<String> values) {
            addCriterion("traceability_id in", values, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdNotIn(List<String> values) {
            addCriterion("traceability_id not in", values, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdBetween(String value1, String value2) {
            addCriterion("traceability_id between", value1, value2, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andTraceabilityIdNotBetween(String value1, String value2) {
            addCriterion("traceability_id not between", value1, value2, "traceabilityId");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionIsNull() {
            addCriterion("defect_description is null");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionIsNotNull() {
            addCriterion("defect_description is not null");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionEqualTo(String value) {
            addCriterion("defect_description =", value, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionNotEqualTo(String value) {
            addCriterion("defect_description <>", value, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionGreaterThan(String value) {
            addCriterion("defect_description >", value, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("defect_description >=", value, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionLessThan(String value) {
            addCriterion("defect_description <", value, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionLessThanOrEqualTo(String value) {
            addCriterion("defect_description <=", value, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionLike(String value) {
            addCriterion("defect_description like", value, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionNotLike(String value) {
            addCriterion("defect_description not like", value, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionIn(List<String> values) {
            addCriterion("defect_description in", values, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionNotIn(List<String> values) {
            addCriterion("defect_description not in", values, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionBetween(String value1, String value2) {
            addCriterion("defect_description between", value1, value2, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andDefectDescriptionNotBetween(String value1, String value2) {
            addCriterion("defect_description not between", value1, value2, "defectDescription");
            return (Criteria) this;
        }

        public Criteria andItemNumberIsNull() {
            addCriterion("item_number is null");
            return (Criteria) this;
        }

        public Criteria andItemNumberIsNotNull() {
            addCriterion("item_number is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumberEqualTo(String value) {
            addCriterion("item_number =", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotEqualTo(String value) {
            addCriterion("item_number <>", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThan(String value) {
            addCriterion("item_number >", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThanOrEqualTo(String value) {
            addCriterion("item_number >=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThan(String value) {
            addCriterion("item_number <", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThanOrEqualTo(String value) {
            addCriterion("item_number <=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLike(String value) {
            addCriterion("item_number like", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotLike(String value) {
            addCriterion("item_number not like", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberIn(List<String> values) {
            addCriterion("item_number in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotIn(List<String> values) {
            addCriterion("item_number not in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberBetween(String value1, String value2) {
            addCriterion("item_number between", value1, value2, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotBetween(String value1, String value2) {
            addCriterion("item_number not between", value1, value2, "itemNumber");
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

        public Criteria andRequesterEqualTo(Integer value) {
            addCriterion("requester =", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotEqualTo(Integer value) {
            addCriterion("requester <>", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterGreaterThan(Integer value) {
            addCriterion("requester >", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterGreaterThanOrEqualTo(Integer value) {
            addCriterion("requester >=", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLessThan(Integer value) {
            addCriterion("requester <", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLessThanOrEqualTo(Integer value) {
            addCriterion("requester <=", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterIn(List<Integer> values) {
            addCriterion("requester in", values, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotIn(List<Integer> values) {
            addCriterion("requester not in", values, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterBetween(Integer value1, Integer value2) {
            addCriterion("requester between", value1, value2, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotBetween(Integer value1, Integer value2) {
            addCriterion("requester not between", value1, value2, "requester");
            return (Criteria) this;
        }

        public Criteria andJudgmentIsNull() {
            addCriterion("judgment is null");
            return (Criteria) this;
        }

        public Criteria andJudgmentIsNotNull() {
            addCriterion("judgment is not null");
            return (Criteria) this;
        }

        public Criteria andJudgmentEqualTo(String value) {
            addCriterion("judgment =", value, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentNotEqualTo(String value) {
            addCriterion("judgment <>", value, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentGreaterThan(String value) {
            addCriterion("judgment >", value, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentGreaterThanOrEqualTo(String value) {
            addCriterion("judgment >=", value, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentLessThan(String value) {
            addCriterion("judgment <", value, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentLessThanOrEqualTo(String value) {
            addCriterion("judgment <=", value, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentLike(String value) {
            addCriterion("judgment like", value, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentNotLike(String value) {
            addCriterion("judgment not like", value, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentIn(List<String> values) {
            addCriterion("judgment in", values, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentNotIn(List<String> values) {
            addCriterion("judgment not in", values, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentBetween(String value1, String value2) {
            addCriterion("judgment between", value1, value2, "judgment");
            return (Criteria) this;
        }

        public Criteria andJudgmentNotBetween(String value1, String value2) {
            addCriterion("judgment not between", value1, value2, "judgment");
            return (Criteria) this;
        }

        public Criteria andShareCodeIsNull() {
            addCriterion("share_code is null");
            return (Criteria) this;
        }

        public Criteria andShareCodeIsNotNull() {
            addCriterion("share_code is not null");
            return (Criteria) this;
        }

        public Criteria andShareCodeEqualTo(String value) {
            addCriterion("share_code =", value, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeNotEqualTo(String value) {
            addCriterion("share_code <>", value, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeGreaterThan(String value) {
            addCriterion("share_code >", value, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeGreaterThanOrEqualTo(String value) {
            addCriterion("share_code >=", value, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeLessThan(String value) {
            addCriterion("share_code <", value, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeLessThanOrEqualTo(String value) {
            addCriterion("share_code <=", value, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeLike(String value) {
            addCriterion("share_code like", value, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeNotLike(String value) {
            addCriterion("share_code not like", value, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeIn(List<String> values) {
            addCriterion("share_code in", values, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeNotIn(List<String> values) {
            addCriterion("share_code not in", values, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeBetween(String value1, String value2) {
            addCriterion("share_code between", value1, value2, "shareCode");
            return (Criteria) this;
        }

        public Criteria andShareCodeNotBetween(String value1, String value2) {
            addCriterion("share_code not between", value1, value2, "shareCode");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoIsNull() {
            addCriterion("associated_scrap_no is null");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoIsNotNull() {
            addCriterion("associated_scrap_no is not null");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoEqualTo(String value) {
            addCriterion("associated_scrap_no =", value, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoNotEqualTo(String value) {
            addCriterion("associated_scrap_no <>", value, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoGreaterThan(String value) {
            addCriterion("associated_scrap_no >", value, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoGreaterThanOrEqualTo(String value) {
            addCriterion("associated_scrap_no >=", value, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoLessThan(String value) {
            addCriterion("associated_scrap_no <", value, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoLessThanOrEqualTo(String value) {
            addCriterion("associated_scrap_no <=", value, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoLike(String value) {
            addCriterion("associated_scrap_no like", value, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoNotLike(String value) {
            addCriterion("associated_scrap_no not like", value, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoIn(List<String> values) {
            addCriterion("associated_scrap_no in", values, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoNotIn(List<String> values) {
            addCriterion("associated_scrap_no not in", values, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoBetween(String value1, String value2) {
            addCriterion("associated_scrap_no between", value1, value2, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andAssociatedScrapNoNotBetween(String value1, String value2) {
            addCriterion("associated_scrap_no not between", value1, value2, "associatedScrapNo");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerIsNull() {
            addCriterion("quality_engineer is null");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerIsNotNull() {
            addCriterion("quality_engineer is not null");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerEqualTo(Integer value) {
            addCriterion("quality_engineer =", value, "qualityEngineer");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerNotEqualTo(Integer value) {
            addCriterion("quality_engineer <>", value, "qualityEngineer");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerGreaterThan(Integer value) {
            addCriterion("quality_engineer >", value, "qualityEngineer");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_engineer >=", value, "qualityEngineer");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerLessThan(Integer value) {
            addCriterion("quality_engineer <", value, "qualityEngineer");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerLessThanOrEqualTo(Integer value) {
            addCriterion("quality_engineer <=", value, "qualityEngineer");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerIn(List<Integer> values) {
            addCriterion("quality_engineer in", values, "qualityEngineer");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerNotIn(List<Integer> values) {
            addCriterion("quality_engineer not in", values, "qualityEngineer");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerBetween(Integer value1, Integer value2) {
            addCriterion("quality_engineer between", value1, value2, "qualityEngineer");
            return (Criteria) this;
        }

        public Criteria andQualityEngineerNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_engineer not between", value1, value2, "qualityEngineer");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNull() {
            addCriterion("options is null");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNotNull() {
            addCriterion("options is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsEqualTo(String value) {
            addCriterion("options =", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotEqualTo(String value) {
            addCriterion("options <>", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThan(String value) {
            addCriterion("options >", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("options >=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThan(String value) {
            addCriterion("options <", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThanOrEqualTo(String value) {
            addCriterion("options <=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLike(String value) {
            addCriterion("options like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotLike(String value) {
            addCriterion("options not like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsIn(List<String> values) {
            addCriterion("options in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotIn(List<String> values) {
            addCriterion("options not in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsBetween(String value1, String value2) {
            addCriterion("options between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotBetween(String value1, String value2) {
            addCriterion("options not between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIsNull() {
            addCriterion("belong_area is null");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIsNotNull() {
            addCriterion("belong_area is not null");
            return (Criteria) this;
        }

        public Criteria andBelongAreaEqualTo(String value) {
            addCriterion("belong_area =", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaNotEqualTo(String value) {
            addCriterion("belong_area <>", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaGreaterThan(String value) {
            addCriterion("belong_area >", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaGreaterThanOrEqualTo(String value) {
            addCriterion("belong_area >=", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaLessThan(String value) {
            addCriterion("belong_area <", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaLessThanOrEqualTo(String value) {
            addCriterion("belong_area <=", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaLike(String value) {
            addCriterion("belong_area like", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaNotLike(String value) {
            addCriterion("belong_area not like", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIn(List<String> values) {
            addCriterion("belong_area in", values, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaNotIn(List<String> values) {
            addCriterion("belong_area not in", values, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaBetween(String value1, String value2) {
            addCriterion("belong_area between", value1, value2, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaNotBetween(String value1, String value2) {
            addCriterion("belong_area not between", value1, value2, "belongArea");
            return (Criteria) this;
        }

        public Criteria andCreateAccountIsNull() {
            addCriterion("create_account is null");
            return (Criteria) this;
        }

        public Criteria andCreateAccountIsNotNull() {
            addCriterion("create_account is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAccountEqualTo(String value) {
            addCriterion("create_account =", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountNotEqualTo(String value) {
            addCriterion("create_account <>", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountGreaterThan(String value) {
            addCriterion("create_account >", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountGreaterThanOrEqualTo(String value) {
            addCriterion("create_account >=", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountLessThan(String value) {
            addCriterion("create_account <", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountLessThanOrEqualTo(String value) {
            addCriterion("create_account <=", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountLike(String value) {
            addCriterion("create_account like", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountNotLike(String value) {
            addCriterion("create_account not like", value, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountIn(List<String> values) {
            addCriterion("create_account in", values, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountNotIn(List<String> values) {
            addCriterion("create_account not in", values, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountBetween(String value1, String value2) {
            addCriterion("create_account between", value1, value2, "createAccount");
            return (Criteria) this;
        }

        public Criteria andCreateAccountNotBetween(String value1, String value2) {
            addCriterion("create_account not between", value1, value2, "createAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountIsNull() {
            addCriterion("update_account is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountIsNotNull() {
            addCriterion("update_account is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountEqualTo(String value) {
            addCriterion("update_account =", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountNotEqualTo(String value) {
            addCriterion("update_account <>", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountGreaterThan(String value) {
            addCriterion("update_account >", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountGreaterThanOrEqualTo(String value) {
            addCriterion("update_account >=", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountLessThan(String value) {
            addCriterion("update_account <", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountLessThanOrEqualTo(String value) {
            addCriterion("update_account <=", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountLike(String value) {
            addCriterion("update_account like", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountNotLike(String value) {
            addCriterion("update_account not like", value, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountIn(List<String> values) {
            addCriterion("update_account in", values, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountNotIn(List<String> values) {
            addCriterion("update_account not in", values, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountBetween(String value1, String value2) {
            addCriterion("update_account between", value1, value2, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andUpdateAccountNotBetween(String value1, String value2) {
            addCriterion("update_account not between", value1, value2, "updateAccount");
            return (Criteria) this;
        }

        public Criteria andStatueIsNull() {
            addCriterion("statue is null");
            return (Criteria) this;
        }

        public Criteria andStatueIsNotNull() {
            addCriterion("statue is not null");
            return (Criteria) this;
        }

        public Criteria andStatueEqualTo(Integer value) {
            addCriterion("statue =", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotEqualTo(Integer value) {
            addCriterion("statue <>", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueGreaterThan(Integer value) {
            addCriterion("statue >", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("statue >=", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLessThan(Integer value) {
            addCriterion("statue <", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLessThanOrEqualTo(Integer value) {
            addCriterion("statue <=", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueIn(List<Integer> values) {
            addCriterion("statue in", values, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotIn(List<Integer> values) {
            addCriterion("statue not in", values, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueBetween(Integer value1, Integer value2) {
            addCriterion("statue between", value1, value2, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotBetween(Integer value1, Integer value2) {
            addCriterion("statue not between", value1, value2, "statue");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andBack1IsNull() {
            addCriterion("back1 is null");
            return (Criteria) this;
        }

        public Criteria andBack1IsNotNull() {
            addCriterion("back1 is not null");
            return (Criteria) this;
        }

        public Criteria andBack1EqualTo(String value) {
            addCriterion("back1 =", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1NotEqualTo(String value) {
            addCriterion("back1 <>", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1GreaterThan(String value) {
            addCriterion("back1 >", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1GreaterThanOrEqualTo(String value) {
            addCriterion("back1 >=", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1LessThan(String value) {
            addCriterion("back1 <", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1LessThanOrEqualTo(String value) {
            addCriterion("back1 <=", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1Like(String value) {
            addCriterion("back1 like", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1NotLike(String value) {
            addCriterion("back1 not like", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1In(List<String> values) {
            addCriterion("back1 in", values, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1NotIn(List<String> values) {
            addCriterion("back1 not in", values, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1Between(String value1, String value2) {
            addCriterion("back1 between", value1, value2, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1NotBetween(String value1, String value2) {
            addCriterion("back1 not between", value1, value2, "back1");
            return (Criteria) this;
        }

        public Criteria andBack2IsNull() {
            addCriterion("back2 is null");
            return (Criteria) this;
        }

        public Criteria andBack2IsNotNull() {
            addCriterion("back2 is not null");
            return (Criteria) this;
        }

        public Criteria andBack2EqualTo(String value) {
            addCriterion("back2 =", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2NotEqualTo(String value) {
            addCriterion("back2 <>", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2GreaterThan(String value) {
            addCriterion("back2 >", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2GreaterThanOrEqualTo(String value) {
            addCriterion("back2 >=", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2LessThan(String value) {
            addCriterion("back2 <", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2LessThanOrEqualTo(String value) {
            addCriterion("back2 <=", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2Like(String value) {
            addCriterion("back2 like", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2NotLike(String value) {
            addCriterion("back2 not like", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2In(List<String> values) {
            addCriterion("back2 in", values, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2NotIn(List<String> values) {
            addCriterion("back2 not in", values, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2Between(String value1, String value2) {
            addCriterion("back2 between", value1, value2, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2NotBetween(String value1, String value2) {
            addCriterion("back2 not between", value1, value2, "back2");
            return (Criteria) this;
        }

        public Criteria andBack3IsNull() {
            addCriterion("back3 is null");
            return (Criteria) this;
        }

        public Criteria andBack3IsNotNull() {
            addCriterion("back3 is not null");
            return (Criteria) this;
        }

        public Criteria andBack3EqualTo(String value) {
            addCriterion("back3 =", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3NotEqualTo(String value) {
            addCriterion("back3 <>", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3GreaterThan(String value) {
            addCriterion("back3 >", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3GreaterThanOrEqualTo(String value) {
            addCriterion("back3 >=", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3LessThan(String value) {
            addCriterion("back3 <", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3LessThanOrEqualTo(String value) {
            addCriterion("back3 <=", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3Like(String value) {
            addCriterion("back3 like", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3NotLike(String value) {
            addCriterion("back3 not like", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3In(List<String> values) {
            addCriterion("back3 in", values, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3NotIn(List<String> values) {
            addCriterion("back3 not in", values, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3Between(String value1, String value2) {
            addCriterion("back3 between", value1, value2, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3NotBetween(String value1, String value2) {
            addCriterion("back3 not between", value1, value2, "back3");
            return (Criteria) this;
        }

        public Criteria andBack4IsNull() {
            addCriterion("back4 is null");
            return (Criteria) this;
        }

        public Criteria andBack4IsNotNull() {
            addCriterion("back4 is not null");
            return (Criteria) this;
        }

        public Criteria andBack4EqualTo(Integer value) {
            addCriterion("back4 =", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4NotEqualTo(Integer value) {
            addCriterion("back4 <>", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4GreaterThan(Integer value) {
            addCriterion("back4 >", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4GreaterThanOrEqualTo(Integer value) {
            addCriterion("back4 >=", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4LessThan(Integer value) {
            addCriterion("back4 <", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4LessThanOrEqualTo(Integer value) {
            addCriterion("back4 <=", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4In(List<Integer> values) {
            addCriterion("back4 in", values, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4NotIn(List<Integer> values) {
            addCriterion("back4 not in", values, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4Between(Integer value1, Integer value2) {
            addCriterion("back4 between", value1, value2, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4NotBetween(Integer value1, Integer value2) {
            addCriterion("back4 not between", value1, value2, "back4");
            return (Criteria) this;
        }

        public Criteria andBack5IsNull() {
            addCriterion("back5 is null");
            return (Criteria) this;
        }

        public Criteria andBack5IsNotNull() {
            addCriterion("back5 is not null");
            return (Criteria) this;
        }

        public Criteria andBack5EqualTo(Integer value) {
            addCriterion("back5 =", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotEqualTo(Integer value) {
            addCriterion("back5 <>", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5GreaterThan(Integer value) {
            addCriterion("back5 >", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5GreaterThanOrEqualTo(Integer value) {
            addCriterion("back5 >=", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5LessThan(Integer value) {
            addCriterion("back5 <", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5LessThanOrEqualTo(Integer value) {
            addCriterion("back5 <=", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5In(List<Integer> values) {
            addCriterion("back5 in", values, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotIn(List<Integer> values) {
            addCriterion("back5 not in", values, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5Between(Integer value1, Integer value2) {
            addCriterion("back5 between", value1, value2, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotBetween(Integer value1, Integer value2) {
            addCriterion("back5 not between", value1, value2, "back5");
            return (Criteria) this;
        }
    }

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