package seedu.todolist.logic.command;

import seedu.todolist.exception.ToDoListException;
import seedu.todolist.ui.Ui;
import seedu.todolist.task.TaskList;

/**
 * Parent class for Command objects.
 */
public abstract class Command {
    /**
     * Executes the command.
     */
    public abstract void execute(TaskList taskList, Ui ui) throws ToDoListException;

    /**
     * Returns whether a command, by default, should terminate the program.
     *
     * @return <code>False</code>, since most commands should not terminate the program.
     */
    public boolean shouldExit() {
        return false;
    }
}