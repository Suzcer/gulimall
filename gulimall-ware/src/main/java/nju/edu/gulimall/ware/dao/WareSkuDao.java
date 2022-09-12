package nju.edu.gulimall.ware.dao;

import nju.edu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Musss
 * @email 201250104@smail.nju.edu.cn
 * @date 2022-09-12 10:03:58
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
