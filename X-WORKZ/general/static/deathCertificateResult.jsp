<%
com.xworkz.general.dto.DeathCertificateDTO dto =
(com.xworkz.general.dto.DeathCertificateDTO) request.getAttribute("dto");
%>
<h2>Death Certificate Details</h2>
<p>Name: <%= dto.getName() %></p>
<p>Cause: <%= dto.getCause() %></p>
<p>Date: <%= dto.getDate() %></p>
<p>Time: <%= dto.getTime() %></p>
<p>Age: <%= dto.getAgeAtDeath() %></p>
<p>Certified By: <%= dto.getCertifiedBy() %></p>
<p>Hospital: <%= dto.getHospitalName() %></p>
<p>Manner: <%= dto.getMannerOfDeath() %></p>
<p>Gender: <%= dto.getGender() %></p>
<p>Marks: <%= dto.getMarks() %></p>
