<%@include file="/apps/mywebsite/global.jsp"%>
<%@ page import="org.apache.sling.commons.json.io.JSONWriter,
				org.w3c.dom.*" %><%
String filter = request.getParameter("filter");
   
com.pc.chart.CustomerService cs = sling.getService(com.pc.chart.CustomerService.class);
   
String XML = cs.getCustRevenue() ; 
    
//Send the data back to the client 
JSONWriter writer = new JSONWriter(response.getWriter());
writer.object();
writer.key("xml");
writer.value(XML);
   
writer.endObject();
%>