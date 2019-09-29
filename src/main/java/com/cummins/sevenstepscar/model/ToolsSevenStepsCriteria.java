package com.cummins.sevenstepscar.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToolsSevenStepsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ToolsSevenStepsCriteria() {
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

        public Criteria andIssueNumberIsNull() {
            addCriterion("issue_number is null");
            return (Criteria) this;
        }

        public Criteria andIssueNumberIsNotNull() {
            addCriterion("issue_number is not null");
            return (Criteria) this;
        }

        public Criteria andIssueNumberEqualTo(String value) {
            addCriterion("issue_number =", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberNotEqualTo(String value) {
            addCriterion("issue_number <>", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberGreaterThan(String value) {
            addCriterion("issue_number >", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberGreaterThanOrEqualTo(String value) {
            addCriterion("issue_number >=", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberLessThan(String value) {
            addCriterion("issue_number <", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberLessThanOrEqualTo(String value) {
            addCriterion("issue_number <=", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberLike(String value) {
            addCriterion("issue_number like", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberNotLike(String value) {
            addCriterion("issue_number not like", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberIn(List<String> values) {
            addCriterion("issue_number in", values, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberNotIn(List<String> values) {
            addCriterion("issue_number not in", values, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberBetween(String value1, String value2) {
            addCriterion("issue_number between", value1, value2, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberNotBetween(String value1, String value2) {
            addCriterion("issue_number not between", value1, value2, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescIsNull() {
            addCriterion("sevenstep_desc is null");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescIsNotNull() {
            addCriterion("sevenstep_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescEqualTo(String value) {
            addCriterion("sevenstep_desc =", value, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescNotEqualTo(String value) {
            addCriterion("sevenstep_desc <>", value, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescGreaterThan(String value) {
            addCriterion("sevenstep_desc >", value, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescGreaterThanOrEqualTo(String value) {
            addCriterion("sevenstep_desc >=", value, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescLessThan(String value) {
            addCriterion("sevenstep_desc <", value, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescLessThanOrEqualTo(String value) {
            addCriterion("sevenstep_desc <=", value, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescLike(String value) {
            addCriterion("sevenstep_desc like", value, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescNotLike(String value) {
            addCriterion("sevenstep_desc not like", value, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescIn(List<String> values) {
            addCriterion("sevenstep_desc in", values, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescNotIn(List<String> values) {
            addCriterion("sevenstep_desc not in", values, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescBetween(String value1, String value2) {
            addCriterion("sevenstep_desc between", value1, value2, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andSevenstepDescNotBetween(String value1, String value2) {
            addCriterion("sevenstep_desc not between", value1, value2, "sevenstepDesc");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoIsNull() {
            addCriterion("attment_two is null");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoIsNotNull() {
            addCriterion("attment_two is not null");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoEqualTo(String value) {
            addCriterion("attment_two =", value, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoNotEqualTo(String value) {
            addCriterion("attment_two <>", value, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoGreaterThan(String value) {
            addCriterion("attment_two >", value, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoGreaterThanOrEqualTo(String value) {
            addCriterion("attment_two >=", value, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoLessThan(String value) {
            addCriterion("attment_two <", value, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoLessThanOrEqualTo(String value) {
            addCriterion("attment_two <=", value, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoLike(String value) {
            addCriterion("attment_two like", value, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoNotLike(String value) {
            addCriterion("attment_two not like", value, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoIn(List<String> values) {
            addCriterion("attment_two in", values, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoNotIn(List<String> values) {
            addCriterion("attment_two not in", values, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoBetween(String value1, String value2) {
            addCriterion("attment_two between", value1, value2, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentTwoNotBetween(String value1, String value2) {
            addCriterion("attment_two not between", value1, value2, "attmentTwo");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeIsNull() {
            addCriterion("attment_three is null");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeIsNotNull() {
            addCriterion("attment_three is not null");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeEqualTo(String value) {
            addCriterion("attment_three =", value, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeNotEqualTo(String value) {
            addCriterion("attment_three <>", value, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeGreaterThan(String value) {
            addCriterion("attment_three >", value, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeGreaterThanOrEqualTo(String value) {
            addCriterion("attment_three >=", value, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeLessThan(String value) {
            addCriterion("attment_three <", value, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeLessThanOrEqualTo(String value) {
            addCriterion("attment_three <=", value, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeLike(String value) {
            addCriterion("attment_three like", value, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeNotLike(String value) {
            addCriterion("attment_three not like", value, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeIn(List<String> values) {
            addCriterion("attment_three in", values, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeNotIn(List<String> values) {
            addCriterion("attment_three not in", values, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeBetween(String value1, String value2) {
            addCriterion("attment_three between", value1, value2, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentThreeNotBetween(String value1, String value2) {
            addCriterion("attment_three not between", value1, value2, "attmentThree");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenIsNull() {
            addCriterion("attment_seven is null");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenIsNotNull() {
            addCriterion("attment_seven is not null");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenEqualTo(String value) {
            addCriterion("attment_seven =", value, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenNotEqualTo(String value) {
            addCriterion("attment_seven <>", value, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenGreaterThan(String value) {
            addCriterion("attment_seven >", value, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenGreaterThanOrEqualTo(String value) {
            addCriterion("attment_seven >=", value, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenLessThan(String value) {
            addCriterion("attment_seven <", value, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenLessThanOrEqualTo(String value) {
            addCriterion("attment_seven <=", value, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenLike(String value) {
            addCriterion("attment_seven like", value, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenNotLike(String value) {
            addCriterion("attment_seven not like", value, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenIn(List<String> values) {
            addCriterion("attment_seven in", values, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenNotIn(List<String> values) {
            addCriterion("attment_seven not in", values, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenBetween(String value1, String value2) {
            addCriterion("attment_seven between", value1, value2, "attmentSeven");
            return (Criteria) this;
        }

        public Criteria andAttmentSevenNotBetween(String value1, String value2) {
            addCriterion("attment_seven not between", value1, value2, "attmentSeven");
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

        public Criteria andEsnFromIsNull() {
            addCriterion("esn_from is null");
            return (Criteria) this;
        }

        public Criteria andEsnFromIsNotNull() {
            addCriterion("esn_from is not null");
            return (Criteria) this;
        }

        public Criteria andEsnFromEqualTo(String value) {
            addCriterion("esn_from =", value, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromNotEqualTo(String value) {
            addCriterion("esn_from <>", value, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromGreaterThan(String value) {
            addCriterion("esn_from >", value, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromGreaterThanOrEqualTo(String value) {
            addCriterion("esn_from >=", value, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromLessThan(String value) {
            addCriterion("esn_from <", value, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromLessThanOrEqualTo(String value) {
            addCriterion("esn_from <=", value, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromLike(String value) {
            addCriterion("esn_from like", value, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromNotLike(String value) {
            addCriterion("esn_from not like", value, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromIn(List<String> values) {
            addCriterion("esn_from in", values, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromNotIn(List<String> values) {
            addCriterion("esn_from not in", values, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromBetween(String value1, String value2) {
            addCriterion("esn_from between", value1, value2, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andEsnFromNotBetween(String value1, String value2) {
            addCriterion("esn_from not between", value1, value2, "esnFrom");
            return (Criteria) this;
        }

        public Criteria andTo1IsNull() {
            addCriterion("To1 is null");
            return (Criteria) this;
        }

        public Criteria andTo1IsNotNull() {
            addCriterion("To1 is not null");
            return (Criteria) this;
        }

        public Criteria andTo1EqualTo(String value) {
            addCriterion("To1 =", value, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1NotEqualTo(String value) {
            addCriterion("To1 <>", value, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1GreaterThan(String value) {
            addCriterion("To1 >", value, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1GreaterThanOrEqualTo(String value) {
            addCriterion("To1 >=", value, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1LessThan(String value) {
            addCriterion("To1 <", value, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1LessThanOrEqualTo(String value) {
            addCriterion("To1 <=", value, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1Like(String value) {
            addCriterion("To1 like", value, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1NotLike(String value) {
            addCriterion("To1 not like", value, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1In(List<String> values) {
            addCriterion("To1 in", values, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1NotIn(List<String> values) {
            addCriterion("To1 not in", values, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1Between(String value1, String value2) {
            addCriterion("To1 between", value1, value2, "to1");
            return (Criteria) this;
        }

        public Criteria andTo1NotBetween(String value1, String value2) {
            addCriterion("To1 not between", value1, value2, "to1");
            return (Criteria) this;
        }

        public Criteria andNumQtyIsNull() {
            addCriterion("num_qty is null");
            return (Criteria) this;
        }

        public Criteria andNumQtyIsNotNull() {
            addCriterion("num_qty is not null");
            return (Criteria) this;
        }

        public Criteria andNumQtyEqualTo(String value) {
            addCriterion("num_qty =", value, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyNotEqualTo(String value) {
            addCriterion("num_qty <>", value, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyGreaterThan(String value) {
            addCriterion("num_qty >", value, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyGreaterThanOrEqualTo(String value) {
            addCriterion("num_qty >=", value, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyLessThan(String value) {
            addCriterion("num_qty <", value, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyLessThanOrEqualTo(String value) {
            addCriterion("num_qty <=", value, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyLike(String value) {
            addCriterion("num_qty like", value, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyNotLike(String value) {
            addCriterion("num_qty not like", value, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyIn(List<String> values) {
            addCriterion("num_qty in", values, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyNotIn(List<String> values) {
            addCriterion("num_qty not in", values, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyBetween(String value1, String value2) {
            addCriterion("num_qty between", value1, value2, "numQty");
            return (Criteria) this;
        }

        public Criteria andNumQtyNotBetween(String value1, String value2) {
            addCriterion("num_qty not between", value1, value2, "numQty");
            return (Criteria) this;
        }

        public Criteria andDatefromIsNull() {
            addCriterion("datefrom is null");
            return (Criteria) this;
        }

        public Criteria andDatefromIsNotNull() {
            addCriterion("datefrom is not null");
            return (Criteria) this;
        }

        public Criteria andDatefromEqualTo(String value) {
            addCriterion("datefrom =", value, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromNotEqualTo(String value) {
            addCriterion("datefrom <>", value, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromGreaterThan(String value) {
            addCriterion("datefrom >", value, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromGreaterThanOrEqualTo(String value) {
            addCriterion("datefrom >=", value, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromLessThan(String value) {
            addCriterion("datefrom <", value, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromLessThanOrEqualTo(String value) {
            addCriterion("datefrom <=", value, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromLike(String value) {
            addCriterion("datefrom like", value, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromNotLike(String value) {
            addCriterion("datefrom not like", value, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromIn(List<String> values) {
            addCriterion("datefrom in", values, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromNotIn(List<String> values) {
            addCriterion("datefrom not in", values, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromBetween(String value1, String value2) {
            addCriterion("datefrom between", value1, value2, "datefrom");
            return (Criteria) this;
        }

        public Criteria andDatefromNotBetween(String value1, String value2) {
            addCriterion("datefrom not between", value1, value2, "datefrom");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNull() {
            addCriterion("over_time is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNotNull() {
            addCriterion("over_time is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeEqualTo(Date value) {
            addCriterion("over_time =", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotEqualTo(Date value) {
            addCriterion("over_time <>", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThan(Date value) {
            addCriterion("over_time >", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("over_time >=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThan(Date value) {
            addCriterion("over_time <", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("over_time <=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIn(List<Date> values) {
            addCriterion("over_time in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotIn(List<Date> values) {
            addCriterion("over_time not in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeBetween(Date value1, Date value2) {
            addCriterion("over_time between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("over_time not between", value1, value2, "overTime");
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

        public Criteria andBack4EqualTo(String value) {
            addCriterion("back4 =", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4NotEqualTo(String value) {
            addCriterion("back4 <>", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4GreaterThan(String value) {
            addCriterion("back4 >", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4GreaterThanOrEqualTo(String value) {
            addCriterion("back4 >=", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4LessThan(String value) {
            addCriterion("back4 <", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4LessThanOrEqualTo(String value) {
            addCriterion("back4 <=", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4Like(String value) {
            addCriterion("back4 like", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4NotLike(String value) {
            addCriterion("back4 not like", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4In(List<String> values) {
            addCriterion("back4 in", values, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4NotIn(List<String> values) {
            addCriterion("back4 not in", values, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4Between(String value1, String value2) {
            addCriterion("back4 between", value1, value2, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4NotBetween(String value1, String value2) {
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

        public Criteria andBack5EqualTo(String value) {
            addCriterion("back5 =", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotEqualTo(String value) {
            addCriterion("back5 <>", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5GreaterThan(String value) {
            addCriterion("back5 >", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5GreaterThanOrEqualTo(String value) {
            addCriterion("back5 >=", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5LessThan(String value) {
            addCriterion("back5 <", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5LessThanOrEqualTo(String value) {
            addCriterion("back5 <=", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5Like(String value) {
            addCriterion("back5 like", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotLike(String value) {
            addCriterion("back5 not like", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5In(List<String> values) {
            addCriterion("back5 in", values, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotIn(List<String> values) {
            addCriterion("back5 not in", values, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5Between(String value1, String value2) {
            addCriterion("back5 between", value1, value2, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotBetween(String value1, String value2) {
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