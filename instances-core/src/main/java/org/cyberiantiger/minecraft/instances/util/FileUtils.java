/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cyberiantiger.minecraft.instances.util;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author antony
 */
public class FileUtils {
    
    public static boolean deleteRecursively(File file) throws IOException {
        if (file.isDirectory()) {
            boolean success = true;
            for (File child : file.listFiles()) {
                if (!deleteRecursively(child)) {
                    success = false;
                }
            }
            if (success) {
                return file.delete();
            } else {
                return success;
            }
        } else if (file.isFile()) {
            return file.delete();
        } else {
            // Does not exist
            return false;
        }
    }
}
