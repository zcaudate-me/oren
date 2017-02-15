(ns oren.types
  (:require [hara.object :as object]))

(def ^:dynamic *platform* (str (oshi.SystemInfo/getCurrentPlatformEnum)))

;; Hardware Abstractions

(object/map-like

 oshi.SystemInfo
 {:tag "system" :read :all}
 oshi.hardware.Baseboard
 {:tag "baseboard" :read :all}
 oshi.hardware.CentralProcessor
 {:tag "cpu" :read :all}
 oshi.hardware.Disks
 {:tag "disks" :read :all}
 oshi.hardware.Display
 {:tag "display" :read :all}
 oshi.hardware.Firmware
 {:tag "firmware" :read :all}
 oshi.hardware.GlobalMemory
 {:tag "memory" :read :all}
 oshi.hardware.HardwareAbstractionLayer
 {:tag "hardware" :read :all}
 oshi.hardware.Networks
 {:tag "networks" :read :all}
 oshi.hardware.PowerSource
 {:tag "power" :read :all}
 oshi.hardware.Sensors
 {:tag "sensors" :read :all}
 oshi.hardware.UsbDevice
 {:tag "usb" :read :all}

 oshi.hardware.HWDiskStore
 {:tag "disk" :read :all}
 oshi.hardware.HWPartition
 {:tag "partition" :read :all}
 
 oshi.hardware.NetworkIF
 {:tag "net" :read :all})

(when (= *platform* "FREEBSD")
  (eval '(object/map-like
          oshi.hardware.platform.unix.freebsd.FreeBsdCentralProcessor
          {:tag "cpu" :read :all}
          oshi.hardware.platform.unix.freebsd.FreeBsdDisks
          {:tag "disks" :read :all}
          oshi.hardware.platform.unix.freebsd.FreeBsdDisplay
          {:tag "display" :read :all}
          oshi.hardware.platform.unix.freebsd.FreeBsdFirmware
          {:tag "firmware" :read :all}
          oshi.hardware.platform.unix.freebsd.FreeBsdGlobalMemory
          {:tag "memory" :read :all}
          oshi.hardware.platform.unix.freebsd.FreeBsdHardwareAbstractionLayer
          {:tag "hardware" :read :all}
          oshi.hardware.platform.unix.freebsd.FreeBsdNetworks
          {:tag "networks" :read :all}
          oshi.hardware.platform.unix.freebsd.FreeBsdPowerSource
          {:tag "power" :read :all}
          oshi.hardware.platform.unix.freebsd.FreeBsdSensors
          {:tag "sensors" :read :all}
          oshi.hardware.platform.unix.freebsd.FreeBsdUsbDevice
          {:tag "usb" :read :all})))

(when (= *platform* "LINUX")
  (eval '(object/map-like
          oshi.hardware.platform.linux.LinuxCentralProcessor
          {:tag "cpu" :read :all}
          oshi.hardware.platform.linux.LinuxDisks
          {:tag "disks" :read :all}
          oshi.hardware.platform.linux.LinuxDisplay
          {:tag "display" :read :all}
          oshi.hardware.platform.linux.LinuxFirmware
          {:tag "firmware" :read :all}
          oshi.hardware.platform.linux.LinuxGlobalMemory
          {:tag "memory" :read :all}
          oshi.hardware.platform.linux.LinuxHardwareAbstractionLayer
          {:tag "hardware" :read :all}
          oshi.hardware.platform.linux.LinuxNetworks
          {:tag "networks" :read :all}
          oshi.hardware.platform.linux.LinuxPowerSource
          {:tag "power" :read :all}
          oshi.hardware.platform.linux.LinuxSensors
          {:tag "sensors" :read :all}
          oshi.hardware.platform.linux.LinuxUsbDevice
          {:tag "usb" :read :all})))

(when (= *platform* "MACOSX")
  (eval '(object/map-like
          oshi.hardware.platform.mac.MacCentralProcessor
          {:tag "cpu" :read :all}
          oshi.hardware.platform.mac.MacComputerSystem
          {:tag "sys" :read :all}
          oshi.hardware.platform.mac.MacDisks
          {:tag "disks" :read :all}
          oshi.hardware.platform.mac.MacDisplay
          {:tag "display" :read :all}
          oshi.hardware.platform.mac.MacFirmware
          {:tag "firmware" :read :all}
          oshi.hardware.platform.mac.MacGlobalMemory
          {:tag "memory" :read :all}
          oshi.hardware.platform.mac.MacHardwareAbstractionLayer
          {:tag "hardware" :read :all}
          oshi.hardware.platform.mac.MacNetworks
          {:tag "networks" :read :all}
          oshi.hardware.platform.mac.MacPowerSource
          {:tag "power" :read :all}
          oshi.hardware.platform.mac.MacSensors
          {:tag "sensors" :read :all}
          oshi.hardware.platform.mac.MacUsbDevice
          {:tag "usb" :read :all})))

(when (= *platform* "SOLARIS")
  (eval '(object/map-like
          oshi.hardware.platform.unix.solaris.SolarisCentralProcessor
          {:tag "cpu" :read :all}
          oshi.hardware.platform.unix.solaris.SolarisDisks
          {:tag "disks" :read :all}
          oshi.hardware.platform.unix.solaris.SolarisDisplay
          {:tag "display" :read :all}
          oshi.hardware.platform.unix.solaris.SolarisFirmware
          {:tag "firmware" :read :all}
          oshi.hardware.platform.unix.solaris.SolarisGlobalMemory
          {:tag "memory" :read :all}
          oshi.hardware.platform.unix.solaris.SolarisHardwareAbstractionLayer
          {:tag "hardware" :read :all}
          oshi.hardware.platform.unix.solaris.SolarisNetworks
          {:tag "networks" :read :all}
          oshi.hardware.platform.unix.solaris.SolarisPowerSource
          {:tag "power" :read :all}
          oshi.hardware.platform.unix.solaris.SolarisSensors
          {:tag "sensors" :read :all}
          oshi.hardware.platform.unix.solaris.SolarisUsbDevice
          {:tag "usb" :read :all})))

(when (= *platform* "WINDOWS")
  (eval '(object/map-like
          oshi.hardware.platform.windows.WindowsCentralProcessor
          {:tag "cpu" :read :all}
          oshi.hardware.platform.windows.WindowsDisks
          {:tag "disks" :read :all}
          oshi.hardware.platform.windows.WindowsDisplay
          {:tag "display" :read :all}
          oshi.hardware.platform.windows.WindowsFirmware
          {:tag "firmware" :read :all}
          oshi.hardware.platform.windows.WindowsGlobalMemory
          {:tag "memory" :read :all}
          oshi.hardware.platform.windows.WindowsHardwareAbstractionLayer
          {:tag "hardware" :read :all}
          oshi.hardware.platform.windows.WindowsNetworks
          {:tag "networks" :read :all}
          oshi.hardware.platform.windows.WindowsPowerSource
          {:tag "power" :read :all}
          oshi.hardware.platform.windows.WindowsSensors
          {:tag "sensors" :read :all}
          oshi.hardware.platform.windows.WindowsUsbDevice
          {:tag "usb" :read :all})))

;; Software Abstractions

(object/map-like

 oshi.software.os.FileSystem
 {:tag "file" :read :all}
 oshi.software.os.OSFileStore
 {:tag "fs" :read :all}
 oshi.software.os.OperatingSystem
 {:tag "os" :read :all}
 oshi.software.os.OperatingSystemVersion
 {:tag "version" :read :all}
 oshi.software.os.OSProcess
 {:tag "process" :read :all})

(when (= *platform* "FREEBSD")
  (eval '(object/map-like
          oshi.software.os.unix.freebsd.FreeBsdFileSystem
          {:tag "fs" :read :all}
          oshi.software.os.unix.freebsd.FreeBsdOperatingSystem
          {:tag "os" :read :all}
          oshi.software.os.unix.freebsd.FreeBsdOSVersionInfoEx
          {:tag "info" :read :all}
          oshi.software.os.unix.freebsd.FreeBsdProcess
          {:tag "process" :read :all})))

(when (= *platform* "LINUX")
  (eval '(object/map-like
          oshi.software.os.linux.LinuxFileSystem
          {:tag "fs" :read :all}
          oshi.software.os.linux.LinuxOperatingSystem
          {:tag "os" :read :all}
          oshi.software.os.linux.LinuxOSVersionInfoEx
          {:tag "info" :read :all}
          oshi.software.os.linux.LinuxProcess
          {:tag "process" :read :all})))

(when (= *platform* "MACOSX")
  (eval '(object/map-like
          oshi.software.os.mac.MacFileSystem
          {:tag "fs" :read :all}
          oshi.software.os.mac.MacOperatingSystem
          {:tag "os" :read :all}
          oshi.software.os.mac.MacOSVersionInfoEx
          {:tag "info" :read :all}
          oshi.software.os.mac.MacProcess
          {:tag "process" :read :all})))

(when (= *platform* "SOLARIS")
  (eval '(object/map-like
          oshi.software.os.unix.solaris.SolarisFileSystem
          {:tag "fs" :read :all}
          oshi.software.os.unix.solaris.SolarisOperatingSystem
          {:tag "os" :read :all}
          oshi.software.os.unix.solaris.SolarisOSVersionInfoEx
          {:tag "info" :read :all}
          oshi.software.os.unix.solaris.SolarisProcess
          {:tag "process" :read :all})))

(when (= *platform* "WINDOWS")
  (eval '(object/map-like
          oshi.software.os.windows.WindowsFileSystem
          {:tag "fs" :read :all}
          oshi.software.os.windows.WindowsOperatingSystem
          {:tag "os" :read :all}
          oshi.software.os.windows.WindowsOSVersionInfoEx
          {:tag "info" :read :all}
          oshi.software.os.windows.WindowsProcess
          {:tag "process" :read :all})))


