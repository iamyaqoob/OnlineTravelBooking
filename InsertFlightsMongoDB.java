import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertFlightsMongoDB {

	public static void main(String lol[]) throws IOException, ParseException {

		MongoClient mongo = new MongoClient("localhost", 27017);
		MongoDatabase db = mongo.getDatabase("onlineTravelBooking");
		MongoCollection<Document> collection = db.getCollection("FLIGHTS");

		File file = new File("C:\\Users\\Yaqoob\\Desktop\\study\\eclipse\\Practice\\flights.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		String s[];
		Document doc;

		while ((st = br.readLine()) != null) {
			// System.out.println(st);
			s = st.split(" ");

			// AIRLINE | IATA_CODE | DEPT_CITY | ARR_CITY | DEPT_TIME | ARR_TIME | SEATS
			// Air-India AI Pune Kolkata 24/04/2018-19:40 24/04/2018-21:40 50

			String AIRLINE = s[0].replace('-', ' ');
			String IATA_CODE = s[1];
			String DEPT_CITY = s[2];
			String ARR_CITY = s[3];
			int SEATS = Integer.parseInt(s[6]);

			String DEPT__TIME = s[4];
			Date DEPT_TIME = new SimpleDateFormat("dd/MM/yyyy-HH:mm").parse(DEPT__TIME);
			// System.out.println(DEPT_TIME);

			String ARR__TIME = s[5];
			Date ARR_TIME = new SimpleDateFormat("dd/MM/yyyy-HH:mm").parse(ARR__TIME);
			// System.out.println(ARR_TIME);

			doc = new Document("AIRLINE", AIRLINE).append("IATA_CODE", IATA_CODE).append("DEPT_CITY", DEPT_CITY)
					.append("ARR_CITY", ARR_CITY).append("DEPT_TIME", DEPT_TIME).append("ARR_TIME", ARR_TIME)
					.append("SEATS", SEATS);

			collection.insertOne(doc);

		}

		mongo.close();

	}
}
