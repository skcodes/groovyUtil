package contactsLocations

import java.sql.Connection
import javax.sql.DataSource;
import groovy.sql.Sql;

class dbWriter extends Sql {

	public dbWriter(DataSource dataSource) {
		super(dataSource);
		// Auto-generated constructor stub
	}

	public dbWriter(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	public dbWriter(Sql parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}

	public Boolean storeValue(newUser, newLocation) {
		
		return false;
	}
}
