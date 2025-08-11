<%
com.xworkz.general.dto.MarriageCertificateDTO dto =
(com.xworkz.general.dto.MarriageCertificateDTO) request.getAttribute("dto");
%>
<h2>Marriage Certificate Details</h2>
<p>Groom: <%= dto.getGroomName() %></p>
<p>Bride: <%= dto.getBrideName() %></p>
<p>Location: <%= dto.getLocation() %></p>
<p>Address: <%= dto.getAddress() %></p>
<p>Religion: <%= dto.getReligion() %></p>
<p>Date: <%= dto.getDate() %></p>
<p>Witness 1: <%= dto.getWitness1() %></p>
<p>Witness 2: <%= dto.getWitness2() %></p>
<p>Officer Present: <%= dto.getOfficerPresent() %></p>
