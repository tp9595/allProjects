package Apitesting.Apiproject;

public class interviewquestion {
    
	
	
	private String name;
	private String job;
	private String [] skills;
	private detail detail;
	
	public interviewquestion(String name, String job,String [] skills,String companyName,String emailid)
	{
		this.name=name;
		this.job=job;
		this.skills=skills;
		this.detail= new detail( companyName, emailid);
		
				
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public detail getDetai() {
		return detail;
	}
	public void setDetai(detail detai) {
		this.detail = detai;
	}
	
	
	
}
