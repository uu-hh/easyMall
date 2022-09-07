package com.hh.easymall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 采购信息
 *
 * @author hh
 * @email ${email}
 * @date 2022-08-18 21:51:51
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Long id;
    /**
     *
     */
    private Long assigneeId;
    /**
     *
     */
    private String assigneeName;
    /**
     *
     */
    private String phone;
    /**
     *
     */
    private Integer priority;
    /**
     *
     */
    private Integer status;
    /**
     *
     */
    private Long wareId;
    /**
     *
     */
    private BigDecimal amount;
    /**
     *
     */
    private Date createTime;
    /**
     *
     */
    private Date updateTime;

}
