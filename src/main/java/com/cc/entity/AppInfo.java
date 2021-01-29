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
@ApiModel(value="AppInfo对象", description="")
public class AppInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "客户ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "公司名称")
    @TableField("corpName")
    private String corpName;

    @ApiModelProperty(value = "app名称")
    @TableField("appName")
    private String appName;

    @ApiModelProperty(value = "APPKEY")
    @TableField("appKey")
    private String appKey;

    @ApiModelProperty(value = "APP密码")
    @TableField("appSecret")
    private String appSecret;

    @ApiModelProperty(value = "回调地址")
    @TableField("redirectUrl")
    private String redirectUrl;

    @ApiModelProperty(value = "APP每天限流量")
    private Integer limit;

    @ApiModelProperty(value = "APP描述")
    private String description;

    @ApiModelProperty(value = "所属客户 id")
    @TableField("cusId")
    private Integer cusId;

    @ApiModelProperty(value = "状态")
    private Integer state;


}
