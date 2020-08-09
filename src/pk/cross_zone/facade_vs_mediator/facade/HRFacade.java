package pk.cross_zone.facade_vs_mediator.facade;

import java.util.Date;

/**
 * HR 门面
 * Created by Nelson on 2020/8/9.
 */
public class HRFacade {
    // 总工资情况
    private SalaryProvider salaryProvider = new SalaryProvider();
    // 考勤情况
    private Attendance attendance = new Attendance();

    // 查询一个人的总收入
    public int querySalary(String name, Date date) {
        return salaryProvider.totalSalary();
    }

    // 查询一个员工一个月工作了多少天
    public int queryWorkDays(String name) {
        return attendance.getWorkDays();
    }
}