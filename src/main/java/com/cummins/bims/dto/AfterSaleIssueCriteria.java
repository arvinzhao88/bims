package com.cummins.bims.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AfterSaleIssueCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AfterSaleIssueCriteria() {
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

        public Criteria andInputPersonNameIsNull() {
            addCriterion("input_person_name is null");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameIsNotNull() {
            addCriterion("input_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameEqualTo(String value) {
            addCriterion("input_person_name =", value, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameNotEqualTo(String value) {
            addCriterion("input_person_name <>", value, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameGreaterThan(String value) {
            addCriterion("input_person_name >", value, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("input_person_name >=", value, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameLessThan(String value) {
            addCriterion("input_person_name <", value, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameLessThanOrEqualTo(String value) {
            addCriterion("input_person_name <=", value, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameLike(String value) {
            addCriterion("input_person_name like", value, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameNotLike(String value) {
            addCriterion("input_person_name not like", value, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameIn(List<String> values) {
            addCriterion("input_person_name in", values, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameNotIn(List<String> values) {
            addCriterion("input_person_name not in", values, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameBetween(String value1, String value2) {
            addCriterion("input_person_name between", value1, value2, "inputPersonName");
            return (Criteria) this;
        }

        public Criteria andInputPersonNameNotBetween(String value1, String value2) {
            addCriterion("input_person_name not between", value1, value2, "inputPersonName");
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

        public Criteria andInformationSourceIsNull() {
            addCriterion("information_source is null");
            return (Criteria) this;
        }

        public Criteria andInformationSourceIsNotNull() {
            addCriterion("information_source is not null");
            return (Criteria) this;
        }

        public Criteria andInformationSourceEqualTo(String value) {
            addCriterion("information_source =", value, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceNotEqualTo(String value) {
            addCriterion("information_source <>", value, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceGreaterThan(String value) {
            addCriterion("information_source >", value, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceGreaterThanOrEqualTo(String value) {
            addCriterion("information_source >=", value, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceLessThan(String value) {
            addCriterion("information_source <", value, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceLessThanOrEqualTo(String value) {
            addCriterion("information_source <=", value, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceLike(String value) {
            addCriterion("information_source like", value, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceNotLike(String value) {
            addCriterion("information_source not like", value, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceIn(List<String> values) {
            addCriterion("information_source in", values, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceNotIn(List<String> values) {
            addCriterion("information_source not in", values, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceBetween(String value1, String value2) {
            addCriterion("information_source between", value1, value2, "informationSource");
            return (Criteria) this;
        }

        public Criteria andInformationSourceNotBetween(String value1, String value2) {
            addCriterion("information_source not between", value1, value2, "informationSource");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentIsNull() {
            addCriterion("vehicle_equipment is null");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentIsNotNull() {
            addCriterion("vehicle_equipment is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentEqualTo(String value) {
            addCriterion("vehicle_equipment =", value, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentNotEqualTo(String value) {
            addCriterion("vehicle_equipment <>", value, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentGreaterThan(String value) {
            addCriterion("vehicle_equipment >", value, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_equipment >=", value, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentLessThan(String value) {
            addCriterion("vehicle_equipment <", value, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentLessThanOrEqualTo(String value) {
            addCriterion("vehicle_equipment <=", value, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentLike(String value) {
            addCriterion("vehicle_equipment like", value, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentNotLike(String value) {
            addCriterion("vehicle_equipment not like", value, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentIn(List<String> values) {
            addCriterion("vehicle_equipment in", values, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentNotIn(List<String> values) {
            addCriterion("vehicle_equipment not in", values, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentBetween(String value1, String value2) {
            addCriterion("vehicle_equipment between", value1, value2, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleEquipmentNotBetween(String value1, String value2) {
            addCriterion("vehicle_equipment not between", value1, value2, "vehicleEquipment");
            return (Criteria) this;
        }

        public Criteria andVehicleVinIsNull() {
            addCriterion("vehicle_vin is null");
            return (Criteria) this;
        }

        public Criteria andVehicleVinIsNotNull() {
            addCriterion("vehicle_vin is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleVinEqualTo(String value) {
            addCriterion("vehicle_vin =", value, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinNotEqualTo(String value) {
            addCriterion("vehicle_vin <>", value, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinGreaterThan(String value) {
            addCriterion("vehicle_vin >", value, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_vin >=", value, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinLessThan(String value) {
            addCriterion("vehicle_vin <", value, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinLessThanOrEqualTo(String value) {
            addCriterion("vehicle_vin <=", value, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinLike(String value) {
            addCriterion("vehicle_vin like", value, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinNotLike(String value) {
            addCriterion("vehicle_vin not like", value, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinIn(List<String> values) {
            addCriterion("vehicle_vin in", values, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinNotIn(List<String> values) {
            addCriterion("vehicle_vin not in", values, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinBetween(String value1, String value2) {
            addCriterion("vehicle_vin between", value1, value2, "vehicleVin");
            return (Criteria) this;
        }

        public Criteria andVehicleVinNotBetween(String value1, String value2) {
            addCriterion("vehicle_vin not between", value1, value2, "vehicleVin");
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

        public Criteria andEngineSeriesNoIsNull() {
            addCriterion("engine_series_no is null");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoIsNotNull() {
            addCriterion("engine_series_no is not null");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoEqualTo(String value) {
            addCriterion("engine_series_no =", value, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoNotEqualTo(String value) {
            addCriterion("engine_series_no <>", value, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoGreaterThan(String value) {
            addCriterion("engine_series_no >", value, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoGreaterThanOrEqualTo(String value) {
            addCriterion("engine_series_no >=", value, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoLessThan(String value) {
            addCriterion("engine_series_no <", value, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoLessThanOrEqualTo(String value) {
            addCriterion("engine_series_no <=", value, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoLike(String value) {
            addCriterion("engine_series_no like", value, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoNotLike(String value) {
            addCriterion("engine_series_no not like", value, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoIn(List<String> values) {
            addCriterion("engine_series_no in", values, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoNotIn(List<String> values) {
            addCriterion("engine_series_no not in", values, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoBetween(String value1, String value2) {
            addCriterion("engine_series_no between", value1, value2, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andEngineSeriesNoNotBetween(String value1, String value2) {
            addCriterion("engine_series_no not between", value1, value2, "engineSeriesNo");
            return (Criteria) this;
        }

        public Criteria andShopOrderIsNull() {
            addCriterion("shop_order is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderIsNotNull() {
            addCriterion("shop_order is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderEqualTo(String value) {
            addCriterion("shop_order =", value, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderNotEqualTo(String value) {
            addCriterion("shop_order <>", value, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderGreaterThan(String value) {
            addCriterion("shop_order >", value, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderGreaterThanOrEqualTo(String value) {
            addCriterion("shop_order >=", value, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderLessThan(String value) {
            addCriterion("shop_order <", value, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderLessThanOrEqualTo(String value) {
            addCriterion("shop_order <=", value, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderLike(String value) {
            addCriterion("shop_order like", value, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderNotLike(String value) {
            addCriterion("shop_order not like", value, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderIn(List<String> values) {
            addCriterion("shop_order in", values, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderNotIn(List<String> values) {
            addCriterion("shop_order not in", values, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderBetween(String value1, String value2) {
            addCriterion("shop_order between", value1, value2, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andShopOrderNotBetween(String value1, String value2) {
            addCriterion("shop_order not between", value1, value2, "shopOrder");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateIsNull() {
            addCriterion("engine_build_date is null");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateIsNotNull() {
            addCriterion("engine_build_date is not null");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateEqualTo(String value) {
            addCriterion("engine_build_date =", value, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateNotEqualTo(String value) {
            addCriterion("engine_build_date <>", value, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateGreaterThan(String value) {
            addCriterion("engine_build_date >", value, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateGreaterThanOrEqualTo(String value) {
            addCriterion("engine_build_date >=", value, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateLessThan(String value) {
            addCriterion("engine_build_date <", value, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateLessThanOrEqualTo(String value) {
            addCriterion("engine_build_date <=", value, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateLike(String value) {
            addCriterion("engine_build_date like", value, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateNotLike(String value) {
            addCriterion("engine_build_date not like", value, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateIn(List<String> values) {
            addCriterion("engine_build_date in", values, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateNotIn(List<String> values) {
            addCriterion("engine_build_date not in", values, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateBetween(String value1, String value2) {
            addCriterion("engine_build_date between", value1, value2, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andEngineBuildDateNotBetween(String value1, String value2) {
            addCriterion("engine_build_date not between", value1, value2, "engineBuildDate");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNull() {
            addCriterion("dealer_name is null");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNotNull() {
            addCriterion("dealer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNameEqualTo(String value) {
            addCriterion("dealer_name =", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotEqualTo(String value) {
            addCriterion("dealer_name <>", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThan(String value) {
            addCriterion("dealer_name >", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_name >=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThan(String value) {
            addCriterion("dealer_name <", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThanOrEqualTo(String value) {
            addCriterion("dealer_name <=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLike(String value) {
            addCriterion("dealer_name like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotLike(String value) {
            addCriterion("dealer_name not like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIn(List<String> values) {
            addCriterion("dealer_name in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotIn(List<String> values) {
            addCriterion("dealer_name not in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameBetween(String value1, String value2) {
            addCriterion("dealer_name between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotBetween(String value1, String value2) {
            addCriterion("dealer_name not between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerContactIsNull() {
            addCriterion("dealer_contact is null");
            return (Criteria) this;
        }

        public Criteria andDealerContactIsNotNull() {
            addCriterion("dealer_contact is not null");
            return (Criteria) this;
        }

        public Criteria andDealerContactEqualTo(String value) {
            addCriterion("dealer_contact =", value, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactNotEqualTo(String value) {
            addCriterion("dealer_contact <>", value, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactGreaterThan(String value) {
            addCriterion("dealer_contact >", value, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_contact >=", value, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactLessThan(String value) {
            addCriterion("dealer_contact <", value, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactLessThanOrEqualTo(String value) {
            addCriterion("dealer_contact <=", value, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactLike(String value) {
            addCriterion("dealer_contact like", value, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactNotLike(String value) {
            addCriterion("dealer_contact not like", value, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactIn(List<String> values) {
            addCriterion("dealer_contact in", values, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactNotIn(List<String> values) {
            addCriterion("dealer_contact not in", values, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactBetween(String value1, String value2) {
            addCriterion("dealer_contact between", value1, value2, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andDealerContactNotBetween(String value1, String value2) {
            addCriterion("dealer_contact not between", value1, value2, "dealerContact");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateIsNull() {
            addCriterion("vehicle_build_date is null");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateIsNotNull() {
            addCriterion("vehicle_build_date is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateEqualTo(String value) {
            addCriterion("vehicle_build_date =", value, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateNotEqualTo(String value) {
            addCriterion("vehicle_build_date <>", value, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateGreaterThan(String value) {
            addCriterion("vehicle_build_date >", value, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_build_date >=", value, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateLessThan(String value) {
            addCriterion("vehicle_build_date <", value, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateLessThanOrEqualTo(String value) {
            addCriterion("vehicle_build_date <=", value, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateLike(String value) {
            addCriterion("vehicle_build_date like", value, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateNotLike(String value) {
            addCriterion("vehicle_build_date not like", value, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateIn(List<String> values) {
            addCriterion("vehicle_build_date in", values, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateNotIn(List<String> values) {
            addCriterion("vehicle_build_date not in", values, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateBetween(String value1, String value2) {
            addCriterion("vehicle_build_date between", value1, value2, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleBuildDateNotBetween(String value1, String value2) {
            addCriterion("vehicle_build_date not between", value1, value2, "vehicleBuildDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateIsNull() {
            addCriterion("vehicle_sale_date is null");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateIsNotNull() {
            addCriterion("vehicle_sale_date is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateEqualTo(String value) {
            addCriterion("vehicle_sale_date =", value, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateNotEqualTo(String value) {
            addCriterion("vehicle_sale_date <>", value, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateGreaterThan(String value) {
            addCriterion("vehicle_sale_date >", value, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_sale_date >=", value, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateLessThan(String value) {
            addCriterion("vehicle_sale_date <", value, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateLessThanOrEqualTo(String value) {
            addCriterion("vehicle_sale_date <=", value, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateLike(String value) {
            addCriterion("vehicle_sale_date like", value, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateNotLike(String value) {
            addCriterion("vehicle_sale_date not like", value, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateIn(List<String> values) {
            addCriterion("vehicle_sale_date in", values, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateNotIn(List<String> values) {
            addCriterion("vehicle_sale_date not in", values, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateBetween(String value1, String value2) {
            addCriterion("vehicle_sale_date between", value1, value2, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andVehicleSaleDateNotBetween(String value1, String value2) {
            addCriterion("vehicle_sale_date not between", value1, value2, "vehicleSaleDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateIsNull() {
            addCriterion("failure_date is null");
            return (Criteria) this;
        }

        public Criteria andFailureDateIsNotNull() {
            addCriterion("failure_date is not null");
            return (Criteria) this;
        }

        public Criteria andFailureDateEqualTo(String value) {
            addCriterion("failure_date =", value, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateNotEqualTo(String value) {
            addCriterion("failure_date <>", value, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateGreaterThan(String value) {
            addCriterion("failure_date >", value, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateGreaterThanOrEqualTo(String value) {
            addCriterion("failure_date >=", value, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateLessThan(String value) {
            addCriterion("failure_date <", value, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateLessThanOrEqualTo(String value) {
            addCriterion("failure_date <=", value, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateLike(String value) {
            addCriterion("failure_date like", value, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateNotLike(String value) {
            addCriterion("failure_date not like", value, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateIn(List<String> values) {
            addCriterion("failure_date in", values, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateNotIn(List<String> values) {
            addCriterion("failure_date not in", values, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateBetween(String value1, String value2) {
            addCriterion("failure_date between", value1, value2, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureDateNotBetween(String value1, String value2) {
            addCriterion("failure_date not between", value1, value2, "failureDate");
            return (Criteria) this;
        }

        public Criteria andFailureMileageIsNull() {
            addCriterion("failure_mileage is null");
            return (Criteria) this;
        }

        public Criteria andFailureMileageIsNotNull() {
            addCriterion("failure_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andFailureMileageEqualTo(String value) {
            addCriterion("failure_mileage =", value, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageNotEqualTo(String value) {
            addCriterion("failure_mileage <>", value, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageGreaterThan(String value) {
            addCriterion("failure_mileage >", value, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageGreaterThanOrEqualTo(String value) {
            addCriterion("failure_mileage >=", value, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageLessThan(String value) {
            addCriterion("failure_mileage <", value, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageLessThanOrEqualTo(String value) {
            addCriterion("failure_mileage <=", value, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageLike(String value) {
            addCriterion("failure_mileage like", value, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageNotLike(String value) {
            addCriterion("failure_mileage not like", value, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageIn(List<String> values) {
            addCriterion("failure_mileage in", values, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageNotIn(List<String> values) {
            addCriterion("failure_mileage not in", values, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageBetween(String value1, String value2) {
            addCriterion("failure_mileage between", value1, value2, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureMileageNotBetween(String value1, String value2) {
            addCriterion("failure_mileage not between", value1, value2, "failureMileage");
            return (Criteria) this;
        }

        public Criteria andFailureNumIsNull() {
            addCriterion("failure_num is null");
            return (Criteria) this;
        }

        public Criteria andFailureNumIsNotNull() {
            addCriterion("failure_num is not null");
            return (Criteria) this;
        }

        public Criteria andFailureNumEqualTo(String value) {
            addCriterion("failure_num =", value, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumNotEqualTo(String value) {
            addCriterion("failure_num <>", value, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumGreaterThan(String value) {
            addCriterion("failure_num >", value, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumGreaterThanOrEqualTo(String value) {
            addCriterion("failure_num >=", value, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumLessThan(String value) {
            addCriterion("failure_num <", value, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumLessThanOrEqualTo(String value) {
            addCriterion("failure_num <=", value, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumLike(String value) {
            addCriterion("failure_num like", value, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumNotLike(String value) {
            addCriterion("failure_num not like", value, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumIn(List<String> values) {
            addCriterion("failure_num in", values, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumNotIn(List<String> values) {
            addCriterion("failure_num not in", values, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumBetween(String value1, String value2) {
            addCriterion("failure_num between", value1, value2, "failureNum");
            return (Criteria) this;
        }

        public Criteria andFailureNumNotBetween(String value1, String value2) {
            addCriterion("failure_num not between", value1, value2, "failureNum");
            return (Criteria) this;
        }

        public Criteria andRepairLocationIsNull() {
            addCriterion("repair_location is null");
            return (Criteria) this;
        }

        public Criteria andRepairLocationIsNotNull() {
            addCriterion("repair_location is not null");
            return (Criteria) this;
        }

        public Criteria andRepairLocationEqualTo(String value) {
            addCriterion("repair_location =", value, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationNotEqualTo(String value) {
            addCriterion("repair_location <>", value, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationGreaterThan(String value) {
            addCriterion("repair_location >", value, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationGreaterThanOrEqualTo(String value) {
            addCriterion("repair_location >=", value, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationLessThan(String value) {
            addCriterion("repair_location <", value, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationLessThanOrEqualTo(String value) {
            addCriterion("repair_location <=", value, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationLike(String value) {
            addCriterion("repair_location like", value, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationNotLike(String value) {
            addCriterion("repair_location not like", value, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationIn(List<String> values) {
            addCriterion("repair_location in", values, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationNotIn(List<String> values) {
            addCriterion("repair_location not in", values, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationBetween(String value1, String value2) {
            addCriterion("repair_location between", value1, value2, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andRepairLocationNotBetween(String value1, String value2) {
            addCriterion("repair_location not between", value1, value2, "repairLocation");
            return (Criteria) this;
        }

        public Criteria andUsingConditionIsNull() {
            addCriterion("using_condition is null");
            return (Criteria) this;
        }

        public Criteria andUsingConditionIsNotNull() {
            addCriterion("using_condition is not null");
            return (Criteria) this;
        }

        public Criteria andUsingConditionEqualTo(String value) {
            addCriterion("using_condition =", value, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionNotEqualTo(String value) {
            addCriterion("using_condition <>", value, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionGreaterThan(String value) {
            addCriterion("using_condition >", value, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionGreaterThanOrEqualTo(String value) {
            addCriterion("using_condition >=", value, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionLessThan(String value) {
            addCriterion("using_condition <", value, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionLessThanOrEqualTo(String value) {
            addCriterion("using_condition <=", value, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionLike(String value) {
            addCriterion("using_condition like", value, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionNotLike(String value) {
            addCriterion("using_condition not like", value, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionIn(List<String> values) {
            addCriterion("using_condition in", values, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionNotIn(List<String> values) {
            addCriterion("using_condition not in", values, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionBetween(String value1, String value2) {
            addCriterion("using_condition between", value1, value2, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andUsingConditionNotBetween(String value1, String value2) {
            addCriterion("using_condition not between", value1, value2, "usingCondition");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("customer_type like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("customer_type not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andFaultDescIsNull() {
            addCriterion("fault_desc is null");
            return (Criteria) this;
        }

        public Criteria andFaultDescIsNotNull() {
            addCriterion("fault_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFaultDescEqualTo(String value) {
            addCriterion("fault_desc =", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescNotEqualTo(String value) {
            addCriterion("fault_desc <>", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescGreaterThan(String value) {
            addCriterion("fault_desc >", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescGreaterThanOrEqualTo(String value) {
            addCriterion("fault_desc >=", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescLessThan(String value) {
            addCriterion("fault_desc <", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescLessThanOrEqualTo(String value) {
            addCriterion("fault_desc <=", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescLike(String value) {
            addCriterion("fault_desc like", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescNotLike(String value) {
            addCriterion("fault_desc not like", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescIn(List<String> values) {
            addCriterion("fault_desc in", values, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescNotIn(List<String> values) {
            addCriterion("fault_desc not in", values, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescBetween(String value1, String value2) {
            addCriterion("fault_desc between", value1, value2, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescNotBetween(String value1, String value2) {
            addCriterion("fault_desc not between", value1, value2, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultPartIsNull() {
            addCriterion("fault_part is null");
            return (Criteria) this;
        }

        public Criteria andFaultPartIsNotNull() {
            addCriterion("fault_part is not null");
            return (Criteria) this;
        }

        public Criteria andFaultPartEqualTo(String value) {
            addCriterion("fault_part =", value, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartNotEqualTo(String value) {
            addCriterion("fault_part <>", value, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartGreaterThan(String value) {
            addCriterion("fault_part >", value, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartGreaterThanOrEqualTo(String value) {
            addCriterion("fault_part >=", value, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartLessThan(String value) {
            addCriterion("fault_part <", value, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartLessThanOrEqualTo(String value) {
            addCriterion("fault_part <=", value, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartLike(String value) {
            addCriterion("fault_part like", value, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartNotLike(String value) {
            addCriterion("fault_part not like", value, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartIn(List<String> values) {
            addCriterion("fault_part in", values, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartNotIn(List<String> values) {
            addCriterion("fault_part not in", values, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartBetween(String value1, String value2) {
            addCriterion("fault_part between", value1, value2, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFaultPartNotBetween(String value1, String value2) {
            addCriterion("fault_part not between", value1, value2, "faultPart");
            return (Criteria) this;
        }

        public Criteria andFailureModeIsNull() {
            addCriterion("failure_mode is null");
            return (Criteria) this;
        }

        public Criteria andFailureModeIsNotNull() {
            addCriterion("failure_mode is not null");
            return (Criteria) this;
        }

        public Criteria andFailureModeEqualTo(String value) {
            addCriterion("failure_mode =", value, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeNotEqualTo(String value) {
            addCriterion("failure_mode <>", value, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeGreaterThan(String value) {
            addCriterion("failure_mode >", value, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeGreaterThanOrEqualTo(String value) {
            addCriterion("failure_mode >=", value, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeLessThan(String value) {
            addCriterion("failure_mode <", value, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeLessThanOrEqualTo(String value) {
            addCriterion("failure_mode <=", value, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeLike(String value) {
            addCriterion("failure_mode like", value, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeNotLike(String value) {
            addCriterion("failure_mode not like", value, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeIn(List<String> values) {
            addCriterion("failure_mode in", values, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeNotIn(List<String> values) {
            addCriterion("failure_mode not in", values, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeBetween(String value1, String value2) {
            addCriterion("failure_mode between", value1, value2, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFailureModeNotBetween(String value1, String value2) {
            addCriterion("failure_mode not between", value1, value2, "failureMode");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoIsNull() {
            addCriterion("fault_part_no is null");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoIsNotNull() {
            addCriterion("fault_part_no is not null");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoEqualTo(String value) {
            addCriterion("fault_part_no =", value, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoNotEqualTo(String value) {
            addCriterion("fault_part_no <>", value, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoGreaterThan(String value) {
            addCriterion("fault_part_no >", value, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoGreaterThanOrEqualTo(String value) {
            addCriterion("fault_part_no >=", value, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoLessThan(String value) {
            addCriterion("fault_part_no <", value, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoLessThanOrEqualTo(String value) {
            addCriterion("fault_part_no <=", value, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoLike(String value) {
            addCriterion("fault_part_no like", value, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoNotLike(String value) {
            addCriterion("fault_part_no not like", value, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoIn(List<String> values) {
            addCriterion("fault_part_no in", values, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoNotIn(List<String> values) {
            addCriterion("fault_part_no not in", values, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoBetween(String value1, String value2) {
            addCriterion("fault_part_no between", value1, value2, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFaultPartNoNotBetween(String value1, String value2) {
            addCriterion("fault_part_no not between", value1, value2, "faultPartNo");
            return (Criteria) this;
        }

        public Criteria andFieldInspectIsNull() {
            addCriterion("field_inspect is null");
            return (Criteria) this;
        }

        public Criteria andFieldInspectIsNotNull() {
            addCriterion("field_inspect is not null");
            return (Criteria) this;
        }

        public Criteria andFieldInspectEqualTo(String value) {
            addCriterion("field_inspect =", value, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectNotEqualTo(String value) {
            addCriterion("field_inspect <>", value, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectGreaterThan(String value) {
            addCriterion("field_inspect >", value, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectGreaterThanOrEqualTo(String value) {
            addCriterion("field_inspect >=", value, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectLessThan(String value) {
            addCriterion("field_inspect <", value, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectLessThanOrEqualTo(String value) {
            addCriterion("field_inspect <=", value, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectLike(String value) {
            addCriterion("field_inspect like", value, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectNotLike(String value) {
            addCriterion("field_inspect not like", value, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectIn(List<String> values) {
            addCriterion("field_inspect in", values, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectNotIn(List<String> values) {
            addCriterion("field_inspect not in", values, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectBetween(String value1, String value2) {
            addCriterion("field_inspect between", value1, value2, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFieldInspectNotBetween(String value1, String value2) {
            addCriterion("field_inspect not between", value1, value2, "fieldInspect");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionIsNull() {
            addCriterion("failure_analysis_conclusion is null");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionIsNotNull() {
            addCriterion("failure_analysis_conclusion is not null");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionEqualTo(String value) {
            addCriterion("failure_analysis_conclusion =", value, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionNotEqualTo(String value) {
            addCriterion("failure_analysis_conclusion <>", value, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionGreaterThan(String value) {
            addCriterion("failure_analysis_conclusion >", value, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("failure_analysis_conclusion >=", value, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionLessThan(String value) {
            addCriterion("failure_analysis_conclusion <", value, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionLessThanOrEqualTo(String value) {
            addCriterion("failure_analysis_conclusion <=", value, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionLike(String value) {
            addCriterion("failure_analysis_conclusion like", value, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionNotLike(String value) {
            addCriterion("failure_analysis_conclusion not like", value, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionIn(List<String> values) {
            addCriterion("failure_analysis_conclusion in", values, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionNotIn(List<String> values) {
            addCriterion("failure_analysis_conclusion not in", values, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionBetween(String value1, String value2) {
            addCriterion("failure_analysis_conclusion between", value1, value2, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andFailureAnalysisConclusionNotBetween(String value1, String value2) {
            addCriterion("failure_analysis_conclusion not between", value1, value2, "failureAnalysisConclusion");
            return (Criteria) this;
        }

        public Criteria andRequireFixIsNull() {
            addCriterion("require_fix is null");
            return (Criteria) this;
        }

        public Criteria andRequireFixIsNotNull() {
            addCriterion("require_fix is not null");
            return (Criteria) this;
        }

        public Criteria andRequireFixEqualTo(String value) {
            addCriterion("require_fix =", value, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixNotEqualTo(String value) {
            addCriterion("require_fix <>", value, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixGreaterThan(String value) {
            addCriterion("require_fix >", value, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixGreaterThanOrEqualTo(String value) {
            addCriterion("require_fix >=", value, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixLessThan(String value) {
            addCriterion("require_fix <", value, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixLessThanOrEqualTo(String value) {
            addCriterion("require_fix <=", value, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixLike(String value) {
            addCriterion("require_fix like", value, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixNotLike(String value) {
            addCriterion("require_fix not like", value, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixIn(List<String> values) {
            addCriterion("require_fix in", values, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixNotIn(List<String> values) {
            addCriterion("require_fix not in", values, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixBetween(String value1, String value2) {
            addCriterion("require_fix between", value1, value2, "requireFix");
            return (Criteria) this;
        }

        public Criteria andRequireFixNotBetween(String value1, String value2) {
            addCriterion("require_fix not between", value1, value2, "requireFix");
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

        public Criteria andFactoryIsNull() {
            addCriterion("factory is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("factory is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(String value) {
            addCriterion("factory =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(String value) {
            addCriterion("factory <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(String value) {
            addCriterion("factory >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("factory >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(String value) {
            addCriterion("factory <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(String value) {
            addCriterion("factory <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLike(String value) {
            addCriterion("factory like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotLike(String value) {
            addCriterion("factory not like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<String> values) {
            addCriterion("factory in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<String> values) {
            addCriterion("factory not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(String value1, String value2) {
            addCriterion("factory between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(String value1, String value2) {
            addCriterion("factory not between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNull() {
            addCriterion("close_date is null");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNotNull() {
            addCriterion("close_date is not null");
            return (Criteria) this;
        }

        public Criteria andCloseDateEqualTo(Date value) {
            addCriterion("close_date =", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotEqualTo(Date value) {
            addCriterion("close_date <>", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThan(Date value) {
            addCriterion("close_date >", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("close_date >=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThan(Date value) {
            addCriterion("close_date <", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThanOrEqualTo(Date value) {
            addCriterion("close_date <=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateIn(List<Date> values) {
            addCriterion("close_date in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotIn(List<Date> values) {
            addCriterion("close_date not in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateBetween(Date value1, Date value2) {
            addCriterion("close_date between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotBetween(Date value1, Date value2) {
            addCriterion("close_date not between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNull() {
            addCriterion("handler is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNotNull() {
            addCriterion("handler is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerEqualTo(String value) {
            addCriterion("handler =", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotEqualTo(String value) {
            addCriterion("handler <>", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThan(String value) {
            addCriterion("handler >", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("handler >=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThan(String value) {
            addCriterion("handler <", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThanOrEqualTo(String value) {
            addCriterion("handler <=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLike(String value) {
            addCriterion("handler like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotLike(String value) {
            addCriterion("handler not like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerIn(List<String> values) {
            addCriterion("handler in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotIn(List<String> values) {
            addCriterion("handler not in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerBetween(String value1, String value2) {
            addCriterion("handler between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotBetween(String value1, String value2) {
            addCriterion("handler not between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNameIsNull() {
            addCriterion("handler_name is null");
            return (Criteria) this;
        }

        public Criteria andHandlerNameIsNotNull() {
            addCriterion("handler_name is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerNameEqualTo(String value) {
            addCriterion("handler_name =", value, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameNotEqualTo(String value) {
            addCriterion("handler_name <>", value, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameGreaterThan(String value) {
            addCriterion("handler_name >", value, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameGreaterThanOrEqualTo(String value) {
            addCriterion("handler_name >=", value, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameLessThan(String value) {
            addCriterion("handler_name <", value, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameLessThanOrEqualTo(String value) {
            addCriterion("handler_name <=", value, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameLike(String value) {
            addCriterion("handler_name like", value, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameNotLike(String value) {
            addCriterion("handler_name not like", value, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameIn(List<String> values) {
            addCriterion("handler_name in", values, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameNotIn(List<String> values) {
            addCriterion("handler_name not in", values, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameBetween(String value1, String value2) {
            addCriterion("handler_name between", value1, value2, "handlerName");
            return (Criteria) this;
        }

        public Criteria andHandlerNameNotBetween(String value1, String value2) {
            addCriterion("handler_name not between", value1, value2, "handlerName");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsIsNull() {
            addCriterion("processing_tools is null");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsIsNotNull() {
            addCriterion("processing_tools is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsEqualTo(String value) {
            addCriterion("processing_tools =", value, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsNotEqualTo(String value) {
            addCriterion("processing_tools <>", value, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsGreaterThan(String value) {
            addCriterion("processing_tools >", value, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsGreaterThanOrEqualTo(String value) {
            addCriterion("processing_tools >=", value, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsLessThan(String value) {
            addCriterion("processing_tools <", value, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsLessThanOrEqualTo(String value) {
            addCriterion("processing_tools <=", value, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsLike(String value) {
            addCriterion("processing_tools like", value, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsNotLike(String value) {
            addCriterion("processing_tools not like", value, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsIn(List<String> values) {
            addCriterion("processing_tools in", values, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsNotIn(List<String> values) {
            addCriterion("processing_tools not in", values, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsBetween(String value1, String value2) {
            addCriterion("processing_tools between", value1, value2, "processingTools");
            return (Criteria) this;
        }

        public Criteria andProcessingToolsNotBetween(String value1, String value2) {
            addCriterion("processing_tools not between", value1, value2, "processingTools");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNull() {
            addCriterion("question_type is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNotNull() {
            addCriterion("question_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeEqualTo(Integer value) {
            addCriterion("question_type =", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotEqualTo(Integer value) {
            addCriterion("question_type <>", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThan(Integer value) {
            addCriterion("question_type >", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_type >=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThan(Integer value) {
            addCriterion("question_type <", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("question_type <=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIn(List<Integer> values) {
            addCriterion("question_type in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotIn(List<Integer> values) {
            addCriterion("question_type not in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeBetween(Integer value1, Integer value2) {
            addCriterion("question_type between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("question_type not between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andToolsTypeIsNull() {
            addCriterion("tools_type is null");
            return (Criteria) this;
        }

        public Criteria andToolsTypeIsNotNull() {
            addCriterion("tools_type is not null");
            return (Criteria) this;
        }

        public Criteria andToolsTypeEqualTo(Integer value) {
            addCriterion("tools_type =", value, "toolsType");
            return (Criteria) this;
        }

        public Criteria andToolsTypeNotEqualTo(Integer value) {
            addCriterion("tools_type <>", value, "toolsType");
            return (Criteria) this;
        }

        public Criteria andToolsTypeGreaterThan(Integer value) {
            addCriterion("tools_type >", value, "toolsType");
            return (Criteria) this;
        }

        public Criteria andToolsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tools_type >=", value, "toolsType");
            return (Criteria) this;
        }

        public Criteria andToolsTypeLessThan(Integer value) {
            addCriterion("tools_type <", value, "toolsType");
            return (Criteria) this;
        }

        public Criteria andToolsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tools_type <=", value, "toolsType");
            return (Criteria) this;
        }

        public Criteria andToolsTypeIn(List<Integer> values) {
            addCriterion("tools_type in", values, "toolsType");
            return (Criteria) this;
        }

        public Criteria andToolsTypeNotIn(List<Integer> values) {
            addCriterion("tools_type not in", values, "toolsType");
            return (Criteria) this;
        }

        public Criteria andToolsTypeBetween(Integer value1, Integer value2) {
            addCriterion("tools_type between", value1, value2, "toolsType");
            return (Criteria) this;
        }

        public Criteria andToolsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tools_type not between", value1, value2, "toolsType");
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