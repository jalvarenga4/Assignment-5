
 class VanBuilder implements CarBuilder {
	 private Car car;
	 
	 public VanBuilder()
	 {
		 car = new Car();
	 }
	 
	 public void addEngine() 
	 {
		car.setEngine("6 Cylinder 200 Horsepower");
	 }
	 
	 public void addBody() 
	 {
		 car.setBody("Multiple Side and Back Doors");
	 }
	 
	 public void addSoundSystem()
	 {
		 car.setSound("DVD Player For Kids in back");
	 }
	 
	 public void addWheels()
	 {
		 car.setWheels("Super Safe High Friction");
	 }
	 
	
	  public Car build() 
		 {
			 return  car;
		 }

}
