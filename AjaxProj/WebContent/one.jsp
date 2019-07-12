<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
window.onload = function() { 
 
var chart = new CanvasJS.Chart("chartContainer", {
	animationEnabled: true,
	title: {
		text: "Gravity Vs Escape Velocity of Planets"
	},
	axisX: {
		reversed: true
	},
	axisY: {
		title: "Gravity (m/s²)",
		titleFontColor: "#4F81BC",
		lineColor: "#4F81BC",
		labelFontColor: "#4F81BC",
		tickColor: "#4F81BC"
	},
	axisY2: {
		title: "Escape Velocity (km/s)",
		titleFontColor: "#C0504E",
		lineColor: "#C0504E",
		labelFontColor: "#C0504E",
		tickColor: "#C0504E"
	},
	toolTip: {
		shared: true
	},
	legend: {
		cursor: "pointer",
		itemclick: toggleDataSeries
	},
	data: [{
		type: "bar",
		name: "Gravity",
		axisYType: "primary",
		showInLegend: true,
		yValueFormatString: "#,##0.0 m/s²",
		dataPoints: <%=request.getAttribute("dataPoints1")%>
		
	},
	{
		type: "bar",
		name: "Escape Velocity",
		axisYType: "secondary",
		showInLegend: true,
		yValueFormatString: "#,##0.0 km/s",
		dataPoints: <%=request.getAttribute("dataPoints2")%>
	}]
});
chart.render();
 
function toggleDataSeries(e) {
	if (typeof (e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
		e.dataSeries.visible = false;
	} else {
		e.dataSeries.visible = true;
	}
	e.chart.render();
}
 
}
</script>
</head>
<body>

<div id="chartContainer" style="height: 370px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</body>
</html>                              