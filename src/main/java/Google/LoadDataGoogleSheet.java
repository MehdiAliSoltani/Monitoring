/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import Google.ReadGoogleSheet;
import com.mycompany.trywebservice1.Constants;
import com.mycompany.trywebservice1.ControllerUtils;
import com.mycompany.trywebservice1.ServiceCatalog;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author mehdi
 */
public class LoadDataGoogleSheet {

    private Utils utils = new Utils();
    final Logger logger = Logger.getLogger(LoadDataGoogleSheet.class);
    /**
     * global variable store the data loaded from Google Sheet.
     */
//    public  static List<ServiceCatalog> SERVICE_LIST;
    private int serviceName = 0,
            ram = 1,
            diskType = 2,
            diskCapacity = 3,
            virtualization = 4,
            bandWidth = 5,
            traffic = 6,
            datacenter = 7,
            os = 8,
            cpu = 9,
            serviceType = 10,
            providerLink = 11,
            installation = 12,
            operation = 13,
            cpuType=14,
            providerId =15;

    public ServiceCatalog extractData(List<Object> aRow) {
        ServiceCatalog tempService = new ServiceCatalog();

        tempService.setServiceType(utils.retString(aRow.get(this.serviceType).toString()));
        tempService.setServerName(utils.retString(aRow.get(this.serviceName).toString()));
//        tempService.setCPUType(aRow.get(2).toString());
        tempService.setNumberOfCore(utils.extractDigits(aRow.get(this.cpu).toString()));

        tempService.setRam(
                utils.convertToMBytes(
                        aRow.get(this.ram).toString()));

        tempService.setDiskType(utils.splitString(aRow.get(this.diskType).toString(), "[/]"));
        tempService.setDiskCapacity(utils.convertToMBytes(aRow.get(this.diskCapacity).toString()));

        tempService.setVirtualizationType(utils.retString(aRow.get(this.virtualization).toString()));
        tempService.setBandWidth(utils.convertToMBytes(aRow.get(this.bandWidth).toString()));
        tempService.setMountlyTraffic(utils.convertToMBytes(aRow.get(this.traffic).toString()));
        tempService.setDatacenterProvider(utils.retString(aRow.get(this.datacenter).toString()));
//        tempService.setPanel(convertToList(utils.splitString(aRow.get(11).toString(), "[/]")));
        tempService.setOS(utils.splitString(aRow.get(this.os).toString(), "[/]"));
//        tempService.setSupport(aRow.get(13).toString());
//        tempService.setRoutableIP(Integer.parseInt(utils.extractDigits(aRow.get(14).toString())));
//        tempService.setDeliveryTime(aRow.get(15).toString());
        tempService.setProviderLink(utils.retString(aRow.get(this.providerLink).toString()));
        tempService.setInstallationFee(utils.extractDigits(aRow.get(this.installation).toString()));
        tempService.setOperationFee(utils.extractDigits(aRow.get(this.operation).toString()));

        return tempService;
    }

    public   List<ServiceCatalog> loadSheetInMemory() {
        ReadGoogleSheet readSheet = new ReadGoogleSheet();
        List<List<Object>> dataFromSheet = readSheet.readGoogleSheet(
                Constants.SPREAD_SHEET_ID, Constants.RANGE);

        setDictionary(dataFromSheet.get(0));
        List<ServiceCatalog> serviceList = new ArrayList<ServiceCatalog>();
        for (int i = 1; i < dataFromSheet.size(); i++) {

//            System.out.println("");
//            List<Object> o = dataFromSheet.get(i);
//            ServiceCatalog s = extractData(o);
//            serviceList.add(s);
            serviceList.add(extractData(dataFromSheet.get(i)));
        }
        return serviceList;
    }

    private void setDictionary(List<Object> row0) {
        for (int i = 0; i < row0.size(); i++) {
            String val = row0.get(i).toString();
            switch (val) {
                case "SERVICENAME":
                    this.serviceName = i;
                    break;
                case "RAM":
                    this.ram = i;
                    break;
                case "DISKTYPE":
                    this.diskType = i;
                    break;
                case "DISK":
                    this.diskCapacity = i;
                    break;
                case "VIRTUALIZATION":
                    this.virtualization = i;
                    break;
                case "BW":
                    this.bandWidth = i;
                    break;
                case "TRAFFIC":
                    this.traffic = i;
                    break;
                case "DC":
                    this.datacenter = i;
                    break;
                case "OS":
                    this.os = i;
                    break;
                case "CPU":
                    this.cpu = i;
                    break;
                case "SERVICETYPE":
                    this.serviceType = i;
                    break;
                case "PROVIDERLINK":
                    this.providerLink = i;
                    break;
                case "INSTALLATION":
                    this.installation = i;
                    break;
                case "OPERATION":
                    this.operation = i;
                    break;
                case "CPUTYPE":
                    this.cpuType = i;
                    break;
                case "PROVIDERID":
                    this.providerId = i;
                    break;
                default:
                    logger.error("Incompatible data dictionary, please check the google sheet dictionary");
            }
        }
    }

//    public LoadDataGoogleSheet() {
//            
//        serviceList = loadSheetInMemory();
//    }
    

    public static void main(String[] args) {
        LoadDataGoogleSheet l = new LoadDataGoogleSheet();
//        SERVICE_LIST = l.loadSheetInMemory();
        ControllerUtils u = new ControllerUtils();
        List<List<String>> a = u.getInitValue();
        System.out.println("********");
    }
}
