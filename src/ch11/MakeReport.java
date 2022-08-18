package ch11;

public class MakeReport {

	StringBuffer buffer = new StringBuffer();
	
	private String line = "==================================================\n";
	private String title = " 이름\t 주소 \t\t 전화번호 \n";
	private void makeHeader()
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		buffer.append("Myoung jun \t");
		buffer.append("Daejeon Korea \t");
		buffer.append("010-4255-5598 \n");
		
		buffer.append("Seung A \t");
		buffer.append("Daejeon Korea \t");
		buffer.append("010-1111-1111 \n");
	}
	
	private void makeFooter()
	{
		
		buffer.append(line);
	}
	
	public String getReport()
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
