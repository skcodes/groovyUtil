package contactsLocations

import groovy.sql.Sql

class LocationUpdater {

	static main(args) {
		/*
		def dbResults = []
		contactsDBConnection.eachRow( 'select * from userLocation' ) { 
			println "$it.userid -- ${it.locationID} --"
			//dbResults << it.toRowResult()
		}
		*/
		DataLoader data1 = new DataLoader()
		
		def contactsDBConnection = Sql.newInstance(
			'jdbc:h2:contactsTestDB;MVCC=TRUE;LOCK_TIMEOUT=10000',
			'sa',
			'',
			'org.h2.Driver'
		)
		//contactsDBConnection.execute("create table userLocation (userid varchar(9), locationid varchar(6))")
		
		//define a dataset for the "userLocation" table and print its contents
		def userLocationData = contactsDBConnection.dataSet("userLocation")
		
		userLocationData.each {item ->
			println item.userid + ", " + item.locationid}
		println "listing above this line shows what is currently in table (userLocation)."
		
		//go through the values in the DataLoader file and write them to the "userLocation" table
		for (entry in data1.getValues() ) {
			//println "Will attempt to insert: userid:${entry.key}, locationid:${entry.value}"
			println entry[0] + ",  " + entry[1]
			//contactsDBConnection.execute("insert into userLocation (userid, locationid) values (${entry.key}, ${entry.value})")
			//userLocationData.add(userid: entry[0], locationid: entry[1]) 
			
		}
			
			
		println "that's all, folks."
		//userLocationData.
	}


}
