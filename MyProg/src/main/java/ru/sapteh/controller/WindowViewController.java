package ru.sapteh.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sapteh.model.Computer;


public class WindowViewController {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    ObservableList<Computer> observableList = FXCollections.observableArrayList();
    @FXML
    private TableView<Computer> computerTableView;

    @FXML
    private TableColumn<Computer, Integer> idColumn;

    @FXML
    private TableColumn<Computer, Integer> ramColumn;

    @FXML
    private TableColumn<Computer, Integer> hddColumn;

    @FXML
    private TableColumn<Computer, Integer> powerSupplyColumn;

    @FXML
    private TableColumn<Computer, String> videoCardColumn;

    }








