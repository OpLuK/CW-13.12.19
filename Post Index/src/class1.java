public class class1 {
	public static void main (String [] args){
		index adress = new index();
		adress.city = "г.Георгиевск";
		adress.street = "ул.Быкова";
		adress.postIndex = 358131;
		adress.houseNum = 13;
		adress.displayInfo();
	}
}
class index {
	int postIndex;
	int houseNum;
	String city;
	String street;
	void displayInfo() {
		System.out.println("Почтовый адрес вашей организации: " + postIndex + ", " + city + ", " + street + ", " + houseNum);
	}
}