import java.awt.event.*;

public class PanelSwitcherController implements ActionListener {
	private PanelSwitcherView view;
	private PanelSwitcherModel model;
	public PanelSwitcherController(PanelSwitcherView view, PanelSwitcherModel model) {
		this.model = model;
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.switchPanel();
		view.displayPanel(model.whichPanel());
	}

}
