<%
com.xworkz.general.dto.DrivingLicenseDTO dto =
(com.xworkz.general.dto.DrivingLicenseDTO) request.getAttribute("dto");
%>
<h2>Driving License Submitted</h2>
<p>Name: <%= dto.getName() %></p>
<p>Address: <%= dto.getAddress() %></p>
<p>Mobile: <%= dto.getMobile() %></p>
<p>Applied Date: <%= dto.getAppliedDate() %></p>
<p>Vehicle Type: <%= dto.getVehicleType() %></p>
