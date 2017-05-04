/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

/**
 *
 * @author mehdi
 */
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ReadGoogleSheet {

    /**
     * LOG4j 
     */
    final Logger logger = Logger.getLogger(ReadGoogleSheet.class);
    
    /**
     * Application name.
     */
    private static final String APPLICATION_NAME
            = "Google Sheets API Java Quickstart";

    /**
     * Directory to store user credentials for this application.
     */
    private   final java.io.File DATA_STORE_DIR = new java.io.File(
            System.getProperty("user.home"), ".credentials/sheets.googleapis.com-java-quickstart");

    /**
     * Global instance of the {@link FileDataStoreFactory}.
     */
    private   FileDataStoreFactory DATA_STORE_FACTORY;

    /**
     * Global instance of the JSON factory.
     */
    private   final JsonFactory JSON_FACTORY
            = JacksonFactory.getDefaultInstance();

    /**
     * Global instance of the HTTP transport.
     */
    private   HttpTransport HTTP_TRANSPORT;

    /**
     * Global instance of the scopes required by this quickstart.
     *
     * If modifying these scopes, delete your previously saved credentials at
     * ~/.credentials/sheets.googleapis.com-java-quickstart
     */
    private   final List<String> SCOPES
            = Arrays.asList(SheetsScopes.SPREADSHEETS_READONLY);
    
      {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Creates an authorized Credential object.
     *
     * @return an authorized Credential object.
     * @throws IOException
     */
    public   Credential authorize() throws IOException {
        // Load client secrets.
        InputStream in
                = ReadGoogleSheet.class.getResourceAsStream("/client_secret.json");
        GoogleClientSecrets clientSecrets
                = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow
                = new GoogleAuthorizationCodeFlow.Builder(
                        HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                        .setDataStoreFactory(DATA_STORE_FACTORY)
                        .setAccessType("offline")
                        .build();
        Credential credential = new AuthorizationCodeInstalledApp(
                flow, new LocalServerReceiver()).authorize("user");
        
        logger.info("Credentials saved to" + DATA_STORE_DIR.getAbsolutePath());
//        System.out.println(
//                "Credentials saved to " + DATA_STORE_DIR.getAbsolutePath());
        return credential;
    }

    /**
     * Build and return an authorized Sheets API client service.
     *
     * @return an authorized Sheets API client service
     * @throws IOException
     */
    public   Sheets getSheetsService() throws IOException {
        Credential credential = authorize();
        return new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    public  List<List<Object>> readGoogleSheet(String spreadsheetId, String range) {
        
//        List<ServiceCatalog>  catalog = new ArrayList<ServiceCatalog>();
        try {
            
            // Build a new authorized API client service.
            
            Sheets service = null;
            
            try {
                service = getSheetsService();
            } catch (IOException ex) {
                logger.error("Method readGoogleSheet : Can not connect to google spreedsheet");
            }

            // Prints the names and majors of students in a sample spreadsheet:
            // https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
            ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();

//        System.out.println("++++++++++++++" + response.getRange());
            List<List<Object>> values = response.getValues();
            if (values == null || values.size() == 0) {
                logger.info("Method readGoogleSheet : No data found in google speadsheet");
                return null;
//                System.out.println("No data found.");
            } else {
                logger.info("start to reading from google sheet Id =" + spreadsheetId);
                return values;
//                List<ServiceCatalog> serviceList = new ArrayList<ServiceCatalog>();
/**                
//                System.out.println("Name, Major");
                for (List row : values) {
                    // Print columns A and E, which correspond to indices 0 and 4.
                    for (Object s : row) {
                        System.out.print("   " + s.toString());
                    }
                    System.out.println("");
//            System.out.printf("%s, %s %s %s\n", row.get(0), row.get(1),row.get(2),row.get(3));

                }
                for (int i = 0; i < values.size(); i++) {
                    for (int j = 0; j < values.get(i).size(); j++) {
                        System.out.print("     "+values.get(i).get(j).toString());
                    }
                    System.out.println("");
                    
                }
                */
            }
            
        } catch (IOException ex) {
            System.err.println(ex);
            logger.error("Can not read from google spreadsheet.");
        }
        return null;
    }
    
    public static void main(String[] args) throws IOException {
        ReadGoogleSheet r = new ReadGoogleSheet();
//        r.readGoogleSheet();
    }
    
}
