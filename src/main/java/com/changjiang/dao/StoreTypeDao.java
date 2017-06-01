package com.changjiang.dao;
import com.changjiang.entity.StoreType;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface StoreTypeDao{
    long getStoreTypeRowCount(Assist assist);
    List<StoreType> selectStoreType(Assist assist);
    StoreType selectStoreTypeById(Integer id);
    int insertStoreType(StoreType value);
    int insertNonEmptyStoreType(StoreType value);
    int deleteStoreTypeById(Integer id);
    int deleteStoreType(Assist assist);
    int updateStoreTypeById(StoreType enti);
    int updateStoreType(@Param("enti") StoreType value, @Param("assist") Assist assist);
    int updateNonEmptyStoreTypeById(StoreType enti);
    int updateNonEmptyStoreType(@Param("enti") StoreType value, @Param("assist") Assist assist);
}