package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarCriteria() {
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

        public Criteria andIssueIdIsNull() {
            addCriterion("issue_id is null");
            return (Criteria) this;
        }

        public Criteria andIssueIdIsNotNull() {
            addCriterion("issue_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssueIdEqualTo(Integer value) {
            addCriterion("issue_id =", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotEqualTo(Integer value) {
            addCriterion("issue_id <>", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThan(Integer value) {
            addCriterion("issue_id >", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("issue_id >=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThan(Integer value) {
            addCriterion("issue_id <", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThanOrEqualTo(Integer value) {
            addCriterion("issue_id <=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdIn(List<Integer> values) {
            addCriterion("issue_id in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotIn(List<Integer> values) {
            addCriterion("issue_id not in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdBetween(Integer value1, Integer value2) {
            addCriterion("issue_id between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("issue_id not between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andToolIdIsNull() {
            addCriterion("tool_id is null");
            return (Criteria) this;
        }

        public Criteria andToolIdIsNotNull() {
            addCriterion("tool_id is not null");
            return (Criteria) this;
        }

        public Criteria andToolIdEqualTo(Integer value) {
            addCriterion("tool_id =", value, "toolId");
            return (Criteria) this;
        }

        public Criteria andToolIdNotEqualTo(Integer value) {
            addCriterion("tool_id <>", value, "toolId");
            return (Criteria) this;
        }

        public Criteria andToolIdGreaterThan(Integer value) {
            addCriterion("tool_id >", value, "toolId");
            return (Criteria) this;
        }

        public Criteria andToolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tool_id >=", value, "toolId");
            return (Criteria) this;
        }

        public Criteria andToolIdLessThan(Integer value) {
            addCriterion("tool_id <", value, "toolId");
            return (Criteria) this;
        }

        public Criteria andToolIdLessThanOrEqualTo(Integer value) {
            addCriterion("tool_id <=", value, "toolId");
            return (Criteria) this;
        }

        public Criteria andToolIdIn(List<Integer> values) {
            addCriterion("tool_id in", values, "toolId");
            return (Criteria) this;
        }

        public Criteria andToolIdNotIn(List<Integer> values) {
            addCriterion("tool_id not in", values, "toolId");
            return (Criteria) this;
        }

        public Criteria andToolIdBetween(Integer value1, Integer value2) {
            addCriterion("tool_id between", value1, value2, "toolId");
            return (Criteria) this;
        }

        public Criteria andToolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tool_id not between", value1, value2, "toolId");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNull() {
            addCriterion("car_no is null");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNotNull() {
            addCriterion("car_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarNoEqualTo(String value) {
            addCriterion("car_no =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotEqualTo(String value) {
            addCriterion("car_no <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThan(String value) {
            addCriterion("car_no >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_no >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThan(String value) {
            addCriterion("car_no <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThanOrEqualTo(String value) {
            addCriterion("car_no <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLike(String value) {
            addCriterion("car_no like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotLike(String value) {
            addCriterion("car_no not like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoIn(List<String> values) {
            addCriterion("car_no in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotIn(List<String> values) {
            addCriterion("car_no not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoBetween(String value1, String value2) {
            addCriterion("car_no between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotBetween(String value1, String value2) {
            addCriterion("car_no not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNull() {
            addCriterion("sponsor is null");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNotNull() {
            addCriterion("sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorEqualTo(String value) {
            addCriterion("sponsor =", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotEqualTo(String value) {
            addCriterion("sponsor <>", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThan(String value) {
            addCriterion("sponsor >", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor >=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThan(String value) {
            addCriterion("sponsor <", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThanOrEqualTo(String value) {
            addCriterion("sponsor <=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLike(String value) {
            addCriterion("sponsor like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotLike(String value) {
            addCriterion("sponsor not like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorIn(List<String> values) {
            addCriterion("sponsor in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotIn(List<String> values) {
            addCriterion("sponsor not in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorBetween(String value1, String value2) {
            addCriterion("sponsor between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotBetween(String value1, String value2) {
            addCriterion("sponsor not between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNameIsNull() {
            addCriterion("sponsor_name is null");
            return (Criteria) this;
        }

        public Criteria andSponsorNameIsNotNull() {
            addCriterion("sponsor_name is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorNameEqualTo(String value) {
            addCriterion("sponsor_name =", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameNotEqualTo(String value) {
            addCriterion("sponsor_name <>", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameGreaterThan(String value) {
            addCriterion("sponsor_name >", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor_name >=", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameLessThan(String value) {
            addCriterion("sponsor_name <", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameLessThanOrEqualTo(String value) {
            addCriterion("sponsor_name <=", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameLike(String value) {
            addCriterion("sponsor_name like", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameNotLike(String value) {
            addCriterion("sponsor_name not like", value, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameIn(List<String> values) {
            addCriterion("sponsor_name in", values, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameNotIn(List<String> values) {
            addCriterion("sponsor_name not in", values, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameBetween(String value1, String value2) {
            addCriterion("sponsor_name between", value1, value2, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorNameNotBetween(String value1, String value2) {
            addCriterion("sponsor_name not between", value1, value2, "sponsorName");
            return (Criteria) this;
        }

        public Criteria andDutyDeptIsNull() {
            addCriterion("duty_dept is null");
            return (Criteria) this;
        }

        public Criteria andDutyDeptIsNotNull() {
            addCriterion("duty_dept is not null");
            return (Criteria) this;
        }

        public Criteria andDutyDeptEqualTo(String value) {
            addCriterion("duty_dept =", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptNotEqualTo(String value) {
            addCriterion("duty_dept <>", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptGreaterThan(String value) {
            addCriterion("duty_dept >", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptGreaterThanOrEqualTo(String value) {
            addCriterion("duty_dept >=", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptLessThan(String value) {
            addCriterion("duty_dept <", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptLessThanOrEqualTo(String value) {
            addCriterion("duty_dept <=", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptLike(String value) {
            addCriterion("duty_dept like", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptNotLike(String value) {
            addCriterion("duty_dept not like", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptIn(List<String> values) {
            addCriterion("duty_dept in", values, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptNotIn(List<String> values) {
            addCriterion("duty_dept not in", values, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptBetween(String value1, String value2) {
            addCriterion("duty_dept between", value1, value2, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptNotBetween(String value1, String value2) {
            addCriterion("duty_dept not between", value1, value2, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyPersonIsNull() {
            addCriterion("duty_person is null");
            return (Criteria) this;
        }

        public Criteria andDutyPersonIsNotNull() {
            addCriterion("duty_person is not null");
            return (Criteria) this;
        }

        public Criteria andDutyPersonEqualTo(String value) {
            addCriterion("duty_person =", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNotEqualTo(String value) {
            addCriterion("duty_person <>", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonGreaterThan(String value) {
            addCriterion("duty_person >", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("duty_person >=", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonLessThan(String value) {
            addCriterion("duty_person <", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonLessThanOrEqualTo(String value) {
            addCriterion("duty_person <=", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonLike(String value) {
            addCriterion("duty_person like", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNotLike(String value) {
            addCriterion("duty_person not like", value, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonIn(List<String> values) {
            addCriterion("duty_person in", values, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNotIn(List<String> values) {
            addCriterion("duty_person not in", values, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonBetween(String value1, String value2) {
            addCriterion("duty_person between", value1, value2, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNotBetween(String value1, String value2) {
            addCriterion("duty_person not between", value1, value2, "dutyPerson");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameIsNull() {
            addCriterion("duty_person_name is null");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameIsNotNull() {
            addCriterion("duty_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameEqualTo(String value) {
            addCriterion("duty_person_name =", value, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameNotEqualTo(String value) {
            addCriterion("duty_person_name <>", value, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameGreaterThan(String value) {
            addCriterion("duty_person_name >", value, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("duty_person_name >=", value, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameLessThan(String value) {
            addCriterion("duty_person_name <", value, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameLessThanOrEqualTo(String value) {
            addCriterion("duty_person_name <=", value, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameLike(String value) {
            addCriterion("duty_person_name like", value, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameNotLike(String value) {
            addCriterion("duty_person_name not like", value, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameIn(List<String> values) {
            addCriterion("duty_person_name in", values, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameNotIn(List<String> values) {
            addCriterion("duty_person_name not in", values, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameBetween(String value1, String value2) {
            addCriterion("duty_person_name between", value1, value2, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andDutyPersonNameNotBetween(String value1, String value2) {
            addCriterion("duty_person_name not between", value1, value2, "dutyPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonIsNull() {
            addCriterion("confirm_person is null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonIsNotNull() {
            addCriterion("confirm_person is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonEqualTo(String value) {
            addCriterion("confirm_person =", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotEqualTo(String value) {
            addCriterion("confirm_person <>", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonGreaterThan(String value) {
            addCriterion("confirm_person >", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_person >=", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonLessThan(String value) {
            addCriterion("confirm_person <", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonLessThanOrEqualTo(String value) {
            addCriterion("confirm_person <=", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonLike(String value) {
            addCriterion("confirm_person like", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotLike(String value) {
            addCriterion("confirm_person not like", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonIn(List<String> values) {
            addCriterion("confirm_person in", values, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotIn(List<String> values) {
            addCriterion("confirm_person not in", values, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonBetween(String value1, String value2) {
            addCriterion("confirm_person between", value1, value2, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotBetween(String value1, String value2) {
            addCriterion("confirm_person not between", value1, value2, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameIsNull() {
            addCriterion("confirm_person_name is null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameIsNotNull() {
            addCriterion("confirm_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameEqualTo(String value) {
            addCriterion("confirm_person_name =", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameNotEqualTo(String value) {
            addCriterion("confirm_person_name <>", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameGreaterThan(String value) {
            addCriterion("confirm_person_name >", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_person_name >=", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameLessThan(String value) {
            addCriterion("confirm_person_name <", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameLessThanOrEqualTo(String value) {
            addCriterion("confirm_person_name <=", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameLike(String value) {
            addCriterion("confirm_person_name like", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameNotLike(String value) {
            addCriterion("confirm_person_name not like", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameIn(List<String> values) {
            addCriterion("confirm_person_name in", values, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameNotIn(List<String> values) {
            addCriterion("confirm_person_name not in", values, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameBetween(String value1, String value2) {
            addCriterion("confirm_person_name between", value1, value2, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameNotBetween(String value1, String value2) {
            addCriterion("confirm_person_name not between", value1, value2, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andIssueTitleIsNull() {
            addCriterion("issue_title is null");
            return (Criteria) this;
        }

        public Criteria andIssueTitleIsNotNull() {
            addCriterion("issue_title is not null");
            return (Criteria) this;
        }

        public Criteria andIssueTitleEqualTo(String value) {
            addCriterion("issue_title =", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleNotEqualTo(String value) {
            addCriterion("issue_title <>", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleGreaterThan(String value) {
            addCriterion("issue_title >", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleGreaterThanOrEqualTo(String value) {
            addCriterion("issue_title >=", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleLessThan(String value) {
            addCriterion("issue_title <", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleLessThanOrEqualTo(String value) {
            addCriterion("issue_title <=", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleLike(String value) {
            addCriterion("issue_title like", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleNotLike(String value) {
            addCriterion("issue_title not like", value, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleIn(List<String> values) {
            addCriterion("issue_title in", values, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleNotIn(List<String> values) {
            addCriterion("issue_title not in", values, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleBetween(String value1, String value2) {
            addCriterion("issue_title between", value1, value2, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andIssueTitleNotBetween(String value1, String value2) {
            addCriterion("issue_title not between", value1, value2, "issueTitle");
            return (Criteria) this;
        }

        public Criteria andHappenAreaIsNull() {
            addCriterion("happen_area is null");
            return (Criteria) this;
        }

        public Criteria andHappenAreaIsNotNull() {
            addCriterion("happen_area is not null");
            return (Criteria) this;
        }

        public Criteria andHappenAreaEqualTo(String value) {
            addCriterion("happen_area =", value, "happenArea");
            return (Criteria) this;
        }

        public Criteria andHappenAreaNotEqualTo(String value) {
            addCriterion("happen_area <>", value, "happenArea");
            return (Criteria) this;
        }

        public Criteria andHappenAreaGreaterThan(String value) {
            addCriterion("happen_area >", value, "happenArea");
            return (Criteria) this;
        }

        public Criteria andHappenAreaGreaterThanOrEqualTo(String value) {
            addCriterion("happen_area >=", value, "happenArea");
            return (Criteria) this;
        }

        public Criteria andHappenAreaLessThan(String value) {
            addCriterion("happen_area <", value, "happenArea");
            return (Criteria) this;
        }

        public Criteria andHappenAreaLessThanOrEqualTo(String value) {
            addCriterion("happen_area <=", value, "happenArea");
            return (Criteria) this;
        }

        public Criteria andHappenAreaIn(List<String> values) {
            addCriterion("happen_area in", values, "happenArea");
            return (Criteria) this;
        }

        public Criteria andHappenAreaNotIn(List<String> values) {
            addCriterion("happen_area not in", values, "happenArea");
            return (Criteria) this;
        }

        public Criteria andHappenAreaBetween(String value1, String value2) {
            addCriterion("happen_area between", value1, value2, "happenArea");
            return (Criteria) this;
        }

        public Criteria andHappenAreaNotBetween(String value1, String value2) {
            addCriterion("happen_area not between", value1, value2, "happenArea");
            return (Criteria) this;
        }

        public Criteria andStepOneIsNull() {
            addCriterion("step_one is null");
            return (Criteria) this;
        }

        public Criteria andStepOneIsNotNull() {
            addCriterion("step_one is not null");
            return (Criteria) this;
        }

        public Criteria andStepOneEqualTo(String value) {
            addCriterion("step_one =", value, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneNotEqualTo(String value) {
            addCriterion("step_one <>", value, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneGreaterThan(String value) {
            addCriterion("step_one >", value, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneGreaterThanOrEqualTo(String value) {
            addCriterion("step_one >=", value, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneLessThan(String value) {
            addCriterion("step_one <", value, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneLessThanOrEqualTo(String value) {
            addCriterion("step_one <=", value, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneLike(String value) {
            addCriterion("step_one like", value, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneNotLike(String value) {
            addCriterion("step_one not like", value, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneIn(List<String> values) {
            addCriterion("step_one in", values, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneNotIn(List<String> values) {
            addCriterion("step_one not in", values, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneBetween(String value1, String value2) {
            addCriterion("step_one between", value1, value2, "stepOne");
            return (Criteria) this;
        }

        public Criteria andStepOneNotBetween(String value1, String value2) {
            addCriterion("step_one not between", value1, value2, "stepOne");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveIsNull() {
            addCriterion("email_receive is null");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveIsNotNull() {
            addCriterion("email_receive is not null");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveEqualTo(String value) {
            addCriterion("email_receive =", value, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveNotEqualTo(String value) {
            addCriterion("email_receive <>", value, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveGreaterThan(String value) {
            addCriterion("email_receive >", value, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveGreaterThanOrEqualTo(String value) {
            addCriterion("email_receive >=", value, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveLessThan(String value) {
            addCriterion("email_receive <", value, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveLessThanOrEqualTo(String value) {
            addCriterion("email_receive <=", value, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveLike(String value) {
            addCriterion("email_receive like", value, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveNotLike(String value) {
            addCriterion("email_receive not like", value, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveIn(List<String> values) {
            addCriterion("email_receive in", values, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveNotIn(List<String> values) {
            addCriterion("email_receive not in", values, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveBetween(String value1, String value2) {
            addCriterion("email_receive between", value1, value2, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andEmailReceiveNotBetween(String value1, String value2) {
            addCriterion("email_receive not between", value1, value2, "emailReceive");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateIsNull() {
            addCriterion("aim_close_date is null");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateIsNotNull() {
            addCriterion("aim_close_date is not null");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateEqualTo(Date value) {
            addCriterion("aim_close_date =", value, "aimCloseDate");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateNotEqualTo(Date value) {
            addCriterion("aim_close_date <>", value, "aimCloseDate");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateGreaterThan(Date value) {
            addCriterion("aim_close_date >", value, "aimCloseDate");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("aim_close_date >=", value, "aimCloseDate");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateLessThan(Date value) {
            addCriterion("aim_close_date <", value, "aimCloseDate");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateLessThanOrEqualTo(Date value) {
            addCriterion("aim_close_date <=", value, "aimCloseDate");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateIn(List<Date> values) {
            addCriterion("aim_close_date in", values, "aimCloseDate");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateNotIn(List<Date> values) {
            addCriterion("aim_close_date not in", values, "aimCloseDate");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateBetween(Date value1, Date value2) {
            addCriterion("aim_close_date between", value1, value2, "aimCloseDate");
            return (Criteria) this;
        }

        public Criteria andAimCloseDateNotBetween(Date value1, Date value2) {
            addCriterion("aim_close_date not between", value1, value2, "aimCloseDate");
            return (Criteria) this;
        }

        public Criteria andStepTwoIsNull() {
            addCriterion("step_two is null");
            return (Criteria) this;
        }

        public Criteria andStepTwoIsNotNull() {
            addCriterion("step_two is not null");
            return (Criteria) this;
        }

        public Criteria andStepTwoEqualTo(String value) {
            addCriterion("step_two =", value, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoNotEqualTo(String value) {
            addCriterion("step_two <>", value, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoGreaterThan(String value) {
            addCriterion("step_two >", value, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoGreaterThanOrEqualTo(String value) {
            addCriterion("step_two >=", value, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoLessThan(String value) {
            addCriterion("step_two <", value, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoLessThanOrEqualTo(String value) {
            addCriterion("step_two <=", value, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoLike(String value) {
            addCriterion("step_two like", value, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoNotLike(String value) {
            addCriterion("step_two not like", value, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoIn(List<String> values) {
            addCriterion("step_two in", values, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoNotIn(List<String> values) {
            addCriterion("step_two not in", values, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoBetween(String value1, String value2) {
            addCriterion("step_two between", value1, value2, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andStepTwoNotBetween(String value1, String value2) {
            addCriterion("step_two not between", value1, value2, "stepTwo");
            return (Criteria) this;
        }

        public Criteria andBreakpointIsNull() {
            addCriterion("breakpoint is null");
            return (Criteria) this;
        }

        public Criteria andBreakpointIsNotNull() {
            addCriterion("breakpoint is not null");
            return (Criteria) this;
        }

        public Criteria andBreakpointEqualTo(String value) {
            addCriterion("breakpoint =", value, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointNotEqualTo(String value) {
            addCriterion("breakpoint <>", value, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointGreaterThan(String value) {
            addCriterion("breakpoint >", value, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointGreaterThanOrEqualTo(String value) {
            addCriterion("breakpoint >=", value, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointLessThan(String value) {
            addCriterion("breakpoint <", value, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointLessThanOrEqualTo(String value) {
            addCriterion("breakpoint <=", value, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointLike(String value) {
            addCriterion("breakpoint like", value, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointNotLike(String value) {
            addCriterion("breakpoint not like", value, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointIn(List<String> values) {
            addCriterion("breakpoint in", values, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointNotIn(List<String> values) {
            addCriterion("breakpoint not in", values, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointBetween(String value1, String value2) {
            addCriterion("breakpoint between", value1, value2, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andBreakpointNotBetween(String value1, String value2) {
            addCriterion("breakpoint not between", value1, value2, "breakpoint");
            return (Criteria) this;
        }

        public Criteria andImproveIsNull() {
            addCriterion("improve is null");
            return (Criteria) this;
        }

        public Criteria andImproveIsNotNull() {
            addCriterion("improve is not null");
            return (Criteria) this;
        }

        public Criteria andImproveEqualTo(String value) {
            addCriterion("improve =", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveNotEqualTo(String value) {
            addCriterion("improve <>", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveGreaterThan(String value) {
            addCriterion("improve >", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveGreaterThanOrEqualTo(String value) {
            addCriterion("improve >=", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveLessThan(String value) {
            addCriterion("improve <", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveLessThanOrEqualTo(String value) {
            addCriterion("improve <=", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveLike(String value) {
            addCriterion("improve like", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveNotLike(String value) {
            addCriterion("improve not like", value, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveIn(List<String> values) {
            addCriterion("improve in", values, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveNotIn(List<String> values) {
            addCriterion("improve not in", values, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveBetween(String value1, String value2) {
            addCriterion("improve between", value1, value2, "improve");
            return (Criteria) this;
        }

        public Criteria andImproveNotBetween(String value1, String value2) {
            addCriterion("improve not between", value1, value2, "improve");
            return (Criteria) this;
        }

        public Criteria andUpdateFileIsNull() {
            addCriterion("update_file is null");
            return (Criteria) this;
        }

        public Criteria andUpdateFileIsNotNull() {
            addCriterion("update_file is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateFileEqualTo(String value) {
            addCriterion("update_file =", value, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileNotEqualTo(String value) {
            addCriterion("update_file <>", value, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileGreaterThan(String value) {
            addCriterion("update_file >", value, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileGreaterThanOrEqualTo(String value) {
            addCriterion("update_file >=", value, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileLessThan(String value) {
            addCriterion("update_file <", value, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileLessThanOrEqualTo(String value) {
            addCriterion("update_file <=", value, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileLike(String value) {
            addCriterion("update_file like", value, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileNotLike(String value) {
            addCriterion("update_file not like", value, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileIn(List<String> values) {
            addCriterion("update_file in", values, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileNotIn(List<String> values) {
            addCriterion("update_file not in", values, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileBetween(String value1, String value2) {
            addCriterion("update_file between", value1, value2, "updateFile");
            return (Criteria) this;
        }

        public Criteria andUpdateFileNotBetween(String value1, String value2) {
            addCriterion("update_file not between", value1, value2, "updateFile");
            return (Criteria) this;
        }

        public Criteria andRacIsNull() {
            addCriterion("rac is null");
            return (Criteria) this;
        }

        public Criteria andRacIsNotNull() {
            addCriterion("rac is not null");
            return (Criteria) this;
        }

        public Criteria andRacEqualTo(String value) {
            addCriterion("rac =", value, "rac");
            return (Criteria) this;
        }

        public Criteria andRacNotEqualTo(String value) {
            addCriterion("rac <>", value, "rac");
            return (Criteria) this;
        }

        public Criteria andRacGreaterThan(String value) {
            addCriterion("rac >", value, "rac");
            return (Criteria) this;
        }

        public Criteria andRacGreaterThanOrEqualTo(String value) {
            addCriterion("rac >=", value, "rac");
            return (Criteria) this;
        }

        public Criteria andRacLessThan(String value) {
            addCriterion("rac <", value, "rac");
            return (Criteria) this;
        }

        public Criteria andRacLessThanOrEqualTo(String value) {
            addCriterion("rac <=", value, "rac");
            return (Criteria) this;
        }

        public Criteria andRacLike(String value) {
            addCriterion("rac like", value, "rac");
            return (Criteria) this;
        }

        public Criteria andRacNotLike(String value) {
            addCriterion("rac not like", value, "rac");
            return (Criteria) this;
        }

        public Criteria andRacIn(List<String> values) {
            addCriterion("rac in", values, "rac");
            return (Criteria) this;
        }

        public Criteria andRacNotIn(List<String> values) {
            addCriterion("rac not in", values, "rac");
            return (Criteria) this;
        }

        public Criteria andRacBetween(String value1, String value2) {
            addCriterion("rac between", value1, value2, "rac");
            return (Criteria) this;
        }

        public Criteria andRacNotBetween(String value1, String value2) {
            addCriterion("rac not between", value1, value2, "rac");
            return (Criteria) this;
        }

        public Criteria andCheckFileIsNull() {
            addCriterion("check_file is null");
            return (Criteria) this;
        }

        public Criteria andCheckFileIsNotNull() {
            addCriterion("check_file is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFileEqualTo(String value) {
            addCriterion("check_file =", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileNotEqualTo(String value) {
            addCriterion("check_file <>", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileGreaterThan(String value) {
            addCriterion("check_file >", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileGreaterThanOrEqualTo(String value) {
            addCriterion("check_file >=", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileLessThan(String value) {
            addCriterion("check_file <", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileLessThanOrEqualTo(String value) {
            addCriterion("check_file <=", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileLike(String value) {
            addCriterion("check_file like", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileNotLike(String value) {
            addCriterion("check_file not like", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileIn(List<String> values) {
            addCriterion("check_file in", values, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileNotIn(List<String> values) {
            addCriterion("check_file not in", values, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileBetween(String value1, String value2) {
            addCriterion("check_file between", value1, value2, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileNotBetween(String value1, String value2) {
            addCriterion("check_file not between", value1, value2, "checkFile");
            return (Criteria) this;
        }

        public Criteria andEsnFormIsNull() {
            addCriterion("esn_form is null");
            return (Criteria) this;
        }

        public Criteria andEsnFormIsNotNull() {
            addCriterion("esn_form is not null");
            return (Criteria) this;
        }

        public Criteria andEsnFormEqualTo(String value) {
            addCriterion("esn_form =", value, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormNotEqualTo(String value) {
            addCriterion("esn_form <>", value, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormGreaterThan(String value) {
            addCriterion("esn_form >", value, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormGreaterThanOrEqualTo(String value) {
            addCriterion("esn_form >=", value, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormLessThan(String value) {
            addCriterion("esn_form <", value, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormLessThanOrEqualTo(String value) {
            addCriterion("esn_form <=", value, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormLike(String value) {
            addCriterion("esn_form like", value, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormNotLike(String value) {
            addCriterion("esn_form not like", value, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormIn(List<String> values) {
            addCriterion("esn_form in", values, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormNotIn(List<String> values) {
            addCriterion("esn_form not in", values, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormBetween(String value1, String value2) {
            addCriterion("esn_form between", value1, value2, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnFormNotBetween(String value1, String value2) {
            addCriterion("esn_form not between", value1, value2, "esnForm");
            return (Criteria) this;
        }

        public Criteria andEsnToIsNull() {
            addCriterion("esn_to is null");
            return (Criteria) this;
        }

        public Criteria andEsnToIsNotNull() {
            addCriterion("esn_to is not null");
            return (Criteria) this;
        }

        public Criteria andEsnToEqualTo(String value) {
            addCriterion("esn_to =", value, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToNotEqualTo(String value) {
            addCriterion("esn_to <>", value, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToGreaterThan(String value) {
            addCriterion("esn_to >", value, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToGreaterThanOrEqualTo(String value) {
            addCriterion("esn_to >=", value, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToLessThan(String value) {
            addCriterion("esn_to <", value, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToLessThanOrEqualTo(String value) {
            addCriterion("esn_to <=", value, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToLike(String value) {
            addCriterion("esn_to like", value, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToNotLike(String value) {
            addCriterion("esn_to not like", value, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToIn(List<String> values) {
            addCriterion("esn_to in", values, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToNotIn(List<String> values) {
            addCriterion("esn_to not in", values, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToBetween(String value1, String value2) {
            addCriterion("esn_to between", value1, value2, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnToNotBetween(String value1, String value2) {
            addCriterion("esn_to not between", value1, value2, "esnTo");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtIsNull() {
            addCriterion("esn_form_ncm_qt is null");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtIsNotNull() {
            addCriterion("esn_form_ncm_qt is not null");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtEqualTo(Integer value) {
            addCriterion("esn_form_ncm_qt =", value, "esnFormNcmQt");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtNotEqualTo(Integer value) {
            addCriterion("esn_form_ncm_qt <>", value, "esnFormNcmQt");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtGreaterThan(Integer value) {
            addCriterion("esn_form_ncm_qt >", value, "esnFormNcmQt");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtGreaterThanOrEqualTo(Integer value) {
            addCriterion("esn_form_ncm_qt >=", value, "esnFormNcmQt");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtLessThan(Integer value) {
            addCriterion("esn_form_ncm_qt <", value, "esnFormNcmQt");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtLessThanOrEqualTo(Integer value) {
            addCriterion("esn_form_ncm_qt <=", value, "esnFormNcmQt");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtIn(List<Integer> values) {
            addCriterion("esn_form_ncm_qt in", values, "esnFormNcmQt");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtNotIn(List<Integer> values) {
            addCriterion("esn_form_ncm_qt not in", values, "esnFormNcmQt");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtBetween(Integer value1, Integer value2) {
            addCriterion("esn_form_ncm_qt between", value1, value2, "esnFormNcmQt");
            return (Criteria) this;
        }

        public Criteria andEsnFormNcmQtNotBetween(Integer value1, Integer value2) {
            addCriterion("esn_form_ncm_qt not between", value1, value2, "esnFormNcmQt");
            return (Criteria) this;
        }

        public Criteria andDateFormIsNull() {
            addCriterion("date_form is null");
            return (Criteria) this;
        }

        public Criteria andDateFormIsNotNull() {
            addCriterion("date_form is not null");
            return (Criteria) this;
        }

        public Criteria andDateFormEqualTo(String value) {
            addCriterion("date_form =", value, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormNotEqualTo(String value) {
            addCriterion("date_form <>", value, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormGreaterThan(String value) {
            addCriterion("date_form >", value, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormGreaterThanOrEqualTo(String value) {
            addCriterion("date_form >=", value, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormLessThan(String value) {
            addCriterion("date_form <", value, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormLessThanOrEqualTo(String value) {
            addCriterion("date_form <=", value, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormLike(String value) {
            addCriterion("date_form like", value, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormNotLike(String value) {
            addCriterion("date_form not like", value, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormIn(List<String> values) {
            addCriterion("date_form in", values, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormNotIn(List<String> values) {
            addCriterion("date_form not in", values, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormBetween(String value1, String value2) {
            addCriterion("date_form between", value1, value2, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateFormNotBetween(String value1, String value2) {
            addCriterion("date_form not between", value1, value2, "dateForm");
            return (Criteria) this;
        }

        public Criteria andDateToIsNull() {
            addCriterion("date_to is null");
            return (Criteria) this;
        }

        public Criteria andDateToIsNotNull() {
            addCriterion("date_to is not null");
            return (Criteria) this;
        }

        public Criteria andDateToEqualTo(String value) {
            addCriterion("date_to =", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotEqualTo(String value) {
            addCriterion("date_to <>", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToGreaterThan(String value) {
            addCriterion("date_to >", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToGreaterThanOrEqualTo(String value) {
            addCriterion("date_to >=", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLessThan(String value) {
            addCriterion("date_to <", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLessThanOrEqualTo(String value) {
            addCriterion("date_to <=", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLike(String value) {
            addCriterion("date_to like", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotLike(String value) {
            addCriterion("date_to not like", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToIn(List<String> values) {
            addCriterion("date_to in", values, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotIn(List<String> values) {
            addCriterion("date_to not in", values, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToBetween(String value1, String value2) {
            addCriterion("date_to between", value1, value2, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotBetween(String value1, String value2) {
            addCriterion("date_to not between", value1, value2, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyIsNull() {
            addCriterion("date_form_ncm_qty is null");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyIsNotNull() {
            addCriterion("date_form_ncm_qty is not null");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyEqualTo(Integer value) {
            addCriterion("date_form_ncm_qty =", value, "dateFormNcmQty");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyNotEqualTo(Integer value) {
            addCriterion("date_form_ncm_qty <>", value, "dateFormNcmQty");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyGreaterThan(Integer value) {
            addCriterion("date_form_ncm_qty >", value, "dateFormNcmQty");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_form_ncm_qty >=", value, "dateFormNcmQty");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyLessThan(Integer value) {
            addCriterion("date_form_ncm_qty <", value, "dateFormNcmQty");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyLessThanOrEqualTo(Integer value) {
            addCriterion("date_form_ncm_qty <=", value, "dateFormNcmQty");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyIn(List<Integer> values) {
            addCriterion("date_form_ncm_qty in", values, "dateFormNcmQty");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyNotIn(List<Integer> values) {
            addCriterion("date_form_ncm_qty not in", values, "dateFormNcmQty");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyBetween(Integer value1, Integer value2) {
            addCriterion("date_form_ncm_qty between", value1, value2, "dateFormNcmQty");
            return (Criteria) this;
        }

        public Criteria andDateFormNcmQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("date_form_ncm_qty not between", value1, value2, "dateFormNcmQty");
            return (Criteria) this;
        }

        public Criteria andMqvIsNull() {
            addCriterion("mqv is null");
            return (Criteria) this;
        }

        public Criteria andMqvIsNotNull() {
            addCriterion("mqv is not null");
            return (Criteria) this;
        }

        public Criteria andMqvEqualTo(String value) {
            addCriterion("mqv =", value, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvNotEqualTo(String value) {
            addCriterion("mqv <>", value, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvGreaterThan(String value) {
            addCriterion("mqv >", value, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvGreaterThanOrEqualTo(String value) {
            addCriterion("mqv >=", value, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvLessThan(String value) {
            addCriterion("mqv <", value, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvLessThanOrEqualTo(String value) {
            addCriterion("mqv <=", value, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvLike(String value) {
            addCriterion("mqv like", value, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvNotLike(String value) {
            addCriterion("mqv not like", value, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvIn(List<String> values) {
            addCriterion("mqv in", values, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvNotIn(List<String> values) {
            addCriterion("mqv not in", values, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvBetween(String value1, String value2) {
            addCriterion("mqv between", value1, value2, "mqv");
            return (Criteria) this;
        }

        public Criteria andMqvNotBetween(String value1, String value2) {
            addCriterion("mqv not between", value1, value2, "mqv");
            return (Criteria) this;
        }

        public Criteria andCompleteDateIsNull() {
            addCriterion("complete_date is null");
            return (Criteria) this;
        }

        public Criteria andCompleteDateIsNotNull() {
            addCriterion("complete_date is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteDateEqualTo(Date value) {
            addCriterion("complete_date =", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateNotEqualTo(Date value) {
            addCriterion("complete_date <>", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateGreaterThan(Date value) {
            addCriterion("complete_date >", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("complete_date >=", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateLessThan(Date value) {
            addCriterion("complete_date <", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateLessThanOrEqualTo(Date value) {
            addCriterion("complete_date <=", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateIn(List<Date> values) {
            addCriterion("complete_date in", values, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateNotIn(List<Date> values) {
            addCriterion("complete_date not in", values, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateBetween(Date value1, Date value2) {
            addCriterion("complete_date between", value1, value2, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateNotBetween(Date value1, Date value2) {
            addCriterion("complete_date not between", value1, value2, "completeDate");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNull() {
            addCriterion("review_status is null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNotNull() {
            addCriterion("review_status is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusEqualTo(Integer value) {
            addCriterion("review_status =", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotEqualTo(Integer value) {
            addCriterion("review_status <>", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThan(Integer value) {
            addCriterion("review_status >", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_status >=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThan(Integer value) {
            addCriterion("review_status <", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("review_status <=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIn(List<Integer> values) {
            addCriterion("review_status in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotIn(List<Integer> values) {
            addCriterion("review_status not in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusBetween(Integer value1, Integer value2) {
            addCriterion("review_status between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("review_status not between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewPersonIsNull() {
            addCriterion("review_person is null");
            return (Criteria) this;
        }

        public Criteria andReviewPersonIsNotNull() {
            addCriterion("review_person is not null");
            return (Criteria) this;
        }

        public Criteria andReviewPersonEqualTo(String value) {
            addCriterion("review_person =", value, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNotEqualTo(String value) {
            addCriterion("review_person <>", value, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonGreaterThan(String value) {
            addCriterion("review_person >", value, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonGreaterThanOrEqualTo(String value) {
            addCriterion("review_person >=", value, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonLessThan(String value) {
            addCriterion("review_person <", value, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonLessThanOrEqualTo(String value) {
            addCriterion("review_person <=", value, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonLike(String value) {
            addCriterion("review_person like", value, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNotLike(String value) {
            addCriterion("review_person not like", value, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonIn(List<String> values) {
            addCriterion("review_person in", values, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNotIn(List<String> values) {
            addCriterion("review_person not in", values, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonBetween(String value1, String value2) {
            addCriterion("review_person between", value1, value2, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNotBetween(String value1, String value2) {
            addCriterion("review_person not between", value1, value2, "reviewPerson");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameIsNull() {
            addCriterion("review_person_name is null");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameIsNotNull() {
            addCriterion("review_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameEqualTo(String value) {
            addCriterion("review_person_name =", value, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameNotEqualTo(String value) {
            addCriterion("review_person_name <>", value, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameGreaterThan(String value) {
            addCriterion("review_person_name >", value, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("review_person_name >=", value, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameLessThan(String value) {
            addCriterion("review_person_name <", value, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameLessThanOrEqualTo(String value) {
            addCriterion("review_person_name <=", value, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameLike(String value) {
            addCriterion("review_person_name like", value, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameNotLike(String value) {
            addCriterion("review_person_name not like", value, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameIn(List<String> values) {
            addCriterion("review_person_name in", values, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameNotIn(List<String> values) {
            addCriterion("review_person_name not in", values, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameBetween(String value1, String value2) {
            addCriterion("review_person_name between", value1, value2, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewPersonNameNotBetween(String value1, String value2) {
            addCriterion("review_person_name not between", value1, value2, "reviewPersonName");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNull() {
            addCriterion("review_date is null");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNotNull() {
            addCriterion("review_date is not null");
            return (Criteria) this;
        }

        public Criteria andReviewDateEqualTo(Date value) {
            addCriterion("review_date =", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotEqualTo(Date value) {
            addCriterion("review_date <>", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThan(Date value) {
            addCriterion("review_date >", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThanOrEqualTo(Date value) {
            addCriterion("review_date >=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThan(Date value) {
            addCriterion("review_date <", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThanOrEqualTo(Date value) {
            addCriterion("review_date <=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateIn(List<Date> values) {
            addCriterion("review_date in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotIn(List<Date> values) {
            addCriterion("review_date not in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateBetween(Date value1, Date value2) {
            addCriterion("review_date between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotBetween(Date value1, Date value2) {
            addCriterion("review_date not between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("attachment is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("attachment is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("attachment =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("attachment <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("attachment >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("attachment >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(String value) {
            addCriterion("attachment <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("attachment <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLike(String value) {
            addCriterion("attachment like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotLike(String value) {
            addCriterion("attachment not like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("attachment in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("attachment not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("attachment between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("attachment not between", value1, value2, "attachment");
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