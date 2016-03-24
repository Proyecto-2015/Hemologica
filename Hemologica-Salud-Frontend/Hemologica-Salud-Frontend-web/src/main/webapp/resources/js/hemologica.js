/**
 * 
 */

$(document).ready(function() {
	
	persontableDonation();
	persontableTransfusion();
	persontable();
    
} );



function persontableDonation() {
	
	$('#persontableDonation').DataTable({
		
		 'bSort': false,
	    'aoColumns': [
	          { sWidth: "15%", bSearchable: false, bSortable: false },
	          { sWidth: "15%", bSearchable: false, bSortable: false },
	          { sWidth: "15%", bSearchable: false, bSortable: false },
	          { sWidth: "15%", bSearchable: false, bSortable: false },
	          { sWidth: "15%", bSearchable: false, bSortable: false },
	          { sWidth: "15%", bSearchable: false, bSortable: false },
	          { sWidth: "15%", bSearchable: false, bSortable: false },
	          { sWidth: "15%", bSearchable: false, bSortable: false }
	    ],
	    "scrollY":        "200px",
	    "scrollCollapse": false,
	    "info":           false,
	    "paging":         true,
	    "searching":			false,
	    "bLengthChange" : false,
	    "pageLength": 50,
	    "retrieve": true,
	    
	    "language": {
	   	    "paginate": {
	   	      "first": "Primero",
	   	      "last": "Ultimo",
	   	      "next": "Siguiente",
	   	      "previous": "Anterior"
	   	    }
	   	  }
	})
}



function  persontableTransfusion(){
    $('#persontableTransfusion').DataTable({
    	
    	 'bSort': false,
         'aoColumns': [
               { sWidth: "15%", bSearchable: false, bSortable: false },
               { sWidth: "15%", bSearchable: false, bSortable: false },
               { sWidth: "15%", bSearchable: false, bSortable: false },
               { sWidth: "15%", bSearchable: false, bSortable: false },
               { sWidth: "15%", bSearchable: false, bSortable: false },
               { sWidth: "15%", bSearchable: false, bSortable: false },
               { sWidth: "15%", bSearchable: false, bSortable: false }
               
         ],
         "scrollY":        "200px",
         "scrollCollapse": false,
         "info":           false,
         "paging":         true,
         "searching":			false,
         "bLengthChange" : false,
         "pageLength": 50,
         "retrieve": true,
         
         "language": {
        	    "paginate": {
        	      "first": "Primero",
        	      "last": "Ultimo",
        	      "next": "Siguiente",
        	      "previous": "Anterior"
        	    }
        	  }
    
    });
}

function persontable(){
	
    $('#persontable').DataTable({
    	
    	 'bSort': false,
         'aoColumns': [
               { sWidth: "15%", bSearchable: false, bSortable: false },
               { sWidth: "15%", bSearchable: false, bSortable: false },
               { sWidth: "15%", bSearchable: false, bSortable: false },
               { sWidth: "15%", bSearchable: false, bSortable: false },
               { sWidth: "15%", bSearchable: false, bSortable: false }
               
         ],
         "scrollY":        "200px",
         "scrollCollapse": false,
         "info":           false,
         "paging":         true,
         "searching":			false,
         "bLengthChange" : false,
         "pageLength": 50,
         "retrieve": true,
         
         "language": {
        	    "paginate": {
        	      "first": "Primero",
        	      "last": "Ultimo",
        	      "next": "Siguiente",
        	      "previous": "Anterior"
        	    }
        	  }
    
    });
}



