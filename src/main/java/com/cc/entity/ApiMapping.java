package com.cc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 金金文
 * @since 2021-01-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ApiMapping对象", description="")
public class ApiMapping implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "对外接口名称")
    @TableField("gatewayApiName")
    private String gatewayApiName;

    @ApiModelProperty(value = "对内的接口URL")
    @TableField("insideApiUrl")
    private String insideApiUrl;

    @ApiModelProperty(value = "api状态 1 可用 0 不可用 ")
    private Integer state;

    @ApiModelProperty(value = "接口描述")
    private String description;

    @TableField("serviceId")
    private String serviceId;

    private String idempotents;

    private String needfee;


}
