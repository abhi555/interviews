package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
 -- need instance and constructor setter for that object
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
-- base class/interface as Engine and subclassed as Gas/Electric
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now (to be implemented by Elon Musk  :-) )
		}
	}

}

interface Engine {
	void spinWheels();
}