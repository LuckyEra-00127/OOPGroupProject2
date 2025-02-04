package repository;

import java.util.ArrayList;
import java.util.List;
import model.Schedule;

public class ScheduleRepository implements IScheduleRepository {
    private List<Schedule> schedules = new ArrayList<>();

    @Override
    public Schedule getById(int scheduleId) {
        return schedules.stream().filter(s -> s.getScheduleId() == scheduleId).findFirst().orElse(null);
    }

    @Override
    public List<Schedule> getAllSchedules() {
        return schedules;
    }

    @Override
    public void save(Schedule schedule) {
        schedules.add(schedule);
    }

    @Override
    public void update(Schedule schedule) {
        Schedule existingSchedule = getById(schedule.getScheduleId());
        if (existingSchedule != null) {
            existingSchedule.setCourseId(schedule.getCourseId());
            existingSchedule.setDay(schedule.getDay());
            existingSchedule.setTime(schedule.getTime());
        }
    }

    @Override
    public void delete(int scheduleId) {
        schedules.removeIf(s -> s.getScheduleId() == scheduleId);
    }
}
