package com.changjiang.dao;
import com.changjiang.entity.Store;
import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface StoreDao{
    long getStoreRowCount(Assist assist);
    List<Store> selectStore(Assist assist);
    Store selectStoreById(Integer id);
    int insertStore(Store value);
    int insertNonEmptyStore(Store value);
    int deleteStoreById(Integer id);
    int deleteStore(Assist assist);
    int updateStoreById(Store enti);
    int updateStore(@Param("enti") Store value, @Param("assist") Assist assist);
    int updateNonEmptyStoreById(Store enti);
    int updateNonEmptyStore(@Param("enti") Store value, @Param("assist") Assist assist);
}