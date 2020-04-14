
class Car implements Item {
	private String Engine;
	private String Body;
	private String Wheels;
	private String Sound;
	
	public void  setEngine(String engine) 
	{
		this.Engine = engine;
	}
	
	public void setBody(String body) 
	{
		this.Body = body;
	}
	
	public void setSound (String sound)
	{
		this.Sound = sound;
	}
	
	public void  setWheels(String wheels)
	{
		this.Wheels = wheels;
	}
	
	public String getEngine() 
	{
		return Engine;
	}
	public String getBody() 
	{
		return Body;
	}
	public String getSound() 
	{
		return Sound;
	}
	public String getWheels()
	{
		return Wheels;
	}
	
	 @Override
	 public String toString() 
	 {
		 return "Consists of:\n" + "Engine: " + getEngine() + "\n" + "Body: " +
	 getBody() + "\nSound: " + getSound() + "\nWheels: " + getWheels();

	 }
}
