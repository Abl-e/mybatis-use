package mybatisInterface;

import domain.Department;

/**
 * Created by 唐国翔 on 2017/8/15.
 */
public interface DepartmentMapper {

    Department getDepart(Integer id);

    Department getDepartStep(Integer id);
}
