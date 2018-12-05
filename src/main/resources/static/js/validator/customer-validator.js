$(document).ready(function() {
	$('#customer-form').bootstrapValidator({
		feedbackIcons: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {/*rules*/
			customerID: {
				message: 'Invalid ID',
				validators: {
					notEmpty: {
						message: 'Cannot be empty'
					},
					stringLength: {
						min: 0,
						max: 5,
						message: 'The length should between 0 to 5'
					},
					regexp: {
						regexp: /^[a-zA-Z_]+$/,
						message: 'Should only contain alphabets'
					}
				}
			},
			companyName: {
				message:'Invalid company name',
				validators: {
					notEmpty: {
						message: 'cannot be empty'
					},
					stringLength: {
						min: 0,
						max: 30,
						message: 'The length should between 0 to 30'
					},
					regexp: {
						regexp: /^[a-zA-Z_]+$/,
						message: 'Should only contain alphabets'
					}
				}
			}			
		}
	});
});