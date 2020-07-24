
public class Board {
	private String subject;
	private String content;

	public Board(String subject, String content) {
		this.setSubject(subject);
		this.setContent(content);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
