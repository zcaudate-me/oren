(ns oren.types
  (:require [hara.object :as object]))

(object/extend-maplike

 oshi.SystemInfo
 {:tag "system"}

 ;; Hardware Types
 oshi.hardware.HardwareAbstractionLayer
 {:tag "hardware"}
 oshi.hardware.platform.windows.WindowsHardwareAbstractionLayer
 {:tag "hardware"}
 oshi.hardware.platform.mac.MacHardwareAbstractionLayer
 {:tag "hardware"}
 oshi.hardware.platform.linux.LinuxHardwareAbstractionLayer
 {:tag "hardware"}

 ;; Display Types
 oshi.hardware.Display
 {:tag "display"}
 oshi.hardware.platform.windows.WindowsDisplay
 {:tag "display"}
 oshi.hardware.platform.mac.MacDisplay
 {:tag "display"}
 oshi.hardware.platform.linux.LinuxDisplay
 {:tag "display"}

 ;; Memory Types
 oshi.hardware.GlobalMemory
 {:tag "memory"}
 oshi.hardware.platform.windows.WindowsGlobalMemory
 {:tag "memory"}
 oshi.hardware.platform.mac.MacGlobalMemory
 {:tag "memory"}
 oshi.hardware.platform.linux.LinuxGlobalMemory
 {:tag "memory"}
  
 ;; PowerSource Types
 oshi.hardware.PowerSource
 {:tag "power"}
 oshi.hardware.platform.windows.WindowsPowerSource
 {:tag "power"}
 oshi.hardware.platform.mac.MacPowerSource
 {:tag "power"}
 oshi.hardware.platform.linux.LinuxPowerSource
 {:tag "power"}

 ;; CPU Types
 oshi.hardware.CentralProcessor
 {:tag "cpu"}
 oshi.hardware.platform.windows.WindowsCentralProcessor
 {:tag "cpu"}
 oshi.hardware.platform.mac.MacCentralProcessor
 {:tag "cpu"}
  oshi.hardware.platform.linux.LinuxCentralProcessor
 {:tag "cpu"}

 ;; FileStore Types
 oshi.software.os.OSFileStore
 {:tag "fs"}
 oshi.software.os.windows.WindowsFileSystem
 {:tag "fs"}
 oshi.software.os.mac.MacFileSystem
 {:tag "fs"}
 oshi.software.os.linux.LinuxFileSystem
 {:tag "fs"}
 
 ;; OS Types
 oshi.software.os.OperatingSystem
 {:tag "os"}
 oshi.software.os.windows.WindowsOperatingSystem
 {:tag "os"}
 oshi.software.os.mac.MacOperatingSystem
 {:tag "os"}
 oshi.software.os.linux.LinuxOperatingSystem
 {:tag "os"}
 
 ;; Version Types
 oshi.software.os.OperatingSystemVersion
 {:tag "info"}
 oshi.software.os.windows.WindowsOSVersionInfoEx
 {:tag "info"}
 oshi.software.os.mac.MacOSVersionInfoEx
 {:tag "info"}
 oshi.software.os.linux.LinuxOSVersionInfoEx
 {:tag "info"})
