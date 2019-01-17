package com.alm.note.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteExample {
    /**
     * t_note
     */
    protected String orderByClause;

    /**
     * t_note
     */
    protected boolean distinct;

    /**
     * t_note
     */
    protected List<Criteria> oredCriteria;

    public NoteExample() {
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
     * 笔记表 2019-01-17
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIsNull() {
            addCriterion("isPrivate is null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIsNotNull() {
            addCriterion("isPrivate is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateEqualTo(Integer value) {
            addCriterion("isPrivate =", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotEqualTo(Integer value) {
            addCriterion("isPrivate <>", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateGreaterThan(Integer value) {
            addCriterion("isPrivate >", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPrivate >=", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateLessThan(Integer value) {
            addCriterion("isPrivate <", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateLessThanOrEqualTo(Integer value) {
            addCriterion("isPrivate <=", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIn(List<Integer> values) {
            addCriterion("isPrivate in", values, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotIn(List<Integer> values) {
            addCriterion("isPrivate not in", values, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateBetween(Integer value1, Integer value2) {
            addCriterion("isPrivate between", value1, value2, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotBetween(Integer value1, Integer value2) {
            addCriterion("isPrivate not between", value1, value2, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andProfileIsNull() {
            addCriterion("profile is null");
            return (Criteria) this;
        }

        public Criteria andProfileIsNotNull() {
            addCriterion("profile is not null");
            return (Criteria) this;
        }

        public Criteria andProfileEqualTo(String value) {
            addCriterion("profile =", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotEqualTo(String value) {
            addCriterion("profile <>", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThan(String value) {
            addCriterion("profile >", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThanOrEqualTo(String value) {
            addCriterion("profile >=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThan(String value) {
            addCriterion("profile <", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThanOrEqualTo(String value) {
            addCriterion("profile <=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLike(String value) {
            addCriterion("profile like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotLike(String value) {
            addCriterion("profile not like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileIn(List<String> values) {
            addCriterion("profile in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotIn(List<String> values) {
            addCriterion("profile not in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileBetween(String value1, String value2) {
            addCriterion("profile between", value1, value2, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotBetween(String value1, String value2) {
            addCriterion("profile not between", value1, value2, "profile");
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

        public Criteria andTagId1IsNull() {
            addCriterion("tagId1 is null");
            return (Criteria) this;
        }

        public Criteria andTagId1IsNotNull() {
            addCriterion("tagId1 is not null");
            return (Criteria) this;
        }

        public Criteria andTagId1EqualTo(Integer value) {
            addCriterion("tagId1 =", value, "tagId1");
            return (Criteria) this;
        }

        public Criteria andTagId1NotEqualTo(Integer value) {
            addCriterion("tagId1 <>", value, "tagId1");
            return (Criteria) this;
        }

        public Criteria andTagId1GreaterThan(Integer value) {
            addCriterion("tagId1 >", value, "tagId1");
            return (Criteria) this;
        }

        public Criteria andTagId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("tagId1 >=", value, "tagId1");
            return (Criteria) this;
        }

        public Criteria andTagId1LessThan(Integer value) {
            addCriterion("tagId1 <", value, "tagId1");
            return (Criteria) this;
        }

        public Criteria andTagId1LessThanOrEqualTo(Integer value) {
            addCriterion("tagId1 <=", value, "tagId1");
            return (Criteria) this;
        }

        public Criteria andTagId1In(List<Integer> values) {
            addCriterion("tagId1 in", values, "tagId1");
            return (Criteria) this;
        }

        public Criteria andTagId1NotIn(List<Integer> values) {
            addCriterion("tagId1 not in", values, "tagId1");
            return (Criteria) this;
        }

        public Criteria andTagId1Between(Integer value1, Integer value2) {
            addCriterion("tagId1 between", value1, value2, "tagId1");
            return (Criteria) this;
        }

        public Criteria andTagId1NotBetween(Integer value1, Integer value2) {
            addCriterion("tagId1 not between", value1, value2, "tagId1");
            return (Criteria) this;
        }

        public Criteria andTagName1IsNull() {
            addCriterion("tagName1 is null");
            return (Criteria) this;
        }

        public Criteria andTagName1IsNotNull() {
            addCriterion("tagName1 is not null");
            return (Criteria) this;
        }

        public Criteria andTagName1EqualTo(String value) {
            addCriterion("tagName1 =", value, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1NotEqualTo(String value) {
            addCriterion("tagName1 <>", value, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1GreaterThan(String value) {
            addCriterion("tagName1 >", value, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1GreaterThanOrEqualTo(String value) {
            addCriterion("tagName1 >=", value, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1LessThan(String value) {
            addCriterion("tagName1 <", value, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1LessThanOrEqualTo(String value) {
            addCriterion("tagName1 <=", value, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1Like(String value) {
            addCriterion("tagName1 like", value, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1NotLike(String value) {
            addCriterion("tagName1 not like", value, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1In(List<String> values) {
            addCriterion("tagName1 in", values, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1NotIn(List<String> values) {
            addCriterion("tagName1 not in", values, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1Between(String value1, String value2) {
            addCriterion("tagName1 between", value1, value2, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagName1NotBetween(String value1, String value2) {
            addCriterion("tagName1 not between", value1, value2, "tagName1");
            return (Criteria) this;
        }

        public Criteria andTagId2IsNull() {
            addCriterion("tagId2 is null");
            return (Criteria) this;
        }

        public Criteria andTagId2IsNotNull() {
            addCriterion("tagId2 is not null");
            return (Criteria) this;
        }

        public Criteria andTagId2EqualTo(Integer value) {
            addCriterion("tagId2 =", value, "tagId2");
            return (Criteria) this;
        }

        public Criteria andTagId2NotEqualTo(Integer value) {
            addCriterion("tagId2 <>", value, "tagId2");
            return (Criteria) this;
        }

        public Criteria andTagId2GreaterThan(Integer value) {
            addCriterion("tagId2 >", value, "tagId2");
            return (Criteria) this;
        }

        public Criteria andTagId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("tagId2 >=", value, "tagId2");
            return (Criteria) this;
        }

        public Criteria andTagId2LessThan(Integer value) {
            addCriterion("tagId2 <", value, "tagId2");
            return (Criteria) this;
        }

        public Criteria andTagId2LessThanOrEqualTo(Integer value) {
            addCriterion("tagId2 <=", value, "tagId2");
            return (Criteria) this;
        }

        public Criteria andTagId2In(List<Integer> values) {
            addCriterion("tagId2 in", values, "tagId2");
            return (Criteria) this;
        }

        public Criteria andTagId2NotIn(List<Integer> values) {
            addCriterion("tagId2 not in", values, "tagId2");
            return (Criteria) this;
        }

        public Criteria andTagId2Between(Integer value1, Integer value2) {
            addCriterion("tagId2 between", value1, value2, "tagId2");
            return (Criteria) this;
        }

        public Criteria andTagId2NotBetween(Integer value1, Integer value2) {
            addCriterion("tagId2 not between", value1, value2, "tagId2");
            return (Criteria) this;
        }

        public Criteria andTagName2IsNull() {
            addCriterion("tagName2 is null");
            return (Criteria) this;
        }

        public Criteria andTagName2IsNotNull() {
            addCriterion("tagName2 is not null");
            return (Criteria) this;
        }

        public Criteria andTagName2EqualTo(String value) {
            addCriterion("tagName2 =", value, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2NotEqualTo(String value) {
            addCriterion("tagName2 <>", value, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2GreaterThan(String value) {
            addCriterion("tagName2 >", value, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2GreaterThanOrEqualTo(String value) {
            addCriterion("tagName2 >=", value, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2LessThan(String value) {
            addCriterion("tagName2 <", value, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2LessThanOrEqualTo(String value) {
            addCriterion("tagName2 <=", value, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2Like(String value) {
            addCriterion("tagName2 like", value, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2NotLike(String value) {
            addCriterion("tagName2 not like", value, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2In(List<String> values) {
            addCriterion("tagName2 in", values, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2NotIn(List<String> values) {
            addCriterion("tagName2 not in", values, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2Between(String value1, String value2) {
            addCriterion("tagName2 between", value1, value2, "tagName2");
            return (Criteria) this;
        }

        public Criteria andTagName2NotBetween(String value1, String value2) {
            addCriterion("tagName2 not between", value1, value2, "tagName2");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("readCount is null");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("readCount is not null");
            return (Criteria) this;
        }

        public Criteria andReadCountEqualTo(Integer value) {
            addCriterion("readCount =", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotEqualTo(Integer value) {
            addCriterion("readCount <>", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThan(Integer value) {
            addCriterion("readCount >", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("readCount >=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThan(Integer value) {
            addCriterion("readCount <", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("readCount <=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIn(List<Integer> values) {
            addCriterion("readCount in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotIn(List<Integer> values) {
            addCriterion("readCount not in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountBetween(Integer value1, Integer value2) {
            addCriterion("readCount between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("readCount not between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andCommenCountIsNull() {
            addCriterion("commenCount is null");
            return (Criteria) this;
        }

        public Criteria andCommenCountIsNotNull() {
            addCriterion("commenCount is not null");
            return (Criteria) this;
        }

        public Criteria andCommenCountEqualTo(Integer value) {
            addCriterion("commenCount =", value, "commenCount");
            return (Criteria) this;
        }

        public Criteria andCommenCountNotEqualTo(Integer value) {
            addCriterion("commenCount <>", value, "commenCount");
            return (Criteria) this;
        }

        public Criteria andCommenCountGreaterThan(Integer value) {
            addCriterion("commenCount >", value, "commenCount");
            return (Criteria) this;
        }

        public Criteria andCommenCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commenCount >=", value, "commenCount");
            return (Criteria) this;
        }

        public Criteria andCommenCountLessThan(Integer value) {
            addCriterion("commenCount <", value, "commenCount");
            return (Criteria) this;
        }

        public Criteria andCommenCountLessThanOrEqualTo(Integer value) {
            addCriterion("commenCount <=", value, "commenCount");
            return (Criteria) this;
        }

        public Criteria andCommenCountIn(List<Integer> values) {
            addCriterion("commenCount in", values, "commenCount");
            return (Criteria) this;
        }

        public Criteria andCommenCountNotIn(List<Integer> values) {
            addCriterion("commenCount not in", values, "commenCount");
            return (Criteria) this;
        }

        public Criteria andCommenCountBetween(Integer value1, Integer value2) {
            addCriterion("commenCount between", value1, value2, "commenCount");
            return (Criteria) this;
        }

        public Criteria andCommenCountNotBetween(Integer value1, Integer value2) {
            addCriterion("commenCount not between", value1, value2, "commenCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNull() {
            addCriterion("shareCount is null");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNotNull() {
            addCriterion("shareCount is not null");
            return (Criteria) this;
        }

        public Criteria andShareCountEqualTo(Integer value) {
            addCriterion("shareCount =", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotEqualTo(Integer value) {
            addCriterion("shareCount <>", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThan(Integer value) {
            addCriterion("shareCount >", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("shareCount >=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThan(Integer value) {
            addCriterion("shareCount <", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThanOrEqualTo(Integer value) {
            addCriterion("shareCount <=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIn(List<Integer> values) {
            addCriterion("shareCount in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotIn(List<Integer> values) {
            addCriterion("shareCount not in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountBetween(Integer value1, Integer value2) {
            addCriterion("shareCount between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotBetween(Integer value1, Integer value2) {
            addCriterion("shareCount not between", value1, value2, "shareCount");
            return (Criteria) this;
        }
    }

    /**
     * t_note
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 笔记表 2019-01-17
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