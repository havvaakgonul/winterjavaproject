package day28exceptions;

public class TestInvalidEmailIdCheckedException {

	public static void main(String[] args) {
	//	Integer.parseInt("123");
		try {
		vaidateEmailId("abc@xmail.com");
	}catch (InvalidEmailIdCheckedException e) {
		System.out.println(e.getMessage());
	}
	}
	public static void vaidateEmailId(String emailId) throws InvalidEmailIdCheckedException {
		
		if (emailId.contains("@gmail.com")|| emailId.contains("yahoo.com")) {
			System.out.println(emailId);
		}else {
			throw new InvalidEmailIdCheckedException ("Email id is not valid");
		}
	}
}
