// Credit to MCreator for most of this script
package io.github.actuallyasmartname.detectors;

public class OSDetector {

	public static final int WIN = 1;
	public static final int MACOS = 2;
	public static final int LINUXOS = 3;

	public static final int OSBIT32 = 32;
	public static final int OSBIT64 = 64;
    public static final int JVM64 = 64;
    public static final int JVM32 = 32;

	public static int OS() {
		String os = System.getProperty("os.name");
		if (os.contains("Mac") || os.contains("OS X"))
			return MACOS;
		if (os.contains("Linux"))
			return LINUXOS;
		return WIN;
	}

	public static int Bits() {
		boolean if64bit;
		if (OS() == WIN) {
            if64bit = (System.getenv("ProgramFiles(x86)") != null);
		} else {
            if64bit = (System.getProperty("os.arch").indexOf("64") != -1);
        }

		if (if64bit)
			return OSBIT64;
		return OSBIT32;
	}

	public static int JVMBits() {
		if (System.getProperty("sun.arch.data.model").contains("64")){
            return JVM64;
        } else {
		return JVM32;
    }
	}

	public static String Runtime() {
		if (OS() == WIN) {
			return "cmd";
		} else {
			return "bash";
		}
	}

}
