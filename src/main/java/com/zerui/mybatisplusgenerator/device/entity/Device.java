package com.zerui.mybatisplusgenerator.device.entity;

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
 * @since 2021-07-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_base_device")
@ApiModel(value="Device对象", description="")
public class Device extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "设备id")
    private String deviceId;

    @ApiModelProperty(value = "设备编码")
    private String deviceCode;

    @ApiModelProperty(value = "设备名称")
    private String deviceName;

    @ApiModelProperty(value = "设备IP")
    private String deviceIp;

    @ApiModelProperty(value = "设备端口号")
    private Integer devicePort;

    @ApiModelProperty(value = "所属组织id")
    private String orgCodeId;

    @ApiModelProperty(value = "当前设备组织路径")
    private String orgPath;

    @ApiModelProperty(value = "是否删除（0：正常，1：删除）")
    private Boolean isDelete;

    @ApiModelProperty(value = "通道数量")
    private Integer channelNumber;

    @ApiModelProperty(value = "告警输入通道数目")
    private Integer alarmInChannelNumber;

    @ApiModelProperty(value = "注册服务器的编号")
    private String registerServerCode;

    @ApiModelProperty(value = "报警服务器的编号")
    private String alarmServerCode;

    @ApiModelProperty(value = "流媒体服务器的编号")
    private String streamServerCode;

    @ApiModelProperty(value = "流媒体使用方式")
    private Integer streamUseMethod;

    @ApiModelProperty(value = "流媒体取流方式")
    private Integer streamPullMethod;

    @ApiModelProperty(value = "码流类型(1:主码流，2：子码流）")
    private Integer streamType;

    @ApiModelProperty(value = "设备所属网段")
    private String netZone;

    @ApiModelProperty(value = "是否启用全通道(0：否，1：是）")
    private Boolean enableFullChannel;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "月流量限额(MB)")
    private Integer streamLimitSizePerMonth;

    @ApiModelProperty(value = "运营商信息")
    private String carrier;

    @ApiModelProperty(value = "运营商联系电话")
    private String phone;

    @ApiModelProperty(value = "厂商信息")
    private String manufacturer;

    @ApiModelProperty(value = "设备创建的时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "设备最后更新的时间")
    private LocalDateTime updateTime;


}
