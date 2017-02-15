# oren

system and process monitoring for clojure

![O Ren Ishii](https://raw.githubusercontent.com/zcaudate/oren/master/kill-bill-lucy-liu-o-ren-ishii.jpg)

    At a time when I knew the least about my enemies,
    the first name on my Death List, O-Ren Ishii, was
    the easiest to find. But of course when one manages
    the hard task of becoming queen of the Tokyo underworld,
    one doesn't keep it a secret, does one?
     
    - Beatrix Kiddo, Kill Bill
  
## Overview

`oren` is a wrapper around the [oshi](https://github.com/dblock/oshi) project, a free JNA-based (native) operating system information library for Java. It is an alternative to [sigmund](https://github.com/zcaudate/sigmund) and [sigar](https://github.com/hyperic/sigar) for system information.

## Installation

Add to project.clj dependencies:

```clojure
[im.chit/oren "0.1.6"]
```

## Usage

All functionality is contained within `oren.core`:

```clojure
(require '[oren.core :as oren])

```

To view all information regarding the system:

```clojure
(oren/all)
=>  {:operating-system {:family "Mac OS X",
                        :manufacturer "Apple",
                        :version {:build-number "15D21",
                        :code-name "El Capitan",
                        :version "10.11.3"}}

     :hardware   {:file-stores [{:description "Local Disk",
                                 :name "Macintosh HD (/)",
                                 :total-space 249821663232,
                                 :usable-space 6691004416}],
                  :memory {:available 5489655808,
                           :total 17179869184},
                  :power-sources [{:name "InternalBattery-0",
                                   :remaining-capacity 1.0,
                                   :time-remaining -2.0}],
                  :displays [{:edid [0 -1 -1 -1 -1 -1 -1 0 6 16 34 -96 0 0 0 0 4 23 1 4 -91 33 21 120 2 111 -79 -89 85 76 -98 37 12 80 84 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 -17 -125 64 -96 -80 8 52 112 48 32 54 0 75 -49 16 0 0 26 0 0 0 -4 0 67 111 108 111 114 32 76 67 68 10 32 32 32 0 0 0 16 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 16 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 -34]}],
                  :processor {:vendor "GenuineIntel",
                              :physical-processor-count 4,
                              :system-serial-number "C02PJ3F4G3QC",
                              :system-cpu-load 0.05301345350347394,
                              :family "6",
                              :processor-cpu-load-between-ticks [0.17663193631951368
                                                                 0.010866610560713695
                                                                 0.13377820387398162
                                                                 0.011582505842628765
                                                                 0.13342550941401995
                                                                 0.011683154589585269
                                                                 0.1329983810870803
                                                                 0.011536209176998595],
                              :logical-processor-count 8,
                              :name "Intel(R) Core(TM) i7-4770HQ CPU @ 2.20GHz",
                              :system-cpu-load-between-ticks 0.07781338151067693,
                              :cpu64bit? true,
                              :processor-cpu-load-ticks [[1193156 0 1459374 12364714]
                                                         [75698 0 87484 14853666]
                                                         [1024369 0 984577 13008028]
                                                         [79928 0 94004 14842875]
                                                         [1020819 0 982824 13013289]
                                                         [80400 0 95043 14841327]
                                                         [1023121 0 974103 13019665]
                                                         [79621 0 93616 14843503]],
                              :system-cpu-load-ticks [4577113 0 4771025 110787068],
                              :identifier "Intel64 Family 6 Model 70 Stepping 1",
                              :system-uptime 218449,
                              :stepping "1",
                              :system-load-average 1.794921875,
                              :vendor-freq 2200000000,
                              :model "70"}}}
```

For specifics about the system can be access via `cpu`, `memory`, `power`, `displays`, `fs` and `os`:

```clojure

(cpu)
=>  #cpu{:vendor "GenuineIntel",
         ...
         ...
         :system-uptime 219323, :stepping "1",
         :system-load-average 1.603515625, :vendor-freq 2200000000,
         :model "70"}

(memory)
=>  #memory{:available 5499760640, :total 17179869184}

(power)
=>  (#power{:name "InternalBattery-0", :remaining-capacity 1.0, :time-remaining -2.0})

(displays)
=>  (#display{:edid [0 -1 -1 -1 -1 -1 -1 0 6 16 34 -96 0 0 
                     ....
                     ....
                     0 0 0 0 0 0 0 0 0 0 -34]})

(fs)
=>  (#fs{:description "Local Disk", :name "Macintosh HD (/)", :total-space 249821663232, :usable-space 6732836864})

(os)
=>  #os{:family "Mac OS X", :manufacturer "Apple", \
        :version {:build-number "15D21", :code-name "El Capitan", :version "10.11.3"}}

```

## License

Copyright © 2016 Chris Zheng

Distributed under the MIT License
