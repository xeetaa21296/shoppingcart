$(function() {
	// solving the active menu problem
	switch(menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	case 'Contact Us':
			$('#contact').addClass('active');
			break;
	default:
		if(menu == "Home")break;
	    $('#listProducts').addClass('active');
	    $('#a_'+menu).addClass('active');	
	break;

	}
	
	//code for jquery datatable
	//create a dataset
	var products = [
	                ['1','abc'],
	                ['2','def'],
	                ['3','ghi'],
	                ['4','lmn'],
	                ['5','pqr'],
	                ['6','stw'],
	                ['7','xyz'],
	                ['8','ovk']
	                ];
	var $table = $('#productListTable');
	
	//execute the below code only where we have this table
	if($table.length) {
		
		//console.log('inside the table');
		$table.DataTable({
			lengthMenu: [[3,5,10,-1],['3 Records','5 Records','10 Records','ALL']],
			pageLength: 5,
			data: products
			
		});
	}
});