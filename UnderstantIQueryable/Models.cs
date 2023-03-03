namespace UnderstandIQueriabel;

public class TaskItem
{
    public int TaskItemId { get; set; }
    public string Title { get; set; }
    
    public int? ReminderId { get; set; }
    public Reminder Reminder { get; set; }
}

public class Reminder
{
    public int ReminderId { get; set; }

    public DateTime Date { get; set; }
    
    public int ReminderTypeId { get; set; }
    public ReminderType ReminderType { get; set; }

}

public class ReminderType 
{
    public int ReminderTypeId { get; set; }
    public string Label { get; set; }
}
