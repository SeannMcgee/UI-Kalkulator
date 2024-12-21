import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class KalkulatorApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Membuat elemen UI
        Label lblBil1 = new Label("Masukkan bilangan pertama:");
        lblBil1.setFont(Font.font("Arial", 14));
        TextField txtBil1 = new TextField();
        txtBil1.setPromptText("Bilangan pertama");

        Label lblBil2 = new Label("Masukkan bilangan kedua:");
        lblBil2.setFont(Font.font("Arial", 14));
        TextField txtBil2 = new TextField();
        txtBil2.setPromptText("Bilangan kedua");

        Button btnTambah = new Button("+");
        Button btnKurang = new Button("-");
        Button btnKali = new Button("*");
        Button btnBagi = new Button("/");

        Label lblHasil = new Label("Hasil:");
        lblHasil.setFont(Font.font("Arial", 16));
        lblHasil.setTextFill(Color.DARKBLUE);
        TextField txtHasil = new TextField();
        txtHasil.setEditable(false);
        txtHasil.setStyle("-fx-background-color: lightyellow;");

        // Mengatur tata letak dengan VBox untuk form input
        VBox inputBox = new VBox(10, lblBil1, txtBil1, lblBil2, txtBil2);
        inputBox.setAlignment(Pos.CENTER);

        // Mengatur tata letak dengan HBox untuk tombol operasi
        HBox buttonBox = new HBox(10, btnTambah, btnKurang, btnKali, btnBagi);
        buttonBox.setAlignment(Pos.CENTER);

        // Mengatur tata letak keseluruhan
        VBox root = new VBox(20, inputBox, buttonBox, lblHasil, txtHasil);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #f0f8ff;");

        // Menambahkan logika untuk tombol operasi
        btnTambah.setOnAction(e -> {
            try {
                double bil1 = Double.parseDouble(txtBil1.getText());
                double bil2 = Double.parseDouble(txtBil2.getText());
                txtHasil.setText(String.valueOf(bil1 + bil2));
            } catch (NumberFormatException ex) {
                txtHasil.setText("Error: Input tidak valid");
            }
        });

        btnKurang.setOnAction(e -> {
            try {
                double bil1 = Double.parseDouble(txtBil1.getText());
                double bil2 = Double.parseDouble(txtBil2.getText());
                txtHasil.setText(String.valueOf(bil1 - bil2));
            } catch (NumberFormatException ex) {
                txtHasil.setText("Error: Input tidak valid");
            }
        });

        btnKali.setOnAction(e -> {
            try {
                double bil1 = Double.parseDouble(txtBil1.getText());
                double bil2 = Double.parseDouble(txtBil2.getText());
                txtHasil.setText(String.valueOf(bil1 * bil2));
            } catch (NumberFormatException ex) {
                txtHasil.setText("Error: Input tidak valid");
            }
        });

        btnBagi.setOnAction(e -> {
            try {
                double bil1 = Double.parseDouble(txtBil1.getText());
                double bil2 = Double.parseDouble(txtBil2.getText());
                if (bil2 != 0) {
                    txtHasil.setText(String.valueOf(bil1 / bil2));
                } else {
                    txtHasil.setText("Error: Pembagian dengan 0");
                }
            } catch (NumberFormatException ex) {
                txtHasil.setText("Error: Input tidak valid");
            }
        });

        // Menampilkan scene
        Scene scene = new Scene(root, 400, 350);
        primaryStage.setTitle("Kalkulator Sederhana");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
