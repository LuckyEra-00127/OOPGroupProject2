import model.Schedule;
import repository.IScheduleRepository;
import repository.ScheduleRepository;
import service.ScheduleService;
import controller.ScheduleController;

public class Main {
    public static void main(String[] args) {
        // Initialize Repository, Service, and Controller
        IScheduleRepository scheduleRepository = new ScheduleRepository();
        ScheduleService scheduleService = new ScheduleService(scheduleRepository);
        ScheduleController scheduleController = new ScheduleController(scheduleService);

        // Create a new schedule
        Schedule schedule1 = new Schedule(1, 101, "Monday", "10:00 AM");
        scheduleController.createSchedule(schedule1);

        // Get and print all schedules
        scheduleController.getAllSchedules().forEach(s ->
                System.out.println(s.getDay() + " " + s.getTime()));

        // Update a schedule
        schedule1.setTime("11:00 AM");
        scheduleController.updateSchedule(schedule1);

        // Get schedule by ID
        Schedule schedule = scheduleController.getScheduleById(1);
        System.out.println(schedule.getDay() + " " + schedule.getTime());

        // Delete a schedule
        scheduleController.deleteSchedule(1);
    }
}
