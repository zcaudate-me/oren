(ns oren.core
  (:require [oren.types :as types]
            [hara.object :as object]))

(defonce ^:dynamic *raw* true)

(defn to-data
  [obj]
  (if *raw*
    obj
    (object/to-data obj)))

(defn all []
  (binding [*raw* false]
    (to-data (oshi.SystemInfo.))))

(defn cpu []
  (-> (oshi.SystemInfo.)
      (.getHardware)
      (.getProcessor)
      (to-data)))

(defn memory []
  (-> (oshi.SystemInfo.)
      (.getHardware)
      (.getMemory)))

(defn power []
  (-> (oshi.SystemInfo.)
      (.getHardware)
      (.getPowerSources)
      seq
      (to-data)))

(defn displays []
  (-> (oshi.SystemInfo.)
      (.getHardware)
      (.getDisplays)
      seq
      (to-data)))

(defn fs []
  (-> (oshi.SystemInfo.)
      (.getHardware)
      (.getFileStores)
      seq
      (to-data)))

(defn os []
  (-> (oshi.SystemInfo.)
      (.getOperatingSystem)
      (to-data)))

