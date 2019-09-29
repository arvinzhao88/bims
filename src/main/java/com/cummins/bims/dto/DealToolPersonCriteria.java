package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealToolPersonCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealToolPersonCriteria() {
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

        public Criteria andToolNoIsNull() {
            addCriterion("tool_no is null");
            return (Criteria) this;
        }

        public Criteria andToolNoIsNotNull() {
            addCriterion("tool_no is not null");
            return (Criteria) this;
        }

        public Criteria andToolNoEqualTo(String value) {
            addCriterion("tool_no =", value, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoNotEqualTo(String value) {
            addCriterion("tool_no <>", value, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoGreaterThan(String value) {
            addCriterion("tool_no >", value, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoGreaterThanOrEqualTo(String value) {
            addCriterion("tool_no >=", value, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoLessThan(String value) {
            addCriterion("tool_no <", value, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoLessThanOrEqualTo(String value) {
            addCriterion("tool_no <=", value, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoLike(String value) {
            addCriterion("tool_no like", value, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoNotLike(String value) {
            addCriterion("tool_no not like", value, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoIn(List<String> values) {
            addCriterion("tool_no in", values, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoNotIn(List<String> values) {
            addCriterion("tool_no not in", values, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoBetween(String value1, String value2) {
            addCriterion("tool_no between", value1, value2, "toolNo");
            return (Criteria) this;
        }

        public Criteria andToolNoNotBetween(String value1, String value2) {
            addCriterion("tool_no not between", value1, value2, "toolNo");
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

        public Criteria andIssueAreaIsNull() {
            addCriterion("issue_area is null");
            return (Criteria) this;
        }

        public Criteria andIssueAreaIsNotNull() {
            addCriterion("issue_area is not null");
            return (Criteria) this;
        }

        public Criteria andIssueAreaEqualTo(String value) {
            addCriterion("issue_area =", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotEqualTo(String value) {
            addCriterion("issue_area <>", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaGreaterThan(String value) {
            addCriterion("issue_area >", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaGreaterThanOrEqualTo(String value) {
            addCriterion("issue_area >=", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaLessThan(String value) {
            addCriterion("issue_area <", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaLessThanOrEqualTo(String value) {
            addCriterion("issue_area <=", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaLike(String value) {
            addCriterion("issue_area like", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotLike(String value) {
            addCriterion("issue_area not like", value, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaIn(List<String> values) {
            addCriterion("issue_area in", values, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotIn(List<String> values) {
            addCriterion("issue_area not in", values, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaBetween(String value1, String value2) {
            addCriterion("issue_area between", value1, value2, "issueArea");
            return (Criteria) this;
        }

        public Criteria andIssueAreaNotBetween(String value1, String value2) {
            addCriterion("issue_area not between", value1, value2, "issueArea");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameIsNull() {
            addCriterion("process_person_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameIsNotNull() {
            addCriterion("process_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameEqualTo(String value) {
            addCriterion("process_person_name =", value, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameNotEqualTo(String value) {
            addCriterion("process_person_name <>", value, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameGreaterThan(String value) {
            addCriterion("process_person_name >", value, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_person_name >=", value, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameLessThan(String value) {
            addCriterion("process_person_name <", value, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameLessThanOrEqualTo(String value) {
            addCriterion("process_person_name <=", value, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameLike(String value) {
            addCriterion("process_person_name like", value, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameNotLike(String value) {
            addCriterion("process_person_name not like", value, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameIn(List<String> values) {
            addCriterion("process_person_name in", values, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameNotIn(List<String> values) {
            addCriterion("process_person_name not in", values, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameBetween(String value1, String value2) {
            addCriterion("process_person_name between", value1, value2, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNameNotBetween(String value1, String value2) {
            addCriterion("process_person_name not between", value1, value2, "processPersonName");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountIsNull() {
            addCriterion("process_person_account is null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountIsNotNull() {
            addCriterion("process_person_account is not null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountEqualTo(String value) {
            addCriterion("process_person_account =", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountNotEqualTo(String value) {
            addCriterion("process_person_account <>", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountGreaterThan(String value) {
            addCriterion("process_person_account >", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountGreaterThanOrEqualTo(String value) {
            addCriterion("process_person_account >=", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountLessThan(String value) {
            addCriterion("process_person_account <", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountLessThanOrEqualTo(String value) {
            addCriterion("process_person_account <=", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountLike(String value) {
            addCriterion("process_person_account like", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountNotLike(String value) {
            addCriterion("process_person_account not like", value, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountIn(List<String> values) {
            addCriterion("process_person_account in", values, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountNotIn(List<String> values) {
            addCriterion("process_person_account not in", values, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountBetween(String value1, String value2) {
            addCriterion("process_person_account between", value1, value2, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonAccountNotBetween(String value1, String value2) {
            addCriterion("process_person_account not between", value1, value2, "processPersonAccount");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdIsNull() {
            addCriterion("process_person_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdIsNotNull() {
            addCriterion("process_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdEqualTo(Integer value) {
            addCriterion("process_person_id =", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdNotEqualTo(Integer value) {
            addCriterion("process_person_id <>", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdGreaterThan(Integer value) {
            addCriterion("process_person_id >", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_person_id >=", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdLessThan(Integer value) {
            addCriterion("process_person_id <", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("process_person_id <=", value, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdIn(List<Integer> values) {
            addCriterion("process_person_id in", values, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdNotIn(List<Integer> values) {
            addCriterion("process_person_id not in", values, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("process_person_id between", value1, value2, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("process_person_id not between", value1, value2, "processPersonId");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameIsNull() {
            addCriterion("init_person_name is null");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameIsNotNull() {
            addCriterion("init_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameEqualTo(String value) {
            addCriterion("init_person_name =", value, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameNotEqualTo(String value) {
            addCriterion("init_person_name <>", value, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameGreaterThan(String value) {
            addCriterion("init_person_name >", value, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("init_person_name >=", value, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameLessThan(String value) {
            addCriterion("init_person_name <", value, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameLessThanOrEqualTo(String value) {
            addCriterion("init_person_name <=", value, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameLike(String value) {
            addCriterion("init_person_name like", value, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameNotLike(String value) {
            addCriterion("init_person_name not like", value, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameIn(List<String> values) {
            addCriterion("init_person_name in", values, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameNotIn(List<String> values) {
            addCriterion("init_person_name not in", values, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameBetween(String value1, String value2) {
            addCriterion("init_person_name between", value1, value2, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andInitPersonNameNotBetween(String value1, String value2) {
            addCriterion("init_person_name not between", value1, value2, "initPersonName");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountIsNull() {
            addCriterion("int_person_account is null");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountIsNotNull() {
            addCriterion("int_person_account is not null");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountEqualTo(String value) {
            addCriterion("int_person_account =", value, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountNotEqualTo(String value) {
            addCriterion("int_person_account <>", value, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountGreaterThan(String value) {
            addCriterion("int_person_account >", value, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountGreaterThanOrEqualTo(String value) {
            addCriterion("int_person_account >=", value, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountLessThan(String value) {
            addCriterion("int_person_account <", value, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountLessThanOrEqualTo(String value) {
            addCriterion("int_person_account <=", value, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountLike(String value) {
            addCriterion("int_person_account like", value, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountNotLike(String value) {
            addCriterion("int_person_account not like", value, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountIn(List<String> values) {
            addCriterion("int_person_account in", values, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountNotIn(List<String> values) {
            addCriterion("int_person_account not in", values, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountBetween(String value1, String value2) {
            addCriterion("int_person_account between", value1, value2, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andIntPersonAccountNotBetween(String value1, String value2) {
            addCriterion("int_person_account not between", value1, value2, "intPersonAccount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andToolTypeIsNull() {
            addCriterion("tool_type is null");
            return (Criteria) this;
        }

        public Criteria andToolTypeIsNotNull() {
            addCriterion("tool_type is not null");
            return (Criteria) this;
        }

        public Criteria andToolTypeEqualTo(Byte value) {
            addCriterion("tool_type =", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeNotEqualTo(Byte value) {
            addCriterion("tool_type <>", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeGreaterThan(Byte value) {
            addCriterion("tool_type >", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tool_type >=", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeLessThan(Byte value) {
            addCriterion("tool_type <", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tool_type <=", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeIn(List<Byte> values) {
            addCriterion("tool_type in", values, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeNotIn(List<Byte> values) {
            addCriterion("tool_type not in", values, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeBetween(Byte value1, Byte value2) {
            addCriterion("tool_type between", value1, value2, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tool_type not between", value1, value2, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolNameIsNull() {
            addCriterion("tool_name is null");
            return (Criteria) this;
        }

        public Criteria andToolNameIsNotNull() {
            addCriterion("tool_name is not null");
            return (Criteria) this;
        }

        public Criteria andToolNameEqualTo(String value) {
            addCriterion("tool_name =", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameNotEqualTo(String value) {
            addCriterion("tool_name <>", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameGreaterThan(String value) {
            addCriterion("tool_name >", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameGreaterThanOrEqualTo(String value) {
            addCriterion("tool_name >=", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameLessThan(String value) {
            addCriterion("tool_name <", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameLessThanOrEqualTo(String value) {
            addCriterion("tool_name <=", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameLike(String value) {
            addCriterion("tool_name like", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameNotLike(String value) {
            addCriterion("tool_name not like", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameIn(List<String> values) {
            addCriterion("tool_name in", values, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameNotIn(List<String> values) {
            addCriterion("tool_name not in", values, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameBetween(String value1, String value2) {
            addCriterion("tool_name between", value1, value2, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameNotBetween(String value1, String value2) {
            addCriterion("tool_name not between", value1, value2, "toolName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeIsNull() {
            addCriterion("need_over_time is null");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeIsNotNull() {
            addCriterion("need_over_time is not null");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeEqualTo(Date value) {
            addCriterion("need_over_time =", value, "needOverTime");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeNotEqualTo(Date value) {
            addCriterion("need_over_time <>", value, "needOverTime");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeGreaterThan(Date value) {
            addCriterion("need_over_time >", value, "needOverTime");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("need_over_time >=", value, "needOverTime");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeLessThan(Date value) {
            addCriterion("need_over_time <", value, "needOverTime");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("need_over_time <=", value, "needOverTime");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeIn(List<Date> values) {
            addCriterion("need_over_time in", values, "needOverTime");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeNotIn(List<Date> values) {
            addCriterion("need_over_time not in", values, "needOverTime");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeBetween(Date value1, Date value2) {
            addCriterion("need_over_time between", value1, value2, "needOverTime");
            return (Criteria) this;
        }

        public Criteria andNeedOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("need_over_time not between", value1, value2, "needOverTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNull() {
            addCriterion("deal_time is null");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNotNull() {
            addCriterion("deal_time is not null");
            return (Criteria) this;
        }

        public Criteria andDealTimeEqualTo(Date value) {
            addCriterion("deal_time =", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotEqualTo(Date value) {
            addCriterion("deal_time <>", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThan(Date value) {
            addCriterion("deal_time >", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deal_time >=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThan(Date value) {
            addCriterion("deal_time <", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThanOrEqualTo(Date value) {
            addCriterion("deal_time <=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIn(List<Date> values) {
            addCriterion("deal_time in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotIn(List<Date> values) {
            addCriterion("deal_time not in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeBetween(Date value1, Date value2) {
            addCriterion("deal_time between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotBetween(Date value1, Date value2) {
            addCriterion("deal_time not between", value1, value2, "dealTime");
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