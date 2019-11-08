package com.alm.note.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 <p>table  笔记标签</p>
 <p>author lishuai</p>
 <p>time   2019-11-08</p>
*/
@ApiModel("笔记标签")
public class NoteTag {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("父标签")
    private Integer parentId;

    @ApiModelProperty("标签名称")
    private String name;

    @ApiModelProperty("层级")
    private Integer layer;

    @ApiModelProperty("显示顺序")
    private Integer sequence;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 父标签
     * @return parentId 父标签
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 父标签
     * @param parentId 父标签
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 标签名称
     * @return name 标签名称
     */
    public String getName() {
        return name;
    }

    /**
     * 标签名称
     * @param name 标签名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 层级
     * @return layer 层级
     */
    public Integer getLayer() {
        return layer;
    }

    /**
     * 层级
     * @param layer 层级
     */
    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    /**
     * 显示顺序
     * @return sequence 显示顺序
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 显示顺序
     * @param sequence 显示顺序
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}