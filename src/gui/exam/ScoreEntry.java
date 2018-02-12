package gui.exam;

class ScoreEntry
{
    private String team;

    private int score;

    private int toreHome, toreOpp;

    private int countWin, countTie, countLoss;

    public ScoreEntry(String team, int goalsActive, int goalsPassive)
    {
        if (team == null || team.length() == 0)
        {
            throw new IllegalArgumentException("Ungültige Team-Kennung");
        }
        if (goalsActive < 0 || goalsPassive < 0)
        {
            throw new IllegalArgumentException("Negative Torezahl");
        }
        this.team = team;
        update(goalsActive, goalsPassive);
    }

    private void update(int gA, int gP)
    {
        toreHome += gA;
        toreOpp += gP;
        if (gA > gP)
        {
            score += 3;
            countWin++;
        }
        else if (gA == gP)
        {
            score += 1;
            countTie++;
        }
        else
        {
            countLoss++;
        }
    }

    public void add(ScoreEntry se)
    {
        if (!team.equals(se.team))
        {
            return;
        }
        score += se.score;
        toreHome += se.toreHome;
        toreOpp += se.toreOpp;

        if (se.toreHome > se.toreOpp)
        {
            score += 3;
            countWin++;
        }
        else if (se.toreHome == se.toreOpp)
        {
            score += 1;
            countTie++;
        }
        else
        {
            countLoss++;
        }

    }

    public void subtract(ScoreEntry se)
    {
        if (!team.equals(se.team))
        {
            return;
        }
        score -= se.score;
        toreHome -= se.toreHome;
        toreOpp -= se.toreOpp;

        if (se.toreHome > se.toreOpp)
        {
            score += 3;
            countWin++;
        }
        else if (se.toreHome == se.toreOpp)
        {
            score += 1;
            countTie++;
        }
        else
        {
            countLoss++;
        }
    }

    public String getTeam()
    {
        return team;
    }

    public int getScore()
    {
        return score;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof ScoreEntry))
        {
            return false;
        }
        return team.equals(((ScoreEntry) o).team);
    }

    public String toString()
    {
        return team + ": " + score + " (" + toreHome + ":" + toreOpp + " " + countWin + "/" + countTie + "/" + countLoss + ")";
    }
}
