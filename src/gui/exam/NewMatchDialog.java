package gui.exam;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NewMatchDialog
{
    private Stage stage;

    private TextField textFieldTeam1;

    private TextField textFieldTeam2;

    private TextField textFieldResult1;

    private TextField textFieldResult2;

    private Button btnHinzu;

    private Button btnAbbr;

    private Label log;

    public NewMatchDialog()
    {
        VBox root = new VBox();

        HBox hBox1 = new HBox();
        textFieldTeam1 = new TextField();
        textFieldTeam2 = new TextField();
        hBox1.getChildren().addAll(new Label("Teams:"), textFieldTeam1, new Label("-"), textFieldTeam2);

        HBox hBox2 = new HBox();
        textFieldResult1 = new TextField();
        textFieldResult2 = new TextField();
        hBox2.getChildren().addAll(new Label("Ergebnis:"), textFieldResult1, new Label(":"), textFieldResult2);

        HBox hBox3 = new HBox();
        btnHinzu = new Button("Hinzufügen");
        btnHinzu.setOnAction(e -> onClickHinzu());
        btnAbbr = new Button("Abbrechen");
        btnAbbr.setOnAction(e -> stage.close());
        hBox3.getChildren().addAll(btnHinzu, btnAbbr);

        log = new Label("");

        root.getChildren().addAll(hBox1, hBox2, hBox3, log);

        Scene scene = new Scene(root);
        stage = new Stage();
        stage.setScene(scene);

    }

    public void show()
    {
        stage.show();
    }

    public void onClickHinzu()
    {
        try
        {
            if (Integer.valueOf(textFieldResult1.getText()) >= 0 && Integer.valueOf(textFieldResult2.getText()) >= 0)
            {

                stage.close();
            }
            else
            {
                log.setText("Ergebnis: ungültige Eingabe");
            }
        }
        catch (NumberFormatException e)
        {
            log.setText("Ergebnis: ungültige Eingabe");
        }

    }
}
