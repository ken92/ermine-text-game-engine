package areas;

import control.ButtonActionHandler;
import control.ErmineNavigationScreenController;
import control.ErmineNavigationScreenController.NavigationPanelButtons;

public class TestArea extends Area {
	private final NorthController northController;
	
	public TestArea() {
		super();
		navigationControl.setButtonText("Change row 1 text", "west");
		navigationControl.setButtonText("Toggle north text/action", "center");
		
		northController = new NorthController();
		
		registerNorthAction(northController);
		registerWestAction(new WestController(this));
		registerSouthAction(new SouthController());
		registerEastAction(new EastController());
		registerCenterAction(new CenterController(this));
	}
	
	// ---- BUTTON CONTROLLERS ----
	public class NorthController implements ButtonActionHandler {
		@Override
		public void execute() {
			System.out.println("North Execute!");
		}
	}
	public class SouthController implements ButtonActionHandler {
		@Override
		public void execute() {
			System.out.println("South Execute!");
		}
	}
	public class WestController implements ButtonActionHandler {
		private int num = 0;
		private TestArea area;
		public WestController(TestArea area) {
			this.area = area;
		}
		
		@Override
		public void execute() {
			System.out.println("West Execute!");

			area.navigationControl.setRowLabel("Row Label"+num, "row1");
			area.navigationControl.setRowText("Row Text"+num, "row1");
			num++;
		}
	}
	public class EastController implements ButtonActionHandler {
		@Override
		public void execute() {
			System.out.println("East Execute!");
		}
	}
	public class CenterController implements ButtonActionHandler {
		private TestArea area;
		public CenterController(TestArea area) {
			this.area = area;
		}
		
		@Override
		public void execute() {
			System.out.println("Center Execute!");
			if (area.navigationControl.hasAction(NavigationPanelButtons.NORTH)) {
				System.out.println("north has action");
				area.deregisterNorthAction();
				area.navigationControl.setButtonText("ayy lmao", "north");
			} else {
				System.out.println("north does not have action");
				area.registerNorthAction(northController);
				area.navigationControl.setButtonText("NORTH", "north");
			}
		}
	}
}