package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotificationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotificationCriteria() {
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

        public Criteria andIssueDescIsNull() {
            addCriterion("issue_desc is null");
            return (Criteria) this;
        }

        public Criteria andIssueDescIsNotNull() {
            addCriterion("issue_desc is not null");
            return (Criteria) this;
        }

        public Criteria andIssueDescEqualTo(String value) {
            addCriterion("issue_desc =", value, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescNotEqualTo(String value) {
            addCriterion("issue_desc <>", value, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescGreaterThan(String value) {
            addCriterion("issue_desc >", value, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescGreaterThanOrEqualTo(String value) {
            addCriterion("issue_desc >=", value, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescLessThan(String value) {
            addCriterion("issue_desc <", value, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescLessThanOrEqualTo(String value) {
            addCriterion("issue_desc <=", value, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescLike(String value) {
            addCriterion("issue_desc like", value, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescNotLike(String value) {
            addCriterion("issue_desc not like", value, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescIn(List<String> values) {
            addCriterion("issue_desc in", values, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescNotIn(List<String> values) {
            addCriterion("issue_desc not in", values, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescBetween(String value1, String value2) {
            addCriterion("issue_desc between", value1, value2, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDescNotBetween(String value1, String value2) {
            addCriterion("issue_desc not between", value1, value2, "issueDesc");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNull() {
            addCriterion("issue_date is null");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNotNull() {
            addCriterion("issue_date is not null");
            return (Criteria) this;
        }

        public Criteria andIssueDateEqualTo(Date value) {
            addCriterion("issue_date =", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotEqualTo(Date value) {
            addCriterion("issue_date <>", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThan(Date value) {
            addCriterion("issue_date >", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("issue_date >=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThan(Date value) {
            addCriterion("issue_date <", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThanOrEqualTo(Date value) {
            addCriterion("issue_date <=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateIn(List<Date> values) {
            addCriterion("issue_date in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotIn(List<Date> values) {
            addCriterion("issue_date not in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateBetween(Date value1, Date value2) {
            addCriterion("issue_date between", value1, value2, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotBetween(Date value1, Date value2) {
            addCriterion("issue_date not between", value1, value2, "issueDate");
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

        public Criteria andStationNoIsNull() {
            addCriterion("station_no is null");
            return (Criteria) this;
        }

        public Criteria andStationNoIsNotNull() {
            addCriterion("station_no is not null");
            return (Criteria) this;
        }

        public Criteria andStationNoEqualTo(String value) {
            addCriterion("station_no =", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotEqualTo(String value) {
            addCriterion("station_no <>", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThan(String value) {
            addCriterion("station_no >", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThanOrEqualTo(String value) {
            addCriterion("station_no >=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThan(String value) {
            addCriterion("station_no <", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThanOrEqualTo(String value) {
            addCriterion("station_no <=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLike(String value) {
            addCriterion("station_no like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotLike(String value) {
            addCriterion("station_no not like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoIn(List<String> values) {
            addCriterion("station_no in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotIn(List<String> values) {
            addCriterion("station_no not in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoBetween(String value1, String value2) {
            addCriterion("station_no between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotBetween(String value1, String value2) {
            addCriterion("station_no not between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIsNull() {
            addCriterion("engine_type is null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIsNotNull() {
            addCriterion("engine_type is not null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeEqualTo(String value) {
            addCriterion("engine_type =", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotEqualTo(String value) {
            addCriterion("engine_type <>", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeGreaterThan(String value) {
            addCriterion("engine_type >", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("engine_type >=", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLessThan(String value) {
            addCriterion("engine_type <", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLessThanOrEqualTo(String value) {
            addCriterion("engine_type <=", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLike(String value) {
            addCriterion("engine_type like", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotLike(String value) {
            addCriterion("engine_type not like", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIn(List<String> values) {
            addCriterion("engine_type in", values, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotIn(List<String> values) {
            addCriterion("engine_type not in", values, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeBetween(String value1, String value2) {
            addCriterion("engine_type between", value1, value2, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotBetween(String value1, String value2) {
            addCriterion("engine_type not between", value1, value2, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoIsNull() {
            addCriterion("engine_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoIsNotNull() {
            addCriterion("engine_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoEqualTo(String value) {
            addCriterion("engine_serial_no =", value, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoNotEqualTo(String value) {
            addCriterion("engine_serial_no <>", value, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoGreaterThan(String value) {
            addCriterion("engine_serial_no >", value, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("engine_serial_no >=", value, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoLessThan(String value) {
            addCriterion("engine_serial_no <", value, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoLessThanOrEqualTo(String value) {
            addCriterion("engine_serial_no <=", value, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoLike(String value) {
            addCriterion("engine_serial_no like", value, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoNotLike(String value) {
            addCriterion("engine_serial_no not like", value, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoIn(List<String> values) {
            addCriterion("engine_serial_no in", values, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoNotIn(List<String> values) {
            addCriterion("engine_serial_no not in", values, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoBetween(String value1, String value2) {
            addCriterion("engine_serial_no between", value1, value2, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andEngineSerialNoNotBetween(String value1, String value2) {
            addCriterion("engine_serial_no not between", value1, value2, "engineSerialNo");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNull() {
            addCriterion("part_no is null");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNotNull() {
            addCriterion("part_no is not null");
            return (Criteria) this;
        }

        public Criteria andPartNoEqualTo(String value) {
            addCriterion("part_no =", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotEqualTo(String value) {
            addCriterion("part_no <>", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThan(String value) {
            addCriterion("part_no >", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThanOrEqualTo(String value) {
            addCriterion("part_no >=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThan(String value) {
            addCriterion("part_no <", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThanOrEqualTo(String value) {
            addCriterion("part_no <=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLike(String value) {
            addCriterion("part_no like", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotLike(String value) {
            addCriterion("part_no not like", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoIn(List<String> values) {
            addCriterion("part_no in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotIn(List<String> values) {
            addCriterion("part_no not in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoBetween(String value1, String value2) {
            addCriterion("part_no between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotBetween(String value1, String value2) {
            addCriterion("part_no not between", value1, value2, "partNo");
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

        public Criteria andContainmentActionIsNull() {
            addCriterion("containment_action is null");
            return (Criteria) this;
        }

        public Criteria andContainmentActionIsNotNull() {
            addCriterion("containment_action is not null");
            return (Criteria) this;
        }

        public Criteria andContainmentActionEqualTo(String value) {
            addCriterion("containment_action =", value, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionNotEqualTo(String value) {
            addCriterion("containment_action <>", value, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionGreaterThan(String value) {
            addCriterion("containment_action >", value, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionGreaterThanOrEqualTo(String value) {
            addCriterion("containment_action >=", value, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionLessThan(String value) {
            addCriterion("containment_action <", value, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionLessThanOrEqualTo(String value) {
            addCriterion("containment_action <=", value, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionLike(String value) {
            addCriterion("containment_action like", value, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionNotLike(String value) {
            addCriterion("containment_action not like", value, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionIn(List<String> values) {
            addCriterion("containment_action in", values, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionNotIn(List<String> values) {
            addCriterion("containment_action not in", values, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionBetween(String value1, String value2) {
            addCriterion("containment_action between", value1, value2, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andContainmentActionNotBetween(String value1, String value2) {
            addCriterion("containment_action not between", value1, value2, "containmentAction");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andAilureQtyIsNull() {
            addCriterion("ailure_qty is null");
            return (Criteria) this;
        }

        public Criteria andAilureQtyIsNotNull() {
            addCriterion("ailure_qty is not null");
            return (Criteria) this;
        }

        public Criteria andAilureQtyEqualTo(Integer value) {
            addCriterion("ailure_qty =", value, "ailureQty");
            return (Criteria) this;
        }

        public Criteria andAilureQtyNotEqualTo(Integer value) {
            addCriterion("ailure_qty <>", value, "ailureQty");
            return (Criteria) this;
        }

        public Criteria andAilureQtyGreaterThan(Integer value) {
            addCriterion("ailure_qty >", value, "ailureQty");
            return (Criteria) this;
        }

        public Criteria andAilureQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ailure_qty >=", value, "ailureQty");
            return (Criteria) this;
        }

        public Criteria andAilureQtyLessThan(Integer value) {
            addCriterion("ailure_qty <", value, "ailureQty");
            return (Criteria) this;
        }

        public Criteria andAilureQtyLessThanOrEqualTo(Integer value) {
            addCriterion("ailure_qty <=", value, "ailureQty");
            return (Criteria) this;
        }

        public Criteria andAilureQtyIn(List<Integer> values) {
            addCriterion("ailure_qty in", values, "ailureQty");
            return (Criteria) this;
        }

        public Criteria andAilureQtyNotIn(List<Integer> values) {
            addCriterion("ailure_qty not in", values, "ailureQty");
            return (Criteria) this;
        }

        public Criteria andAilureQtyBetween(Integer value1, Integer value2) {
            addCriterion("ailure_qty between", value1, value2, "ailureQty");
            return (Criteria) this;
        }

        public Criteria andAilureQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("ailure_qty not between", value1, value2, "ailureQty");
            return (Criteria) this;
        }

        public Criteria andCleanPointIsNull() {
            addCriterion("clean_point is null");
            return (Criteria) this;
        }

        public Criteria andCleanPointIsNotNull() {
            addCriterion("clean_point is not null");
            return (Criteria) this;
        }

        public Criteria andCleanPointEqualTo(String value) {
            addCriterion("clean_point =", value, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointNotEqualTo(String value) {
            addCriterion("clean_point <>", value, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointGreaterThan(String value) {
            addCriterion("clean_point >", value, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointGreaterThanOrEqualTo(String value) {
            addCriterion("clean_point >=", value, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointLessThan(String value) {
            addCriterion("clean_point <", value, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointLessThanOrEqualTo(String value) {
            addCriterion("clean_point <=", value, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointLike(String value) {
            addCriterion("clean_point like", value, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointNotLike(String value) {
            addCriterion("clean_point not like", value, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointIn(List<String> values) {
            addCriterion("clean_point in", values, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointNotIn(List<String> values) {
            addCriterion("clean_point not in", values, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointBetween(String value1, String value2) {
            addCriterion("clean_point between", value1, value2, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andCleanPointNotBetween(String value1, String value2) {
            addCriterion("clean_point not between", value1, value2, "cleanPoint");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutIsNull() {
            addCriterion("effect_engine_amout is null");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutIsNotNull() {
            addCriterion("effect_engine_amout is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutEqualTo(String value) {
            addCriterion("effect_engine_amout =", value, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutNotEqualTo(String value) {
            addCriterion("effect_engine_amout <>", value, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutGreaterThan(String value) {
            addCriterion("effect_engine_amout >", value, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutGreaterThanOrEqualTo(String value) {
            addCriterion("effect_engine_amout >=", value, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutLessThan(String value) {
            addCriterion("effect_engine_amout <", value, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutLessThanOrEqualTo(String value) {
            addCriterion("effect_engine_amout <=", value, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutLike(String value) {
            addCriterion("effect_engine_amout like", value, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutNotLike(String value) {
            addCriterion("effect_engine_amout not like", value, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutIn(List<String> values) {
            addCriterion("effect_engine_amout in", values, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutNotIn(List<String> values) {
            addCriterion("effect_engine_amout not in", values, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutBetween(String value1, String value2) {
            addCriterion("effect_engine_amout between", value1, value2, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectEngineAmoutNotBetween(String value1, String value2) {
            addCriterion("effect_engine_amout not between", value1, value2, "effectEngineAmout");
            return (Criteria) this;
        }

        public Criteria andEffectScopeIsNull() {
            addCriterion("effect_scope is null");
            return (Criteria) this;
        }

        public Criteria andEffectScopeIsNotNull() {
            addCriterion("effect_scope is not null");
            return (Criteria) this;
        }

        public Criteria andEffectScopeEqualTo(String value) {
            addCriterion("effect_scope =", value, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeNotEqualTo(String value) {
            addCriterion("effect_scope <>", value, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeGreaterThan(String value) {
            addCriterion("effect_scope >", value, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeGreaterThanOrEqualTo(String value) {
            addCriterion("effect_scope >=", value, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeLessThan(String value) {
            addCriterion("effect_scope <", value, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeLessThanOrEqualTo(String value) {
            addCriterion("effect_scope <=", value, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeLike(String value) {
            addCriterion("effect_scope like", value, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeNotLike(String value) {
            addCriterion("effect_scope not like", value, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeIn(List<String> values) {
            addCriterion("effect_scope in", values, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeNotIn(List<String> values) {
            addCriterion("effect_scope not in", values, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeBetween(String value1, String value2) {
            addCriterion("effect_scope between", value1, value2, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectScopeNotBetween(String value1, String value2) {
            addCriterion("effect_scope not between", value1, value2, "effectScope");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryIsNull() {
            addCriterion("effect_to_delivery is null");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryIsNotNull() {
            addCriterion("effect_to_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryEqualTo(String value) {
            addCriterion("effect_to_delivery =", value, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryNotEqualTo(String value) {
            addCriterion("effect_to_delivery <>", value, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryGreaterThan(String value) {
            addCriterion("effect_to_delivery >", value, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("effect_to_delivery >=", value, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryLessThan(String value) {
            addCriterion("effect_to_delivery <", value, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryLessThanOrEqualTo(String value) {
            addCriterion("effect_to_delivery <=", value, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryLike(String value) {
            addCriterion("effect_to_delivery like", value, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryNotLike(String value) {
            addCriterion("effect_to_delivery not like", value, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryIn(List<String> values) {
            addCriterion("effect_to_delivery in", values, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryNotIn(List<String> values) {
            addCriterion("effect_to_delivery not in", values, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryBetween(String value1, String value2) {
            addCriterion("effect_to_delivery between", value1, value2, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andEffectToDeliveryNotBetween(String value1, String value2) {
            addCriterion("effect_to_delivery not between", value1, value2, "effectToDelivery");
            return (Criteria) this;
        }

        public Criteria andIssueSensorIsNull() {
            addCriterion("issue_sensor is null");
            return (Criteria) this;
        }

        public Criteria andIssueSensorIsNotNull() {
            addCriterion("issue_sensor is not null");
            return (Criteria) this;
        }

        public Criteria andIssueSensorEqualTo(String value) {
            addCriterion("issue_sensor =", value, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorNotEqualTo(String value) {
            addCriterion("issue_sensor <>", value, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorGreaterThan(String value) {
            addCriterion("issue_sensor >", value, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorGreaterThanOrEqualTo(String value) {
            addCriterion("issue_sensor >=", value, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorLessThan(String value) {
            addCriterion("issue_sensor <", value, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorLessThanOrEqualTo(String value) {
            addCriterion("issue_sensor <=", value, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorLike(String value) {
            addCriterion("issue_sensor like", value, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorNotLike(String value) {
            addCriterion("issue_sensor not like", value, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorIn(List<String> values) {
            addCriterion("issue_sensor in", values, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorNotIn(List<String> values) {
            addCriterion("issue_sensor not in", values, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorBetween(String value1, String value2) {
            addCriterion("issue_sensor between", value1, value2, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andIssueSensorNotBetween(String value1, String value2) {
            addCriterion("issue_sensor not between", value1, value2, "issueSensor");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andCarScarIsNull() {
            addCriterion("car_scar is null");
            return (Criteria) this;
        }

        public Criteria andCarScarIsNotNull() {
            addCriterion("car_scar is not null");
            return (Criteria) this;
        }

        public Criteria andCarScarEqualTo(String value) {
            addCriterion("car_scar =", value, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarNotEqualTo(String value) {
            addCriterion("car_scar <>", value, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarGreaterThan(String value) {
            addCriterion("car_scar >", value, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarGreaterThanOrEqualTo(String value) {
            addCriterion("car_scar >=", value, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarLessThan(String value) {
            addCriterion("car_scar <", value, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarLessThanOrEqualTo(String value) {
            addCriterion("car_scar <=", value, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarLike(String value) {
            addCriterion("car_scar like", value, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarNotLike(String value) {
            addCriterion("car_scar not like", value, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarIn(List<String> values) {
            addCriterion("car_scar in", values, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarNotIn(List<String> values) {
            addCriterion("car_scar not in", values, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarBetween(String value1, String value2) {
            addCriterion("car_scar between", value1, value2, "carScar");
            return (Criteria) this;
        }

        public Criteria andCarScarNotBetween(String value1, String value2) {
            addCriterion("car_scar not between", value1, value2, "carScar");
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