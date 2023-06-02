class nsp6{
	public static void main(String[] args){
		String str ="Veg";
		Switch(str){
			case "Veg":{
				String str1 ="Main Course";
				Switch(str1){
					case "Main Course":
						System.out.println("Panner");
						break;
					case "Starter":
						System.out.println("Masala Papad");
						break;
					}
				}
				break;
			case "Non-veg":{
				String str="Starter";
				Switch(str1){
					case "Main Course":
						System.out.println("Butter Chicken");
						break;
					case "Starter":
						System.out.println("Chicken Tikka");
						break;
					}
				}
				break;
			}

	}
}
