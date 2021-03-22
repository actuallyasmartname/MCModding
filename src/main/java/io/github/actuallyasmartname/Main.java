package io.github.actuallyasmartname;


import java.util.logging.Logger;

import io.github.actuallyasmartname.detectors.OSDetector;

public class Main {
    public static final Logger logger = Logger.getLogger(Main.class.getName()); 
    {
        if (OSDetector.OS() == OSDetector.MACOS) {
			System.setProperty("javafx.embed.singleThread", "true");
		}
    if (OSDetector.Bits() > OSDetector.JVMBits());{
        logger.info("Terminating process because your JVM is 32 bit and you are on a 64 bit environment");
        System.exit(0);
    }
    if (OSDetector.JVMBits() > OSDetector.Bits()); {
        logger.info("Terminating process because your system is 32 bit however you are using a 64 bit JVM");
        System.exit(0);
    }
     
  }
}

