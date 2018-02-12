package gui.exam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter();
        presenter.setModel(model);
        presenter.setView(view);
        view.setPresenter(presenter);
        model.setPresenter(presenter);

        Pane root = view.getView();
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
