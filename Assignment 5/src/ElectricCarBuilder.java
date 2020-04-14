
public class ElectricCarBuilder implements CarBuilder {

	Car car;
	
	public ElectricCarBuilder() 
	{
		car = new Car();
	}
	
	@Override
	public void addEngine()
	{
		car.setEngine("8 Batteries");
	}

	@Override
	public void addBody() {
		car.setBody("Two door");
		
	}

	@Override
	public void addSoundSystem() 
	{
		
		car.setSound("One speaker in each door");
	}

	@Override
	public void addWheels()
	{
		
		car.setWheels("Little tiny ones");
	}

	@Override
	public Car build() {
		
		return car;
	}

}
