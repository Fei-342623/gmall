package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sunfei
 * @email Fei_342623@163.com
 * @date 2020-02-29 21:12:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
