package behavior.commandPattern.party;

public class LightroomLightOffCommand implements Command {
	Light light;

	public LightroomLightOffCommand(Light light) {
		this.light = light;
	}
  
	public void execute() {
		light.off();
	}
  
	public void undo() {
		light.on();
	}
}
