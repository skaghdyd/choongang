package chap09_2;

public class MessageListener implements Button.OnClickListener {
	@Override
	public String onClick() {
		return "메세지를 보냅니다.";
	}
}