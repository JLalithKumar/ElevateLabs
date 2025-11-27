import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoApp {
    public static void main(String[] args) {

        JFrame frame = new JFrame("To-Do List App");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<String> taskList = new DefaultListModel<>();
        JList<String> list = new JList<>(taskList);
        JScrollPane scrollPane = new JScrollPane(list);

        JTextField taskField = new JTextField(15);
        JButton addButton = new JButton("Add Task");
        JButton deleteButton = new JButton("Delete Task");

        JPanel panel = new JPanel();
        panel.add(taskField);
        panel.add(addButton);
        panel.add(deleteButton);

        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                taskList.addElement(task);
                taskField.setText(""); 
            }
        });

        deleteButton.addActionListener(e -> {
            int selectedIndex = list.getSelectedIndex();
            if (selectedIndex != -1) {
                taskList.remove(selectedIndex);
            }
        });

        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
