package org.funnypinky.planTableElectron;

import com.sun.jna.platform.win32.Secur32;
import com.sun.jna.ptr.IntByReference;

import java.util.Arrays;

public class Helper {

    public static String userName() {
            //Windows
        char[] name = new char[1024];
        Secur32.INSTANCE.GetUserNameEx(
                Secur32.EXTENDED_NAME_FORMAT.NameDisplay,
                name, new IntByReference(name.length)
        );
        return new String(name).trim();
    }
}
