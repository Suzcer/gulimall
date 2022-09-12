package nju.edu.gulimall.coupon.service.impl;

import nju.edu.gulimall.coupon.service.CouponSpuCategoryRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nju.edu.common.utils.PageUtils;
import nju.edu.common.utils.Query;

import nju.edu.gulimall.coupon.dao.CouponSpuCategoryRelationDao;
import nju.edu.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;


@Service("couponSpuCategoryRelationService")
public class CouponSpuCategoryRelationServiceImpl extends ServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelationEntity> implements CouponSpuCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuCategoryRelationEntity> page = this.page(
                new Query<CouponSpuCategoryRelationEntity>().getPage(params),
                new QueryWrapper<CouponSpuCategoryRelationEntity>()
        );

        return new PageUtils(page);
    }

}
