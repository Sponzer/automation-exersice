package utilities;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ServerManager {
    public void startSeleniumGrid() {
        try {
            Process startSeleniumGrid=Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"java -jar selenium-server-standalone-3.141.59.jar -role hub -hubConfig hubconfig.json",
                    null, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\grid\\"));
            Thread.sleep(10000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void startAppiumNodes() {
        Map<String,String> nodes = new HashMap<String,String>();
        nodes.put("oreo.json","4730");
        nodes.put("pie.json","4731");
        nodes.put("q.json","4732");
        Iterator<Map.Entry<String, String>> itr = nodes.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, String> entry = itr.next();

            try {
                Process startAppiumNodes=Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p "+entry.getValue()+" --nodeconfig "+entry.getKey()+"",
                        null, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\grid\\"));
                Thread.sleep(10000);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void startEmulators() {
        ArrayList<String> emulators = new ArrayList<String>();
        emulators.add("@API27_Oreo_8.1_Pixel2");
        emulators.add("@API28_Pie_9_Pixel2");
        emulators.add("@API29_Q_10_Pixel2");

        for(int i=0;i<emulators.size();i++){
            System.out.println(emulators.get(i));
            try {
                Process startEmulators=Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"emulator "+emulators.get(i)+"",
                null, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\grid\\"));
                Thread.sleep(10000);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        ServerManager appiumServer = new ServerManager();
        appiumServer.startSeleniumGrid();
        appiumServer.startAppiumNodes();
        appiumServer.startEmulators();
    }
}
