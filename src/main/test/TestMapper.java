import com.fa.entity.Address;
import com.fa.entity.User;
import com.fa.mapper.AddressMapper;
import com.fa.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class TestMapper {
    public static void main(String[] args) {
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
                .build(TestMapper.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = ssf.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUserById(new User(1));
        users.forEach(user -> {
            System.out.println(user.toString());
        });
    }
}
