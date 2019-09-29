package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.List;

public class DealToolCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealToolCriteria() {
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

        public Criteria andNotificationIdIsNull() {
            addCriterion("notification_id is null");
            return (Criteria) this;
        }

        public Criteria andNotificationIdIsNotNull() {
            addCriterion("notification_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationIdEqualTo(String value) {
            addCriterion("notification_id =", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotEqualTo(String value) {
            addCriterion("notification_id <>", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdGreaterThan(String value) {
            addCriterion("notification_id >", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdGreaterThanOrEqualTo(String value) {
            addCriterion("notification_id >=", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdLessThan(String value) {
            addCriterion("notification_id <", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdLessThanOrEqualTo(String value) {
            addCriterion("notification_id <=", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdLike(String value) {
            addCriterion("notification_id like", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotLike(String value) {
            addCriterion("notification_id not like", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdIn(List<String> values) {
            addCriterion("notification_id in", values, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotIn(List<String> values) {
            addCriterion("notification_id not in", values, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdBetween(String value1, String value2) {
            addCriterion("notification_id between", value1, value2, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotBetween(String value1, String value2) {
            addCriterion("notification_id not between", value1, value2, "notificationId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameIsNull() {
            addCriterion("apply_person_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameIsNotNull() {
            addCriterion("apply_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameEqualTo(String value) {
            addCriterion("apply_person_name =", value, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameNotEqualTo(String value) {
            addCriterion("apply_person_name <>", value, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameGreaterThan(String value) {
            addCriterion("apply_person_name >", value, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_person_name >=", value, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameLessThan(String value) {
            addCriterion("apply_person_name <", value, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameLessThanOrEqualTo(String value) {
            addCriterion("apply_person_name <=", value, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameLike(String value) {
            addCriterion("apply_person_name like", value, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameNotLike(String value) {
            addCriterion("apply_person_name not like", value, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameIn(List<String> values) {
            addCriterion("apply_person_name in", values, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameNotIn(List<String> values) {
            addCriterion("apply_person_name not in", values, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameBetween(String value1, String value2) {
            addCriterion("apply_person_name between", value1, value2, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNameNotBetween(String value1, String value2) {
            addCriterion("apply_person_name not between", value1, value2, "applyPersonName");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIsNull() {
            addCriterion("apply_person is null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIsNotNull() {
            addCriterion("apply_person is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonEqualTo(String value) {
            addCriterion("apply_person =", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotEqualTo(String value) {
            addCriterion("apply_person <>", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonGreaterThan(String value) {
            addCriterion("apply_person >", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("apply_person >=", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLessThan(String value) {
            addCriterion("apply_person <", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLessThanOrEqualTo(String value) {
            addCriterion("apply_person <=", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLike(String value) {
            addCriterion("apply_person like", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotLike(String value) {
            addCriterion("apply_person not like", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIn(List<String> values) {
            addCriterion("apply_person in", values, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotIn(List<String> values) {
            addCriterion("apply_person not in", values, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonBetween(String value1, String value2) {
            addCriterion("apply_person between", value1, value2, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotBetween(String value1, String value2) {
            addCriterion("apply_person not between", value1, value2, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andProcessToolIsNull() {
            addCriterion("process_tool is null");
            return (Criteria) this;
        }

        public Criteria andProcessToolIsNotNull() {
            addCriterion("process_tool is not null");
            return (Criteria) this;
        }

        public Criteria andProcessToolEqualTo(String value) {
            addCriterion("process_tool =", value, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolNotEqualTo(String value) {
            addCriterion("process_tool <>", value, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolGreaterThan(String value) {
            addCriterion("process_tool >", value, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolGreaterThanOrEqualTo(String value) {
            addCriterion("process_tool >=", value, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolLessThan(String value) {
            addCriterion("process_tool <", value, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolLessThanOrEqualTo(String value) {
            addCriterion("process_tool <=", value, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolLike(String value) {
            addCriterion("process_tool like", value, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolNotLike(String value) {
            addCriterion("process_tool not like", value, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolIn(List<String> values) {
            addCriterion("process_tool in", values, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolNotIn(List<String> values) {
            addCriterion("process_tool not in", values, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolBetween(String value1, String value2) {
            addCriterion("process_tool between", value1, value2, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolNotBetween(String value1, String value2) {
            addCriterion("process_tool not between", value1, value2, "processTool");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameIsNull() {
            addCriterion("process_tool_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameIsNotNull() {
            addCriterion("process_tool_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameEqualTo(String value) {
            addCriterion("process_tool_name =", value, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameNotEqualTo(String value) {
            addCriterion("process_tool_name <>", value, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameGreaterThan(String value) {
            addCriterion("process_tool_name >", value, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_tool_name >=", value, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameLessThan(String value) {
            addCriterion("process_tool_name <", value, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameLessThanOrEqualTo(String value) {
            addCriterion("process_tool_name <=", value, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameLike(String value) {
            addCriterion("process_tool_name like", value, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameNotLike(String value) {
            addCriterion("process_tool_name not like", value, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameIn(List<String> values) {
            addCriterion("process_tool_name in", values, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameNotIn(List<String> values) {
            addCriterion("process_tool_name not in", values, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameBetween(String value1, String value2) {
            addCriterion("process_tool_name between", value1, value2, "processToolName");
            return (Criteria) this;
        }

        public Criteria andProcessToolNameNotBetween(String value1, String value2) {
            addCriterion("process_tool_name not between", value1, value2, "processToolName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonIsNull() {
            addCriterion("tool_duty_person is null");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonIsNotNull() {
            addCriterion("tool_duty_person is not null");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonEqualTo(String value) {
            addCriterion("tool_duty_person =", value, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNotEqualTo(String value) {
            addCriterion("tool_duty_person <>", value, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonGreaterThan(String value) {
            addCriterion("tool_duty_person >", value, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("tool_duty_person >=", value, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonLessThan(String value) {
            addCriterion("tool_duty_person <", value, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonLessThanOrEqualTo(String value) {
            addCriterion("tool_duty_person <=", value, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonLike(String value) {
            addCriterion("tool_duty_person like", value, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNotLike(String value) {
            addCriterion("tool_duty_person not like", value, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonIn(List<String> values) {
            addCriterion("tool_duty_person in", values, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNotIn(List<String> values) {
            addCriterion("tool_duty_person not in", values, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonBetween(String value1, String value2) {
            addCriterion("tool_duty_person between", value1, value2, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNotBetween(String value1, String value2) {
            addCriterion("tool_duty_person not between", value1, value2, "toolDutyPerson");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameIsNull() {
            addCriterion("tool_duty_person_name is null");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameIsNotNull() {
            addCriterion("tool_duty_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameEqualTo(String value) {
            addCriterion("tool_duty_person_name =", value, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameNotEqualTo(String value) {
            addCriterion("tool_duty_person_name <>", value, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameGreaterThan(String value) {
            addCriterion("tool_duty_person_name >", value, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("tool_duty_person_name >=", value, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameLessThan(String value) {
            addCriterion("tool_duty_person_name <", value, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameLessThanOrEqualTo(String value) {
            addCriterion("tool_duty_person_name <=", value, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameLike(String value) {
            addCriterion("tool_duty_person_name like", value, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameNotLike(String value) {
            addCriterion("tool_duty_person_name not like", value, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameIn(List<String> values) {
            addCriterion("tool_duty_person_name in", values, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameNotIn(List<String> values) {
            addCriterion("tool_duty_person_name not in", values, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameBetween(String value1, String value2) {
            addCriterion("tool_duty_person_name between", value1, value2, "toolDutyPersonName");
            return (Criteria) this;
        }

        public Criteria andToolDutyPersonNameNotBetween(String value1, String value2) {
            addCriterion("tool_duty_person_name not between", value1, value2, "toolDutyPersonName");
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