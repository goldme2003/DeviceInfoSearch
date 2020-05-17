package com.zhzt.devinfosearch.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dev_info", schema = "POW_DATA_ANALY", catalog = "")
public class DevInfo {
    private int devInfoId;
    private String devName;
    private String devType;
    private String opNo;
    private String substName;
    private String belongedFeedbackLine;
    private String feedbacklineBranch;
    private String typeNo;
    private String manufactor;
    private String initialNo;
    private Timestamp manuData;
    private String belongedTo;
    private Timestamp beginDate;
    private String devCode;
    private String volLev;
    private String devStatus;
    private String phase;
    private String maintainTeam;
    private String devOwner;
    private String belongedFeedbackLineId;
    private String feedbacklineBranchId;
    private String objId;
    private String devId;
    private String opCompany;
    private String projNo;
    private String projName;
    private String stationBuildingId;
    private String profCategory;
    private String funcPosition;
    private String pmCode;
    private String voltLevelName;
    private String devTypeCode;
    private String stationLineName;
    private String devManufactor;
    private String volLevCode;
    private String assetProp;
    private String manuCountry;
    private String bayUnit;
    private String belongedStationVolLev;
    private String phaseNo;
    private Timestamp latestOpDate;
    private String assetTransId;
    private String note;
    private String devIncreMode;
    private Timestamp regDate;
    private String equipBrandOplibId;
    private String belongedCity;
    private String assetNo;

    @Id
    @Column(name = "Dev_Info_ID", nullable = false)
    public int getDevInfoId() {
        return devInfoId;
    }

    public void setDevInfoId(int devInfoId) {
        this.devInfoId = devInfoId;
    }

    @Basic
    @Column(name = "Dev_Name", nullable = true, length = 255)
    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    @Basic
    @Column(name = "Dev_Type", nullable = true, length = 255)
    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType;
    }

    @Basic
    @Column(name = "Op_No", nullable = true, length = 255)
    public String getOpNo() {
        return opNo;
    }

    public void setOpNo(String opNo) {
        this.opNo = opNo;
    }

    @Basic
    @Column(name = "Subst_Name", nullable = true, length = 255)
    public String getSubstName() {
        return substName;
    }

    public void setSubstName(String substName) {
        this.substName = substName;
    }

    @Basic
    @Column(name = "Belonged_FeedbackLine", nullable = true, length = 255)
    public String getBelongedFeedbackLine() {
        return belongedFeedbackLine;
    }

    public void setBelongedFeedbackLine(String belongedFeedbackLine) {
        this.belongedFeedbackLine = belongedFeedbackLine;
    }

    @Basic
    @Column(name = "Feedbackline_Branch", nullable = true, length = 255)
    public String getFeedbacklineBranch() {
        return feedbacklineBranch;
    }

    public void setFeedbacklineBranch(String feedbacklineBranch) {
        this.feedbacklineBranch = feedbacklineBranch;
    }

    @Basic
    @Column(name = "Type_No", nullable = true, length = 255)
    public String getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(String typeNo) {
        this.typeNo = typeNo;
    }

    @Basic
    @Column(name = "Manufactor", nullable = true, length = 255)
    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    @Basic
    @Column(name = "Initial_No", nullable = true, length = 255)
    public String getInitialNo() {
        return initialNo;
    }

    public void setInitialNo(String initialNo) {
        this.initialNo = initialNo;
    }

    @Basic
    @Column(name = "Manu_Data", nullable = true)
    public Timestamp getManuData() {
        return manuData;
    }

    public void setManuData(Timestamp manuData) {
        this.manuData = manuData;
    }

    @Basic
    @Column(name = "Belonged_To", nullable = true, length = 255)
    public String getBelongedTo() {
        return belongedTo;
    }

    public void setBelongedTo(String belongedTo) {
        this.belongedTo = belongedTo;
    }

    @Basic
    @Column(name = "Begin_Date", nullable = true)
    public Timestamp getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Timestamp beginDate) {
        this.beginDate = beginDate;
    }

    @Basic
    @Column(name = "Dev_Code", nullable = true, length = 255)
    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    @Basic
    @Column(name = "Vol_Lev", nullable = true, length = 255)
    public String getVolLev() {
        return volLev;
    }

    public void setVolLev(String volLev) {
        this.volLev = volLev;
    }

    @Basic
    @Column(name = "Dev_Status", nullable = true, length = 255)
    public String getDevStatus() {
        return devStatus;
    }

    public void setDevStatus(String devStatus) {
        this.devStatus = devStatus;
    }

    @Basic
    @Column(name = "Phase", nullable = true, length = 255)
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Basic
    @Column(name = "Maintain_Team", nullable = true, length = 255)
    public String getMaintainTeam() {
        return maintainTeam;
    }

    public void setMaintainTeam(String maintainTeam) {
        this.maintainTeam = maintainTeam;
    }

    @Basic
    @Column(name = "Dev_Owner", nullable = true, length = 255)
    public String getDevOwner() {
        return devOwner;
    }

    public void setDevOwner(String devOwner) {
        this.devOwner = devOwner;
    }

    @Basic
    @Column(name = "Belonged_FeedbackLineID", nullable = true, length = 255)
    public String getBelongedFeedbackLineId() {
        return belongedFeedbackLineId;
    }

    public void setBelongedFeedbackLineId(String belongedFeedbackLineId) {
        this.belongedFeedbackLineId = belongedFeedbackLineId;
    }

    @Basic
    @Column(name = "Feedbackline_BranchID", nullable = true, length = 255)
    public String getFeedbacklineBranchId() {
        return feedbacklineBranchId;
    }

    public void setFeedbacklineBranchId(String feedbacklineBranchId) {
        this.feedbacklineBranchId = feedbacklineBranchId;
    }

    @Basic
    @Column(name = "obj_id", nullable = true, length = 255)
    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    @Basic
    @Column(name = "Dev_ID", nullable = true, length = 255)
    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    @Basic
    @Column(name = "Op_Company", nullable = true, length = 255)
    public String getOpCompany() {
        return opCompany;
    }

    public void setOpCompany(String opCompany) {
        this.opCompany = opCompany;
    }

    @Basic
    @Column(name = "Proj_No", nullable = true, length = 255)
    public String getProjNo() {
        return projNo;
    }

    public void setProjNo(String projNo) {
        this.projNo = projNo;
    }

    @Basic
    @Column(name = "Proj_Name", nullable = true, length = 255)
    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    @Basic
    @Column(name = "StationBuilding_ID", nullable = true, length = 255)
    public String getStationBuildingId() {
        return stationBuildingId;
    }

    public void setStationBuildingId(String stationBuildingId) {
        this.stationBuildingId = stationBuildingId;
    }

    @Basic
    @Column(name = "Prof_Category", nullable = true, length = 255)
    public String getProfCategory() {
        return profCategory;
    }

    public void setProfCategory(String profCategory) {
        this.profCategory = profCategory;
    }

    @Basic
    @Column(name = "Func_Position", nullable = true, length = 255)
    public String getFuncPosition() {
        return funcPosition;
    }

    public void setFuncPosition(String funcPosition) {
        this.funcPosition = funcPosition;
    }

    @Basic
    @Column(name = "PM_Code", nullable = true, length = 255)
    public String getPmCode() {
        return pmCode;
    }

    public void setPmCode(String pmCode) {
        this.pmCode = pmCode;
    }

    @Basic
    @Column(name = "Volt_Level_Name", nullable = true, length = 255)
    public String getVoltLevelName() {
        return voltLevelName;
    }

    public void setVoltLevelName(String voltLevelName) {
        this.voltLevelName = voltLevelName;
    }

    @Basic
    @Column(name = "Dev_Type_Code", nullable = true, length = 255)
    public String getDevTypeCode() {
        return devTypeCode;
    }

    public void setDevTypeCode(String devTypeCode) {
        this.devTypeCode = devTypeCode;
    }

    @Basic
    @Column(name = "StationLine_Name", nullable = true, length = 255)
    public String getStationLineName() {
        return stationLineName;
    }

    public void setStationLineName(String stationLineName) {
        this.stationLineName = stationLineName;
    }

    @Basic
    @Column(name = "Dev_Manufactor", nullable = true, length = 255)
    public String getDevManufactor() {
        return devManufactor;
    }

    public void setDevManufactor(String devManufactor) {
        this.devManufactor = devManufactor;
    }

    @Basic
    @Column(name = "Vol_Lev_Code", nullable = true, length = 255)
    public String getVolLevCode() {
        return volLevCode;
    }

    public void setVolLevCode(String volLevCode) {
        this.volLevCode = volLevCode;
    }

    @Basic
    @Column(name = "Asset_Prop", nullable = true, length = 255)
    public String getAssetProp() {
        return assetProp;
    }

    public void setAssetProp(String assetProp) {
        this.assetProp = assetProp;
    }

    @Basic
    @Column(name = "Manu_Country", nullable = true, length = 255)
    public String getManuCountry() {
        return manuCountry;
    }

    public void setManuCountry(String manuCountry) {
        this.manuCountry = manuCountry;
    }

    @Basic
    @Column(name = "Bay_Unit", nullable = true, length = 255)
    public String getBayUnit() {
        return bayUnit;
    }

    public void setBayUnit(String bayUnit) {
        this.bayUnit = bayUnit;
    }

    @Basic
    @Column(name = "Belonged_Station_Vol_Lev", nullable = true, length = 255)
    public String getBelongedStationVolLev() {
        return belongedStationVolLev;
    }

    public void setBelongedStationVolLev(String belongedStationVolLev) {
        this.belongedStationVolLev = belongedStationVolLev;
    }

    @Basic
    @Column(name = "Phase_No", nullable = true, length = 255)
    public String getPhaseNo() {
        return phaseNo;
    }

    public void setPhaseNo(String phaseNo) {
        this.phaseNo = phaseNo;
    }

    @Basic
    @Column(name = "Latest_Op_Date", nullable = true)
    public Timestamp getLatestOpDate() {
        return latestOpDate;
    }

    public void setLatestOpDate(Timestamp latestOpDate) {
        this.latestOpDate = latestOpDate;
    }

    @Basic
    @Column(name = "Asset_Trans_ID", nullable = true, length = 255)
    public String getAssetTransId() {
        return assetTransId;
    }

    public void setAssetTransId(String assetTransId) {
        this.assetTransId = assetTransId;
    }

    @Basic
    @Column(name = "Note", nullable = true, length = 255)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "Dev_Incre_Mode", nullable = true, length = 255)
    public String getDevIncreMode() {
        return devIncreMode;
    }

    public void setDevIncreMode(String devIncreMode) {
        this.devIncreMode = devIncreMode;
    }

    @Basic
    @Column(name = "Reg_Date", nullable = true)
    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "Equip_Brand_Oplib_ID", nullable = true, length = 255)
    public String getEquipBrandOplibId() {
        return equipBrandOplibId;
    }

    public void setEquipBrandOplibId(String equipBrandOplibId) {
        this.equipBrandOplibId = equipBrandOplibId;
    }

    @Basic
    @Column(name = "Belonged_City", nullable = true, length = 255)
    public String getBelongedCity() {
        return belongedCity;
    }

    public void setBelongedCity(String belongedCity) {
        this.belongedCity = belongedCity;
    }

    @Basic
    @Column(name = "Asset_No", nullable = true, length = 255)
    public String getAssetNo() {
        return assetNo;
    }

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DevInfo devInfo = (DevInfo) o;
        return devInfoId == devInfo.devInfoId &&
                Objects.equals(devName, devInfo.devName) &&
                Objects.equals(devType, devInfo.devType) &&
                Objects.equals(opNo, devInfo.opNo) &&
                Objects.equals(substName, devInfo.substName) &&
                Objects.equals(belongedFeedbackLine, devInfo.belongedFeedbackLine) &&
                Objects.equals(feedbacklineBranch, devInfo.feedbacklineBranch) &&
                Objects.equals(typeNo, devInfo.typeNo) &&
                Objects.equals(manufactor, devInfo.manufactor) &&
                Objects.equals(initialNo, devInfo.initialNo) &&
                Objects.equals(manuData, devInfo.manuData) &&
                Objects.equals(belongedTo, devInfo.belongedTo) &&
                Objects.equals(beginDate, devInfo.beginDate) &&
                Objects.equals(devCode, devInfo.devCode) &&
                Objects.equals(volLev, devInfo.volLev) &&
                Objects.equals(devStatus, devInfo.devStatus) &&
                Objects.equals(phase, devInfo.phase) &&
                Objects.equals(maintainTeam, devInfo.maintainTeam) &&
                Objects.equals(devOwner, devInfo.devOwner) &&
                Objects.equals(belongedFeedbackLineId, devInfo.belongedFeedbackLineId) &&
                Objects.equals(feedbacklineBranchId, devInfo.feedbacklineBranchId) &&
                Objects.equals(objId, devInfo.objId) &&
                Objects.equals(devId, devInfo.devId) &&
                Objects.equals(opCompany, devInfo.opCompany) &&
                Objects.equals(projNo, devInfo.projNo) &&
                Objects.equals(projName, devInfo.projName) &&
                Objects.equals(stationBuildingId, devInfo.stationBuildingId) &&
                Objects.equals(profCategory, devInfo.profCategory) &&
                Objects.equals(funcPosition, devInfo.funcPosition) &&
                Objects.equals(pmCode, devInfo.pmCode) &&
                Objects.equals(voltLevelName, devInfo.voltLevelName) &&
                Objects.equals(devTypeCode, devInfo.devTypeCode) &&
                Objects.equals(stationLineName, devInfo.stationLineName) &&
                Objects.equals(devManufactor, devInfo.devManufactor) &&
                Objects.equals(volLevCode, devInfo.volLevCode) &&
                Objects.equals(assetProp, devInfo.assetProp) &&
                Objects.equals(manuCountry, devInfo.manuCountry) &&
                Objects.equals(bayUnit, devInfo.bayUnit) &&
                Objects.equals(belongedStationVolLev, devInfo.belongedStationVolLev) &&
                Objects.equals(phaseNo, devInfo.phaseNo) &&
                Objects.equals(latestOpDate, devInfo.latestOpDate) &&
                Objects.equals(assetTransId, devInfo.assetTransId) &&
                Objects.equals(note, devInfo.note) &&
                Objects.equals(devIncreMode, devInfo.devIncreMode) &&
                Objects.equals(regDate, devInfo.regDate) &&
                Objects.equals(equipBrandOplibId, devInfo.equipBrandOplibId) &&
                Objects.equals(belongedCity, devInfo.belongedCity) &&
                Objects.equals(assetNo, devInfo.assetNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devInfoId, devName, devType, opNo, substName, belongedFeedbackLine, feedbacklineBranch, typeNo, manufactor, initialNo, manuData, belongedTo, beginDate, devCode, volLev, devStatus, phase, maintainTeam, devOwner, belongedFeedbackLineId, feedbacklineBranchId, objId, devId, opCompany, projNo, projName, stationBuildingId, profCategory, funcPosition, pmCode, voltLevelName, devTypeCode, stationLineName, devManufactor, volLevCode, assetProp, manuCountry, bayUnit, belongedStationVolLev, phaseNo, latestOpDate, assetTransId, note, devIncreMode, regDate, equipBrandOplibId, belongedCity, assetNo);
    }
}
