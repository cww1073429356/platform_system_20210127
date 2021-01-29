package com.cc.platform_system_20210127;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;


@ContextConfiguration(classes= PlatformSystem20210127Application.class)
@EnableAutoConfiguration
@SpringBootTest
 public  class PlatformSystem20210127ApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void auto_test(){
//        // 需要构建一个 代码自动生成器 对象
//        AutoGenerator mpg = new AutoGenerator(); // 配置策略
//        // 1、全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        gc.setOutputDir(projectPath + "/src/main/java");
//        gc.setAuthor("金金文");
//        gc.setOpen(false);
//        gc.setFileOverride(true); // 是否覆盖
//        gc.setServiceName("%sService"); // 去Service的I前缀
//        gc.setIdType(IdType.ID_WORKER);
//        gc.setDateType(DateType.ONLY_DATE);
//        gc.setSwagger2(true);
//        mpg.setGlobalConfig(gc);
//        //2、设置数据源
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://172.16.51.130:3306/platform_system?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8");
//        dsc.setDriverName("com.mysql.jdbc.Driver");
//        dsc.setUsername("jinjinwen");
//        dsc.setPassword("P@ssw0rd");
//        dsc.setDbType(DbType.MYSQL);
//        mpg.setDataSource(dsc);
//        //3、包的配置
//        PackageConfig pc = new PackageConfig();
//        pc.setModuleName("cc");
//        pc.setParent("com");
//        pc.setEntity("entity");
//        pc.setMapper("mapper");
//        pc.setService("service");
//        pc.setController("controller");
//        mpg.setPackageInfo(pc);
//        //4、策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setInclude("admin_user","api_mapping","api_systemparam","app_info","customer","menu","recharge","role","user_token","role_menu"); // 设置要映射的表名
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setEntityLombokModel(true); // 自动lombok；
//        strategy.setLogicDeleteFieldName("deleted"); // 自动填充配置
//        TableFill gmtCreate = new TableFill("create_time", FieldFill.INSERT);
//        TableFill gmtModified = new TableFill("updata_time", FieldFill.INSERT_UPDATE);
//        ArrayList<TableFill> tableFills = new ArrayList<>(); tableFills.add(gmtCreate);
//        tableFills.add(gmtModified);
//        strategy.setTableFillList(tableFills);
//        // 乐观锁
//        strategy.setVersionFieldName("version");
//        strategy.setRestControllerStyle(true);
//        strategy.setControllerMappingHyphenStyle(true); // localhost:8080/hello_id_2
//        mpg.setStrategy(strategy);
//        mpg.execute(); //执行
    }

}
