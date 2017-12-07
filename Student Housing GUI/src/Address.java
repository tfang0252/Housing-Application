public class Address{
	private String address;
	private int houseNum;
	private String streetName;
	private String city;
	private String state;
	private int zip;
		
		
	public Address(String add){
		address = add;
		int count = 0;
		int position = 0;

		for(int i=0; i<address.length(); i++){
			if(address.charAt(i) == ' ' && count == 0){
				houseNum = Integer.parseInt(address.substring(0, i));
				position = i;
				i++;
				count++;
			}
			if(address.charAt(i) == ',' && count == 1){
				streetName = address.substring(position+1, i);
				position = i;
				i++;
				count++;
			}
			if(address.charAt(i) == ',' && count == 2){
				city = address.substring(position+2, i);
				position = i;
				i++;
				count++;
			}
			if(address.charAt(i) == ' ' && count == 3){
				state = address.substring(position+2, i+3);
				zip = Integer.parseInt(address.substring(i+4, address.length()));
				position = i;
				i++;
				count++;
			}
		}
	}
	
	public String getAddress(){
		return address;
	}
	
	public int getHouseNum(){
		return houseNum;
	}
	
	public String getStreetName(){
		return streetName;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getState(){
		return state;
	}
	
	public int getZip(){
		return zip;
	}
	
	public String toString(){
		return address;
	}
}

