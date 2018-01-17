package com.dengpu.barbershop.dao;

import com.dengpu.barbershop.model.HairDresser;
import com.dengpu.barbershop.model.HairDresserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HairDresserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    long countByExample(HairDresserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    int deleteByExample(HairDresserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    int insert(HairDresser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    int insertSelective(HairDresser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    List<HairDresser> selectByExample(HairDresserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    HairDresser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    int updateByExampleSelective(@Param("record") HairDresser record, @Param("example") HairDresserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    int updateByExample(@Param("record") HairDresser record, @Param("example") HairDresserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    int updateByPrimaryKeySelective(HairDresser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hairdresser
     *
     * @mbg.generated Wed Jan 17 16:14:47 CST 2018
     */
    int updateByPrimaryKey(HairDresser record);
}