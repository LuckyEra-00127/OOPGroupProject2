import controller.IScheduleController;
import controller.ScheduleController;
import module.ScheduleModule;
import repository.ScheduleRepository;

public class Main {
    public static void main(String[] args) {
        // Initialize Repository, Module, and Controller
        ScheduleRepository scheduleRepository = new ScheduleRepository();
        ScheduleModule scheduleModule = new ScheduleModule(1, 101, "Monday", "10:00 AM");
        IScheduleController scheduleController = new ScheduleController(scheduleRepository);

        // Create a new schedule
        scheduleController.createSchedule(scheduleModule);

        // Get and print all schedules
        scheduleController.getAllSchedules().forEach(s ->
                System.out.println(s.getDay() + " " + s.getTime()));

        // Update a schedule
        scheduleModule.setTime("11:00 AM");
        scheduleController.updateSchedule(scheduleModule);

        // Get schedule by ID
        ScheduleModule schedule = scheduleController.getScheduleById(1);
        System.out.println(schedule.getDay() + " " + schedule.getTime());

        // Delete a schedule
        scheduleController.deleteSchedule(1);
    }
}
