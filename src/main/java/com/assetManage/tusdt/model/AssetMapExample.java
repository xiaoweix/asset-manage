package com.assetManage.tusdt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetMapExample() {
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

        public Criteria andMapNameIsNull() {
            addCriterion("map_name is null");
            return (Criteria) this;
        }

        public Criteria andMapNameIsNotNull() {
            addCriterion("map_name is not null");
            return (Criteria) this;
        }

        public Criteria andMapNameEqualTo(String value) {
            addCriterion("map_name =", value, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameNotEqualTo(String value) {
            addCriterion("map_name <>", value, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameGreaterThan(String value) {
            addCriterion("map_name >", value, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameGreaterThanOrEqualTo(String value) {
            addCriterion("map_name >=", value, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameLessThan(String value) {
            addCriterion("map_name <", value, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameLessThanOrEqualTo(String value) {
            addCriterion("map_name <=", value, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameLike(String value) {
            addCriterion("map_name like", value, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameNotLike(String value) {
            addCriterion("map_name not like", value, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameIn(List<String> values) {
            addCriterion("map_name in", values, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameNotIn(List<String> values) {
            addCriterion("map_name not in", values, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameBetween(String value1, String value2) {
            addCriterion("map_name between", value1, value2, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapNameNotBetween(String value1, String value2) {
            addCriterion("map_name not between", value1, value2, "mapName");
            return (Criteria) this;
        }

        public Criteria andMapXIsNull() {
            addCriterion("map_x is null");
            return (Criteria) this;
        }

        public Criteria andMapXIsNotNull() {
            addCriterion("map_x is not null");
            return (Criteria) this;
        }

        public Criteria andMapXEqualTo(Integer value) {
            addCriterion("map_x =", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXNotEqualTo(Integer value) {
            addCriterion("map_x <>", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXGreaterThan(Integer value) {
            addCriterion("map_x >", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXGreaterThanOrEqualTo(Integer value) {
            addCriterion("map_x >=", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXLessThan(Integer value) {
            addCriterion("map_x <", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXLessThanOrEqualTo(Integer value) {
            addCriterion("map_x <=", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXIn(List<Integer> values) {
            addCriterion("map_x in", values, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXNotIn(List<Integer> values) {
            addCriterion("map_x not in", values, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXBetween(Integer value1, Integer value2) {
            addCriterion("map_x between", value1, value2, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXNotBetween(Integer value1, Integer value2) {
            addCriterion("map_x not between", value1, value2, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapYIsNull() {
            addCriterion("map_y is null");
            return (Criteria) this;
        }

        public Criteria andMapYIsNotNull() {
            addCriterion("map_y is not null");
            return (Criteria) this;
        }

        public Criteria andMapYEqualTo(Integer value) {
            addCriterion("map_y =", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYNotEqualTo(Integer value) {
            addCriterion("map_y <>", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYGreaterThan(Integer value) {
            addCriterion("map_y >", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYGreaterThanOrEqualTo(Integer value) {
            addCriterion("map_y >=", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYLessThan(Integer value) {
            addCriterion("map_y <", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYLessThanOrEqualTo(Integer value) {
            addCriterion("map_y <=", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYIn(List<Integer> values) {
            addCriterion("map_y in", values, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYNotIn(List<Integer> values) {
            addCriterion("map_y not in", values, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYBetween(Integer value1, Integer value2) {
            addCriterion("map_y between", value1, value2, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYNotBetween(Integer value1, Integer value2) {
            addCriterion("map_y not between", value1, value2, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapLengthIsNull() {
            addCriterion("map_length is null");
            return (Criteria) this;
        }

        public Criteria andMapLengthIsNotNull() {
            addCriterion("map_length is not null");
            return (Criteria) this;
        }

        public Criteria andMapLengthEqualTo(Integer value) {
            addCriterion("map_length =", value, "mapLength");
            return (Criteria) this;
        }

        public Criteria andMapLengthNotEqualTo(Integer value) {
            addCriterion("map_length <>", value, "mapLength");
            return (Criteria) this;
        }

        public Criteria andMapLengthGreaterThan(Integer value) {
            addCriterion("map_length >", value, "mapLength");
            return (Criteria) this;
        }

        public Criteria andMapLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("map_length >=", value, "mapLength");
            return (Criteria) this;
        }

        public Criteria andMapLengthLessThan(Integer value) {
            addCriterion("map_length <", value, "mapLength");
            return (Criteria) this;
        }

        public Criteria andMapLengthLessThanOrEqualTo(Integer value) {
            addCriterion("map_length <=", value, "mapLength");
            return (Criteria) this;
        }

        public Criteria andMapLengthIn(List<Integer> values) {
            addCriterion("map_length in", values, "mapLength");
            return (Criteria) this;
        }

        public Criteria andMapLengthNotIn(List<Integer> values) {
            addCriterion("map_length not in", values, "mapLength");
            return (Criteria) this;
        }

        public Criteria andMapLengthBetween(Integer value1, Integer value2) {
            addCriterion("map_length between", value1, value2, "mapLength");
            return (Criteria) this;
        }

        public Criteria andMapLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("map_length not between", value1, value2, "mapLength");
            return (Criteria) this;
        }

        public Criteria andMapWidthIsNull() {
            addCriterion("map_width is null");
            return (Criteria) this;
        }

        public Criteria andMapWidthIsNotNull() {
            addCriterion("map_width is not null");
            return (Criteria) this;
        }

        public Criteria andMapWidthEqualTo(Integer value) {
            addCriterion("map_width =", value, "mapWidth");
            return (Criteria) this;
        }

        public Criteria andMapWidthNotEqualTo(Integer value) {
            addCriterion("map_width <>", value, "mapWidth");
            return (Criteria) this;
        }

        public Criteria andMapWidthGreaterThan(Integer value) {
            addCriterion("map_width >", value, "mapWidth");
            return (Criteria) this;
        }

        public Criteria andMapWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("map_width >=", value, "mapWidth");
            return (Criteria) this;
        }

        public Criteria andMapWidthLessThan(Integer value) {
            addCriterion("map_width <", value, "mapWidth");
            return (Criteria) this;
        }

        public Criteria andMapWidthLessThanOrEqualTo(Integer value) {
            addCriterion("map_width <=", value, "mapWidth");
            return (Criteria) this;
        }

        public Criteria andMapWidthIn(List<Integer> values) {
            addCriterion("map_width in", values, "mapWidth");
            return (Criteria) this;
        }

        public Criteria andMapWidthNotIn(List<Integer> values) {
            addCriterion("map_width not in", values, "mapWidth");
            return (Criteria) this;
        }

        public Criteria andMapWidthBetween(Integer value1, Integer value2) {
            addCriterion("map_width between", value1, value2, "mapWidth");
            return (Criteria) this;
        }

        public Criteria andMapWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("map_width not between", value1, value2, "mapWidth");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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