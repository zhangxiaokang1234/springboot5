package cn.lzy;


import cn.lzy.bean.Person;
import cn.lzy.bean.Student;
import cn.lzy.bean.User;
import cn.lzy.customconfig.CustomProperties;
import cn.lzy.mybatiscatalog.CommentMapper;
import cn.lzy.mybatiscatalog.JPA.Repository;
import cn.lzy.mybatiscatalog.redis.RedisRepository;
import cn.lzy.profileconfig.DBConnector;
//import cn.lzy.redis.RedisRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterTestApplication {

    @Autowired  //自动装配
    ChapterController chapterController;

    @Autowired
    Student student;


    @Value("${student.name}")
    String name;

    @Autowired
    User user;

    @Autowired
    Person person;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    CustomProperties customProperties;

    @Autowired
    DBConnector dbConnector;

    @Autowired
    Repository repository;

    @Autowired
    RedisRepository redisRepository;

    @Autowired
    private CommentMapper commentMapper;


    @Test
    public void getHello() {
        /*cn.lzy.mybatiscatalog.redis.Person personRedis = new cn.lzy.mybatiscatalog.redis.Person();
        personRedis.setFirstname("张");
        personRedis.setLastname("三");
        Address address =new Address();
        address.setCity("aa");
        address.setCountry("china");
        personRedis.setAddress(address);
        List<Family> list = new ArrayList<>();
        Family dad = new Family("父亲","刘");
        Family mom = new Family("母亲","王");
        list.add(dad);
        list.add(mom);
        personRedis.setFamilyList(list);
        cn.lzy.mybatiscatalog.redis.Person personResult = redisRepository.save(personRedis);
        System.out.println(personResult);*/



//        String result = chapterController.sayHello();
//        System.out.println("测试返回的result结果是---" + result);

//        System.out.println("测试返回的name结果是---" + name);
//
//        System.out.println("测试返回的user结果是---" + user);
//
//        System.out.println("测试返回的person结果是---" + person);

//        System.out.println(customProperties);

//        MyProperties myProperties = (MyProperties) applicationContext.getBean("xmlProperties");
//        if (myProperties != null) {
//            myProperties.getResult();
//        }

//        System.out.println(dbConnector.config());
//        查找
//         Comment comment = commentMapper.findById(12);
//         comment.setContent("李可");
//         comment.setaId(1);
//         System.out.println("单元测试返回的comment表的数据----" + comment);

//        List<Discuss> list = repository.findByAuthorNotNull();
//        System.out.println(list);



//        插入
//        Comment comment1 = new Comment(6,"ss","sh",9);
//        commentMapper.insertComment(comment1);

//        删除
//        int comment3 = commentMapper.deleteComment(7);
//        System.out.println("已删除"+comment3);

//          更新
//          Comment comment = new Comment();
//          comment.setContent("张三");
//          comment.setId(8);
//          commentMapper.updateComment(comment);
//          System.out.println("已更新");

        /*String result = student.toString();
        try {
            System.out.println("测试返回student结果是---" + new String(result.getBytes("iso8859-1"), "utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }*/

    }
}
