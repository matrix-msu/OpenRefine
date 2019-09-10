package org.openrefine.wikidata.schema;

import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;
import java.io.FileNotFoundException;

public class WbGetConfigValues {
        InputStream inputStream;
        
        public static Properties extensionProperties;
        
        private static String PROP_FILE_NAME = "wikidata.properties";
        private static String REFERS_TO_PLACE_OF_ORIGIN_PROPERTY = "P31";
        private static String SUBCLASS_OF_PROPERTY = "P2";
        private static String DEFAULT_ENTITY_URI = "https://sandro-16.matrix.msu.edu/wiki/Special:EntityData/";
        
        public WbGetConfigValues() {
                try {
                        extensionProperties = loadPropFile();
                } catch (IOException e) {
                        System.out.println("Exception: " + e);
                }
        }
        
        public String getEntityUriValue() {
                if(extensionProperties == null) {
                        return DEFAULT_ENTITY_URI;
                }
                
                return extensionProperties.getProperty("entity.iri", DEFAULT_ENTITY_URI);

        }
        
        public String getReferstoPlaceofOriginValue() {
                if(extensionProperties == null) {
                        return REFERS_TO_PLACE_OF_ORIGIN_PROPERTY;
                }
                
                return extensionProperties.getProperty("referstoPlaceofOrigin.prop", REFERS_TO_PLACE_OF_ORIGIN_PROPERTY);
        }
        
        public String getSubclassOfValue() {
                if(extensionProperties == null) {
                        return SUBCLASS_OF_PROPERTY;
                }
                
                return extensionProperties.getProperty("subclassOf.prop", SUBCLASS_OF_PROPERTY);
        }
        
        private Properties loadPropFile() throws IOException {
                Properties ps = new Properties();
                
                try {
                        inputStream = getClass().getClassLoader().getResourceAsStream(PROP_FILE_NAME); 
                        if (inputStream != null) {
                                ps.load(inputStream);
                        } else {
                                throw new FileNotFoundException("property file '" + PROP_FILE_NAME + "' not found in the classpath");
                        }
                } catch (Exception e) {
                        System.out.println("Exception: " + e);
                } finally {
                        inputStream.close();
                }
                return ps;
        }
}
