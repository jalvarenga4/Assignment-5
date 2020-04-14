
 class RaceCarBuilder implements CarBuilder {

		 private Car car;
		 
		 public RaceCarBuilder()
		 {
			 car = new Car();
		 }
		 
		 public void addEngine() 
		 {
			car.setEngine("12 Cylinder, 400 Horsepower");
		 }
		 
		 public void addBody() 
		 {
			 car.setBody("Formula One Body");
		 }
		 
		 public void addSoundSystem()
		 {
			 car.setSound("Radio in helmet");
		 }
		 
		 public void addWheels()
		 {
			 car.setWheels("High Performance Firestone");
		 }
			
		  public Car build() 
			 {
				 return car;
			 }

	}


