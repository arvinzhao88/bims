package com.cummins.permission.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BimsPersonCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BimsPersonCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNull() {
            addCriterion("pinyin is null");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNotNull() {
            addCriterion("pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinEqualTo(String value) {
            addCriterion("pinyin =", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotEqualTo(String value) {
            addCriterion("pinyin <>", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThan(String value) {
            addCriterion("pinyin >", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("pinyin >=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThan(String value) {
            addCriterion("pinyin <", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThanOrEqualTo(String value) {
            addCriterion("pinyin <=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLike(String value) {
            addCriterion("pinyin like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotLike(String value) {
            addCriterion("pinyin not like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinIn(List<String> values) {
            addCriterion("pinyin in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotIn(List<String> values) {
            addCriterion("pinyin not in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinBetween(String value1, String value2) {
            addCriterion("pinyin between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotBetween(String value1, String value2) {
            addCriterion("pinyin not between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterIsNull() {
            addCriterion("pinyin_first_letter is null");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterIsNotNull() {
            addCriterion("pinyin_first_letter is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterEqualTo(String value) {
            addCriterion("pinyin_first_letter =", value, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterNotEqualTo(String value) {
            addCriterion("pinyin_first_letter <>", value, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterGreaterThan(String value) {
            addCriterion("pinyin_first_letter >", value, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterGreaterThanOrEqualTo(String value) {
            addCriterion("pinyin_first_letter >=", value, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterLessThan(String value) {
            addCriterion("pinyin_first_letter <", value, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterLessThanOrEqualTo(String value) {
            addCriterion("pinyin_first_letter <=", value, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterLike(String value) {
            addCriterion("pinyin_first_letter like", value, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterNotLike(String value) {
            addCriterion("pinyin_first_letter not like", value, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterIn(List<String> values) {
            addCriterion("pinyin_first_letter in", values, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterNotIn(List<String> values) {
            addCriterion("pinyin_first_letter not in", values, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterBetween(String value1, String value2) {
            addCriterion("pinyin_first_letter between", value1, value2, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLetterNotBetween(String value1, String value2) {
            addCriterion("pinyin_first_letter not between", value1, value2, "pinyinFirstLetter");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andBoundIsNull() {
            addCriterion("bound is null");
            return (Criteria) this;
        }

        public Criteria andBoundIsNotNull() {
            addCriterion("bound is not null");
            return (Criteria) this;
        }

        public Criteria andBoundEqualTo(Boolean value) {
            addCriterion("bound =", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundNotEqualTo(Boolean value) {
            addCriterion("bound <>", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundGreaterThan(Boolean value) {
            addCriterion("bound >", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bound >=", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundLessThan(Boolean value) {
            addCriterion("bound <", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundLessThanOrEqualTo(Boolean value) {
            addCriterion("bound <=", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundIn(List<Boolean> values) {
            addCriterion("bound in", values, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundNotIn(List<Boolean> values) {
            addCriterion("bound not in", values, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundBetween(Boolean value1, Boolean value2) {
            addCriterion("bound between", value1, value2, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bound not between", value1, value2, "bound");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNull() {
            addCriterion("qr_code is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("qr_code =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("qr_code <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("qr_code >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("qr_code <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("qr_code <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("qr_code like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("qr_code not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("qr_code in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("qr_code not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("qr_code between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("qr_code not between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayIsNull() {
            addCriterion("lunar_birthday is null");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayIsNotNull() {
            addCriterion("lunar_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("lunar_birthday =", value, "lunarBirthday");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("lunar_birthday <>", value, "lunarBirthday");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("lunar_birthday >", value, "lunarBirthday");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lunar_birthday >=", value, "lunarBirthday");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("lunar_birthday <", value, "lunarBirthday");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lunar_birthday <=", value, "lunarBirthday");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("lunar_birthday in", values, "lunarBirthday");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("lunar_birthday not in", values, "lunarBirthday");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lunar_birthday between", value1, value2, "lunarBirthday");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lunar_birthday not between", value1, value2, "lunarBirthday");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIsNull() {
            addCriterion("notify_type is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIsNotNull() {
            addCriterion("notify_type is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeEqualTo(Integer value) {
            addCriterion("notify_type =", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotEqualTo(Integer value) {
            addCriterion("notify_type <>", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeGreaterThan(Integer value) {
            addCriterion("notify_type >", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_type >=", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLessThan(Integer value) {
            addCriterion("notify_type <", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("notify_type <=", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIn(List<Integer> values) {
            addCriterion("notify_type in", values, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotIn(List<Integer> values) {
            addCriterion("notify_type not in", values, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeBetween(Integer value1, Integer value2) {
            addCriterion("notify_type between", value1, value2, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_type not between", value1, value2, "notifyType");
            return (Criteria) this;
        }

        public Criteria andEmployedIsNull() {
            addCriterion("employed is null");
            return (Criteria) this;
        }

        public Criteria andEmployedIsNotNull() {
            addCriterion("employed is not null");
            return (Criteria) this;
        }

        public Criteria andEmployedEqualTo(Date value) {
            addCriterionForJDBCDate("employed =", value, "employed");
            return (Criteria) this;
        }

        public Criteria andEmployedNotEqualTo(Date value) {
            addCriterionForJDBCDate("employed <>", value, "employed");
            return (Criteria) this;
        }

        public Criteria andEmployedGreaterThan(Date value) {
            addCriterionForJDBCDate("employed >", value, "employed");
            return (Criteria) this;
        }

        public Criteria andEmployedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employed >=", value, "employed");
            return (Criteria) this;
        }

        public Criteria andEmployedLessThan(Date value) {
            addCriterionForJDBCDate("employed <", value, "employed");
            return (Criteria) this;
        }

        public Criteria andEmployedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employed <=", value, "employed");
            return (Criteria) this;
        }

        public Criteria andEmployedIn(List<Date> values) {
            addCriterionForJDBCDate("employed in", values, "employed");
            return (Criteria) this;
        }

        public Criteria andEmployedNotIn(List<Date> values) {
            addCriterionForJDBCDate("employed not in", values, "employed");
            return (Criteria) this;
        }

        public Criteria andEmployedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employed between", value1, value2, "employed");
            return (Criteria) this;
        }

        public Criteria andEmployedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employed not between", value1, value2, "employed");
            return (Criteria) this;
        }

        public Criteria andFiredIsNull() {
            addCriterion("fired is null");
            return (Criteria) this;
        }

        public Criteria andFiredIsNotNull() {
            addCriterion("fired is not null");
            return (Criteria) this;
        }

        public Criteria andFiredEqualTo(Boolean value) {
            addCriterion("fired =", value, "fired");
            return (Criteria) this;
        }

        public Criteria andFiredNotEqualTo(Boolean value) {
            addCriterion("fired <>", value, "fired");
            return (Criteria) this;
        }

        public Criteria andFiredGreaterThan(Boolean value) {
            addCriterion("fired >", value, "fired");
            return (Criteria) this;
        }

        public Criteria andFiredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fired >=", value, "fired");
            return (Criteria) this;
        }

        public Criteria andFiredLessThan(Boolean value) {
            addCriterion("fired <", value, "fired");
            return (Criteria) this;
        }

        public Criteria andFiredLessThanOrEqualTo(Boolean value) {
            addCriterion("fired <=", value, "fired");
            return (Criteria) this;
        }

        public Criteria andFiredIn(List<Boolean> values) {
            addCriterion("fired in", values, "fired");
            return (Criteria) this;
        }

        public Criteria andFiredNotIn(List<Boolean> values) {
            addCriterion("fired not in", values, "fired");
            return (Criteria) this;
        }

        public Criteria andFiredBetween(Boolean value1, Boolean value2) {
            addCriterion("fired between", value1, value2, "fired");
            return (Criteria) this;
        }

        public Criteria andFiredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fired not between", value1, value2, "fired");
            return (Criteria) this;
        }

        public Criteria andFiredTimeIsNull() {
            addCriterion("fired_time is null");
            return (Criteria) this;
        }

        public Criteria andFiredTimeIsNotNull() {
            addCriterion("fired_time is not null");
            return (Criteria) this;
        }

        public Criteria andFiredTimeEqualTo(Date value) {
            addCriterionForJDBCDate("fired_time =", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("fired_time <>", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("fired_time >", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fired_time >=", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeLessThan(Date value) {
            addCriterionForJDBCDate("fired_time <", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fired_time <=", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeIn(List<Date> values) {
            addCriterionForJDBCDate("fired_time in", values, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("fired_time not in", values, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fired_time between", value1, value2, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fired_time not between", value1, value2, "firedTime");
            return (Criteria) this;
        }

        public Criteria andTopTimeIsNull() {
            addCriterion("top_time is null");
            return (Criteria) this;
        }

        public Criteria andTopTimeIsNotNull() {
            addCriterion("top_time is not null");
            return (Criteria) this;
        }

        public Criteria andTopTimeEqualTo(Date value) {
            addCriterion("top_time =", value, "topTime");
            return (Criteria) this;
        }

        public Criteria andTopTimeNotEqualTo(Date value) {
            addCriterion("top_time <>", value, "topTime");
            return (Criteria) this;
        }

        public Criteria andTopTimeGreaterThan(Date value) {
            addCriterion("top_time >", value, "topTime");
            return (Criteria) this;
        }

        public Criteria andTopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("top_time >=", value, "topTime");
            return (Criteria) this;
        }

        public Criteria andTopTimeLessThan(Date value) {
            addCriterion("top_time <", value, "topTime");
            return (Criteria) this;
        }

        public Criteria andTopTimeLessThanOrEqualTo(Date value) {
            addCriterion("top_time <=", value, "topTime");
            return (Criteria) this;
        }

        public Criteria andTopTimeIn(List<Date> values) {
            addCriterion("top_time in", values, "topTime");
            return (Criteria) this;
        }

        public Criteria andTopTimeNotIn(List<Date> values) {
            addCriterion("top_time not in", values, "topTime");
            return (Criteria) this;
        }

        public Criteria andTopTimeBetween(Date value1, Date value2) {
            addCriterion("top_time between", value1, value2, "topTime");
            return (Criteria) this;
        }

        public Criteria andTopTimeNotBetween(Date value1, Date value2) {
            addCriterion("top_time not between", value1, value2, "topTime");
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

        public Criteria andWechatIdIsNull() {
            addCriterion("wechat_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNotNull() {
            addCriterion("wechat_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatIdEqualTo(String value) {
            addCriterion("wechat_id =", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotEqualTo(String value) {
            addCriterion("wechat_id <>", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThan(String value) {
            addCriterion("wechat_id >", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_id >=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThan(String value) {
            addCriterion("wechat_id <", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_id <=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLike(String value) {
            addCriterion("wechat_id like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotLike(String value) {
            addCriterion("wechat_id not like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdIn(List<String> values) {
            addCriterion("wechat_id in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotIn(List<String> values) {
            addCriterion("wechat_id not in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdBetween(String value1, String value2) {
            addCriterion("wechat_id between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotBetween(String value1, String value2) {
            addCriterion("wechat_id not between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("permission is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("permission is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(String value) {
            addCriterion("permission =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(String value) {
            addCriterion("permission <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(String value) {
            addCriterion("permission >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("permission >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(String value) {
            addCriterion("permission <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(String value) {
            addCriterion("permission <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLike(String value) {
            addCriterion("permission like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotLike(String value) {
            addCriterion("permission not like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<String> values) {
            addCriterion("permission in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<String> values) {
            addCriterion("permission not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(String value1, String value2) {
            addCriterion("permission between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(String value1, String value2) {
            addCriterion("permission not between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andBoundTimeIsNull() {
            addCriterion("bound_time is null");
            return (Criteria) this;
        }

        public Criteria andBoundTimeIsNotNull() {
            addCriterion("bound_time is not null");
            return (Criteria) this;
        }

        public Criteria andBoundTimeEqualTo(Date value) {
            addCriterion("bound_time =", value, "boundTime");
            return (Criteria) this;
        }

        public Criteria andBoundTimeNotEqualTo(Date value) {
            addCriterion("bound_time <>", value, "boundTime");
            return (Criteria) this;
        }

        public Criteria andBoundTimeGreaterThan(Date value) {
            addCriterion("bound_time >", value, "boundTime");
            return (Criteria) this;
        }

        public Criteria andBoundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bound_time >=", value, "boundTime");
            return (Criteria) this;
        }

        public Criteria andBoundTimeLessThan(Date value) {
            addCriterion("bound_time <", value, "boundTime");
            return (Criteria) this;
        }

        public Criteria andBoundTimeLessThanOrEqualTo(Date value) {
            addCriterion("bound_time <=", value, "boundTime");
            return (Criteria) this;
        }

        public Criteria andBoundTimeIn(List<Date> values) {
            addCriterion("bound_time in", values, "boundTime");
            return (Criteria) this;
        }

        public Criteria andBoundTimeNotIn(List<Date> values) {
            addCriterion("bound_time not in", values, "boundTime");
            return (Criteria) this;
        }

        public Criteria andBoundTimeBetween(Date value1, Date value2) {
            addCriterion("bound_time between", value1, value2, "boundTime");
            return (Criteria) this;
        }

        public Criteria andBoundTimeNotBetween(Date value1, Date value2) {
            addCriterion("bound_time not between", value1, value2, "boundTime");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIsNull() {
            addCriterion("sync_flag is null");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIsNotNull() {
            addCriterion("sync_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSyncFlagEqualTo(String value) {
            addCriterion("sync_flag =", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotEqualTo(String value) {
            addCriterion("sync_flag <>", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagGreaterThan(String value) {
            addCriterion("sync_flag >", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagGreaterThanOrEqualTo(String value) {
            addCriterion("sync_flag >=", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLessThan(String value) {
            addCriterion("sync_flag <", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLessThanOrEqualTo(String value) {
            addCriterion("sync_flag <=", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLike(String value) {
            addCriterion("sync_flag like", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotLike(String value) {
            addCriterion("sync_flag not like", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIn(List<String> values) {
            addCriterion("sync_flag in", values, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotIn(List<String> values) {
            addCriterion("sync_flag not in", values, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagBetween(String value1, String value2) {
            addCriterion("sync_flag between", value1, value2, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotBetween(String value1, String value2) {
            addCriterion("sync_flag not between", value1, value2, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andIsInitYearIsNull() {
            addCriterion("is_init_year is null");
            return (Criteria) this;
        }

        public Criteria andIsInitYearIsNotNull() {
            addCriterion("is_init_year is not null");
            return (Criteria) this;
        }

        public Criteria andIsInitYearEqualTo(String value) {
            addCriterion("is_init_year =", value, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearNotEqualTo(String value) {
            addCriterion("is_init_year <>", value, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearGreaterThan(String value) {
            addCriterion("is_init_year >", value, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearGreaterThanOrEqualTo(String value) {
            addCriterion("is_init_year >=", value, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearLessThan(String value) {
            addCriterion("is_init_year <", value, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearLessThanOrEqualTo(String value) {
            addCriterion("is_init_year <=", value, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearLike(String value) {
            addCriterion("is_init_year like", value, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearNotLike(String value) {
            addCriterion("is_init_year not like", value, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearIn(List<String> values) {
            addCriterion("is_init_year in", values, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearNotIn(List<String> values) {
            addCriterion("is_init_year not in", values, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearBetween(String value1, String value2) {
            addCriterion("is_init_year between", value1, value2, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andIsInitYearNotBetween(String value1, String value2) {
            addCriterion("is_init_year not between", value1, value2, "isInitYear");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeIsNull() {
            addCriterion("birth_send_time is null");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeIsNotNull() {
            addCriterion("birth_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeEqualTo(Date value) {
            addCriterion("birth_send_time =", value, "birthSendTime");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeNotEqualTo(Date value) {
            addCriterion("birth_send_time <>", value, "birthSendTime");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeGreaterThan(Date value) {
            addCriterion("birth_send_time >", value, "birthSendTime");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("birth_send_time >=", value, "birthSendTime");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeLessThan(Date value) {
            addCriterion("birth_send_time <", value, "birthSendTime");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("birth_send_time <=", value, "birthSendTime");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeIn(List<Date> values) {
            addCriterion("birth_send_time in", values, "birthSendTime");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeNotIn(List<Date> values) {
            addCriterion("birth_send_time not in", values, "birthSendTime");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeBetween(Date value1, Date value2) {
            addCriterion("birth_send_time between", value1, value2, "birthSendTime");
            return (Criteria) this;
        }

        public Criteria andBirthSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("birth_send_time not between", value1, value2, "birthSendTime");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNull() {
            addCriterion("hidden is null");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNotNull() {
            addCriterion("hidden is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenEqualTo(Boolean value) {
            addCriterion("hidden =", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotEqualTo(Boolean value) {
            addCriterion("hidden <>", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThan(Boolean value) {
            addCriterion("hidden >", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hidden >=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThan(Boolean value) {
            addCriterion("hidden <", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThanOrEqualTo(Boolean value) {
            addCriterion("hidden <=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenIn(List<Boolean> values) {
            addCriterion("hidden in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotIn(List<Boolean> values) {
            addCriterion("hidden not in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenBetween(Boolean value1, Boolean value2) {
            addCriterion("hidden between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hidden not between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIsNull() {
            addCriterion("belong_area is null");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIsNotNull() {
            addCriterion("belong_area is not null");
            return (Criteria) this;
        }

        public Criteria andBelongAreaEqualTo(String value) {
            addCriterion("belong_area =", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaNotEqualTo(String value) {
            addCriterion("belong_area <>", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaGreaterThan(String value) {
            addCriterion("belong_area >", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaGreaterThanOrEqualTo(String value) {
            addCriterion("belong_area >=", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaLessThan(String value) {
            addCriterion("belong_area <", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaLessThanOrEqualTo(String value) {
            addCriterion("belong_area <=", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaLike(String value) {
            addCriterion("belong_area like", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaNotLike(String value) {
            addCriterion("belong_area not like", value, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIn(List<String> values) {
            addCriterion("belong_area in", values, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaNotIn(List<String> values) {
            addCriterion("belong_area not in", values, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaBetween(String value1, String value2) {
            addCriterion("belong_area between", value1, value2, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongAreaNotBetween(String value1, String value2) {
            addCriterion("belong_area not between", value1, value2, "belongArea");
            return (Criteria) this;
        }

        public Criteria andBelongRoleIsNull() {
            addCriterion("belong_role is null");
            return (Criteria) this;
        }

        public Criteria andBelongRoleIsNotNull() {
            addCriterion("belong_role is not null");
            return (Criteria) this;
        }

        public Criteria andBelongRoleEqualTo(String value) {
            addCriterion("belong_role =", value, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleNotEqualTo(String value) {
            addCriterion("belong_role <>", value, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleGreaterThan(String value) {
            addCriterion("belong_role >", value, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleGreaterThanOrEqualTo(String value) {
            addCriterion("belong_role >=", value, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleLessThan(String value) {
            addCriterion("belong_role <", value, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleLessThanOrEqualTo(String value) {
            addCriterion("belong_role <=", value, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleLike(String value) {
            addCriterion("belong_role like", value, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleNotLike(String value) {
            addCriterion("belong_role not like", value, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleIn(List<String> values) {
            addCriterion("belong_role in", values, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleNotIn(List<String> values) {
            addCriterion("belong_role not in", values, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleBetween(String value1, String value2) {
            addCriterion("belong_role between", value1, value2, "belongRole");
            return (Criteria) this;
        }

        public Criteria andBelongRoleNotBetween(String value1, String value2) {
            addCriterion("belong_role not between", value1, value2, "belongRole");
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