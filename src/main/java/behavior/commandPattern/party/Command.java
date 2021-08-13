package behavior.commandPattern.party;

public interface Command {
  public void execute();
  public void undo();
}