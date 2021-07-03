package liubei.sharding_jdbc.spring_boot.mybatis.dao;

import liubei.sharding_jdbc.spring_boot.mybatis.entity.Dog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DogMapper {

    @Select("select * from dog")
    public List<Dog> queryAll();

}
