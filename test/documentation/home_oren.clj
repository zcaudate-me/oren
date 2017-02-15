(ns documentation.home-oren
  (:require [oren.core :as oren]))

"**oren** is a wrapper around the [oshi](https://github.com/dblock/oshi) project, a free JNA-based (native) operating system information library for Java. It is an alternative to [sigmund](https://github.com/zcaudate/sigmund) and [sigar](https://github.com/hyperic/sigar) for system information."

[[:chapter {:title "Installation"}]]

"Add to `project.clj` dependencies:

    [im.chit/oren \"{{PROJECT.version}}\"]

**oren.core** contain basic methods for class checking and predicates."

(comment

  (require '[oren.core :as oren]))

[[:chapter {:title "API"}]]

[[:section {:title "Hardware"}]]

[[:api {:namespace "oren.core" :title "" 
        :only ["computer-system"
               "cpu"
               "displays"
               "fs"
               "memory"
               "network-ifs"
               "power"
               "sensors"
               "usb"]}]]

[[:section {:title "OS"}]]

[[:api {:namespace "oren.core" :title "" 
        :only ["os"
               "all"]}]]

[[:section {:title "Process"}]]

[[:api {:namespace "oren.core" :title "" 
        :only ["process-id"
               "process"
               "list-processes"]}]]
