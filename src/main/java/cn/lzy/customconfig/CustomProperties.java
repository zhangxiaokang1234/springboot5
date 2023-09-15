package cn.lzy.customconfig;

import cn.lzy.bean.Course;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Configuration  //标识当前类是自定义类
@PropertySource("classpath:custom.properties")  //指定配置文件路径和名称
@EnableConfigurationProperties(CustomProperties.class)  //开启对应配置类的属性注入功能
@ConfigurationProperties(prefix = "custom")   //指定配置文件注入属性
public class CustomProperties {
    private int id;

    private String name;

    private int age;

    private String[] hobby;

    private List electProduct;

    private Map friends;

    private Course course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public List getElectProduct() {
        return electProduct;
    }

    public void setElectProduct(List electProduct) {
        this.electProduct = electProduct;
    }

    public Map getFriends() {
        return friends;
    }

    public void setFriends(Map friends) {
        this.friends = friends;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "CustomProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                ", electProduct=" + electProduct +
                ", friends=" + friends +
                ", course=" + course +
                '}';
    }
}
