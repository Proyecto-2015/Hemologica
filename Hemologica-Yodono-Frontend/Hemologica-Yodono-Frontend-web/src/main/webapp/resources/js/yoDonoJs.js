/**
 * 
 */

/**
 * Facebook
 */
 window.fbAsyncInit = function() {
    FB.init({
      appId      : '956915034395251',
      xfbml      : true,
      version    : 'v2.5'
    });
  };

  (function(d, s, id){
     var js, fjs = d.getElementsByTagName(s)[0];
     if (d.getElementById(id)) {return;}
     js = d.createElement(s); js.id = id;
     js.src = "//connect.facebook.net/en_US/sdk.js";
     fjs.parentNode.insertBefore(js, fjs);
   }(document, 'script', 'facebook-jssdk'));

(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/es_LA/sdk.js#xfbml=1&amp;version=v2.5&amp;appId=956915034395251";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));
			
//-------------------------
 
/**
 * Twitter
 */
!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');
  
 
  
/**
 * 
 * @param date
 * @returns {String}
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


function readPicture(input, output)
{
    if (input.files && input.files[0])
    {
        var reader = new FileReader();
        reader.onload = function(e)
        {
            output.attr('src', e.target.result);
        };
        reader.readAsDataURL(input.files[0]);
    }
}
