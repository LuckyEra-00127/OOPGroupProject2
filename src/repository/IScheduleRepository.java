package repository;

import java.util.List;
import model.Schedule;

public interface IScheduleRepository {
    Schedule getById(int scheduleId);
    List<Schedule> getAllSchedules();
    void save(Schedule schedule);
    void update(Schedule schedule);
    void delete(int scheduleId);
}
