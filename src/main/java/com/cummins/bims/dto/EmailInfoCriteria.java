package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailInfoCriteria() {
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

        public Criteria andFromEmailIsNull() {
            addCriterion("from_email is null");
            return (Criteria) this;
        }

        public Criteria andFromEmailIsNotNull() {
            addCriterion("from_email is not null");
            return (Criteria) this;
        }

        public Criteria andFromEmailEqualTo(String value) {
            addCriterion("from_email =", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailNotEqualTo(String value) {
            addCriterion("from_email <>", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailGreaterThan(String value) {
            addCriterion("from_email >", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailGreaterThanOrEqualTo(String value) {
            addCriterion("from_email >=", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailLessThan(String value) {
            addCriterion("from_email <", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailLessThanOrEqualTo(String value) {
            addCriterion("from_email <=", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailLike(String value) {
            addCriterion("from_email like", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailNotLike(String value) {
            addCriterion("from_email not like", value, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailIn(List<String> values) {
            addCriterion("from_email in", values, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailNotIn(List<String> values) {
            addCriterion("from_email not in", values, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailBetween(String value1, String value2) {
            addCriterion("from_email between", value1, value2, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andFromEmailNotBetween(String value1, String value2) {
            addCriterion("from_email not between", value1, value2, "fromEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailIsNull() {
            addCriterion("to_email is null");
            return (Criteria) this;
        }

        public Criteria andToEmailIsNotNull() {
            addCriterion("to_email is not null");
            return (Criteria) this;
        }

        public Criteria andToEmailEqualTo(String value) {
            addCriterion("to_email =", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailNotEqualTo(String value) {
            addCriterion("to_email <>", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailGreaterThan(String value) {
            addCriterion("to_email >", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailGreaterThanOrEqualTo(String value) {
            addCriterion("to_email >=", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailLessThan(String value) {
            addCriterion("to_email <", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailLessThanOrEqualTo(String value) {
            addCriterion("to_email <=", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailLike(String value) {
            addCriterion("to_email like", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailNotLike(String value) {
            addCriterion("to_email not like", value, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailIn(List<String> values) {
            addCriterion("to_email in", values, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailNotIn(List<String> values) {
            addCriterion("to_email not in", values, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailBetween(String value1, String value2) {
            addCriterion("to_email between", value1, value2, "toEmail");
            return (Criteria) this;
        }

        public Criteria andToEmailNotBetween(String value1, String value2) {
            addCriterion("to_email not between", value1, value2, "toEmail");
            return (Criteria) this;
        }

        public Criteria andTitileIsNull() {
            addCriterion("titile is null");
            return (Criteria) this;
        }

        public Criteria andTitileIsNotNull() {
            addCriterion("titile is not null");
            return (Criteria) this;
        }

        public Criteria andTitileEqualTo(String value) {
            addCriterion("titile =", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileNotEqualTo(String value) {
            addCriterion("titile <>", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileGreaterThan(String value) {
            addCriterion("titile >", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileGreaterThanOrEqualTo(String value) {
            addCriterion("titile >=", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileLessThan(String value) {
            addCriterion("titile <", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileLessThanOrEqualTo(String value) {
            addCriterion("titile <=", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileLike(String value) {
            addCriterion("titile like", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileNotLike(String value) {
            addCriterion("titile not like", value, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileIn(List<String> values) {
            addCriterion("titile in", values, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileNotIn(List<String> values) {
            addCriterion("titile not in", values, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileBetween(String value1, String value2) {
            addCriterion("titile between", value1, value2, "titile");
            return (Criteria) this;
        }

        public Criteria andTitileNotBetween(String value1, String value2) {
            addCriterion("titile not between", value1, value2, "titile");
            return (Criteria) this;
        }

        public Criteria andCcEmailIsNull() {
            addCriterion("cc_email is null");
            return (Criteria) this;
        }

        public Criteria andCcEmailIsNotNull() {
            addCriterion("cc_email is not null");
            return (Criteria) this;
        }

        public Criteria andCcEmailEqualTo(String value) {
            addCriterion("cc_email =", value, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailNotEqualTo(String value) {
            addCriterion("cc_email <>", value, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailGreaterThan(String value) {
            addCriterion("cc_email >", value, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailGreaterThanOrEqualTo(String value) {
            addCriterion("cc_email >=", value, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailLessThan(String value) {
            addCriterion("cc_email <", value, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailLessThanOrEqualTo(String value) {
            addCriterion("cc_email <=", value, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailLike(String value) {
            addCriterion("cc_email like", value, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailNotLike(String value) {
            addCriterion("cc_email not like", value, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailIn(List<String> values) {
            addCriterion("cc_email in", values, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailNotIn(List<String> values) {
            addCriterion("cc_email not in", values, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailBetween(String value1, String value2) {
            addCriterion("cc_email between", value1, value2, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andCcEmailNotBetween(String value1, String value2) {
            addCriterion("cc_email not between", value1, value2, "ccEmail");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
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