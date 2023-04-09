package groupHWs.groupHW_1.MyTask;

public class Main {
    public static void main(String[] args) {
        String s = "!He!llo w!orld!";

        My_task_for_team task = new My_task_for_team();

        s = task.removeExclamationMarks(s);

        System.out.println(s);
    }
}
