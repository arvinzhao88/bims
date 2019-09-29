package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrintRepairTagCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrintRepairTagCriteria() {
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

        public Criteria andIssueNoIsNull() {
            addCriterion("issue_no is null");
            return (Criteria) this;
        }

        public Criteria andIssueNoIsNotNull() {
            addCriterion("issue_no is not null");
            return (Criteria) this;
        }

        public Criteria andIssueNoEqualTo(String value) {
            addCriterion("issue_no =", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotEqualTo(String value) {
            addCriterion("issue_no <>", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThan(String value) {
            addCriterion("issue_no >", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThanOrEqualTo(String value) {
            addCriterion("issue_no >=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThan(String value) {
            addCriterion("issue_no <", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThanOrEqualTo(String value) {
            addCriterion("issue_no <=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLike(String value) {
            addCriterion("issue_no like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotLike(String value) {
            addCriterion("issue_no not like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoIn(List<String> values) {
            addCriterion("issue_no in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotIn(List<String> values) {
            addCriterion("issue_no not in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoBetween(String value1, String value2) {
            addCriterion("issue_no between", value1, value2, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotBetween(String value1, String value2) {
            addCriterion("issue_no not between", value1, value2, "issueNo");
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

        public Criteria andEsnIsNull() {
            addCriterion("esn is null");
            return (Criteria) this;
        }

        public Criteria andEsnIsNotNull() {
            addCriterion("esn is not null");
            return (Criteria) this;
        }

        public Criteria andEsnEqualTo(String value) {
            addCriterion("esn =", value, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnNotEqualTo(String value) {
            addCriterion("esn <>", value, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnGreaterThan(String value) {
            addCriterion("esn >", value, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnGreaterThanOrEqualTo(String value) {
            addCriterion("esn >=", value, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnLessThan(String value) {
            addCriterion("esn <", value, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnLessThanOrEqualTo(String value) {
            addCriterion("esn <=", value, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnLike(String value) {
            addCriterion("esn like", value, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnNotLike(String value) {
            addCriterion("esn not like", value, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnIn(List<String> values) {
            addCriterion("esn in", values, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnNotIn(List<String> values) {
            addCriterion("esn not in", values, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnBetween(String value1, String value2) {
            addCriterion("esn between", value1, value2, "esn");
            return (Criteria) this;
        }

        public Criteria andEsnNotBetween(String value1, String value2) {
            addCriterion("esn not between", value1, value2, "esn");
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

        public Criteria andTcIsNull() {
            addCriterion("tc is null");
            return (Criteria) this;
        }

        public Criteria andTcIsNotNull() {
            addCriterion("tc is not null");
            return (Criteria) this;
        }

        public Criteria andTcEqualTo(String value) {
            addCriterion("tc =", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotEqualTo(String value) {
            addCriterion("tc <>", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcGreaterThan(String value) {
            addCriterion("tc >", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcGreaterThanOrEqualTo(String value) {
            addCriterion("tc >=", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLessThan(String value) {
            addCriterion("tc <", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLessThanOrEqualTo(String value) {
            addCriterion("tc <=", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLike(String value) {
            addCriterion("tc like", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotLike(String value) {
            addCriterion("tc not like", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcIn(List<String> values) {
            addCriterion("tc in", values, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotIn(List<String> values) {
            addCriterion("tc not in", values, "tc");
            return (Criteria) this;
        }

        public Criteria andTcBetween(String value1, String value2) {
            addCriterion("tc between", value1, value2, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotBetween(String value1, String value2) {
            addCriterion("tc not between", value1, value2, "tc");
            return (Criteria) this;
        }

        public Criteria andPalletIsNull() {
            addCriterion("pallet is null");
            return (Criteria) this;
        }

        public Criteria andPalletIsNotNull() {
            addCriterion("pallet is not null");
            return (Criteria) this;
        }

        public Criteria andPalletEqualTo(String value) {
            addCriterion("pallet =", value, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletNotEqualTo(String value) {
            addCriterion("pallet <>", value, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletGreaterThan(String value) {
            addCriterion("pallet >", value, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletGreaterThanOrEqualTo(String value) {
            addCriterion("pallet >=", value, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletLessThan(String value) {
            addCriterion("pallet <", value, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletLessThanOrEqualTo(String value) {
            addCriterion("pallet <=", value, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletLike(String value) {
            addCriterion("pallet like", value, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletNotLike(String value) {
            addCriterion("pallet not like", value, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletIn(List<String> values) {
            addCriterion("pallet in", values, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletNotIn(List<String> values) {
            addCriterion("pallet not in", values, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletBetween(String value1, String value2) {
            addCriterion("pallet between", value1, value2, "pallet");
            return (Criteria) this;
        }

        public Criteria andPalletNotBetween(String value1, String value2) {
            addCriterion("pallet not between", value1, value2, "pallet");
            return (Criteria) this;
        }

        public Criteria andRepairActionIsNull() {
            addCriterion("repair_action is null");
            return (Criteria) this;
        }

        public Criteria andRepairActionIsNotNull() {
            addCriterion("repair_action is not null");
            return (Criteria) this;
        }

        public Criteria andRepairActionEqualTo(String value) {
            addCriterion("repair_action =", value, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionNotEqualTo(String value) {
            addCriterion("repair_action <>", value, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionGreaterThan(String value) {
            addCriterion("repair_action >", value, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionGreaterThanOrEqualTo(String value) {
            addCriterion("repair_action >=", value, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionLessThan(String value) {
            addCriterion("repair_action <", value, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionLessThanOrEqualTo(String value) {
            addCriterion("repair_action <=", value, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionLike(String value) {
            addCriterion("repair_action like", value, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionNotLike(String value) {
            addCriterion("repair_action not like", value, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionIn(List<String> values) {
            addCriterion("repair_action in", values, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionNotIn(List<String> values) {
            addCriterion("repair_action not in", values, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionBetween(String value1, String value2) {
            addCriterion("repair_action between", value1, value2, "repairAction");
            return (Criteria) this;
        }

        public Criteria andRepairActionNotBetween(String value1, String value2) {
            addCriterion("repair_action not between", value1, value2, "repairAction");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNull() {
            addCriterion("repair_date is null");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNotNull() {
            addCriterion("repair_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDateEqualTo(Date value) {
            addCriterion("repair_date =", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotEqualTo(Date value) {
            addCriterion("repair_date <>", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThan(Date value) {
            addCriterion("repair_date >", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThanOrEqualTo(Date value) {
            addCriterion("repair_date >=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThan(Date value) {
            addCriterion("repair_date <", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThanOrEqualTo(Date value) {
            addCriterion("repair_date <=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateIn(List<Date> values) {
            addCriterion("repair_date in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotIn(List<Date> values) {
            addCriterion("repair_date not in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateBetween(Date value1, Date value2) {
            addCriterion("repair_date between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotBetween(Date value1, Date value2) {
            addCriterion("repair_date not between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andMeQualityIsNull() {
            addCriterion("me_quality is null");
            return (Criteria) this;
        }

        public Criteria andMeQualityIsNotNull() {
            addCriterion("me_quality is not null");
            return (Criteria) this;
        }

        public Criteria andMeQualityEqualTo(String value) {
            addCriterion("me_quality =", value, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityNotEqualTo(String value) {
            addCriterion("me_quality <>", value, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityGreaterThan(String value) {
            addCriterion("me_quality >", value, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityGreaterThanOrEqualTo(String value) {
            addCriterion("me_quality >=", value, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityLessThan(String value) {
            addCriterion("me_quality <", value, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityLessThanOrEqualTo(String value) {
            addCriterion("me_quality <=", value, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityLike(String value) {
            addCriterion("me_quality like", value, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityNotLike(String value) {
            addCriterion("me_quality not like", value, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityIn(List<String> values) {
            addCriterion("me_quality in", values, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityNotIn(List<String> values) {
            addCriterion("me_quality not in", values, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityBetween(String value1, String value2) {
            addCriterion("me_quality between", value1, value2, "meQuality");
            return (Criteria) this;
        }

        public Criteria andMeQualityNotBetween(String value1, String value2) {
            addCriterion("me_quality not between", value1, value2, "meQuality");
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
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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