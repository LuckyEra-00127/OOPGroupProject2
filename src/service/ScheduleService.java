package service;

import java.util.List;
import model.Schedule;
import repository.IScheduleRepository;

public class ScheduleService {
    private IScheduleRepository scheduleRepository;

    public ScheduleService(IScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public Schedule getScheduleById(int scheduleId) {
        return scheduleRepository.getById(scheduleId);
    }

    public List<Schedule> getAllSchedules() {
        return scheduleRepository.getAllSchedules();
    }

    public void createSchedule(Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    public void updateSchedule(Schedule schedule) {
        scheduleRepository.update(schedule);
    }

    public void deleteSchedule(int scheduleId) {
        scheduleRepository.delete(scheduleId);
    }
}
