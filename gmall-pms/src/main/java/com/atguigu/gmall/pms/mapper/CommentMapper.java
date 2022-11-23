package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author wanghang
 * @email wanghang@gmail.com
 * @date 2022-11-18 17:16:29
 */
@Mapper
public interface CommentMapper extends BaseMapper<CommentEntity> {
	
}
