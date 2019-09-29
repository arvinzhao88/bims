package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IssueCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IssueCriteria() {
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

        public Criteria andPlantIsNull() {
            addCriterion("plant is null");
            return (Criteria) this;
        }

        public Criteria andPlantIsNotNull() {
            addCriterion("plant is not null");
            return (Criteria) this;
        }

        public Criteria andPlantEqualTo(String value) {
            addCriterion("plant =", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotEqualTo(String value) {
            addCriterion("plant <>", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantGreaterThan(String value) {
            addCriterion("plant >", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantGreaterThanOrEqualTo(String value) {
            addCriterion("plant >=", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantLessThan(String value) {
            addCriterion("plant <", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantLessThanOrEqualTo(String value) {
            addCriterion("plant <=", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantLike(String value) {
            addCriterion("plant like", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotLike(String value) {
            addCriterion("plant not like", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantIn(List<String> values) {
            addCriterion("plant in", values, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotIn(List<String> values) {
            addCriterion("plant not in", values, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantBetween(String value1, String value2) {
            addCriterion("plant between", value1, value2, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotBetween(String value1, String value2) {
            addCriterion("plant not between", value1, value2, "plant");
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

        public Criteria andIssueStationIsNull() {
            addCriterion("issue_station is null");
            return (Criteria) this;
        }

        public Criteria andIssueStationIsNotNull() {
            addCriterion("issue_station is not null");
            return (Criteria) this;
        }

        public Criteria andIssueStationEqualTo(String value) {
            addCriterion("issue_station =", value, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationNotEqualTo(String value) {
            addCriterion("issue_station <>", value, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationGreaterThan(String value) {
            addCriterion("issue_station >", value, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationGreaterThanOrEqualTo(String value) {
            addCriterion("issue_station >=", value, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationLessThan(String value) {
            addCriterion("issue_station <", value, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationLessThanOrEqualTo(String value) {
            addCriterion("issue_station <=", value, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationLike(String value) {
            addCriterion("issue_station like", value, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationNotLike(String value) {
            addCriterion("issue_station not like", value, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationIn(List<String> values) {
            addCriterion("issue_station in", values, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationNotIn(List<String> values) {
            addCriterion("issue_station not in", values, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationBetween(String value1, String value2) {
            addCriterion("issue_station between", value1, value2, "issueStation");
            return (Criteria) this;
        }

        public Criteria andIssueStationNotBetween(String value1, String value2) {
            addCriterion("issue_station not between", value1, value2, "issueStation");
            return (Criteria) this;
        }

        public Criteria andSeriesNoIsNull() {
            addCriterion("series_no is null");
            return (Criteria) this;
        }

        public Criteria andSeriesNoIsNotNull() {
            addCriterion("series_no is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesNoEqualTo(String value) {
            addCriterion("series_no =", value, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoNotEqualTo(String value) {
            addCriterion("series_no <>", value, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoGreaterThan(String value) {
            addCriterion("series_no >", value, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoGreaterThanOrEqualTo(String value) {
            addCriterion("series_no >=", value, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoLessThan(String value) {
            addCriterion("series_no <", value, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoLessThanOrEqualTo(String value) {
            addCriterion("series_no <=", value, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoLike(String value) {
            addCriterion("series_no like", value, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoNotLike(String value) {
            addCriterion("series_no not like", value, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoIn(List<String> values) {
            addCriterion("series_no in", values, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoNotIn(List<String> values) {
            addCriterion("series_no not in", values, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoBetween(String value1, String value2) {
            addCriterion("series_no between", value1, value2, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andSeriesNoNotBetween(String value1, String value2) {
            addCriterion("series_no not between", value1, value2, "seriesNo");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIsNull() {
            addCriterion("quality_type is null");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIsNotNull() {
            addCriterion("quality_type is not null");
            return (Criteria) this;
        }

        public Criteria andQualityTypeEqualTo(String value) {
            addCriterion("quality_type =", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotEqualTo(String value) {
            addCriterion("quality_type <>", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeGreaterThan(String value) {
            addCriterion("quality_type >", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("quality_type >=", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeLessThan(String value) {
            addCriterion("quality_type <", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeLessThanOrEqualTo(String value) {
            addCriterion("quality_type <=", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeLike(String value) {
            addCriterion("quality_type like", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotLike(String value) {
            addCriterion("quality_type not like", value, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeIn(List<String> values) {
            addCriterion("quality_type in", values, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotIn(List<String> values) {
            addCriterion("quality_type not in", values, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeBetween(String value1, String value2) {
            addCriterion("quality_type between", value1, value2, "qualityType");
            return (Criteria) this;
        }

        public Criteria andQualityTypeNotBetween(String value1, String value2) {
            addCriterion("quality_type not between", value1, value2, "qualityType");
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

        public Criteria andIssueCategoryL1IsNull() {
            addCriterion("issue_category_l1 is null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1IsNotNull() {
            addCriterion("issue_category_l1 is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1EqualTo(String value) {
            addCriterion("issue_category_l1 =", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NotEqualTo(String value) {
            addCriterion("issue_category_l1 <>", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1GreaterThan(String value) {
            addCriterion("issue_category_l1 >", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1GreaterThanOrEqualTo(String value) {
            addCriterion("issue_category_l1 >=", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1LessThan(String value) {
            addCriterion("issue_category_l1 <", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1LessThanOrEqualTo(String value) {
            addCriterion("issue_category_l1 <=", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1Like(String value) {
            addCriterion("issue_category_l1 like", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NotLike(String value) {
            addCriterion("issue_category_l1 not like", value, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1In(List<String> values) {
            addCriterion("issue_category_l1 in", values, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NotIn(List<String> values) {
            addCriterion("issue_category_l1 not in", values, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1Between(String value1, String value2) {
            addCriterion("issue_category_l1 between", value1, value2, "issueCategoryL1");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL1NotBetween(String value1, String value2) {
            addCriterion("issue_category_l1 not between", value1, value2, "issueCategoryL1");
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

        public Criteria andIssueCategoryL2IsNull() {
            addCriterion("issue_category_l2 is null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2IsNotNull() {
            addCriterion("issue_category_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2EqualTo(String value) {
            addCriterion("issue_category_l2 =", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NotEqualTo(String value) {
            addCriterion("issue_category_l2 <>", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2GreaterThan(String value) {
            addCriterion("issue_category_l2 >", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2GreaterThanOrEqualTo(String value) {
            addCriterion("issue_category_l2 >=", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2LessThan(String value) {
            addCriterion("issue_category_l2 <", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2LessThanOrEqualTo(String value) {
            addCriterion("issue_category_l2 <=", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2Like(String value) {
            addCriterion("issue_category_l2 like", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NotLike(String value) {
            addCriterion("issue_category_l2 not like", value, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2In(List<String> values) {
            addCriterion("issue_category_l2 in", values, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NotIn(List<String> values) {
            addCriterion("issue_category_l2 not in", values, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2Between(String value1, String value2) {
            addCriterion("issue_category_l2 between", value1, value2, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL2NotBetween(String value1, String value2) {
            addCriterion("issue_category_l2 not between", value1, value2, "issueCategoryL2");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameIsNull() {
            addCriterion("issue_category_l3_name is null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameIsNotNull() {
            addCriterion("issue_category_l3_name is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameEqualTo(String value) {
            addCriterion("issue_category_l3_name =", value, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameNotEqualTo(String value) {
            addCriterion("issue_category_l3_name <>", value, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameGreaterThan(String value) {
            addCriterion("issue_category_l3_name >", value, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameGreaterThanOrEqualTo(String value) {
            addCriterion("issue_category_l3_name >=", value, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameLessThan(String value) {
            addCriterion("issue_category_l3_name <", value, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameLessThanOrEqualTo(String value) {
            addCriterion("issue_category_l3_name <=", value, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameLike(String value) {
            addCriterion("issue_category_l3_name like", value, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameNotLike(String value) {
            addCriterion("issue_category_l3_name not like", value, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameIn(List<String> values) {
            addCriterion("issue_category_l3_name in", values, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameNotIn(List<String> values) {
            addCriterion("issue_category_l3_name not in", values, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameBetween(String value1, String value2) {
            addCriterion("issue_category_l3_name between", value1, value2, "issueCategoryL3Name");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryL3NameNotBetween(String value1, String value2) {
            addCriterion("issue_category_l3_name not between", value1, value2, "issueCategoryL3Name");
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

        public Criteria andFailureLocationIsNull() {
            addCriterion("failure_location is null");
            return (Criteria) this;
        }

        public Criteria andFailureLocationIsNotNull() {
            addCriterion("failure_location is not null");
            return (Criteria) this;
        }

        public Criteria andFailureLocationEqualTo(String value) {
            addCriterion("failure_location =", value, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationNotEqualTo(String value) {
            addCriterion("failure_location <>", value, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationGreaterThan(String value) {
            addCriterion("failure_location >", value, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationGreaterThanOrEqualTo(String value) {
            addCriterion("failure_location >=", value, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationLessThan(String value) {
            addCriterion("failure_location <", value, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationLessThanOrEqualTo(String value) {
            addCriterion("failure_location <=", value, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationLike(String value) {
            addCriterion("failure_location like", value, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationNotLike(String value) {
            addCriterion("failure_location not like", value, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationIn(List<String> values) {
            addCriterion("failure_location in", values, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationNotIn(List<String> values) {
            addCriterion("failure_location not in", values, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationBetween(String value1, String value2) {
            addCriterion("failure_location between", value1, value2, "failureLocation");
            return (Criteria) this;
        }

        public Criteria andFailureLocationNotBetween(String value1, String value2) {
            addCriterion("failure_location not between", value1, value2, "failureLocation");
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

        public Criteria andProjectNoIsNull() {
            addCriterion("project_no is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNotNull() {
            addCriterion("project_no is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoEqualTo(String value) {
            addCriterion("project_no =", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotEqualTo(String value) {
            addCriterion("project_no <>", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThan(String value) {
            addCriterion("project_no >", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("project_no >=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThan(String value) {
            addCriterion("project_no <", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThanOrEqualTo(String value) {
            addCriterion("project_no <=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLike(String value) {
            addCriterion("project_no like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotLike(String value) {
            addCriterion("project_no not like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoIn(List<String> values) {
            addCriterion("project_no in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotIn(List<String> values) {
            addCriterion("project_no not in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoBetween(String value1, String value2) {
            addCriterion("project_no between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotBetween(String value1, String value2) {
            addCriterion("project_no not between", value1, value2, "projectNo");
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

        public Criteria andEngineSeriesIsNull() {
            addCriterion("engine_series is null");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesIsNotNull() {
            addCriterion("engine_series is not null");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesEqualTo(String value) {
            addCriterion("engine_series =", value, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNotEqualTo(String value) {
            addCriterion("engine_series <>", value, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesGreaterThan(String value) {
            addCriterion("engine_series >", value, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("engine_series >=", value, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesLessThan(String value) {
            addCriterion("engine_series <", value, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesLessThanOrEqualTo(String value) {
            addCriterion("engine_series <=", value, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesLike(String value) {
            addCriterion("engine_series like", value, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNotLike(String value) {
            addCriterion("engine_series not like", value, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesIn(List<String> values) {
            addCriterion("engine_series in", values, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNotIn(List<String> values) {
            addCriterion("engine_series not in", values, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesBetween(String value1, String value2) {
            addCriterion("engine_series between", value1, value2, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNotBetween(String value1, String value2) {
            addCriterion("engine_series not between", value1, value2, "engineSeries");
            return (Criteria) this;
        }

        public Criteria andIssueTypeIsNull() {
            addCriterion("issue_type is null");
            return (Criteria) this;
        }

        public Criteria andIssueTypeIsNotNull() {
            addCriterion("issue_type is not null");
            return (Criteria) this;
        }

        public Criteria andIssueTypeEqualTo(String value) {
            addCriterion("issue_type =", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeNotEqualTo(String value) {
            addCriterion("issue_type <>", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeGreaterThan(String value) {
            addCriterion("issue_type >", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("issue_type >=", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeLessThan(String value) {
            addCriterion("issue_type <", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeLessThanOrEqualTo(String value) {
            addCriterion("issue_type <=", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeLike(String value) {
            addCriterion("issue_type like", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeNotLike(String value) {
            addCriterion("issue_type not like", value, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeIn(List<String> values) {
            addCriterion("issue_type in", values, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeNotIn(List<String> values) {
            addCriterion("issue_type not in", values, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeBetween(String value1, String value2) {
            addCriterion("issue_type between", value1, value2, "issueType");
            return (Criteria) this;
        }

        public Criteria andIssueTypeNotBetween(String value1, String value2) {
            addCriterion("issue_type not between", value1, value2, "issueType");
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

        public Criteria andVendorCodeIsNull() {
            addCriterion("vendor_code is null");
            return (Criteria) this;
        }

        public Criteria andVendorCodeIsNotNull() {
            addCriterion("vendor_code is not null");
            return (Criteria) this;
        }

        public Criteria andVendorCodeEqualTo(String value) {
            addCriterion("vendor_code =", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotEqualTo(String value) {
            addCriterion("vendor_code <>", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeGreaterThan(String value) {
            addCriterion("vendor_code >", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_code >=", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLessThan(String value) {
            addCriterion("vendor_code <", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLessThanOrEqualTo(String value) {
            addCriterion("vendor_code <=", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLike(String value) {
            addCriterion("vendor_code like", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotLike(String value) {
            addCriterion("vendor_code not like", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeIn(List<String> values) {
            addCriterion("vendor_code in", values, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotIn(List<String> values) {
            addCriterion("vendor_code not in", values, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeBetween(String value1, String value2) {
            addCriterion("vendor_code between", value1, value2, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotBetween(String value1, String value2) {
            addCriterion("vendor_code not between", value1, value2, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorNameIsNull() {
            addCriterion("vendor_name is null");
            return (Criteria) this;
        }

        public Criteria andVendorNameIsNotNull() {
            addCriterion("vendor_name is not null");
            return (Criteria) this;
        }

        public Criteria andVendorNameEqualTo(String value) {
            addCriterion("vendor_name =", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotEqualTo(String value) {
            addCriterion("vendor_name <>", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameGreaterThan(String value) {
            addCriterion("vendor_name >", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_name >=", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLessThan(String value) {
            addCriterion("vendor_name <", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLessThanOrEqualTo(String value) {
            addCriterion("vendor_name <=", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLike(String value) {
            addCriterion("vendor_name like", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotLike(String value) {
            addCriterion("vendor_name not like", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameIn(List<String> values) {
            addCriterion("vendor_name in", values, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotIn(List<String> values) {
            addCriterion("vendor_name not in", values, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameBetween(String value1, String value2) {
            addCriterion("vendor_name between", value1, value2, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotBetween(String value1, String value2) {
            addCriterion("vendor_name not between", value1, value2, "vendorName");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("qty is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("qty is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(Integer value) {
            addCriterion("qty =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(Integer value) {
            addCriterion("qty <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(Integer value) {
            addCriterion("qty >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("qty >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(Integer value) {
            addCriterion("qty <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(Integer value) {
            addCriterion("qty <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<Integer> values) {
            addCriterion("qty in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<Integer> values) {
            addCriterion("qty not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(Integer value1, Integer value2) {
            addCriterion("qty between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("qty not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andIsRftIsNull() {
            addCriterion("is_rft is null");
            return (Criteria) this;
        }

        public Criteria andIsRftIsNotNull() {
            addCriterion("is_rft is not null");
            return (Criteria) this;
        }

        public Criteria andIsRftEqualTo(String value) {
            addCriterion("is_rft =", value, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftNotEqualTo(String value) {
            addCriterion("is_rft <>", value, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftGreaterThan(String value) {
            addCriterion("is_rft >", value, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftGreaterThanOrEqualTo(String value) {
            addCriterion("is_rft >=", value, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftLessThan(String value) {
            addCriterion("is_rft <", value, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftLessThanOrEqualTo(String value) {
            addCriterion("is_rft <=", value, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftLike(String value) {
            addCriterion("is_rft like", value, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftNotLike(String value) {
            addCriterion("is_rft not like", value, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftIn(List<String> values) {
            addCriterion("is_rft in", values, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftNotIn(List<String> values) {
            addCriterion("is_rft not in", values, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftBetween(String value1, String value2) {
            addCriterion("is_rft between", value1, value2, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsRftNotBetween(String value1, String value2) {
            addCriterion("is_rft not between", value1, value2, "isRft");
            return (Criteria) this;
        }

        public Criteria andIsEqrIsNull() {
            addCriterion("is_eqr is null");
            return (Criteria) this;
        }

        public Criteria andIsEqrIsNotNull() {
            addCriterion("is_eqr is not null");
            return (Criteria) this;
        }

        public Criteria andIsEqrEqualTo(String value) {
            addCriterion("is_eqr =", value, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrNotEqualTo(String value) {
            addCriterion("is_eqr <>", value, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrGreaterThan(String value) {
            addCriterion("is_eqr >", value, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrGreaterThanOrEqualTo(String value) {
            addCriterion("is_eqr >=", value, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrLessThan(String value) {
            addCriterion("is_eqr <", value, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrLessThanOrEqualTo(String value) {
            addCriterion("is_eqr <=", value, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrLike(String value) {
            addCriterion("is_eqr like", value, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrNotLike(String value) {
            addCriterion("is_eqr not like", value, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrIn(List<String> values) {
            addCriterion("is_eqr in", values, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrNotIn(List<String> values) {
            addCriterion("is_eqr not in", values, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrBetween(String value1, String value2) {
            addCriterion("is_eqr between", value1, value2, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsEqrNotBetween(String value1, String value2) {
            addCriterion("is_eqr not between", value1, value2, "isEqr");
            return (Criteria) this;
        }

        public Criteria andIsCarryIsNull() {
            addCriterion("is_carry is null");
            return (Criteria) this;
        }

        public Criteria andIsCarryIsNotNull() {
            addCriterion("is_carry is not null");
            return (Criteria) this;
        }

        public Criteria andIsCarryEqualTo(String value) {
            addCriterion("is_carry =", value, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryNotEqualTo(String value) {
            addCriterion("is_carry <>", value, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryGreaterThan(String value) {
            addCriterion("is_carry >", value, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryGreaterThanOrEqualTo(String value) {
            addCriterion("is_carry >=", value, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryLessThan(String value) {
            addCriterion("is_carry <", value, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryLessThanOrEqualTo(String value) {
            addCriterion("is_carry <=", value, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryLike(String value) {
            addCriterion("is_carry like", value, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryNotLike(String value) {
            addCriterion("is_carry not like", value, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryIn(List<String> values) {
            addCriterion("is_carry in", values, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryNotIn(List<String> values) {
            addCriterion("is_carry not in", values, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryBetween(String value1, String value2) {
            addCriterion("is_carry between", value1, value2, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsCarryNotBetween(String value1, String value2) {
            addCriterion("is_carry not between", value1, value2, "isCarry");
            return (Criteria) this;
        }

        public Criteria andIsClaimIsNull() {
            addCriterion("is_claim is null");
            return (Criteria) this;
        }

        public Criteria andIsClaimIsNotNull() {
            addCriterion("is_claim is not null");
            return (Criteria) this;
        }

        public Criteria andIsClaimEqualTo(String value) {
            addCriterion("is_claim =", value, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimNotEqualTo(String value) {
            addCriterion("is_claim <>", value, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimGreaterThan(String value) {
            addCriterion("is_claim >", value, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimGreaterThanOrEqualTo(String value) {
            addCriterion("is_claim >=", value, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimLessThan(String value) {
            addCriterion("is_claim <", value, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimLessThanOrEqualTo(String value) {
            addCriterion("is_claim <=", value, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimLike(String value) {
            addCriterion("is_claim like", value, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimNotLike(String value) {
            addCriterion("is_claim not like", value, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimIn(List<String> values) {
            addCriterion("is_claim in", values, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimNotIn(List<String> values) {
            addCriterion("is_claim not in", values, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimBetween(String value1, String value2) {
            addCriterion("is_claim between", value1, value2, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsClaimNotBetween(String value1, String value2) {
            addCriterion("is_claim not between", value1, value2, "isClaim");
            return (Criteria) this;
        }

        public Criteria andIsCountindexIsNull() {
            addCriterion("is_countIndex is null");
            return (Criteria) this;
        }

        public Criteria andIsCountindexIsNotNull() {
            addCriterion("is_countIndex is not null");
            return (Criteria) this;
        }

        public Criteria andIsCountindexEqualTo(String value) {
            addCriterion("is_countIndex =", value, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexNotEqualTo(String value) {
            addCriterion("is_countIndex <>", value, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexGreaterThan(String value) {
            addCriterion("is_countIndex >", value, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexGreaterThanOrEqualTo(String value) {
            addCriterion("is_countIndex >=", value, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexLessThan(String value) {
            addCriterion("is_countIndex <", value, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexLessThanOrEqualTo(String value) {
            addCriterion("is_countIndex <=", value, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexLike(String value) {
            addCriterion("is_countIndex like", value, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexNotLike(String value) {
            addCriterion("is_countIndex not like", value, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexIn(List<String> values) {
            addCriterion("is_countIndex in", values, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexNotIn(List<String> values) {
            addCriterion("is_countIndex not in", values, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexBetween(String value1, String value2) {
            addCriterion("is_countIndex between", value1, value2, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andIsCountindexNotBetween(String value1, String value2) {
            addCriterion("is_countIndex not between", value1, value2, "isCountindex");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNull() {
            addCriterion("input_time is null");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNotNull() {
            addCriterion("input_time is not null");
            return (Criteria) this;
        }

        public Criteria andInputTimeEqualTo(Date value) {
            addCriterion("input_time =", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotEqualTo(Date value) {
            addCriterion("input_time <>", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThan(Date value) {
            addCriterion("input_time >", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("input_time >=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThan(Date value) {
            addCriterion("input_time <", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThanOrEqualTo(Date value) {
            addCriterion("input_time <=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeIn(List<Date> values) {
            addCriterion("input_time in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotIn(List<Date> values) {
            addCriterion("input_time not in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeBetween(Date value1, Date value2) {
            addCriterion("input_time between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotBetween(Date value1, Date value2) {
            addCriterion("input_time not between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputPersonIsNull() {
            addCriterion("input_person is null");
            return (Criteria) this;
        }

        public Criteria andInputPersonIsNotNull() {
            addCriterion("input_person is not null");
            return (Criteria) this;
        }

        public Criteria andInputPersonEqualTo(String value) {
            addCriterion("input_person =", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonNotEqualTo(String value) {
            addCriterion("input_person <>", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonGreaterThan(String value) {
            addCriterion("input_person >", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonGreaterThanOrEqualTo(String value) {
            addCriterion("input_person >=", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonLessThan(String value) {
            addCriterion("input_person <", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonLessThanOrEqualTo(String value) {
            addCriterion("input_person <=", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonLike(String value) {
            addCriterion("input_person like", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonNotLike(String value) {
            addCriterion("input_person not like", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonIn(List<String> values) {
            addCriterion("input_person in", values, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonNotIn(List<String> values) {
            addCriterion("input_person not in", values, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonBetween(String value1, String value2) {
            addCriterion("input_person between", value1, value2, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonNotBetween(String value1, String value2) {
            addCriterion("input_person not between", value1, value2, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameIsNull() {
            addCriterion("input_preson_name is null");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameIsNotNull() {
            addCriterion("input_preson_name is not null");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameEqualTo(String value) {
            addCriterion("input_preson_name =", value, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameNotEqualTo(String value) {
            addCriterion("input_preson_name <>", value, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameGreaterThan(String value) {
            addCriterion("input_preson_name >", value, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameGreaterThanOrEqualTo(String value) {
            addCriterion("input_preson_name >=", value, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameLessThan(String value) {
            addCriterion("input_preson_name <", value, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameLessThanOrEqualTo(String value) {
            addCriterion("input_preson_name <=", value, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameLike(String value) {
            addCriterion("input_preson_name like", value, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameNotLike(String value) {
            addCriterion("input_preson_name not like", value, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameIn(List<String> values) {
            addCriterion("input_preson_name in", values, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameNotIn(List<String> values) {
            addCriterion("input_preson_name not in", values, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameBetween(String value1, String value2) {
            addCriterion("input_preson_name between", value1, value2, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPresonNameNotBetween(String value1, String value2) {
            addCriterion("input_preson_name not between", value1, value2, "inputPresonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountIsNull() {
            addCriterion("input_person_account is null");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountIsNotNull() {
            addCriterion("input_person_account is not null");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountEqualTo(String value) {
            addCriterion("input_person_account =", value, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountNotEqualTo(String value) {
            addCriterion("input_person_account <>", value, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountGreaterThan(String value) {
            addCriterion("input_person_account >", value, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountGreaterThanOrEqualTo(String value) {
            addCriterion("input_person_account >=", value, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountLessThan(String value) {
            addCriterion("input_person_account <", value, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountLessThanOrEqualTo(String value) {
            addCriterion("input_person_account <=", value, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountLike(String value) {
            addCriterion("input_person_account like", value, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountNotLike(String value) {
            addCriterion("input_person_account not like", value, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountIn(List<String> values) {
            addCriterion("input_person_account in", values, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountNotIn(List<String> values) {
            addCriterion("input_person_account not in", values, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountBetween(String value1, String value2) {
            addCriterion("input_person_account between", value1, value2, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andInputPersonAccountNotBetween(String value1, String value2) {
            addCriterion("input_person_account not between", value1, value2, "inputPersonAccount");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNull() {
            addCriterion("delflag is null");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNotNull() {
            addCriterion("delflag is not null");
            return (Criteria) this;
        }

        public Criteria andDelflagEqualTo(String value) {
            addCriterion("delflag =", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotEqualTo(String value) {
            addCriterion("delflag <>", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThan(String value) {
            addCriterion("delflag >", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThanOrEqualTo(String value) {
            addCriterion("delflag >=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThan(String value) {
            addCriterion("delflag <", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThanOrEqualTo(String value) {
            addCriterion("delflag <=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLike(String value) {
            addCriterion("delflag like", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotLike(String value) {
            addCriterion("delflag not like", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagIn(List<String> values) {
            addCriterion("delflag in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotIn(List<String> values) {
            addCriterion("delflag not in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagBetween(String value1, String value2) {
            addCriterion("delflag between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotBetween(String value1, String value2) {
            addCriterion("delflag not between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andSubSourceIsNull() {
            addCriterion("sub_source is null");
            return (Criteria) this;
        }

        public Criteria andSubSourceIsNotNull() {
            addCriterion("sub_source is not null");
            return (Criteria) this;
        }

        public Criteria andSubSourceEqualTo(String value) {
            addCriterion("sub_source =", value, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceNotEqualTo(String value) {
            addCriterion("sub_source <>", value, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceGreaterThan(String value) {
            addCriterion("sub_source >", value, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceGreaterThanOrEqualTo(String value) {
            addCriterion("sub_source >=", value, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceLessThan(String value) {
            addCriterion("sub_source <", value, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceLessThanOrEqualTo(String value) {
            addCriterion("sub_source <=", value, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceLike(String value) {
            addCriterion("sub_source like", value, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceNotLike(String value) {
            addCriterion("sub_source not like", value, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceIn(List<String> values) {
            addCriterion("sub_source in", values, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceNotIn(List<String> values) {
            addCriterion("sub_source not in", values, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceBetween(String value1, String value2) {
            addCriterion("sub_source between", value1, value2, "subSource");
            return (Criteria) this;
        }

        public Criteria andSubSourceNotBetween(String value1, String value2) {
            addCriterion("sub_source not between", value1, value2, "subSource");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNull() {
            addCriterion("process_status is null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNotNull() {
            addCriterion("process_status is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusEqualTo(String value) {
            addCriterion("process_status =", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotEqualTo(String value) {
            addCriterion("process_status <>", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThan(String value) {
            addCriterion("process_status >", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThanOrEqualTo(String value) {
            addCriterion("process_status >=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThan(String value) {
            addCriterion("process_status <", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThanOrEqualTo(String value) {
            addCriterion("process_status <=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLike(String value) {
            addCriterion("process_status like", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotLike(String value) {
            addCriterion("process_status not like", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIn(List<String> values) {
            addCriterion("process_status in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotIn(List<String> values) {
            addCriterion("process_status not in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusBetween(String value1, String value2) {
            addCriterion("process_status between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotBetween(String value1, String value2) {
            addCriterion("process_status not between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIsNull() {
            addCriterion("process_person is null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIsNotNull() {
            addCriterion("process_person is not null");
            return (Criteria) this;
        }

        public Criteria andProcessPersonEqualTo(String value) {
            addCriterion("process_person =", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNotEqualTo(String value) {
            addCriterion("process_person <>", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonGreaterThan(String value) {
            addCriterion("process_person >", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonGreaterThanOrEqualTo(String value) {
            addCriterion("process_person >=", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonLessThan(String value) {
            addCriterion("process_person <", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonLessThanOrEqualTo(String value) {
            addCriterion("process_person <=", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonLike(String value) {
            addCriterion("process_person like", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNotLike(String value) {
            addCriterion("process_person not like", value, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonIn(List<String> values) {
            addCriterion("process_person in", values, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNotIn(List<String> values) {
            addCriterion("process_person not in", values, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonBetween(String value1, String value2) {
            addCriterion("process_person between", value1, value2, "processPerson");
            return (Criteria) this;
        }

        public Criteria andProcessPersonNotBetween(String value1, String value2) {
            addCriterion("process_person not between", value1, value2, "processPerson");
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

        public Criteria andProcessTimeIsNull() {
            addCriterion("process_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNotNull() {
            addCriterion("process_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeEqualTo(Date value) {
            addCriterion("process_time =", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotEqualTo(Date value) {
            addCriterion("process_time <>", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThan(Date value) {
            addCriterion("process_time >", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("process_time >=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThan(Date value) {
            addCriterion("process_time <", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThanOrEqualTo(Date value) {
            addCriterion("process_time <=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIn(List<Date> values) {
            addCriterion("process_time in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotIn(List<Date> values) {
            addCriterion("process_time not in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeBetween(Date value1, Date value2) {
            addCriterion("process_time between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotBetween(Date value1, Date value2) {
            addCriterion("process_time not between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessMethodIsNull() {
            addCriterion("process_method is null");
            return (Criteria) this;
        }

        public Criteria andProcessMethodIsNotNull() {
            addCriterion("process_method is not null");
            return (Criteria) this;
        }

        public Criteria andProcessMethodEqualTo(String value) {
            addCriterion("process_method =", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodNotEqualTo(String value) {
            addCriterion("process_method <>", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodGreaterThan(String value) {
            addCriterion("process_method >", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodGreaterThanOrEqualTo(String value) {
            addCriterion("process_method >=", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodLessThan(String value) {
            addCriterion("process_method <", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodLessThanOrEqualTo(String value) {
            addCriterion("process_method <=", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodLike(String value) {
            addCriterion("process_method like", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodNotLike(String value) {
            addCriterion("process_method not like", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodIn(List<String> values) {
            addCriterion("process_method in", values, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodNotIn(List<String> values) {
            addCriterion("process_method not in", values, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodBetween(String value1, String value2) {
            addCriterion("process_method between", value1, value2, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodNotBetween(String value1, String value2) {
            addCriterion("process_method not between", value1, value2, "processMethod");
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

        public Criteria andReviewPersonAccountIsNull() {
            addCriterion("review_person_account is null");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountIsNotNull() {
            addCriterion("review_person_account is not null");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountEqualTo(String value) {
            addCriterion("review_person_account =", value, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountNotEqualTo(String value) {
            addCriterion("review_person_account <>", value, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountGreaterThan(String value) {
            addCriterion("review_person_account >", value, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountGreaterThanOrEqualTo(String value) {
            addCriterion("review_person_account >=", value, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountLessThan(String value) {
            addCriterion("review_person_account <", value, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountLessThanOrEqualTo(String value) {
            addCriterion("review_person_account <=", value, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountLike(String value) {
            addCriterion("review_person_account like", value, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountNotLike(String value) {
            addCriterion("review_person_account not like", value, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountIn(List<String> values) {
            addCriterion("review_person_account in", values, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountNotIn(List<String> values) {
            addCriterion("review_person_account not in", values, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountBetween(String value1, String value2) {
            addCriterion("review_person_account between", value1, value2, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewPersonAccountNotBetween(String value1, String value2) {
            addCriterion("review_person_account not between", value1, value2, "reviewPersonAccount");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNull() {
            addCriterion("review_time is null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNotNull() {
            addCriterion("review_time is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeEqualTo(Date value) {
            addCriterion("review_time =", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotEqualTo(Date value) {
            addCriterion("review_time <>", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThan(Date value) {
            addCriterion("review_time >", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("review_time >=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThan(Date value) {
            addCriterion("review_time <", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThanOrEqualTo(Date value) {
            addCriterion("review_time <=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIn(List<Date> values) {
            addCriterion("review_time in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotIn(List<Date> values) {
            addCriterion("review_time not in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeBetween(Date value1, Date value2) {
            addCriterion("review_time between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotBetween(Date value1, Date value2) {
            addCriterion("review_time not between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andAttachIsNull() {
            addCriterion("attach is null");
            return (Criteria) this;
        }

        public Criteria andAttachIsNotNull() {
            addCriterion("attach is not null");
            return (Criteria) this;
        }

        public Criteria andAttachEqualTo(String value) {
            addCriterion("attach =", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotEqualTo(String value) {
            addCriterion("attach <>", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThan(String value) {
            addCriterion("attach >", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThanOrEqualTo(String value) {
            addCriterion("attach >=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThan(String value) {
            addCriterion("attach <", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThanOrEqualTo(String value) {
            addCriterion("attach <=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLike(String value) {
            addCriterion("attach like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotLike(String value) {
            addCriterion("attach not like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachIn(List<String> values) {
            addCriterion("attach in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotIn(List<String> values) {
            addCriterion("attach not in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachBetween(String value1, String value2) {
            addCriterion("attach between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotBetween(String value1, String value2) {
            addCriterion("attach not between", value1, value2, "attach");
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