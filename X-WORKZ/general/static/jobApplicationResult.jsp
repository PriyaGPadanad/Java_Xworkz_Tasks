<%
com.xworkz.general.dto.JobApplicationDTO dto =
(com.xworkz.general.dto.JobApplicationDTO) request.getAttribute("dto");
%>
<h2>Job Application Submitted</h2>
<p>Name: <%= dto.getName() %></p>
<p>Email: <%= dto.getEmail() %></p>
<p>Education: <%= dto.getEducation() %></p>
<p>Skills: <%= dto.getSkills() %></p>
<p>Expected Salary: <%= dto.getSalary() %></p>
<p>Experience: <%= dto.getExperience() %></p>
