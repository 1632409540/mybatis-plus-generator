package com.zerui.mybatisplusgenerator.camera.entity;

import com.zerui.mybatisplusgenerator.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
 * @author xiaozhiyun
 * @since 2021-07-22
 */
@Data
@Accessors(chain = true)
@TableName("tb_base_camera")
@ApiModel(value="Camera对象", description="")
public class Camera extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "通道Id")
    private String channelId;

    @ApiModelProperty(value = "通道编码")
    private String channelCode;

    @ApiModelProperty(value = "通道序号")
    private Integer channelNo;

    @ApiModelProperty(value = "通道类型")
    private Integer channelType;

    @ApiModelProperty(value = "所属组织id")
    private String orgId;

    @ApiModelProperty(value = "设备Id")
    private String deviceId;

    @ApiModelProperty(value = "当前设备组织路径")
    private String orgPath;

    @ApiModelProperty(value = "是否删除（0：正常，1：删除）")
    private Boolean isDelete;

    @ApiModelProperty(value = "监控点创建的时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "监控点最后更新的时间")
    private LocalDateTime updateTime;


}
