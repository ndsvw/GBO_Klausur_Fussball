package gui.exam;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends VBox
{

    private ListView<Match> list1 = new ListView<Match>();

    private ListView<ScoreEntry> list2 = new ListView<ScoreEntry>();

    private Button btn1 = new Button("Neues Spielergebnis");

    private Button btn2 = new Button("Spielergebnis löschen");

    public View()
    {
        HBox hBox1 = new HBox();
        hBox1.getChildren().add(list1);
        hBox1.getChildren().add(list2);

        HBox hBox2 = new HBox();
        hBox2.getChildren().add(btn1);
        hBox2.getChildren().add(btn2);
        btn1.setOnAction(e -> showAddDialog());
        btn2.setOnAction(e -> clickedDelete());

        this.getChildren().add(hBox1);
        this.getChildren().add(hBox2);
    }

    public VBox getView()
    {
        return this;
    }

    public void addMatch(Match m)
    {

    }

    public void deleteMatch(Match m)
    {

    }

    public void updateScores(ScoreEntry[] s)
    {

    }

    public void showAddDialog()
    {
        NewMatchDialog n = new NewMatchDialog();
        n.show();
    }

    public void clickedDelete()
    {
        // es ist ein Match ausgewählt
        if (list1.getSelectionModel().getSelectedItem() != null)
        {

        }
    }
}
