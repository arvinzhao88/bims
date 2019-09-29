package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdviceCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdviceCriteria() {
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

        public Criteria andIssueCategoryL1IsNull() {
            addCriterion("issue_category_l1 is null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1IsNotNull() {
            addCriterion("issue_category_l1 is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1EqualTo(Integer value) {
            addCriterion("issue_category_l1 =", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NotEqualTo(Integer value) {
            addCriterion("issue_category_l1 <>", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1GreaterThan(Integer value) {
            addCriterion("issue_category_l1 >", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1GreaterThanOrEqualTo(Integer value) {
            addCriterion("issue_category_l1 >=", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1LessThan(Integer value) {
            addCriterion("issue_category_l1 <", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1LessThanOrEqualTo(Integer value) {
            addCriterion("issue_category_l1 <=", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1In(List<Integer> values) {
            addCriterion("issue_category_l1 in", values, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NotIn(List<Integer> values) {
            addCriterion("issue_category_l1 not in", values, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1Between(Integer value1, Integer value2) {
            addCriterion("issue_category_l1 between", value1, value2, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NotBetween(Integer value1, Integer value2) {
            addCriterion("issue_category_l1 not between", value1, value2, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameIsNull() {
            addCriterion("issue_category_l1_name is null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameIsNotNull() {
            addCriterion("issue_category_l1_name is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameEqualTo(String value) {
            addCriterion("issue_category_l1_name =", value, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameNotEqualTo(String value) {
            addCriterion("issue_category_l1_name <>", value, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameGreaterThan(String value) {
            addCriterion("issue_category_l1_name >", value, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameGreaterThanOrEqualTo(String value) {
            addCriterion("issue_category_l1_name >=", value, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameLessThan(String value) {
            addCriterion("issue_category_l1_name <", value, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameLessThanOrEqualTo(String value) {
            addCriterion("issue_category_l1_name <=", value, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameLike(String value) {
            addCriterion("issue_category_l1_name like", value, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameNotLike(String value) {
            addCriterion("issue_category_l1_name not like", value, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameIn(List<String> values) {
            addCriterion("issue_category_l1_name in", values, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameNotIn(List<String> values) {
            addCriterion("issue_category_l1_name not in", values, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameBetween(String value1, String value2) {
            addCriterion("issue_category_l1_name between", value1, value2, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NameNotBetween(String value1, String value2) {
            addCriterion("issue_category_l1_name not between", value1, value2, "issueCategoryL1Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2IsNull() {
            addCriterion("issue_category_l2 is null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2IsNotNull() {
            addCriterion("issue_category_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2EqualTo(Integer value) {
            addCriterion("issue_category_l2 =", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NotEqualTo(Integer value) {
            addCriterion("issue_category_l2 <>", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2GreaterThan(Integer value) {
            addCriterion("issue_category_l2 >", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2GreaterThanOrEqualTo(Integer value) {
            addCriterion("issue_category_l2 >=", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2LessThan(Integer value) {
            addCriterion("issue_category_l2 <", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2LessThanOrEqualTo(Integer value) {
            addCriterion("issue_category_l2 <=", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2In(List<Integer> values) {
            addCriterion("issue_category_l2 in", values, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NotIn(List<Integer> values) {
            addCriterion("issue_category_l2 not in", values, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2Between(Integer value1, Integer value2) {
            addCriterion("issue_category_l2 between", value1, value2, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NotBetween(Integer value1, Integer value2) {
            addCriterion("issue_category_l2 not between", value1, value2, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameIsNull() {
            addCriterion("issue_category_l2_name is null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameIsNotNull() {
            addCriterion("issue_category_l2_name is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameEqualTo(String value) {
            addCriterion("issue_category_l2_name =", value, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameNotEqualTo(String value) {
            addCriterion("issue_category_l2_name <>", value, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameGreaterThan(String value) {
            addCriterion("issue_category_l2_name >", value, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameGreaterThanOrEqualTo(String value) {
            addCriterion("issue_category_l2_name >=", value, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameLessThan(String value) {
            addCriterion("issue_category_l2_name <", value, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameLessThanOrEqualTo(String value) {
            addCriterion("issue_category_l2_name <=", value, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameLike(String value) {
            addCriterion("issue_category_l2_name like", value, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameNotLike(String value) {
            addCriterion("issue_category_l2_name not like", value, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameIn(List<String> values) {
            addCriterion("issue_category_l2_name in", values, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameNotIn(List<String> values) {
            addCriterion("issue_category_l2_name not in", values, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameBetween(String value1, String value2) {
            addCriterion("issue_category_l2_name between", value1, value2, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NameNotBetween(String value1, String value2) {
            addCriterion("issue_category_l2_name not between", value1, value2, "issueCategoryL2Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3IsNull() {
            addCriterion("issue_category_l3 is null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3IsNotNull() {
            addCriterion("issue_category_l3 is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3EqualTo(String value) {
            addCriterion("issue_category_l3 =", value, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NotEqualTo(String value) {
            addCriterion("issue_category_l3 <>", value, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3GreaterThan(String value) {
            addCriterion("issue_category_l3 >", value, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3GreaterThanOrEqualTo(String value) {
            addCriterion("issue_category_l3 >=", value, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3LessThan(String value) {
            addCriterion("issue_category_l3 <", value, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3LessThanOrEqualTo(String value) {
            addCriterion("issue_category_l3 <=", value, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3Like(String value) {
            addCriterion("issue_category_l3 like", value, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NotLike(String value) {
            addCriterion("issue_category_l3 not like", value, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3In(List<String> values) {
            addCriterion("issue_category_l3 in", values, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NotIn(List<String> values) {
            addCriterion("issue_category_l3 not in", values, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3Between(String value1, String value2) {
            addCriterion("issue_category_l3 between", value1, value2, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NotBetween(String value1, String value2) {
            addCriterion("issue_category_l3 not between", value1, value2, "issueCategoryL3");
            return (Criteria) this;
        }

        public Criteria andHandlerDateIsNull() {
            addCriterion("handler_date is null");
            return (Criteria) this;
        }

        public Criteria andHandlerDateIsNotNull() {
            addCriterion("handler_date is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerDateEqualTo(Date value) {
            addCriterion("handler_date =", value, "handlerDate");
            return (Criteria) this;
        }

        public Criteria andHandlerDateNotEqualTo(Date value) {
            addCriterion("handler_date <>", value, "handlerDate");
            return (Criteria) this;
        }

        public Criteria andHandlerDateGreaterThan(Date value) {
            addCriterion("handler_date >", value, "handlerDate");
            return (Criteria) this;
        }

        public Criteria andHandlerDateGreaterThanOrEqualTo(Date value) {
            addCriterion("handler_date >=", value, "handlerDate");
            return (Criteria) this;
        }

        public Criteria andHandlerDateLessThan(Date value) {
            addCriterion("handler_date <", value, "handlerDate");
            return (Criteria) this;
        }

        public Criteria andHandlerDateLessThanOrEqualTo(Date value) {
            addCriterion("handler_date <=", value, "handlerDate");
            return (Criteria) this;
        }

        public Criteria andHandlerDateIn(List<Date> values) {
            addCriterion("handler_date in", values, "handlerDate");
            return (Criteria) this;
        }

        public Criteria andHandlerDateNotIn(List<Date> values) {
            addCriterion("handler_date not in", values, "handlerDate");
            return (Criteria) this;
        }

        public Criteria andHandlerDateBetween(Date value1, Date value2) {
            addCriterion("handler_date between", value1, value2, "handlerDate");
            return (Criteria) this;
        }

        public Criteria andHandlerDateNotBetween(Date value1, Date value2) {
            addCriterion("handler_date not between", value1, value2, "handlerDate");
            return (Criteria) this;
        }

        public Criteria andResolutionIsNull() {
            addCriterion("resolution is null");
            return (Criteria) this;
        }

        public Criteria andResolutionIsNotNull() {
            addCriterion("resolution is not null");
            return (Criteria) this;
        }

        public Criteria andResolutionEqualTo(String value) {
            addCriterion("resolution =", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotEqualTo(String value) {
            addCriterion("resolution <>", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionGreaterThan(String value) {
            addCriterion("resolution >", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionGreaterThanOrEqualTo(String value) {
            addCriterion("resolution >=", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLessThan(String value) {
            addCriterion("resolution <", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLessThanOrEqualTo(String value) {
            addCriterion("resolution <=", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLike(String value) {
            addCriterion("resolution like", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotLike(String value) {
            addCriterion("resolution not like", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionIn(List<String> values) {
            addCriterion("resolution in", values, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotIn(List<String> values) {
            addCriterion("resolution not in", values, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionBetween(String value1, String value2) {
            addCriterion("resolution between", value1, value2, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotBetween(String value1, String value2) {
            addCriterion("resolution not between", value1, value2, "resolution");
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