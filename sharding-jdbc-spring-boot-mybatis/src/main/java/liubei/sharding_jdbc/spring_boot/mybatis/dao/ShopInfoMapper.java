package liubei.sharding_jdbc.spring_boot.mybatis.dao;

import liubei.sharding_jdbc.spring_boot.mybatis.entity.ShopInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShopInfoMapper {

    /**
     * 保存商户
     */
    @Insert("insert into shop_info(shop_name, account) values(#{shopName}, #{account})")
    int insert(ShopInfo shopInfo);

    /**
     * 查询商户
     */
    @Select("select shop_id, shop_name, account from shop_info where shop_id = #{shopId}")
    ShopInfo selectByPrimaryKey(Long shopId);

    /**
     * 查询商户
     */
    @Select("select shop_id, shop_name, account from shop_info")
    List<ShopInfo> selectAllShopInfos();

}
