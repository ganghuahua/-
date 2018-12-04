package com.xqopen.room.dto;

import java.util.List;

public class RoomDelReq {
    private List<String> roomIds;

    public List<String> getRoomIds() {
        return roomIds;
    }

    public RoomDelReq setRoomIds(List<String> roomIds) {
        this.roomIds = roomIds;
        return this;
    }
}
