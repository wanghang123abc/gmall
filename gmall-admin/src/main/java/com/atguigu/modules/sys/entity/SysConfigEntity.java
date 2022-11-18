/**
 * Copyright (c) 2016-2019 谷粒开源 All rights reserved.
 *
 * https://www.guli.cloud
 *
 * 版权所有，侵权必究！
 */

package com.atguigu.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
 * 系统配置信息
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@TableName("sys_config")
public class SysConfigEntity {
	@TableId
	private Long id;

	@NotNull
	private String paramKey;

	@NotNull
	private String paramValue;
	private String remark;

}
