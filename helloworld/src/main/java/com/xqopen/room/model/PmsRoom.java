package com.xqopen.room.model;

import java.util.Date;

public class PmsRoom {

  private String roomId;

  private String roomContractor;

  private String roomNumber;

  private String roomTypeId;

  private String roomFloors;

  private String isActive;

  private String isDelete;

  private Date modifyTime;

  private String createdBy;

  private Date createdTime;

  private String lastUpdatedBy;

  private Date lastUpdatedTime;

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public Date getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Date lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public Date getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(Date modifyTime) {
    this.modifyTime = modifyTime;
  }

  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId == null ? null : roomId.trim();
  }

  public String getRoomContractor() {
    return roomContractor;
  }

  public void setRoomContractor(String roomContractor) {
    this.roomContractor = roomContractor == null ? null : roomContractor.trim();
  }

  public String getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber == null ? null : roomNumber.trim();
  }

  public String getRoomTypeId() {
    return roomTypeId;
  }

  public void setRoomTypeId(String roomTypeId) {
    this.roomTypeId = roomTypeId == null ? null : roomTypeId.trim();
  }

  public String getRoomFloors() {
    return roomFloors;
  }

  public void setRoomFloors(String roomFloors) {
    this.roomFloors = roomFloors == null ? null : roomFloors.trim();
  }

  public String getIsActive() {
    return isActive;
  }

  public void setIsActive(String isActive) {
    this.isActive = isActive == null ? null : isActive.trim();
  }

  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete == null ? null : isDelete.trim();
  }

  public void selectPmsRoomByRoomId() {
  }
}