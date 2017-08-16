package mybatisInterface;

import domain.Employee;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * Created by 唐国翔 on 2017/8/12.
 */
public interface EmployeeMapper {
   Employee getEmpById(Integer id);

   List<Employee> getEmpListById(Integer id);

   List<Employee> getEmpAll();

   Map<String,Object> getEmpByIdReturnMap(Integer id);

   @MapKey("id")//指定map的key值使用实体类的哪一个属性
   Map<Integer,Employee> getEmpByIdReturnMap(String lastName);//封装map 键为实体类属性  值为实体类

   Employee getEmpByIdPlus(Integer id);//带有级联属性

   List<Employee> getEmpListByDeptId(Integer deptId);
}
