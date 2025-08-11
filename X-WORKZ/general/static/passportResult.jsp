<%
com.xworkz.general.dto.PassportDTO dto =
(com.xworkz.general.dto.PassportDTO) request.getAttribute("dto");
%>
<h2>Passport Application Submitted</h2>
<p>Name: <%= dto.getApplicantName() %></p>
<p>Aadhar No: <%= dto.getAadharNo() %></p>
<p>Address: <%= dto.getAddress() %></p>
<p>PAN No: <%= dto.getPanNo() %></p>
<p>Country: <%= dto.getCountry() %></p>
<p>State: <%= dto.getState() %></p>
<p>City: <%= dto.getCity() %></p>
<p>PinCode: <%= dto.getPinCode() %></p>
<p>Passport Type: <%= dto.getPassportType() %></p>
<p>Payment Ref No: <%= dto.getPaymentRefNo() %></p>
