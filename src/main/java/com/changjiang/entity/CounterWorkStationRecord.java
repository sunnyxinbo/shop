package com.changjiang.entity;

import java.io.Serializable;

public class CounterWorkStationRecord implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1285370350128763686L;
	private Integer id;
    private Integer counterId;
    private Integer workStationId;
    public CounterWorkStationRecord() {
        super();
    }
    public CounterWorkStationRecord(Integer id,Integer counterId,Integer workStationId) {
        super();
        this.id = id;
        this.counterId = counterId;
        this.workStationId = workStationId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCounterId() {
        return this.counterId;
    }

    public void setCounterId(Integer counterId) {
        this.counterId = counterId;
    }

    public Integer getWorkStationId() {
        return this.workStationId;
    }

    public void setWorkStationId(Integer workStationId) {
        this.workStationId = workStationId;
    }

}
