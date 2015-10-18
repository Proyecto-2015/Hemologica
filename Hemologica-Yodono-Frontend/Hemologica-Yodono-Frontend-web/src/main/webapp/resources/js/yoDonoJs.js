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

function holamundo(){
	
	console.log("hola mundoooooo");
	var hola = "hola mundoooooo";
	
	return "hola mundoooooo";
	
}