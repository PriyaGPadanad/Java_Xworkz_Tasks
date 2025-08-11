<%
com.xworkz.general.dto.BirthCertificateDTO dto =
(com.xworkz.general.dto.BirthCertificateDTO) request.getAttribute("dto");
%>
<h2>Birth Certificate Details</h2>
<p>Birth ID: <%= dto.getBirthId() %></p>
<p>Hospital: <%= dto.getHospitalName() %></p>
<p>Father: <%= dto.getFatherName() %></p>
<p>Mother: <%= dto.getMotherName() %></p>
<p>Date & Time: <%= dto.getDateTime() %></p>
<p>Doctor: <%= dto.getDoctorName() %></p>
<p>Nurse: <%= dto.getNurseName() %></p>
<p>Type: <%= dto.getHospitalType() %></p>
