package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();

        TableColumn<Mahasiswa, String> kolomNim = new TableColumn<>("NIM");
        kolomNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("Nama");
        kolomNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tabel.getColumns().add(kolomNim);
        tabel.getColumns().add(kolomNama);

        tabel.getItems().add(new Mahasiswa(1, "22108171", "Muhammad"));
        tabel.getItems().add(new Mahasiswa(2, "22108173", "Pasha"));
        tabel.getItems().add(new Mahasiswa(3, "22108175", "Nabeel"));
        tabel.getItems().add(new Mahasiswa(4, "22108177", "Fatih"));
        tabel.getItems().add(new Mahasiswa(5, "22108179", "Alif"));
        tabel.getItems().add(new Mahasiswa(6, "22108172", "Ghifari"));
        tabel.getItems().add(new Mahasiswa(7, "22108174", "Aulia"));
        tabel.getItems().add(new Mahasiswa(8, "22108176", "Rasyid"));
        tabel.getItems().add(new Mahasiswa(9, "22108178", "Haekal"));
        tabel.getItems().add(new Mahasiswa(10, "22108170", "Barera"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();    
    }
}