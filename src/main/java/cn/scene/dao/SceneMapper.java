package cn.scene.dao;

import cn.scene.model.Scene;
import java.util.List;

public interface SceneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Scene record);

    int insertSelective(Scene record);

    Scene selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Scene record);

    int updateByPrimaryKey(Scene record);

    //查询模板总数
    int selectCount();

    //查询精选模板
    List<Scene> selectDelicate();

    //查询最新推荐
    List<Scene> selectNews();

    //查询最新热门模板
    List<Scene> selectByHot();

    //查询热门模板推荐
    List<Scene> selectByTimes();

    //企业宣传热销排行榜
    List<Scene> selectCompanyByHitCount();

    //个人相册热销模板
    List<Scene> selectPhotoByHitCount();

    //分类查询,积分兑换
    List<Scene> selectCharge(Integer type);

    //分类查询,免费
    List<Scene> selectFree(Integer type);
}