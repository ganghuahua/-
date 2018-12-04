package com.xqopen.room.dao;

import com.xqopen.room.model.PmsRoom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsRoomDao {

    public PmsRoom selectPmsRoomByRoomId(@Param("roomId") String roomId);

    //按roomId删除
    public void deleteRoom(@Param("roomIds") List<String> roomIds);
}
