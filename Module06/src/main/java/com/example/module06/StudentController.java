package com.example.module06;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> studentIdCol;

    @FXML
    private TableColumn<Student, String> nameCol;

    @FXML
    public void initialize() {
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        ObservableList<Student> studentList = FXCollections.observableArrayList(
                new Student(1, "Aufa Thariq Akram", "2510817310014"),
                new Student(2, "Vivaldi Levi", "2510817220014"),
                new Student(3, "Muhammad Ramadhan", "2510817110023"),
                new Student(4, "Dylon riffa", "2510817320008"),
                new Student(5, "Fadhil Lesmana", "2510817210019"),
                new Student(6, "Akmal Sulaiman", "2510817120005"),
                new Student(7, "Kurniawan Pasya", "2510817310027"),
                new Student(8, "Muhammad Abrar", "2510817220011"),
                new Student(9, "Daffa Khoiri", "2510817110030"),
                new Student(10, "Ahmad Riyadhi", "2510817320016")
        );

        studentTable.setItems(studentList);
    }
}