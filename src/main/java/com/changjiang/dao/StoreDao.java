package com.changjiang.dao;
import com.changjiang.entity.Store;
import com.changjiang.entity.StoreProducte;

import java.util.List;
import com.changjiang.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
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
    @Select("SELECT id FROM store WHERE storeNumber=#{storeNumber}")
    @Results({
    	@Result(id=true,column="id",property="id")
    })
    Integer selectIdByStoreNumber(String storeNumber);
    /**
     * 通过店面id查询店面具有的所有产品
     * @param storeid
     * @return
     */
    Store queryStoreProducteByStoreId(Integer storeid);
}