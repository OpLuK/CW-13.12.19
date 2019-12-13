public class class1 {
	public static void main (String [] args){
		index adress = new index();
		System.out.println("Почтовый адрес вашей организации: " + adress.postIndex + ", " + adress.city + ", " + adress.street + ", " + adress.houseNum);
	}
}
class index {
	int postIndex = 358312;
	int houseNum = 14;
	String city = "г.Георгиевск";
	String street = "ул.Быкова";
}