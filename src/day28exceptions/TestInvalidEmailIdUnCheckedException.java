package day28exceptions;

public class TestInvalidEmailIdUnCheckedException { 
	public static void main(String[] args) {
		
		validEmailId("abc@gmail.com");
	}
	
	
	public static void validEmailId(String emailId) {
		
		if (emailId.contains("@gmail.com")|| emailId.contains("yahoo.com")) {
			System.out.println(emailId);
		}else {
			throw new InvalidEmailIdUnCheckedException ("Email id is invalid");
		}
	}
}
