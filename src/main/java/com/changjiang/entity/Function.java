package com.changjiang.entity;

import java.io.Serializable;

public class Function implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7750082498065436362L;
	private Integer id;
    private String functionName;
    private Integer upperLevelId;
    private Integer currentLevel;
    private String icon;
    public Function() {
        super();
    }
    public Function(Integer id,String functionName,Integer upperLevelId,Integer currentLevel,String icon) {
        super();
        this.id = id;
        this.functionName = functionName;
        this.upperLevelId = upperLevelId;
        this.currentLevel = currentLevel;
        this.icon = icon;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Integer getUpperLevelId() {
        return this.upperLevelId;
    }

    public void setUpperLevelId(Integer upperLevelId) {
        this.upperLevelId = upperLevelId;
    }

    public Integer getCurrentLevel() {
        return this.currentLevel;
    }

    public void setCurrentLevel(Integer currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}
