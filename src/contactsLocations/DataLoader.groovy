package contactsLocations

class DataLoader {
	def userLocationMapping = [[],[]]

	public DataLoader() {
		userLocationMapping = [
			['905092951', '000100'],
			['904889308', '000200'],
			['905302685', '000300'],
			['905188003', '000300'],
			['905134236', '000300'],
			['905087345', '000300']
		]
	}
	
	public getValues() {
		return userLocationMapping
	}

	/*			'905092951' : '000100',
			'904889308' : '000200',
			'905302685' : '000300',
			'905188003' : '000300',
			'905134236' : '000300',
			'905087345' : '000300',

*userID:'905097260', userLocation: '000100'
*/
}
