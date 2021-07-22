package com.zerui.mybatisplusgenerator.organization.entity;

import com.zerui.mybatisplusgenerator.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaozhiyun
 * @since 2021-07-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_base_organization")
@ApiModel(value="Organization对象", description="")
public class Organization extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "组织唯一键")
    private String orgId;

    @ApiModelProperty(value = "组织编号")
    private String orgCode;

    @ApiModelProperty(value = "组织名称")
    private String orgName;

    @ApiModelProperty(value = "组织类型")
    private String orgType;

    @ApiModelProperty(value = "上级组织编号")
    private String parentOrgId;

    @ApiModelProperty(value = "当前组织路径")
    private String orgPath;

    @ApiModelProperty(value = "是否删除（0：正常，1：删除）")
    private Boolean isDelete;

    @ApiModelProperty(value = "组织创建的时间")
    private Data createTime;

    @ApiModelProperty(value = "组织最后更新的时间")
    private Data updateTime;


}
