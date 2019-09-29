package com.cummins.receipt.model;

import java.util.ArrayList;
import java.util.List;

public class NonconfigContainmentSonCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NonconfigContainmentSonCriteria() {
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

        public Criteria andNcfIdIsNull() {
            addCriterion("ncf_id is null");
            return (Criteria) this;
        }

        public Criteria andNcfIdIsNotNull() {
            addCriterion("ncf_id is not null");
            return (Criteria) this;
        }

        public Criteria andNcfIdEqualTo(Integer value) {
            addCriterion("ncf_id =", value, "ncfId");
            return (Criteria) this;
        }

        public Criteria andNcfIdNotEqualTo(Integer value) {
            addCriterion("ncf_id <>", value, "ncfId");
            return (Criteria) this;
        }

        public Criteria andNcfIdGreaterThan(Integer value) {
            addCriterion("ncf_id >", value, "ncfId");
            return (Criteria) this;
        }

        public Criteria andNcfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ncf_id >=", value, "ncfId");
            return (Criteria) this;
        }

        public Criteria andNcfIdLessThan(Integer value) {
            addCriterion("ncf_id <", value, "ncfId");
            return (Criteria) this;
        }

        public Criteria andNcfIdLessThanOrEqualTo(Integer value) {
            addCriterion("ncf_id <=", value, "ncfId");
            return (Criteria) this;
        }

        public Criteria andNcfIdIn(List<Integer> values) {
            addCriterion("ncf_id in", values, "ncfId");
            return (Criteria) this;
        }

        public Criteria andNcfIdNotIn(List<Integer> values) {
            addCriterion("ncf_id not in", values, "ncfId");
            return (Criteria) this;
        }

        public Criteria andNcfIdBetween(Integer value1, Integer value2) {
            addCriterion("ncf_id between", value1, value2, "ncfId");
            return (Criteria) this;
        }

        public Criteria andNcfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ncf_id not between", value1, value2, "ncfId");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andQttyIsNull() {
            addCriterion("qtty is null");
            return (Criteria) this;
        }

        public Criteria andQttyIsNotNull() {
            addCriterion("qtty is not null");
            return (Criteria) this;
        }

        public Criteria andQttyEqualTo(String value) {
            addCriterion("qtty =", value, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyNotEqualTo(String value) {
            addCriterion("qtty <>", value, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyGreaterThan(String value) {
            addCriterion("qtty >", value, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyGreaterThanOrEqualTo(String value) {
            addCriterion("qtty >=", value, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyLessThan(String value) {
            addCriterion("qtty <", value, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyLessThanOrEqualTo(String value) {
            addCriterion("qtty <=", value, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyLike(String value) {
            addCriterion("qtty like", value, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyNotLike(String value) {
            addCriterion("qtty not like", value, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyIn(List<String> values) {
            addCriterion("qtty in", values, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyNotIn(List<String> values) {
            addCriterion("qtty not in", values, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyBetween(String value1, String value2) {
            addCriterion("qtty between", value1, value2, "qtty");
            return (Criteria) this;
        }

        public Criteria andQttyNotBetween(String value1, String value2) {
            addCriterion("qtty not between", value1, value2, "qtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyIsNull() {
            addCriterion("screend_qtty is null");
            return (Criteria) this;
        }

        public Criteria andScreendQttyIsNotNull() {
            addCriterion("screend_qtty is not null");
            return (Criteria) this;
        }

        public Criteria andScreendQttyEqualTo(String value) {
            addCriterion("screend_qtty =", value, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyNotEqualTo(String value) {
            addCriterion("screend_qtty <>", value, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyGreaterThan(String value) {
            addCriterion("screend_qtty >", value, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyGreaterThanOrEqualTo(String value) {
            addCriterion("screend_qtty >=", value, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyLessThan(String value) {
            addCriterion("screend_qtty <", value, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyLessThanOrEqualTo(String value) {
            addCriterion("screend_qtty <=", value, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyLike(String value) {
            addCriterion("screend_qtty like", value, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyNotLike(String value) {
            addCriterion("screend_qtty not like", value, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyIn(List<String> values) {
            addCriterion("screend_qtty in", values, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyNotIn(List<String> values) {
            addCriterion("screend_qtty not in", values, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyBetween(String value1, String value2) {
            addCriterion("screend_qtty between", value1, value2, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andScreendQttyNotBetween(String value1, String value2) {
            addCriterion("screend_qtty not between", value1, value2, "screendQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyIsNull() {
            addCriterion("nok_qtty is null");
            return (Criteria) this;
        }

        public Criteria andNokQttyIsNotNull() {
            addCriterion("nok_qtty is not null");
            return (Criteria) this;
        }

        public Criteria andNokQttyEqualTo(String value) {
            addCriterion("nok_qtty =", value, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyNotEqualTo(String value) {
            addCriterion("nok_qtty <>", value, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyGreaterThan(String value) {
            addCriterion("nok_qtty >", value, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyGreaterThanOrEqualTo(String value) {
            addCriterion("nok_qtty >=", value, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyLessThan(String value) {
            addCriterion("nok_qtty <", value, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyLessThanOrEqualTo(String value) {
            addCriterion("nok_qtty <=", value, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyLike(String value) {
            addCriterion("nok_qtty like", value, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyNotLike(String value) {
            addCriterion("nok_qtty not like", value, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyIn(List<String> values) {
            addCriterion("nok_qtty in", values, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyNotIn(List<String> values) {
            addCriterion("nok_qtty not in", values, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyBetween(String value1, String value2) {
            addCriterion("nok_qtty between", value1, value2, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andNokQttyNotBetween(String value1, String value2) {
            addCriterion("nok_qtty not between", value1, value2, "nokQtty");
            return (Criteria) this;
        }

        public Criteria andResponseIsNull() {
            addCriterion("response is null");
            return (Criteria) this;
        }

        public Criteria andResponseIsNotNull() {
            addCriterion("response is not null");
            return (Criteria) this;
        }

        public Criteria andResponseEqualTo(String value) {
            addCriterion("response =", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotEqualTo(String value) {
            addCriterion("response <>", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThan(String value) {
            addCriterion("response >", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThanOrEqualTo(String value) {
            addCriterion("response >=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThan(String value) {
            addCriterion("response <", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThanOrEqualTo(String value) {
            addCriterion("response <=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLike(String value) {
            addCriterion("response like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotLike(String value) {
            addCriterion("response not like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseIn(List<String> values) {
            addCriterion("response in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotIn(List<String> values) {
            addCriterion("response not in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseBetween(String value1, String value2) {
            addCriterion("response between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotBetween(String value1, String value2) {
            addCriterion("response not between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNull() {
            addCriterion("verifier is null");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNotNull() {
            addCriterion("verifier is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierEqualTo(String value) {
            addCriterion("verifier =", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotEqualTo(String value) {
            addCriterion("verifier <>", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThan(String value) {
            addCriterion("verifier >", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThanOrEqualTo(String value) {
            addCriterion("verifier >=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThan(String value) {
            addCriterion("verifier <", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThanOrEqualTo(String value) {
            addCriterion("verifier <=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLike(String value) {
            addCriterion("verifier like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotLike(String value) {
            addCriterion("verifier not like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierIn(List<String> values) {
            addCriterion("verifier in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotIn(List<String> values) {
            addCriterion("verifier not in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierBetween(String value1, String value2) {
            addCriterion("verifier between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotBetween(String value1, String value2) {
            addCriterion("verifier not between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andCompletionDateIsNull() {
            addCriterion("completion_date is null");
            return (Criteria) this;
        }

        public Criteria andCompletionDateIsNotNull() {
            addCriterion("completion_date is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionDateEqualTo(String value) {
            addCriterion("completion_date =", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateNotEqualTo(String value) {
            addCriterion("completion_date <>", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateGreaterThan(String value) {
            addCriterion("completion_date >", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateGreaterThanOrEqualTo(String value) {
            addCriterion("completion_date >=", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateLessThan(String value) {
            addCriterion("completion_date <", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateLessThanOrEqualTo(String value) {
            addCriterion("completion_date <=", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateLike(String value) {
            addCriterion("completion_date like", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateNotLike(String value) {
            addCriterion("completion_date not like", value, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateIn(List<String> values) {
            addCriterion("completion_date in", values, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateNotIn(List<String> values) {
            addCriterion("completion_date not in", values, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateBetween(String value1, String value2) {
            addCriterion("completion_date between", value1, value2, "completionDate");
            return (Criteria) this;
        }

        public Criteria andCompletionDateNotBetween(String value1, String value2) {
            addCriterion("completion_date not between", value1, value2, "completionDate");
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