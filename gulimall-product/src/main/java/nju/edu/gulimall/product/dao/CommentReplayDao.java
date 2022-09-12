package nju.edu.gulimall.product.dao;

import nju.edu.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author Musss
 * @email 201250104@smail.nju.edu.cn
 * @date 2022-09-11 16:25:48
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
