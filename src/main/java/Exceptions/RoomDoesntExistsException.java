package Exceptions;

import Panels.MainPanel;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RoomDoesntExistsException extends Exception {
    public RoomDoesntExistsException(Logger logger) throws IOException {
        super("Dany pokój już nie istnieje!");
        String[] takeIt = new String[]{"RoomExist"};
        Properties properties = new Properties();
       logger.error(this);
        FileInputStream is = new FileInputStream("config.properties");
        properties.load(is);
        JOptionPane.showMessageDialog(null, MainPanel.ReadXmlLanguage(properties.getProperty("DefaultLanguage"), takeIt,logger)[0]);
    }
}

//wyjątek rzucany w przypadku próby usunięcia nieistniejącego pokoju
