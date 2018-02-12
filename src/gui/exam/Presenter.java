package gui.exam;

public class Presenter
{
    private Model model;

    private View view;

    public void setModel(Model model)
    {
        this.model = model;
    }

    public void setView(View view)
    {
        this.view = view;
    }

    public void addMatch(Match m)
    {
        model.addMatch(m);
        view.addMatch(m);
        view.updateScores(model.getAllScores());
    }

    public void deleteMatch(Match m)
    {
        model.deleteMatch(m);
        view.deleteMatch(m);
        view.updateScores(model.getAllScores());
    }
}
