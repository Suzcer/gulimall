package nju.edu.gulimall.coupon.dao;

import nju.edu.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author Musss
 * @email 201250104@smail.nju.edu.cn
 * @date 2022-09-11 23:09:08
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
