package nju.edu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import nju.edu.common.utils.PageUtils;
import nju.edu.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Musss
 * @email 201250104@smail.nju.edu.cn
 * @date 2022-09-11 16:25:48
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

