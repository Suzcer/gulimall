package nju.edu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import nju.edu.common.utils.PageUtils;
import nju.edu.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author Musss
 * @email 201250104@smail.nju.edu.cn
 * @date 2022-09-11 16:25:48
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

