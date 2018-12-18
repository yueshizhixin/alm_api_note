package com.alm.user.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    /**
     * t_user
     */
    protected String orderByClause;

    /**
     * t_user
     */
    protected boolean distinct;

    /**
     * t_user
     */
    protected List<Criteria> oredCriteria;

    public UserExample() {
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

    /**
     * 用户表 2018-12-18
     */
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

        public Criteria andAccIsNull() {
            addCriterion("acc is null");
            return (Criteria) this;
        }

        public Criteria andAccIsNotNull() {
            addCriterion("acc is not null");
            return (Criteria) this;
        }

        public Criteria andAccEqualTo(String value) {
            addCriterion("acc =", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotEqualTo(String value) {
            addCriterion("acc <>", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccGreaterThan(String value) {
            addCriterion("acc >", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccGreaterThanOrEqualTo(String value) {
            addCriterion("acc >=", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccLessThan(String value) {
            addCriterion("acc <", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccLessThanOrEqualTo(String value) {
            addCriterion("acc <=", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccLike(String value) {
            addCriterion("acc like", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotLike(String value) {
            addCriterion("acc not like", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccIn(List<String> values) {
            addCriterion("acc in", values, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotIn(List<String> values) {
            addCriterion("acc not in", values, "acc");
            return (Criteria) this;
        }

        public Criteria andAccBetween(String value1, String value2) {
            addCriterion("acc between", value1, value2, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotBetween(String value1, String value2) {
            addCriterion("acc not between", value1, value2, "acc");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andSignTypeIsNull() {
            addCriterion("signType is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("signType is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(Byte value) {
            addCriterion("signType =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(Byte value) {
            addCriterion("signType <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(Byte value) {
            addCriterion("signType >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("signType >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(Byte value) {
            addCriterion("signType <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(Byte value) {
            addCriterion("signType <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<Byte> values) {
            addCriterion("signType in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<Byte> values) {
            addCriterion("signType not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(Byte value1, Byte value2) {
            addCriterion("signType between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("signType not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBrithdayIsNull() {
            addCriterion("brithday is null");
            return (Criteria) this;
        }

        public Criteria andBrithdayIsNotNull() {
            addCriterion("brithday is not null");
            return (Criteria) this;
        }

        public Criteria andBrithdayEqualTo(String value) {
            addCriterion("brithday =", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayNotEqualTo(String value) {
            addCriterion("brithday <>", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayGreaterThan(String value) {
            addCriterion("brithday >", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayGreaterThanOrEqualTo(String value) {
            addCriterion("brithday >=", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayLessThan(String value) {
            addCriterion("brithday <", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayLessThanOrEqualTo(String value) {
            addCriterion("brithday <=", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayLike(String value) {
            addCriterion("brithday like", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayNotLike(String value) {
            addCriterion("brithday not like", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayIn(List<String> values) {
            addCriterion("brithday in", values, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayNotIn(List<String> values) {
            addCriterion("brithday not in", values, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayBetween(String value1, String value2) {
            addCriterion("brithday between", value1, value2, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayNotBetween(String value1, String value2) {
            addCriterion("brithday not between", value1, value2, "brithday");
            return (Criteria) this;
        }

        public Criteria andVipLvIsNull() {
            addCriterion("vipLv is null");
            return (Criteria) this;
        }

        public Criteria andVipLvIsNotNull() {
            addCriterion("vipLv is not null");
            return (Criteria) this;
        }

        public Criteria andVipLvEqualTo(Byte value) {
            addCriterion("vipLv =", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvNotEqualTo(Byte value) {
            addCriterion("vipLv <>", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvGreaterThan(Byte value) {
            addCriterion("vipLv >", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvGreaterThanOrEqualTo(Byte value) {
            addCriterion("vipLv >=", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvLessThan(Byte value) {
            addCriterion("vipLv <", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvLessThanOrEqualTo(Byte value) {
            addCriterion("vipLv <=", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvIn(List<Byte> values) {
            addCriterion("vipLv in", values, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvNotIn(List<Byte> values) {
            addCriterion("vipLv not in", values, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvBetween(Byte value1, Byte value2) {
            addCriterion("vipLv between", value1, value2, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvNotBetween(Byte value1, Byte value2) {
            addCriterion("vipLv not between", value1, value2, "vipLv");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeIsNull() {
            addCriterion("latestTime is null");
            return (Criteria) this;
        }

        public Criteria andLatestTimeIsNotNull() {
            addCriterion("latestTime is not null");
            return (Criteria) this;
        }

        public Criteria andLatestTimeEqualTo(Date value) {
            addCriterion("latestTime =", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeNotEqualTo(Date value) {
            addCriterion("latestTime <>", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeGreaterThan(Date value) {
            addCriterion("latestTime >", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("latestTime >=", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeLessThan(Date value) {
            addCriterion("latestTime <", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeLessThanOrEqualTo(Date value) {
            addCriterion("latestTime <=", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeIn(List<Date> values) {
            addCriterion("latestTime in", values, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeNotIn(List<Date> values) {
            addCriterion("latestTime not in", values, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeBetween(Date value1, Date value2) {
            addCriterion("latestTime between", value1, value2, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeNotBetween(Date value1, Date value2) {
            addCriterion("latestTime not between", value1, value2, "latestTime");
            return (Criteria) this;
        }

        public Criteria andIsSignIsNull() {
            addCriterion("isSign is null");
            return (Criteria) this;
        }

        public Criteria andIsSignIsNotNull() {
            addCriterion("isSign is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignEqualTo(Byte value) {
            addCriterion("isSign =", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotEqualTo(Byte value) {
            addCriterion("isSign <>", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignGreaterThan(Byte value) {
            addCriterion("isSign >", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignGreaterThanOrEqualTo(Byte value) {
            addCriterion("isSign >=", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignLessThan(Byte value) {
            addCriterion("isSign <", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignLessThanOrEqualTo(Byte value) {
            addCriterion("isSign <=", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignIn(List<Byte> values) {
            addCriterion("isSign in", values, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotIn(List<Byte> values) {
            addCriterion("isSign not in", values, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignBetween(Byte value1, Byte value2) {
            addCriterion("isSign between", value1, value2, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotBetween(Byte value1, Byte value2) {
            addCriterion("isSign not between", value1, value2, "isSign");
            return (Criteria) this;
        }
    }

    /**
     * t_user
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 用户表 2018-12-18
     */
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