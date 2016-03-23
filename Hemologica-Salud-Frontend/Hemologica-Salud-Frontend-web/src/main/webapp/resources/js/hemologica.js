/**
 * 
 */

$(document).ready(function() {
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
         
         "language": {
        	    "paginate": {
        	      "first": "Primero",
        	      "last": "Ultimo",
        	      "next": "Siguiente",
        	      "previous": "Anterior"
        	    }
        	  }
    
    	}	
    );
} );


$(document).ready(function() {
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
         
         "language": {
        	    "paginate": {
        	      "first": "Primero",
        	      "last": "Ultimo",
        	      "next": "Siguiente",
        	      "previous": "Anterior"
        	    }
        	  }
    
    }	
    );
} );

$(document).ready(function() {
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
         
         "language": {
        	    "paginate": {
        	      "first": "Primero",
        	      "last": "Ultimo",
        	      "next": "Siguiente",
        	      "previous": "Anterior"
        	    }
        	  }
    
    }	
    );
} );



