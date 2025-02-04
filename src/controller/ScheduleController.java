package controller;

import java.util.List;
import model.Schedule;
import service.ScheduleService;

public class ScheduleController {
    private ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    public Schedule getScheduleById(int scheduleId) {
        return scheduleService.getScheduleById(scheduleId);
    }

    public List<Schedule> getAllSchedules() {
        return scheduleService.getAllSchedules();
    }

    public void createSchedule(Schedule schedule) {
        scheduleService.createSchedule(schedule);
    }

    public void updateSchedule(Schedule schedule) {
        scheduleService.updateSchedule(schedule);
    }

    public void deleteSchedule(int scheduleId) {
        scheduleService.deleteSchedule(scheduleId);
    }
}
