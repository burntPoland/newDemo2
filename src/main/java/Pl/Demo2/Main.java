package Pl.Demo2;

public class Main {

	public static void main(String[] args) {
		
		
		Client client1 = new Client();
		
		client1.setName("Michael");
		
		client1.setLastName("Scott");
		
		System.out.println(client1.getName() + " " + client1.getlastName());
		
		City cityClient1 = new City();
		
		cityClient1.setCityName("Scranton");
		cityClient1.setPostCode("1938834 29292");
		cityClient1.setZipCode(123453);

		System.out.println(cityClient1.getCityName() + " " + cityClient1.getZipCode());
		
	}

}
