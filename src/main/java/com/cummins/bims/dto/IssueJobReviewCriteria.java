package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IssueJobReviewCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IssueJobReviewCriteria() {
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

        public Criteria andHandlerDeptIdIsNull() {
            addCriterion("handler_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdIsNotNull() {
            addCriterion("handler_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdEqualTo(Integer value) {
            addCriterion("handler_dept_id =", value, "handlerDeptId");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdNotEqualTo(Integer value) {
            addCriterion("handler_dept_id <>", value, "handlerDeptId");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdGreaterThan(Integer value) {
            addCriterion("handler_dept_id >", value, "handlerDeptId");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("handler_dept_id >=", value, "handlerDeptId");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdLessThan(Integer value) {
            addCriterion("handler_dept_id <", value, "handlerDeptId");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("handler_dept_id <=", value, "handlerDeptId");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdIn(List<Integer> values) {
            addCriterion("handler_dept_id in", values, "handlerDeptId");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdNotIn(List<Integer> values) {
            addCriterion("handler_dept_id not in", values, "handlerDeptId");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("handler_dept_id between", value1, value2, "handlerDeptId");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("handler_dept_id not between", value1, value2, "handlerDeptId");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameIsNull() {
            addCriterion("handler_dept_name is null");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameIsNotNull() {
            addCriterion("handler_dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameEqualTo(String value) {
            addCriterion("handler_dept_name =", value, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameNotEqualTo(String value) {
            addCriterion("handler_dept_name <>", value, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameGreaterThan(String value) {
            addCriterion("handler_dept_name >", value, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("handler_dept_name >=", value, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameLessThan(String value) {
            addCriterion("handler_dept_name <", value, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameLessThanOrEqualTo(String value) {
            addCriterion("handler_dept_name <=", value, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameLike(String value) {
            addCriterion("handler_dept_name like", value, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameNotLike(String value) {
            addCriterion("handler_dept_name not like", value, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameIn(List<String> values) {
            addCriterion("handler_dept_name in", values, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameNotIn(List<String> values) {
            addCriterion("handler_dept_name not in", values, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameBetween(String value1, String value2) {
            addCriterion("handler_dept_name between", value1, value2, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerDeptNameNotBetween(String value1, String value2) {
            addCriterion("handler_dept_name not between", value1, value2, "handlerDeptName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdIsNull() {
            addCriterion("handler_person_id is null");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdIsNotNull() {
            addCriterion("handler_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdEqualTo(Integer value) {
            addCriterion("handler_person_id =", value, "handlerPersonId");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdNotEqualTo(Integer value) {
            addCriterion("handler_person_id <>", value, "handlerPersonId");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdGreaterThan(Integer value) {
            addCriterion("handler_person_id >", value, "handlerPersonId");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("handler_person_id >=", value, "handlerPersonId");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdLessThan(Integer value) {
            addCriterion("handler_person_id <", value, "handlerPersonId");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("handler_person_id <=", value, "handlerPersonId");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdIn(List<Integer> values) {
            addCriterion("handler_person_id in", values, "handlerPersonId");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdNotIn(List<Integer> values) {
            addCriterion("handler_person_id not in", values, "handlerPersonId");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("handler_person_id between", value1, value2, "handlerPersonId");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("handler_person_id not between", value1, value2, "handlerPersonId");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountIsNull() {
            addCriterion("handler_person_account is null");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountIsNotNull() {
            addCriterion("handler_person_account is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountEqualTo(String value) {
            addCriterion("handler_person_account =", value, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountNotEqualTo(String value) {
            addCriterion("handler_person_account <>", value, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountGreaterThan(String value) {
            addCriterion("handler_person_account >", value, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountGreaterThanOrEqualTo(String value) {
            addCriterion("handler_person_account >=", value, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountLessThan(String value) {
            addCriterion("handler_person_account <", value, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountLessThanOrEqualTo(String value) {
            addCriterion("handler_person_account <=", value, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountLike(String value) {
            addCriterion("handler_person_account like", value, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountNotLike(String value) {
            addCriterion("handler_person_account not like", value, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountIn(List<String> values) {
            addCriterion("handler_person_account in", values, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountNotIn(List<String> values) {
            addCriterion("handler_person_account not in", values, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountBetween(String value1, String value2) {
            addCriterion("handler_person_account between", value1, value2, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonAccountNotBetween(String value1, String value2) {
            addCriterion("handler_person_account not between", value1, value2, "handlerPersonAccount");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameIsNull() {
            addCriterion("handler_person_name is null");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameIsNotNull() {
            addCriterion("handler_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameEqualTo(String value) {
            addCriterion("handler_person_name =", value, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameNotEqualTo(String value) {
            addCriterion("handler_person_name <>", value, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameGreaterThan(String value) {
            addCriterion("handler_person_name >", value, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("handler_person_name >=", value, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameLessThan(String value) {
            addCriterion("handler_person_name <", value, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameLessThanOrEqualTo(String value) {
            addCriterion("handler_person_name <=", value, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameLike(String value) {
            addCriterion("handler_person_name like", value, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameNotLike(String value) {
            addCriterion("handler_person_name not like", value, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameIn(List<String> values) {
            addCriterion("handler_person_name in", values, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameNotIn(List<String> values) {
            addCriterion("handler_person_name not in", values, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameBetween(String value1, String value2) {
            addCriterion("handler_person_name between", value1, value2, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andHandlerPersonNameNotBetween(String value1, String value2) {
            addCriterion("handler_person_name not between", value1, value2, "handlerPersonName");
            return (Criteria) this;
        }

        public Criteria andAttmentIsNull() {
            addCriterion("attment is null");
            return (Criteria) this;
        }

        public Criteria andAttmentIsNotNull() {
            addCriterion("attment is not null");
            return (Criteria) this;
        }

        public Criteria andAttmentEqualTo(String value) {
            addCriterion("attment =", value, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentNotEqualTo(String value) {
            addCriterion("attment <>", value, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentGreaterThan(String value) {
            addCriterion("attment >", value, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentGreaterThanOrEqualTo(String value) {
            addCriterion("attment >=", value, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentLessThan(String value) {
            addCriterion("attment <", value, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentLessThanOrEqualTo(String value) {
            addCriterion("attment <=", value, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentLike(String value) {
            addCriterion("attment like", value, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentNotLike(String value) {
            addCriterion("attment not like", value, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentIn(List<String> values) {
            addCriterion("attment in", values, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentNotIn(List<String> values) {
            addCriterion("attment not in", values, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentBetween(String value1, String value2) {
            addCriterion("attment between", value1, value2, "attment");
            return (Criteria) this;
        }

        public Criteria andAttmentNotBetween(String value1, String value2) {
            addCriterion("attment not between", value1, value2, "attment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentIsNull() {
            addCriterion("measure_attment is null");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentIsNotNull() {
            addCriterion("measure_attment is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentEqualTo(String value) {
            addCriterion("measure_attment =", value, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentNotEqualTo(String value) {
            addCriterion("measure_attment <>", value, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentGreaterThan(String value) {
            addCriterion("measure_attment >", value, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentGreaterThanOrEqualTo(String value) {
            addCriterion("measure_attment >=", value, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentLessThan(String value) {
            addCriterion("measure_attment <", value, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentLessThanOrEqualTo(String value) {
            addCriterion("measure_attment <=", value, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentLike(String value) {
            addCriterion("measure_attment like", value, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentNotLike(String value) {
            addCriterion("measure_attment not like", value, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentIn(List<String> values) {
            addCriterion("measure_attment in", values, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentNotIn(List<String> values) {
            addCriterion("measure_attment not in", values, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentBetween(String value1, String value2) {
            addCriterion("measure_attment between", value1, value2, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureAttmentNotBetween(String value1, String value2) {
            addCriterion("measure_attment not between", value1, value2, "measureAttment");
            return (Criteria) this;
        }

        public Criteria andMeasureTextIsNull() {
            addCriterion("measure_text is null");
            return (Criteria) this;
        }

        public Criteria andMeasureTextIsNotNull() {
            addCriterion("measure_text is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureTextEqualTo(String value) {
            addCriterion("measure_text =", value, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextNotEqualTo(String value) {
            addCriterion("measure_text <>", value, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextGreaterThan(String value) {
            addCriterion("measure_text >", value, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextGreaterThanOrEqualTo(String value) {
            addCriterion("measure_text >=", value, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextLessThan(String value) {
            addCriterion("measure_text <", value, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextLessThanOrEqualTo(String value) {
            addCriterion("measure_text <=", value, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextLike(String value) {
            addCriterion("measure_text like", value, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextNotLike(String value) {
            addCriterion("measure_text not like", value, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextIn(List<String> values) {
            addCriterion("measure_text in", values, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextNotIn(List<String> values) {
            addCriterion("measure_text not in", values, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextBetween(String value1, String value2) {
            addCriterion("measure_text between", value1, value2, "measureText");
            return (Criteria) this;
        }

        public Criteria andMeasureTextNotBetween(String value1, String value2) {
            addCriterion("measure_text not between", value1, value2, "measureText");
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

        public Criteria andConclusionIsNull() {
            addCriterion("conclusion is null");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNotNull() {
            addCriterion("conclusion is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionEqualTo(String value) {
            addCriterion("conclusion =", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotEqualTo(String value) {
            addCriterion("conclusion <>", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThan(String value) {
            addCriterion("conclusion >", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("conclusion >=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThan(String value) {
            addCriterion("conclusion <", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThanOrEqualTo(String value) {
            addCriterion("conclusion <=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLike(String value) {
            addCriterion("conclusion like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotLike(String value) {
            addCriterion("conclusion not like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionIn(List<String> values) {
            addCriterion("conclusion in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotIn(List<String> values) {
            addCriterion("conclusion not in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionBetween(String value1, String value2) {
            addCriterion("conclusion between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotBetween(String value1, String value2) {
            addCriterion("conclusion not between", value1, value2, "conclusion");
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