package mybatisInterface;

import domain.Employee;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 唐国翔 on 2017/8/12.
 */
public interface EmployeeMapper {
   public Employee getEmpById(Integer id);
}
