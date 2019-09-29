package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarExtendCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExtendCriteria() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarStepIsNull() {
            addCriterion("car_step is null");
            return (Criteria) this;
        }

        public Criteria andCarStepIsNotNull() {
            addCriterion("car_step is not null");
            return (Criteria) this;
        }

        public Criteria andCarStepEqualTo(String value) {
            addCriterion("car_step =", value, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepNotEqualTo(String value) {
            addCriterion("car_step <>", value, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepGreaterThan(String value) {
            addCriterion("car_step >", value, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepGreaterThanOrEqualTo(String value) {
            addCriterion("car_step >=", value, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepLessThan(String value) {
            addCriterion("car_step <", value, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepLessThanOrEqualTo(String value) {
            addCriterion("car_step <=", value, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepLike(String value) {
            addCriterion("car_step like", value, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepNotLike(String value) {
            addCriterion("car_step not like", value, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepIn(List<String> values) {
            addCriterion("car_step in", values, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepNotIn(List<String> values) {
            addCriterion("car_step not in", values, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepBetween(String value1, String value2) {
            addCriterion("car_step between", value1, value2, "carStep");
            return (Criteria) this;
        }

        public Criteria andCarStepNotBetween(String value1, String value2) {
            addCriterion("car_step not between", value1, value2, "carStep");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNull() {
            addCriterion("image_name is null");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNotNull() {
            addCriterion("image_name is not null");
            return (Criteria) this;
        }

        public Criteria andImageNameEqualTo(String value) {
            addCriterion("image_name =", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotEqualTo(String value) {
            addCriterion("image_name <>", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThan(String value) {
            addCriterion("image_name >", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("image_name >=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThan(String value) {
            addCriterion("image_name <", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThanOrEqualTo(String value) {
            addCriterion("image_name <=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLike(String value) {
            addCriterion("image_name like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotLike(String value) {
            addCriterion("image_name not like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameIn(List<String> values) {
            addCriterion("image_name in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotIn(List<String> values) {
            addCriterion("image_name not in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameBetween(String value1, String value2) {
            addCriterion("image_name between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotBetween(String value1, String value2) {
            addCriterion("image_name not between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andAttachNameIsNull() {
            addCriterion("attach_name is null");
            return (Criteria) this;
        }

        public Criteria andAttachNameIsNotNull() {
            addCriterion("attach_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttachNameEqualTo(String value) {
            addCriterion("attach_name =", value, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameNotEqualTo(String value) {
            addCriterion("attach_name <>", value, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameGreaterThan(String value) {
            addCriterion("attach_name >", value, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameGreaterThanOrEqualTo(String value) {
            addCriterion("attach_name >=", value, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameLessThan(String value) {
            addCriterion("attach_name <", value, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameLessThanOrEqualTo(String value) {
            addCriterion("attach_name <=", value, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameLike(String value) {
            addCriterion("attach_name like", value, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameNotLike(String value) {
            addCriterion("attach_name not like", value, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameIn(List<String> values) {
            addCriterion("attach_name in", values, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameNotIn(List<String> values) {
            addCriterion("attach_name not in", values, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameBetween(String value1, String value2) {
            addCriterion("attach_name between", value1, value2, "attachName");
            return (Criteria) this;
        }

        public Criteria andAttachNameNotBetween(String value1, String value2) {
            addCriterion("attach_name not between", value1, value2, "attachName");
            return (Criteria) this;
        }

        public Criteria andMeasureIsNull() {
            addCriterion("measure is null");
            return (Criteria) this;
        }

        public Criteria andMeasureIsNotNull() {
            addCriterion("measure is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureEqualTo(String value) {
            addCriterion("measure =", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotEqualTo(String value) {
            addCriterion("measure <>", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureGreaterThan(String value) {
            addCriterion("measure >", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("measure >=", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLessThan(String value) {
            addCriterion("measure <", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLessThanOrEqualTo(String value) {
            addCriterion("measure <=", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLike(String value) {
            addCriterion("measure like", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotLike(String value) {
            addCriterion("measure not like", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureIn(List<String> values) {
            addCriterion("measure in", values, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotIn(List<String> values) {
            addCriterion("measure not in", values, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureBetween(String value1, String value2) {
            addCriterion("measure between", value1, value2, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotBetween(String value1, String value2) {
            addCriterion("measure not between", value1, value2, "measure");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonIsNull() {
            addCriterion("third_duty_person is null");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonIsNotNull() {
            addCriterion("third_duty_person is not null");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonEqualTo(String value) {
            addCriterion("third_duty_person =", value, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonNotEqualTo(String value) {
            addCriterion("third_duty_person <>", value, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonGreaterThan(String value) {
            addCriterion("third_duty_person >", value, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("third_duty_person >=", value, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonLessThan(String value) {
            addCriterion("third_duty_person <", value, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonLessThanOrEqualTo(String value) {
            addCriterion("third_duty_person <=", value, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonLike(String value) {
            addCriterion("third_duty_person like", value, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonNotLike(String value) {
            addCriterion("third_duty_person not like", value, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonIn(List<String> values) {
            addCriterion("third_duty_person in", values, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonNotIn(List<String> values) {
            addCriterion("third_duty_person not in", values, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonBetween(String value1, String value2) {
            addCriterion("third_duty_person between", value1, value2, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdDutyPersonNotBetween(String value1, String value2) {
            addCriterion("third_duty_person not between", value1, value2, "thirdDutyPerson");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateIsNull() {
            addCriterion("third_execute_date is null");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateIsNotNull() {
            addCriterion("third_execute_date is not null");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateEqualTo(Date value) {
            addCriterion("third_execute_date =", value, "thirdExecuteDate");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateNotEqualTo(Date value) {
            addCriterion("third_execute_date <>", value, "thirdExecuteDate");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateGreaterThan(Date value) {
            addCriterion("third_execute_date >", value, "thirdExecuteDate");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("third_execute_date >=", value, "thirdExecuteDate");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateLessThan(Date value) {
            addCriterion("third_execute_date <", value, "thirdExecuteDate");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateLessThanOrEqualTo(Date value) {
            addCriterion("third_execute_date <=", value, "thirdExecuteDate");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateIn(List<Date> values) {
            addCriterion("third_execute_date in", values, "thirdExecuteDate");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateNotIn(List<Date> values) {
            addCriterion("third_execute_date not in", values, "thirdExecuteDate");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateBetween(Date value1, Date value2) {
            addCriterion("third_execute_date between", value1, value2, "thirdExecuteDate");
            return (Criteria) this;
        }

        public Criteria andThirdExecuteDateNotBetween(Date value1, Date value2) {
            addCriterion("third_execute_date not between", value1, value2, "thirdExecuteDate");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonIsNull() {
            addCriterion("fourth_duty_person is null");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonIsNotNull() {
            addCriterion("fourth_duty_person is not null");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonEqualTo(String value) {
            addCriterion("fourth_duty_person =", value, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonNotEqualTo(String value) {
            addCriterion("fourth_duty_person <>", value, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonGreaterThan(String value) {
            addCriterion("fourth_duty_person >", value, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("fourth_duty_person >=", value, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonLessThan(String value) {
            addCriterion("fourth_duty_person <", value, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonLessThanOrEqualTo(String value) {
            addCriterion("fourth_duty_person <=", value, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonLike(String value) {
            addCriterion("fourth_duty_person like", value, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonNotLike(String value) {
            addCriterion("fourth_duty_person not like", value, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonIn(List<String> values) {
            addCriterion("fourth_duty_person in", values, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonNotIn(List<String> values) {
            addCriterion("fourth_duty_person not in", values, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonBetween(String value1, String value2) {
            addCriterion("fourth_duty_person between", value1, value2, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDutyPersonNotBetween(String value1, String value2) {
            addCriterion("fourth_duty_person not between", value1, value2, "fourthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andFourthDateIsNull() {
            addCriterion("fourth_date is null");
            return (Criteria) this;
        }

        public Criteria andFourthDateIsNotNull() {
            addCriterion("fourth_date is not null");
            return (Criteria) this;
        }

        public Criteria andFourthDateEqualTo(Date value) {
            addCriterion("fourth_date =", value, "fourthDate");
            return (Criteria) this;
        }

        public Criteria andFourthDateNotEqualTo(Date value) {
            addCriterion("fourth_date <>", value, "fourthDate");
            return (Criteria) this;
        }

        public Criteria andFourthDateGreaterThan(Date value) {
            addCriterion("fourth_date >", value, "fourthDate");
            return (Criteria) this;
        }

        public Criteria andFourthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("fourth_date >=", value, "fourthDate");
            return (Criteria) this;
        }

        public Criteria andFourthDateLessThan(Date value) {
            addCriterion("fourth_date <", value, "fourthDate");
            return (Criteria) this;
        }

        public Criteria andFourthDateLessThanOrEqualTo(Date value) {
            addCriterion("fourth_date <=", value, "fourthDate");
            return (Criteria) this;
        }

        public Criteria andFourthDateIn(List<Date> values) {
            addCriterion("fourth_date in", values, "fourthDate");
            return (Criteria) this;
        }

        public Criteria andFourthDateNotIn(List<Date> values) {
            addCriterion("fourth_date not in", values, "fourthDate");
            return (Criteria) this;
        }

        public Criteria andFourthDateBetween(Date value1, Date value2) {
            addCriterion("fourth_date between", value1, value2, "fourthDate");
            return (Criteria) this;
        }

        public Criteria andFourthDateNotBetween(Date value1, Date value2) {
            addCriterion("fourth_date not between", value1, value2, "fourthDate");
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

        public Criteria andSchemeIsNull() {
            addCriterion("scheme is null");
            return (Criteria) this;
        }

        public Criteria andSchemeIsNotNull() {
            addCriterion("scheme is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeEqualTo(String value) {
            addCriterion("scheme =", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeNotEqualTo(String value) {
            addCriterion("scheme <>", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeGreaterThan(String value) {
            addCriterion("scheme >", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeGreaterThanOrEqualTo(String value) {
            addCriterion("scheme >=", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeLessThan(String value) {
            addCriterion("scheme <", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeLessThanOrEqualTo(String value) {
            addCriterion("scheme <=", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeLike(String value) {
            addCriterion("scheme like", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeNotLike(String value) {
            addCriterion("scheme not like", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeIn(List<String> values) {
            addCriterion("scheme in", values, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeNotIn(List<String> values) {
            addCriterion("scheme not in", values, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeBetween(String value1, String value2) {
            addCriterion("scheme between", value1, value2, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeNotBetween(String value1, String value2) {
            addCriterion("scheme not between", value1, value2, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeResultIsNull() {
            addCriterion("scheme_result is null");
            return (Criteria) this;
        }

        public Criteria andSchemeResultIsNotNull() {
            addCriterion("scheme_result is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeResultEqualTo(String value) {
            addCriterion("scheme_result =", value, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultNotEqualTo(String value) {
            addCriterion("scheme_result <>", value, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultGreaterThan(String value) {
            addCriterion("scheme_result >", value, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultGreaterThanOrEqualTo(String value) {
            addCriterion("scheme_result >=", value, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultLessThan(String value) {
            addCriterion("scheme_result <", value, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultLessThanOrEqualTo(String value) {
            addCriterion("scheme_result <=", value, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultLike(String value) {
            addCriterion("scheme_result like", value, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultNotLike(String value) {
            addCriterion("scheme_result not like", value, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultIn(List<String> values) {
            addCriterion("scheme_result in", values, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultNotIn(List<String> values) {
            addCriterion("scheme_result not in", values, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultBetween(String value1, String value2) {
            addCriterion("scheme_result between", value1, value2, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andSchemeResultNotBetween(String value1, String value2) {
            addCriterion("scheme_result not between", value1, value2, "schemeResult");
            return (Criteria) this;
        }

        public Criteria andFifthDateIsNull() {
            addCriterion("fifth_date is null");
            return (Criteria) this;
        }

        public Criteria andFifthDateIsNotNull() {
            addCriterion("fifth_date is not null");
            return (Criteria) this;
        }

        public Criteria andFifthDateEqualTo(Date value) {
            addCriterion("fifth_date =", value, "fifthDate");
            return (Criteria) this;
        }

        public Criteria andFifthDateNotEqualTo(Date value) {
            addCriterion("fifth_date <>", value, "fifthDate");
            return (Criteria) this;
        }

        public Criteria andFifthDateGreaterThan(Date value) {
            addCriterion("fifth_date >", value, "fifthDate");
            return (Criteria) this;
        }

        public Criteria andFifthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("fifth_date >=", value, "fifthDate");
            return (Criteria) this;
        }

        public Criteria andFifthDateLessThan(Date value) {
            addCriterion("fifth_date <", value, "fifthDate");
            return (Criteria) this;
        }

        public Criteria andFifthDateLessThanOrEqualTo(Date value) {
            addCriterion("fifth_date <=", value, "fifthDate");
            return (Criteria) this;
        }

        public Criteria andFifthDateIn(List<Date> values) {
            addCriterion("fifth_date in", values, "fifthDate");
            return (Criteria) this;
        }

        public Criteria andFifthDateNotIn(List<Date> values) {
            addCriterion("fifth_date not in", values, "fifthDate");
            return (Criteria) this;
        }

        public Criteria andFifthDateBetween(Date value1, Date value2) {
            addCriterion("fifth_date between", value1, value2, "fifthDate");
            return (Criteria) this;
        }

        public Criteria andFifthDateNotBetween(Date value1, Date value2) {
            addCriterion("fifth_date not between", value1, value2, "fifthDate");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("action like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("action not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andLastSchemeIsNull() {
            addCriterion("last_scheme is null");
            return (Criteria) this;
        }

        public Criteria andLastSchemeIsNotNull() {
            addCriterion("last_scheme is not null");
            return (Criteria) this;
        }

        public Criteria andLastSchemeEqualTo(String value) {
            addCriterion("last_scheme =", value, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeNotEqualTo(String value) {
            addCriterion("last_scheme <>", value, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeGreaterThan(String value) {
            addCriterion("last_scheme >", value, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeGreaterThanOrEqualTo(String value) {
            addCriterion("last_scheme >=", value, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeLessThan(String value) {
            addCriterion("last_scheme <", value, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeLessThanOrEqualTo(String value) {
            addCriterion("last_scheme <=", value, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeLike(String value) {
            addCriterion("last_scheme like", value, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeNotLike(String value) {
            addCriterion("last_scheme not like", value, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeIn(List<String> values) {
            addCriterion("last_scheme in", values, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeNotIn(List<String> values) {
            addCriterion("last_scheme not in", values, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeBetween(String value1, String value2) {
            addCriterion("last_scheme between", value1, value2, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andLastSchemeNotBetween(String value1, String value2) {
            addCriterion("last_scheme not between", value1, value2, "lastScheme");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonIsNull() {
            addCriterion("sixth_duty_person is null");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonIsNotNull() {
            addCriterion("sixth_duty_person is not null");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonEqualTo(String value) {
            addCriterion("sixth_duty_person =", value, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonNotEqualTo(String value) {
            addCriterion("sixth_duty_person <>", value, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonGreaterThan(String value) {
            addCriterion("sixth_duty_person >", value, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("sixth_duty_person >=", value, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonLessThan(String value) {
            addCriterion("sixth_duty_person <", value, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonLessThanOrEqualTo(String value) {
            addCriterion("sixth_duty_person <=", value, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonLike(String value) {
            addCriterion("sixth_duty_person like", value, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonNotLike(String value) {
            addCriterion("sixth_duty_person not like", value, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonIn(List<String> values) {
            addCriterion("sixth_duty_person in", values, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonNotIn(List<String> values) {
            addCriterion("sixth_duty_person not in", values, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonBetween(String value1, String value2) {
            addCriterion("sixth_duty_person between", value1, value2, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDutyPersonNotBetween(String value1, String value2) {
            addCriterion("sixth_duty_person not between", value1, value2, "sixthDutyPerson");
            return (Criteria) this;
        }

        public Criteria andSixthDateIsNull() {
            addCriterion("sixth_date is null");
            return (Criteria) this;
        }

        public Criteria andSixthDateIsNotNull() {
            addCriterion("sixth_date is not null");
            return (Criteria) this;
        }

        public Criteria andSixthDateEqualTo(Date value) {
            addCriterion("sixth_date =", value, "sixthDate");
            return (Criteria) this;
        }

        public Criteria andSixthDateNotEqualTo(Date value) {
            addCriterion("sixth_date <>", value, "sixthDate");
            return (Criteria) this;
        }

        public Criteria andSixthDateGreaterThan(Date value) {
            addCriterion("sixth_date >", value, "sixthDate");
            return (Criteria) this;
        }

        public Criteria andSixthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sixth_date >=", value, "sixthDate");
            return (Criteria) this;
        }

        public Criteria andSixthDateLessThan(Date value) {
            addCriterion("sixth_date <", value, "sixthDate");
            return (Criteria) this;
        }

        public Criteria andSixthDateLessThanOrEqualTo(Date value) {
            addCriterion("sixth_date <=", value, "sixthDate");
            return (Criteria) this;
        }

        public Criteria andSixthDateIn(List<Date> values) {
            addCriterion("sixth_date in", values, "sixthDate");
            return (Criteria) this;
        }

        public Criteria andSixthDateNotIn(List<Date> values) {
            addCriterion("sixth_date not in", values, "sixthDate");
            return (Criteria) this;
        }

        public Criteria andSixthDateBetween(Date value1, Date value2) {
            addCriterion("sixth_date between", value1, value2, "sixthDate");
            return (Criteria) this;
        }

        public Criteria andSixthDateNotBetween(Date value1, Date value2) {
            addCriterion("sixth_date not between", value1, value2, "sixthDate");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateIsNull() {
            addCriterion("sixth_execute_date is null");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateIsNotNull() {
            addCriterion("sixth_execute_date is not null");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateEqualTo(Date value) {
            addCriterion("sixth_execute_date =", value, "sixthExecuteDate");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateNotEqualTo(Date value) {
            addCriterion("sixth_execute_date <>", value, "sixthExecuteDate");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateGreaterThan(Date value) {
            addCriterion("sixth_execute_date >", value, "sixthExecuteDate");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sixth_execute_date >=", value, "sixthExecuteDate");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateLessThan(Date value) {
            addCriterion("sixth_execute_date <", value, "sixthExecuteDate");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateLessThanOrEqualTo(Date value) {
            addCriterion("sixth_execute_date <=", value, "sixthExecuteDate");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateIn(List<Date> values) {
            addCriterion("sixth_execute_date in", values, "sixthExecuteDate");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateNotIn(List<Date> values) {
            addCriterion("sixth_execute_date not in", values, "sixthExecuteDate");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateBetween(Date value1, Date value2) {
            addCriterion("sixth_execute_date between", value1, value2, "sixthExecuteDate");
            return (Criteria) this;
        }

        public Criteria andSixthExecuteDateNotBetween(Date value1, Date value2) {
            addCriterion("sixth_execute_date not between", value1, value2, "sixthExecuteDate");
            return (Criteria) this;
        }

        public Criteria andSixthAttachIsNull() {
            addCriterion("sixth_attach is null");
            return (Criteria) this;
        }

        public Criteria andSixthAttachIsNotNull() {
            addCriterion("sixth_attach is not null");
            return (Criteria) this;
        }

        public Criteria andSixthAttachEqualTo(String value) {
            addCriterion("sixth_attach =", value, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNotEqualTo(String value) {
            addCriterion("sixth_attach <>", value, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachGreaterThan(String value) {
            addCriterion("sixth_attach >", value, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachGreaterThanOrEqualTo(String value) {
            addCriterion("sixth_attach >=", value, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachLessThan(String value) {
            addCriterion("sixth_attach <", value, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachLessThanOrEqualTo(String value) {
            addCriterion("sixth_attach <=", value, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachLike(String value) {
            addCriterion("sixth_attach like", value, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNotLike(String value) {
            addCriterion("sixth_attach not like", value, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachIn(List<String> values) {
            addCriterion("sixth_attach in", values, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNotIn(List<String> values) {
            addCriterion("sixth_attach not in", values, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachBetween(String value1, String value2) {
            addCriterion("sixth_attach between", value1, value2, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNotBetween(String value1, String value2) {
            addCriterion("sixth_attach not between", value1, value2, "sixthAttach");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameIsNull() {
            addCriterion("sixth_attach_name is null");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameIsNotNull() {
            addCriterion("sixth_attach_name is not null");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameEqualTo(String value) {
            addCriterion("sixth_attach_name =", value, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameNotEqualTo(String value) {
            addCriterion("sixth_attach_name <>", value, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameGreaterThan(String value) {
            addCriterion("sixth_attach_name >", value, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameGreaterThanOrEqualTo(String value) {
            addCriterion("sixth_attach_name >=", value, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameLessThan(String value) {
            addCriterion("sixth_attach_name <", value, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameLessThanOrEqualTo(String value) {
            addCriterion("sixth_attach_name <=", value, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameLike(String value) {
            addCriterion("sixth_attach_name like", value, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameNotLike(String value) {
            addCriterion("sixth_attach_name not like", value, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameIn(List<String> values) {
            addCriterion("sixth_attach_name in", values, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameNotIn(List<String> values) {
            addCriterion("sixth_attach_name not in", values, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameBetween(String value1, String value2) {
            addCriterion("sixth_attach_name between", value1, value2, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachNameNotBetween(String value1, String value2) {
            addCriterion("sixth_attach_name not between", value1, value2, "sixthAttachName");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescIsNull() {
            addCriterion("sixth_attach_desc is null");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescIsNotNull() {
            addCriterion("sixth_attach_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescEqualTo(String value) {
            addCriterion("sixth_attach_desc =", value, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescNotEqualTo(String value) {
            addCriterion("sixth_attach_desc <>", value, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescGreaterThan(String value) {
            addCriterion("sixth_attach_desc >", value, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescGreaterThanOrEqualTo(String value) {
            addCriterion("sixth_attach_desc >=", value, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescLessThan(String value) {
            addCriterion("sixth_attach_desc <", value, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescLessThanOrEqualTo(String value) {
            addCriterion("sixth_attach_desc <=", value, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescLike(String value) {
            addCriterion("sixth_attach_desc like", value, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescNotLike(String value) {
            addCriterion("sixth_attach_desc not like", value, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescIn(List<String> values) {
            addCriterion("sixth_attach_desc in", values, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescNotIn(List<String> values) {
            addCriterion("sixth_attach_desc not in", values, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescBetween(String value1, String value2) {
            addCriterion("sixth_attach_desc between", value1, value2, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andSixthAttachDescNotBetween(String value1, String value2) {
            addCriterion("sixth_attach_desc not between", value1, value2, "sixthAttachDesc");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNull() {
            addCriterion("report_name is null");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNotNull() {
            addCriterion("report_name is not null");
            return (Criteria) this;
        }

        public Criteria andReportNameEqualTo(String value) {
            addCriterion("report_name =", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotEqualTo(String value) {
            addCriterion("report_name <>", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThan(String value) {
            addCriterion("report_name >", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThanOrEqualTo(String value) {
            addCriterion("report_name >=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThan(String value) {
            addCriterion("report_name <", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThanOrEqualTo(String value) {
            addCriterion("report_name <=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLike(String value) {
            addCriterion("report_name like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotLike(String value) {
            addCriterion("report_name not like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameIn(List<String> values) {
            addCriterion("report_name in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotIn(List<String> values) {
            addCriterion("report_name not in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameBetween(String value1, String value2) {
            addCriterion("report_name between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotBetween(String value1, String value2) {
            addCriterion("report_name not between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportRemarkIsNull() {
            addCriterion("report_remark is null");
            return (Criteria) this;
        }

        public Criteria andReportRemarkIsNotNull() {
            addCriterion("report_remark is not null");
            return (Criteria) this;
        }

        public Criteria andReportRemarkEqualTo(String value) {
            addCriterion("report_remark =", value, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkNotEqualTo(String value) {
            addCriterion("report_remark <>", value, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkGreaterThan(String value) {
            addCriterion("report_remark >", value, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("report_remark >=", value, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkLessThan(String value) {
            addCriterion("report_remark <", value, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkLessThanOrEqualTo(String value) {
            addCriterion("report_remark <=", value, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkLike(String value) {
            addCriterion("report_remark like", value, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkNotLike(String value) {
            addCriterion("report_remark not like", value, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkIn(List<String> values) {
            addCriterion("report_remark in", values, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkNotIn(List<String> values) {
            addCriterion("report_remark not in", values, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkBetween(String value1, String value2) {
            addCriterion("report_remark between", value1, value2, "reportRemark");
            return (Criteria) this;
        }

        public Criteria andReportRemarkNotBetween(String value1, String value2) {
            addCriterion("report_remark not between", value1, value2, "reportRemark");
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