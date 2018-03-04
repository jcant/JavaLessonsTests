package com.gmail.gm.jcant;

public class GreenhouseControls extends Controller {
	private boolean light = false;

	public class LightOn extends Event {
		public LightOn(long delayTime) {
			super(delayTime);
		}

		public void action() {
			// some hardware methods to turn light on
			light = true;
			System.out.println("Action: \""+toString()+"\"");
		}

		public String toString() {
			return "Light ON";
		}
	}

	public class LightOff extends Event {
		public LightOff(long delayTime) {
			super(delayTime);
		}

		public void action() {
			// some hardware methods to turn light off
			light = false;
			System.out.println("Action: \""+toString()+"\"");
		}

		public String toString() {
			return "Light OFF";
		}
	}

	private boolean water = false;

	public class WaterOn extends Event {
		public WaterOn(long delayTime) {
			super(delayTime);
		}

		public void action() {
			// some hardware methods to turn water system on
			water = true;
			System.out.println("Action: \""+toString()+"\"");
		}

		public String toString() {
			return "Water system ON";
		}
	}

	public class WaterOff extends Event {
		public WaterOff(long delayTime) {
			super(delayTime);
		}

		public void action() {
			// some hardware methods to turn water system off
			water = false;
			System.out.println("Action: \""+toString()+"\"");
		}

		public String toString() {
			return "Water system OFF";
		}
	}

	private String thermostat = "DAY";

	public class ThermostatNight extends Event {
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}

		public void action() {
			// some hardware methods to switch temperature system to night mode
			thermostat = "NIGHT";
			System.out.println("Action: \""+toString()+"\"");
		}

		public String toString() {
			return "Thermostat is using NIGHT mode";
		}
	}

	public class ThermostatDay extends Event {
		public ThermostatDay(long delayTime) {
			super(delayTime);
		}

		public void action() {
			// some hardware methods to switch temperature system to day mode
			thermostat = "DAY";
			System.out.println("Action: \""+toString()+"\"");
		}

		public String toString() {
			return "Thermostat is using DAY mode";
		}
	}

	public class Bell extends Event {
		public Bell(long delayTime) {
			super(delayTime);
		}

		public void action() {
			addEvent(new Bell(delayTime));
			System.out.println("Action: \""+toString()+"\"");
		}

		public String toString() {
			return "Ding - Dong!!!";
		}
	}

	public class Restart extends Event {
		private Event[] eventList;

		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for (Event e : eventList) {
				addEvent(e);
			}
		}

		public void action() {
			for (Event e : eventList) {
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
			System.out.println("Action: \""+toString()+"\"");
		}

		public String toString() {
			return "System restart";
		}
	}

	public static class Terminate extends Event {
		public Terminate(long delayTime) {
			super(delayTime);
		}

		public void action() {
			System.out.println("Action: \""+toString()+"\"");
			System.exit(0);
		}

		public String toString() {
			return "System off";
		}
	}
}
