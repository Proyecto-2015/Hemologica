/**
 * 
 */

function getStringDifDates(date) {
	
	console.log("fecha donacion " + date);
	var today = new Date();
	console.log("fecha hoy " + date);
	
	var parts = date.split('/');
	var donationDate = new Date(parts[2],parts[0]-1,parts[1]);
	
	var diffDays = today.getTime() - donationDate.getTime();
	
	console.log("dif dias " + diffDays);
	
	var result = "hace ";
	if(diffDays > 365){
		
		result += (diffDays % 365) + "año";
		if((diffDays % 365) > 1)
			result +="s";
	}else if(diffDays >31){
		result += (diffDays % 31) + "mes";
		if((diffDays % 31) > 1)
			result +="es";
		
	}else{
		result += diffDays + "dia";
		if((diffDays) > 1)
			result +="s";
	}
	
	console.log("Salida " + result);
	return result;
	
}

function enablesInputs(){
	
//	PF("birthday_date").disabled=true;
	
	document.getElementById("userForm:birthday_date").disabled=false;
	
	document.getElementById("state").disabled=false;
	document.getElementById("city").disabled=false;
	document.getElementById("address").disabled=false;
	document.getElementById("telephone").disabled=false;
	document.getElementById("email").disabled=false;
	document.getElementById("userForm:allowNotificationNeedDonor").disabled=false;
	document.getElementById("userForm:allowNotificationAbleToDonate").disabled=false;

}
var map;
var panorama;
jQuery(function($) {
    $(document).ready(function() {
        var latlng = new google.maps.LatLng(49.241943,-122.889318);
        var myOptions = {
            zoom: 18,
            center: latlng,
            panControl: true,
            zoomControl: true,
            zoomControlOptions: {
                                  style: google.maps.ZoomControlStyle.SMALL
                                },
            mapTypeControl: false,
            scaleControl: false,
            streetViewControl: false,
            overviewMapControl: true,
            mapTypeId: google.maps.MapTypeId.ROADMAP,
           };
        map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);
        });
});