import domain.Employee;
import mybatisInterface.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by 唐国翔 on 2017/8/12.
 */
public class MybatisTest {

    SqlSessionFactory sessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    @Test
    public void test() throws IOException {

        SqlSession sqlSession = sessionFactory.openSession();
        Employee employee = sqlSession.selectOne("domain.EmployeeMapper.selectEmp", 1);
        System.out.println(employee);

        sqlSession.close();
    }

    @Test
    public void testInterface(){
        SqlSession sqlSession = sessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.getEmpById(1);
        System.out.println(employee);
        sqlSession.close();
    }

}
